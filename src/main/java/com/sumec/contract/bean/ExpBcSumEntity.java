package com.sumec.contract.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：采购合同汇总信息实体.<br/>
 * 
 * #date： 2017年11月10日 上午9:33:38<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class ExpBcSumEntity implements Serializable{

    private static final long serialVersionUID = 5738359862759564492L;
    /** 合同流水号 */
    private BigDecimal bcId;
    /** 合同号 */
    private String bcNo;
    /** 合同状态  0:未签约 1:执行中 2:已终止 3:已关闭   */
    private String cStatus;
    /** 供应商 */
    private String fctName;
    /** 采购方 */
    private String purchaserName;
    /** 采购数量 */
    private BigDecimal purchaseQty;
    /** 采购金额 */
    private BigDecimal purchaseAmt;
    /** 业务员 */
    private String ocuName;
    /** 付款汇总信息 */
    private PaySum paySum;
    /** 物流汇总信息 */
    private TranSum tranSum;
    /** 发票汇总信息 */        
    private InvSum invSum;
    public BigDecimal getBcId(){
        return bcId;
    }
    public void setBcId(BigDecimal bcId){
        this.bcId = bcId;
    }
    public String getBcNo(){
        return bcNo;
    }
    public void setBcNo(String bcNo){
        this.bcNo = bcNo;
    }
    public String getcStatus(){
        return cStatus;
    }
    public void setcStatus(String cStatus){
        this.cStatus = cStatus;
    }
    public String getFctName(){
        return fctName;
    }
    public void setFctName(String fctName){
        this.fctName = fctName;
    }
    public String getPurchaserName(){
        return purchaserName;
    }
    public void setPurchaserName(String purchaserName){
        this.purchaserName = purchaserName;
    }
    public BigDecimal getPurchaseQty(){
        return purchaseQty;
    }
    public void setPurchaseQty(BigDecimal purchaseQty){
        this.purchaseQty = purchaseQty;
    }
    public BigDecimal getPurchaseAmt(){
        return purchaseAmt;
    }
    public void setPurchaseAmt(BigDecimal purchaseAmt){
        this.purchaseAmt = purchaseAmt;
    }
    public String getOcuName(){
        return ocuName;
    }
    public void setOcuName(String ocuName){
        this.ocuName = ocuName;
    }
    public PaySum getPaySum(){
        return paySum;
    }
    public void setPaySum(PaySum paySum){
        this.paySum = paySum;
    }
    public TranSum getTranSum(){
        return tranSum;
    }
    public void setTranSum(TranSum tranSum){
        this.tranSum = tranSum;
    }
    public InvSum getInvSum(){
        return invSum;
    }
    public void setInvSum(InvSum invSum){
        this.invSum = invSum;
    }
}
