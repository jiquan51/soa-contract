package com.sumec.project.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：收款汇总信息.<br/>
 * 
 * #date： 2017年11月13日 下午4:30:20<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class ReceivedSumEntity implements Serializable{

    private static final long serialVersionUID = -5350297117035369026L;
    /** 金额 */
    private BigDecimal inAmt;
    /** 预计收款时间 */
    private String ioPlanDate;
    /** 已收款金额 */
    private BigDecimal receivedAmt;
    /** 收款百分比 */
    private String receivedRate;
    public BigDecimal getInAmt(){
        return inAmt;
    }
    public void setInAmt(BigDecimal inAmt){
        this.inAmt = inAmt;
    }
    public String getIoPlanDate(){
        return ioPlanDate;
    }
    public void setIoPlanDate(String ioPlanDate){
        this.ioPlanDate = ioPlanDate;
    }
    public BigDecimal getReceivedAmt(){
        return receivedAmt;
    }
    public void setReceivedAmt(BigDecimal receivedAmt){
        this.receivedAmt = receivedAmt;
    }
    public String getReceivedRate(){
        return receivedRate;
    }
    public void setReceivedRate(String receivedRate){
        this.receivedRate = receivedRate;
    }
}
