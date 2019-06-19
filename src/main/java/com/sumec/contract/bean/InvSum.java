package com.sumec.contract.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：发票汇总信息.<br/>
 * 
 * #date： 2017年11月10日 上午9:45:21<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class InvSum implements Serializable{

    private static final long serialVersionUID = -5679743810555320565L;
    /** 税单金额 */
    private BigDecimal invTaxAmt;
    /** 税单百分比 */
    private String invTaxRate;
    /** 费用 */
    private BigDecimal invFeeAmt;
    public BigDecimal getInvTaxAmt(){
        return invTaxAmt;
    }
    public void setInvTaxAmt(BigDecimal invTaxAmt){
        this.invTaxAmt = invTaxAmt;
    }
    public String getInvTaxRate(){
        return invTaxRate;
    }
    public void setInvTaxRate(String invTaxRate){
        this.invTaxRate = invTaxRate;
    }
    public BigDecimal getInvFeeAmt(){
        return invFeeAmt;
    }
    public void setInvFeeAmt(BigDecimal invFeeAmt){
        this.invFeeAmt = invFeeAmt;
    }
    
}
