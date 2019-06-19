package com.sumec.project.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：项目执行汇总信息接口.<br/>
 * 
 * #date： 2017年11月13日 上午10:52:27<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class ProjCeecSumEntity implements Serializable{

    private static final long serialVersionUID = 272205425665816579L;
    /** 项目流水号 */
    private BigDecimal projId;
    /** 项目号 */
    private String projNo;
    /** 项目状态 */
    private String projStatus;
    /** 业主 */
    private String ownerName;
    /** 签约主体 */
    private String SignerName;
    /** 签约金额 */
    private String signAmtInfo;
    /** 业务员 */
    private Long mUserId;
    /** 业务员姓名 */
    private String mUserName;
    /** 预算信息 */
    private BudRegEntity budRegs;
    /** 分包汇总信息 */
    private SubcontractEntity subcontract;
    /** 收款汇总信息 */
    private ReceivedSumEntity receivedSum;
    
    public BigDecimal getProjId(){
        return projId;
    }
    public void setProjId(BigDecimal projId){
        this.projId = projId;
    }
    public String getProjNo(){
        return projNo;
    }
    public void setProjNo(String projNo){
        this.projNo = projNo;
    }
    public String getProjStatus(){
        return projStatus;
    }
    public void setProjStatus(String projStatus){
        this.projStatus = projStatus;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getSignerName(){
        return SignerName;
    }
    public void setSignerName(String signerName){
        SignerName = signerName;
    }
    public String getSignAmtInfo(){
        return signAmtInfo;
    }
    public void setSignAmtInfo(String signAmtInfo){
        this.signAmtInfo = signAmtInfo;
    }
    public Long getmUserId(){
        return mUserId;
    }
    public void setmUserId(Long mUserId){
        this.mUserId = mUserId;
    }
    public String getmUserName(){
        return mUserName;
    }
    public void setmUserName(String mUserName){
        this.mUserName = mUserName;
    }
    public BudRegEntity getBudRegs(){
        return budRegs;
    }
    public void setBudRegs(BudRegEntity budRegs){
        this.budRegs = budRegs;
    }
    public SubcontractEntity getSubcontract(){
        return subcontract;
    }
    public void setSubcontract(SubcontractEntity subcontract){
        this.subcontract = subcontract;
    }
    public ReceivedSumEntity getReceivedSum(){
        return receivedSum;
    }
    public void setReceivedSum(ReceivedSumEntity receivedSum){
        this.receivedSum = receivedSum;
    }
    
}
