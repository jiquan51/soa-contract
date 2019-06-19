package com.sumec.project.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：分包汇总信息.<br/>
 * 
 * #date： 2017年11月13日 下午4:07:20<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class SubcontractEntity implements Serializable{

    private static final long serialVersionUID = -1297175856555870516L;
    /** 金额 */
    private BigDecimal pAmt;
    /** 数量 */
    private BigDecimal pQuant;
    /** 已够百分比 */
    private String buyRate;
    /** 已购数量 */    
    private BigDecimal buyQuant;
    /** 出运百分比 */
    private String sendRate;
    /** 出运数量 */ 
    private BigDecimal sendQuant;
    public BigDecimal getpAmt(){
        return pAmt;
    }
    public void setpAmt(BigDecimal pAmt){
        this.pAmt = pAmt;
    }
    public BigDecimal getpQuant(){
        return pQuant;
    }
    public void setpQuant(BigDecimal pQuant){
        this.pQuant = pQuant;
    }
    public String getBuyRate(){
        return buyRate;
    }
    public void setBuyRate(String buyRate){
        this.buyRate = buyRate;
    }
    public BigDecimal getBuyQuant(){
        return buyQuant;
    }
    public void setBuyQuant(BigDecimal buyQuant){
        this.buyQuant = buyQuant;
    }
    public String getSendRate(){
        return sendRate;
    }
    public void setSendRate(String sendRate){
        this.sendRate = sendRate;
    }
    public BigDecimal getSendQuant(){
        return sendQuant;
    }
    public void setSendQuant(BigDecimal sendQuant){
        this.sendQuant = sendQuant;
    }
}
