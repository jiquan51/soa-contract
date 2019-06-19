package com.sumec.flow.service.impl;

import com.sumec.common.MessageConstant;
import com.sumec.common.ResponseData;
import com.sumec.contract.constant.WorkFlowConstant;
import com.sumec.contract.service.IBWorkFlowCallbackHandler;
import com.sumec.flow.bean.ReqConfirm;
import com.sumec.flow.dao.ISumecFlowDetailsDao;
import com.sumec.flow.dao.ISumecFlowModuleDao;
import com.sumec.flow.entity.TSumecFlowDetails;
import com.sumec.flow.entity.TSumecFlowModule;
import com.sumec.flow.service.ISumecFlowDetailsService;
import com.sumec.template.service.IImService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 功能描述：添加功能描述.<br/>
 * 
 * #date： 2017年11月17日 下午1:59:33<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@Service
public class ISumecFlowDetailsServiceImpl implements ISumecFlowDetailsService{

    @Autowired
    private ISumecFlowDetailsDao sumecFlowDetailsDao;
    @Autowired
    private ISumecFlowModuleDao sumecFlowModuleDao;
    @Autowired
    private IBWorkFlowCallbackHandler bBaseCallbackHandler;

    @Autowired
    private IImService imService;
    
    @Override
    @Transactional(rollbackFor = Exception.class)
    public String pass(ReqConfirm reqConfirm){
        if(reqConfirm != null && reqConfirm.getIntId() != null){
            TSumecFlowDetails sumecFlowDetails = sumecFlowDetailsDao.selectByPrimaryKey(reqConfirm.getIntId());
            if(sumecFlowDetails != null){
                String strDealFlag = sumecFlowDetails.getDealFlag();
                String strFlag =sumecFlowDetails.getFlag();
                Long longFmId = sumecFlowDetails.getFmId();
                String strRefValue = sumecFlowDetails.getRefValue();
                // 1.1、首先检查当前记录必须满足未处理(deal_flag='0')
                // 是否处理（0待处理,1通过,2退回,D未到处理）
                if (strDealFlag ==null || !WorkFlowConstant.DEAL_FLAG_0.equals(strDealFlag)){
                    return "该审批已处理过";
                }
                // 并且记录是有效的（flag='1'）
                // 是否有效( 1有效、0无效)
                if (strFlag==null || !WorkFlowConstant.FLAG_1.equals(strFlag)){
                    return "该审批无效";
                }
                // 必须有审批模块id
                if (longFmId==null || longFmId==0){
                    return "无审批模块";
                }
                // 业务表的主键值不能为空
                if (StringUtils.isEmpty(strRefValue)){
                    return "该审批业务表主键不能为空";
                }
                // 设置通过和通过意见(默认通过意见ok)
                if (StringUtils.isEmpty(reqConfirm.getNotion())){
                    reqConfirm.setNotion(WorkFlowConstant.DEFAULT_PASS_ADVICE);
                }
                Date sysDate = new Date();
                TSumecFlowDetails temp = new TSumecFlowDetails();
                temp.setDealTime(sysDate);
                temp.setDealFlag(WorkFlowConstant.DEAL_FLAG_1);
                temp.setNotion(reqConfirm.getNotion());
                temp.setIntId(sumecFlowDetails.getIntId());
                // 1.2、更新当前表记录数据
                sumecFlowDetailsDao.updateByPrimaryKeySelective(temp);

                //查看当前节点是否有会签情况且没审批
                temp.setFmSeqId(sumecFlowDetails.getFmSeqId());
                short intThisDtlStep = sumecFlowDetails.getDtlStep();
                temp.setDtlStep(intThisDtlStep);
                List<TSumecFlowDetails> thisValids = sumecFlowDetailsDao.selectValidStep(temp);
                long validSteps = thisValids.stream().filter(t -> WorkFlowConstant.DEAL_FLAG_0.equals(t.getDealFlag())).count();
                if (validSteps != 0L){
                    //会签有其他人没有处理
                    return "审批成功";
                }

                // 1.3、看是否有下一步审批
                temp.setFmSeqId(sumecFlowDetails.getFmSeqId());
                short intNextDtlStep = (short)(sumecFlowDetails.getDtlStep()+(short)1);
                temp.setDtlStep(intNextDtlStep);
//                TSumecFlowDetails nextValid = sumecFlowDetailsDao.selectNextValidStep(temp);
                List<TSumecFlowDetails> nextValids = sumecFlowDetailsDao.selectValidStep(temp);
                // 2、看后续有没有审批步骤
                if (nextValids != null && nextValids.size() != 0){// 有
//                    temp = null;

                    // 调用审批通知推送到下一个流程节点
                    try{
//                        imService.sendApproval(nextValid.getIntId());
                        for (TSumecFlowDetails nextValid : nextValids) {
                            temp = new TSumecFlowDetails();
                            temp.setFmSeqId(sumecFlowDetails.getFmSeqId());
                            temp.setDtlStep(intNextDtlStep);
                            temp.setDealFlag(WorkFlowConstant.DEAL_FLAG_0);
                            temp.setFlag(WorkFlowConstant.FLAG_1);  //取出来的默认就是有效吧，是不是不需要
                            temp.setDealWay("MOBILE");
                            sumecFlowDetailsDao.updateBWorkFlowDetailsPass(temp);

                            imService.sendApproval(nextValid.getIntId());
                        }
                    }catch(Exception e){
                       e.printStackTrace();
                    }
                    return "审批成功";
                }else{//3、没有那就代表是审批通过
                    TSumecFlowModule sumecFlowModule = sumecFlowModuleDao.selectByPrimaryKey(longFmId);
                    if(sumecFlowModule != null){
                        //4、处理业务表的confirm字段
                        //看是否配制过流程回调接口
                        String strCallBackHandler = sumecFlowModule.getCallbackhandler();
                        String strTableName = sumecFlowModule.getTableName();
                        String strConfirmColumn = sumecFlowModule.getConfirmColumn();
                        String strPkColumn = sumecFlowModule.getPkColumn();
                        //必须保证需要更新的业务表数据都配制过
                        if (StringUtils.isEmpty(strTableName) || StringUtils.isEmpty(strConfirmColumn) || StringUtils.isEmpty(strPkColumn)){
                            return "需要更新的业务表数据未都配制过";
                        }
                        //4、处理业务表的confirm字段
                        HashMap<String,String> hashMap = new HashMap<>();
                        hashMap.put("tableName",strTableName);
                        hashMap.put("confirmColumn",strConfirmColumn);
                        hashMap.put("confirmValue","'" + WorkFlowConstant.CONFIRM_PASS+"'");
                        hashMap.put("pkColumn",strPkColumn);
                        hashMap.put("pkColumnValue","'"+strRefValue+"'");
                        sumecFlowModuleDao.updateBTableConfirm(hashMap);
                        //看流程回调类是否配制过
                        if (StringUtils.isNotEmpty(strCallBackHandler)){
                            //需要有流程回调类处理
                            if(!bBaseCallbackHandler.callBackAfterConfirm(longFmId.toString(),strRefValue)){
                                return "回掉处理失败";
                            }
                        }
                        // 调用审批通知推送用户审批完成通知
                        try{
                            imService.sendApproval(sumecFlowDetails.getIntId());
                        }catch(Exception e){
                           e.printStackTrace();
                        }
                        return "审批成功";
                    }
                }
            }
        }
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String back(ReqConfirm reqConfirm){
        ResponseData<String> res = new ResponseData<String>();
        res.setMsgCode(MessageConstant.REQUEST_FAIL_CODE);
        if(reqConfirm != null && reqConfirm.getIntId() != null){
            TSumecFlowDetails sumecFlowDetails = sumecFlowDetailsDao.selectByPrimaryKey(reqConfirm.getIntId());
            if(sumecFlowDetails != null){
                String strDealFlag = sumecFlowDetails.getDealFlag();
                String strFlag =sumecFlowDetails.getFlag();
                Long longFmId = sumecFlowDetails.getFmId();
                String strRefValue = sumecFlowDetails.getRefValue();
                //1.1、首先检查当前记录必须满足未处理(deal_flag='0')
                if (strDealFlag ==null || !WorkFlowConstant.DEAL_FLAG_0.equals(strDealFlag)){
                    return "该审批已处理过";
                }
                //并且记录是有效的（flag='1'）
                if (strFlag==null || !WorkFlowConstant.FLAG_1.equals(strFlag)){
                    return "该审批无效";
                }
                //必须有审批模块id
                if (longFmId==null || longFmId==0){
                    return "无审批模块";
                }
                //业务表的主键值不能为空
                if (StringUtils.isEmpty(strRefValue)){
                    return "该审批业务表主键不能为空";
                }
                // 设置通过和通过意见(默认通过意见ok)
                if (StringUtils.isEmpty(reqConfirm.getNotion())){
                    reqConfirm.setNotion(WorkFlowConstant.CONFIRM_BACK);
                }
                //1、处理当前审批数据（deal_flg=sysDateTime，deal_flg='2'，notion=strPassAdvice，flg='0'）
                //2、应该是要DEAL_FLAG_2，为了考虑业务审批改动小业务审批特殊处理（deal_flg='0'）2016-07-26
                Date sysDate = new Date();
                TSumecFlowDetails temp = new TSumecFlowDetails();
                temp.setDealTime(sysDate);
                temp.setDealFlag(WorkFlowConstant.DEAL_FLAG_1);
                temp.setNotion(reqConfirm.getNotion());
                temp.setIntId(sumecFlowDetails.getIntId());
                // 1.2、更新当前表记录数据
                sumecFlowDetailsDao.updateByPrimaryKeySelective(temp);
                //3、把所有的当前fm_seq_id的数据全部转成'0'
                temp.setFlag(WorkFlowConstant.FLAG_0);
                temp.setFmSeqId(sumecFlowDetails.getFmSeqId());
                temp.setDealWay("MOBILE");
                sumecFlowDetailsDao.updateBWorkFlowBack(temp);
                //4、获取模块
                TSumecFlowModule sumecFlowModule = sumecFlowModuleDao.selectByPrimaryKey(longFmId);
                if(sumecFlowModule != null){
                    //看是否配制过流程回调接口
                    String strCallBackHandler = sumecFlowModule.getCallbackhandler();
                    String strTableName = sumecFlowModule.getTableName();
                    String strConfirmColumn = sumecFlowModule.getConfirmColumn();
                    String strPkColumn = sumecFlowModule.getPkColumn();
                    //必须保证需要更新的业务表数据都配制过了
                    if (StringUtils.isEmpty(strTableName) || StringUtils.isEmpty(strConfirmColumn) || StringUtils.isEmpty(strPkColumn)){
                        return "需要更新的业务表数据未都配制过";
                    }
                    //4、处理业务表的confirm字段
                    HashMap<String,String> hashMap = new HashMap<>();
                    hashMap.put("tableName",strTableName);
                    hashMap.put("confirmColumn",strConfirmColumn);
                    hashMap.put("confirmValue","'"+WorkFlowConstant.CONFIRM_BACK+"'");
                    hashMap.put("pkColumn",strPkColumn);
                    hashMap.put("pkColumnValue","'"+strRefValue+"'");
                    sumecFlowModuleDao.updateBTableConfirm(hashMap);
                    //看流程回调类是否配制过
                    if (StringUtils.isNotEmpty(strCallBackHandler)){
                        //需要有流程回调类处理
                       if(!bBaseCallbackHandler.callBackAfterBack(longFmId.toString(),strRefValue)){
                           return "回掉处理失败";
                       }
                    }
                    // 调用审批通知推送用户审批被退回
                    try{
                        imService.sendApproval(sumecFlowDetails.getIntId());
                    }catch(Exception e){
                       e.printStackTrace();
                    }
                    return "退回成功";
                }
            }
        }
        return null;
    }

    @Override
    public TSumecFlowDetails selectByPrimaryKey(Long intId){
        return sumecFlowDetailsDao.selectByPrimaryKey(intId);
    }
    @Override
    public List<TSumecFlowDetails> selectByBcId(String bcId) {
        return  sumecFlowDetailsDao.selectByBcId(bcId);
    }

    @Override
    public List<TSumecFlowDetails> selectByFmId(Long fmId, String refValue){
        return sumecFlowDetailsDao.selectByFmId(fmId,refValue);
    }

    @Override
    public TSumecFlowDetails selectNextValidStep(TSumecFlowDetails sumecFlowDetails){
        return sumecFlowDetailsDao.selectNextValidStep(sumecFlowDetails);
    }

}
