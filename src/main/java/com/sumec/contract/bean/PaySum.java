package com.sumec.contract.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：付款汇总信息对象.<br/>
 * 
 * #date： 2017年11月10日 上午9:39:56<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class PaySum implements Serializable{

    private static final long serialVersionUID = 3928201020593272527L;

    /** 货款金额 */
    private BigDecimal payHkAmt;
    /** 货款百分比 */
    private String payHkRate;
    /** 税款金额 */
    private BigDecimal payTaxAmt;
    /** 费用金额 */
    private BigDecimal payFeeAmt;
    public BigDecimal getPayHkAmt(){
        return payHkAmt;
    }
    public void setPayHkAmt(BigDecimal payHkAmt){
        this.payHkAmt = payHkAmt;
    }
    public String getPayHkRate(){
        return payHkRate;
    }
    public void setPayHkRate(String payHkRate){
        this.payHkRate = payHkRate;
    }
    public BigDecimal getPayTaxAmt(){
        return payTaxAmt;
    }
    public void setPayTaxAmt(BigDecimal payTaxAmt){
        this.payTaxAmt = payTaxAmt;
    }
    public BigDecimal getPayFeeAmt(){
        return payFeeAmt;
    }
    public void setPayFeeAmt(BigDecimal payFeeAmt){
        this.payFeeAmt = payFeeAmt;
    }
}
