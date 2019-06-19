package com.sumec.project.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sumec.boot.core.annotation.RESTful;
import com.sumec.common.MessageConstant;
import com.sumec.common.ResponseData;
import com.sumec.project.bean.BudRegEntity;
import com.sumec.project.bean.ProjCeecSumEntity;
import com.sumec.project.bean.ReceivedSumEntity;
import com.sumec.project.bean.SubcontractEntity;
import com.sumec.api.base.bean.TSumecUser;
import com.sumec.api.base.service.ISumecUserService;
import com.sumec.project.entity.TProjCeec;
import com.sumec.project.entity.TProjCeecBudReg;
import com.sumec.project.service.IProjCeecBudRegService;
import com.sumec.project.service.IProjCeecService;
import com.sumec.res.BaseRestResult;
import com.sumec.res.BaseResultConstants;
import com.sumec.res.BaseResultErrorStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 功能描述：项目执行相关操作接口.<br/>
 * 
 * #date： 2017年11月13日 上午10:45:12<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@RESTful
@RequestMapping("/api")
@Api(tags={"项目执行相关操作接口"})
public class ProjCeecController{

    @Autowired
    private IProjCeecService projCeecService;
    @Autowired
    private IProjCeecBudRegService projCeecBudRegService;
    @Autowired
    private ISumecUserService sumecUserService;
    
    @RequestMapping(value = "/project/v1/{projId}/summary", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "根据projId获取项目执行的汇总信息",notes = "v1-根据projId获取项目执行的汇总信息")
    public ResponseEntity<BaseRestResult<ResponseData<ProjCeecSumEntity>>> queryExpBcSum(@PathVariable("projId")BigDecimal projId){
        BaseRestResult<ResponseData<ProjCeecSumEntity>> baseRestResult = BaseRestResult.newInstance();
        ResponseData<ProjCeecSumEntity> res = new ResponseData<ProjCeecSumEntity>();
        ProjCeecSumEntity sum = new ProjCeecSumEntity();
        try{
            if(projId != null){
                TProjCeec projCeec =  projCeecService.selectByPrimaryKey(projId);
                if(projCeec != null){
                    sum.setmUserId(projCeec.getmUserId());
                    TSumecUser sumecUser = sumecUserService.selectByUserId(projCeec.getmUserId());
                    if(sumecUser != null){
                        sum.setmUserName(sumecUser.getUserName());
                    }
                    sum.setOwnerName(projCeec.getOwnerName());
                    sum.setProjId(projId);
                    sum.setProjNo(projCeec.getProjNo());
                    sum.setProjStatus(projCeec.getProjStatus());
                    sum.setSignAmtInfo(projCeec.getSignAmtInfo());
                    sum.setSignerName(projCeec.getSignerName());
                    
                    // 预算信息
                    BudRegEntity budReg = new BudRegEntity();
                    String projType = projCeec.getkId().toString();
                    TProjCeecBudReg projCeecBudReg = projCeecBudRegService.selectByProjId(projType,projId.toString());
                    if(projCeecBudReg != null){
                        budReg.setBudAmt(projCeecBudReg.getProjCostRmb());
                        budReg.setGrossProfit(projCeecBudReg.getProjProfitRmb());
                        budReg.setUseAmt(new BigDecimal("123213"));
                    }
                    sum.setBudRegs(budReg);
                    // 分包汇总信息
                    SubcontractEntity subcontract = new SubcontractEntity();
                    subcontract.setBuyQuant(new BigDecimal("123123"));
                    subcontract.setBuyRate("12.98%");
                    subcontract.setpAmt(new BigDecimal("233123.00"));
                    subcontract.setpQuant(new BigDecimal("123123"));
                    subcontract.setSendQuant(new BigDecimal("12312"));
                    subcontract.setSendRate("32.98%");
                    sum.setSubcontract(subcontract);
                    // 收款汇总信息
                    ReceivedSumEntity receivedSum = new ReceivedSumEntity();
                    receivedSum.setInAmt(new BigDecimal("233123.00"));
                    receivedSum.setIoPlanDate("2017-09-09");
                    receivedSum.setReceivedAmt(new BigDecimal("233123.00"));
                    receivedSum.setReceivedRate("100%");
                    sum.setReceivedSum(receivedSum);
                    
                    res.setMsgCode(MessageConstant.REQUEST_SUCCESS_CODE);
                    res.setMessage(MessageConstant.REQUEST_SUCCESS_MESSAGE);
                    baseRestResult.setResStatus(BaseResultConstants.RES_SUCCESS);
                    baseRestResult.setResMessage("项目执行汇总信息查询成功");
                    res.setData(sum);
                    baseRestResult.setDataBody(res);
                }else{
                    baseRestResult.setResStatus(BaseResultConstants.RES_SUCCESS);
                    res.setMsgCode(MessageConstant.REQUEST_WAIN_CODE);
                    res.setMessage(MessageConstant.REQUEST_WAIN_MESSAGE);
                    res.setData(null);
                    baseRestResult.setResMessage("暂未查询到项目执行汇总信息");
                    baseRestResult.setDataBody(res);
                }
            }else{
                baseRestResult.setResStatus(BaseResultConstants.RES_FAIL);
                baseRestResult.setErrorStatus(BaseResultErrorStatus.ERR_STATUS_701);
                res.setMsgCode(MessageConstant.PARAM_NULL_CODE);
                res.setMessage(MessageConstant.PARAM_NULL_MESSAGE);
                baseRestResult.setDataBody(res);
            }
        }catch(Exception e){
            e.printStackTrace();
            baseRestResult.setResStatus(BaseResultConstants.RES_FAIL);
            baseRestResult.setErrorStatus(BaseResultErrorStatus.ERR_STATUS_801);
            res.setMsgCode(MessageConstant.SYSTEM_ERROR_CODE);
            res.setMessage(e.getMessage());
            baseRestResult.setDataBody(res);
        }
        return ResponseEntity.ok().body(baseRestResult);
    }

}
