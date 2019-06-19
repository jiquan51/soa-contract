package com.sumec.contract.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能描述：关联合同相关信息实体.<br/>
 * 
 * #date： 2017年11月16日 下午4:10:13<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class ContractRelBean implements Serializable{

    private static final long serialVersionUID = 4510931994556705890L;
    /** 关联类型 REL:关联交易 MODEL:商业模式 ASSO:联合业务 EXC:转换关系*/
    private String relType;
    /** 关联合同号 */
    private String relBcNo;
    /** 客商 */
    private String fctName;
    /** 关联合同币种 */
    private String relCurrType;
    /** 金额 */
    private BigDecimal commAmt;
    /** 收款方式 */
    private String payment;
    public String getRelType(){
        if("REL".equals(relType)){
            return "关联交易";
        }else if("MODEL".equals(relType)){
            return "商业模式";
        }else if("ASSO".equals(relType)){
            return "联合业务";
        }else if("EXC".equals(relType)){
            return "转换关系";
        }else{
            return relType;
        }
    }
    public void setRelType(String relType){
        this.relType = relType;
    }
    public String getRelBcNo(){
        return relBcNo;
    }
    public void setRelBcNo(String relBcNo){
        this.relBcNo = relBcNo;
    }
    public String getFctName(){
        return fctName;
    }
    public void setFctName(String fctName){
        this.fctName = fctName;
    }
    public String getRelCurrType(){
        return relCurrType;
    }
    public void setRelCurrType(String relCurrType){
        this.relCurrType = relCurrType;
    }
    public BigDecimal getCommAmt(){
        return commAmt;
    }
    public void setCommAmt(BigDecimal commAmt){
        this.commAmt = commAmt;
    }
    public String getPayment(){
        return payment;
    }
    public void setPayment(String payment){
        this.payment = payment;
    }

}
