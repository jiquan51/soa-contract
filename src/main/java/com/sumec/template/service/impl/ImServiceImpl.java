package com.sumec.template.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.sumec.api.base.bean.TSumecUser;
import com.sumec.api.base.service.ISumecUserService;
import com.sumec.flow.dao.ISumecFlowDetailsDao;
import com.sumec.flow.dao.ISumecFlowModuleDao;
import com.sumec.flow.entity.TSumecFlowDetails;
import com.sumec.flow.entity.TSumecFlowModule;
import com.sumec.template.bean.Approval;
import com.sumec.template.service.IImService;
import com.sumec.utils.DateUtils;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 * @date： 2018年3月23日 下午3:34:55<br/>
 * @author SunTow_J<br/>
 * @since 1.0.0<br/>
 */
@Service
public class ImServiceImpl implements IImService{

    @Value("${im.approvalUrl}")  
    private String approvalUrl;
    @Value("${im.accessToken}")
    private String accessToken;
    @Value("${im.apiKey}")  
    private String apiKey;
    
    @Autowired  
    private RestTemplate restTemplate; 
    @Autowired
    private ISumecFlowDetailsDao sumecFlowDetailsDao;
    @Autowired
    private ISumecFlowModuleDao sumecFlowModuleDao;
    
    @Autowired
    private ISumecUserService sumecUserService;
    
    @Override
    public JSONObject sendApproval(Long intId){
        JSONObject ret = null;
        if(intId != null){
            TSumecFlowDetails sumecFlowDetails = sumecFlowDetailsDao.selectByPrimaryKey(intId);
            // deal_flag （0待处理,1通过,2退回,D未到处理）
            // flag ( 1有效、0无效)
            // dealFlag: 0待处理,1已处理 ,D未到处理   ------主动撤回现在是查不到,退回的flag是0
            if(sumecFlowDetails != null){
                Long fmId = sumecFlowDetails.getFmId();
                Long userId = sumecFlowDetails.getUserId();
                String dealFlag = sumecFlowDetails.getDealFlag();
                String flag = sumecFlowDetails.getFlag(); 
                TSumecFlowModule sumecFlowModule = sumecFlowModuleDao.selectByPrimaryKey(fmId);
                if(sumecFlowModule != null){
                    Approval approval = new Approval();
                    String fmViewName = sumecFlowModule.getFmViewName();
                    approval.setHeader(fmViewName);
                    Map<String,String> hiddenKvs = new HashMap<>();
                    hiddenKvs.put("id",intId+"");
                    approval.setHiddenKvs(hiddenKvs);
                    LinkedHashMap<String,String> kvs = new LinkedHashMap<>();
                    kvs.put("您有一条新的审批消息，点击可查询详情！", "");
                    kvs.put("审批内容", fmViewName);
                    String postName = "";
                    String checkName = "";
                    TSumecFlowDetails temp = new TSumecFlowDetails();
                    temp.setFmSeqId(sumecFlowDetails.getFmSeqId());
                    short intStartDtlStep = (short)1;
                    temp.setDtlStep(intStartDtlStep);
                    TSumecFlowDetails startValid = sumecFlowDetailsDao.selectNextValidStep(temp);
                    if(startValid != null){
                        Long postUserId = startValid.getUserId();
                        TSumecUser sumecUser = sumecUserService.selectByUserId(postUserId);
                        if(sumecUser != null){
                            postName = sumecUser.getUserName();
                        }
                    }
                    TSumecUser sumecUser1 = sumecUserService.selectByUserId(userId);
                    if(sumecUser1 != null){
                        checkName = sumecUser1.getUserName();
                    }
                    if("0".equals(dealFlag)){
                        approval.setStatus("待审批");
                        // 通知审批人
                        approval.setTouserid(userId);
                        // 提示发起人是？
                        kvs.put("发起人", postName);
                    }else if("1".equals(dealFlag) && "0".equals(flag)){
                        approval.setStatus("已退回");
                        // 通知发起人
                        approval.setTouserid(startValid.getUserId());
                        // 提示审批人是？
                        kvs.put("审批人", checkName);
                    }else if("1".equals(dealFlag)){
                        approval.setStatus("已审批");
                        // 通知发起人
                        approval.setTouserid(startValid.getUserId());
                        // 提示审批人是？
                        kvs.put("审批人", checkName);
                    }else if("D".equals(dealFlag)){
                        approval.setTouserid(userId);
                        approval.setStatus("未到处理");
                        kvs.put("发起人", postName);
                    } 
                    
                    kvs.put("提交时间",DateUtils.format(sumecFlowDetails.getPostTime(),DateUtils.F_YYYY_MM_dd_HH_mm_ss));
                    approval.setKvs(kvs);
                    HttpHeaders requestHeaders = new HttpHeaders();
                    requestHeaders.add("api_key", apiKey);
                    HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
                    ResponseEntity<JSONObject> accessTokenRes = restTemplate.exchange(accessToken,HttpMethod.GET,requestEntity,JSONObject.class,new HashMap<String, String[]>());
                    if(accessTokenRes.getStatusCode() == HttpStatus.OK){
                        String access_token = accessTokenRes.getBody().getString("access_token");
                        HttpHeaders headers = new HttpHeaders();
                        headers.add("access_token", access_token);
//                        headers.add("Cookie", "sessionID=e7273ec0d5424daba0ec5d51c761902e");
                        HttpEntity<Approval> postEntity = new HttpEntity<>(approval, headers);
                        ResponseEntity<JSONObject> response = restTemplate.postForEntity(approvalUrl,postEntity,JSONObject.class);
                        if(response.getStatusCode() == HttpStatus.OK){
                            ret = response.getBody();
                            System.out.println("审批推送返回:" + ret);
                        }
                    }
                }
            }
        }
        return ret;
    }
    
    
}
