package com.sumec.contract.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：物流汇总信息对象.<br/>
 * 
 * #date： 2017年11月10日 上午9:42:35<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TranSum implements Serializable{

    private static final long serialVersionUID = -1951745214305369369L;

    /** 数量 */
    private BigDecimal sendQty;
    /** 百分比 */
    private String sendRate;
    /** 金额 */            
    private BigDecimal sendAmt;
    public BigDecimal getSendQty(){
        return sendQty;
    }
    public void setSendQty(BigDecimal sendQty){
        this.sendQty = sendQty;
    }
    public String getSendRate(){
        return sendRate;
    }
    public void setSendRate(String sendRate){
        this.sendRate = sendRate;
    }
    public BigDecimal getSendAmt(){
        return sendAmt;
    }
    public void setSendAmt(BigDecimal sendAmt){
        this.sendAmt = sendAmt;
    }
}
