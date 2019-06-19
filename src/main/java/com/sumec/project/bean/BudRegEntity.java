package com.sumec.project.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.NumberFormat;

import org.springframework.util.StringUtils;

/**
 * 功能描述：预算信息实体.<br/>
 * 
 * #date： 2017年11月13日 下午2:08:32<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class BudRegEntity implements Serializable{

    private static final long serialVersionUID = 6772294668264832684L;

    /** 预算的成本 */
    private BigDecimal budAmt;
    /** 已用金额 */
    private BigDecimal useAmt;
    /** 预算的毛利 */
    private BigDecimal grossProfit;
    /** 已用金额百分比 */
    private String useAmtRate;
    public BigDecimal getBudAmt(){
        return budAmt;
    }
    public void setBudAmt(BigDecimal budAmt){
        this.budAmt = budAmt;
    }
    public BigDecimal getUseAmt(){
        return useAmt;
    }
    public void setUseAmt(BigDecimal useAmt){
        this.useAmt = useAmt;
    }
    public BigDecimal getGrossProfit(){
        return grossProfit;
    }
    public void setGrossProfit(BigDecimal grossProfit){
        this.grossProfit = grossProfit;
    }
    public String getUseAmtRate(){
        if(StringUtils.isEmpty(useAmtRate)){
            double percentage = useAmt.divide(budAmt,BigDecimal.ROUND_HALF_UP).doubleValue();
            NumberFormat nt = NumberFormat.getPercentInstance();  
            //设置百分数精确度2即保留两位小数  
            nt.setMinimumFractionDigits(2); 
            useAmtRate =  nt.format(percentage);
        }
        return useAmtRate;
    }
    public void setUseAmtRate(String useAmtRate){
        this.useAmtRate = useAmtRate;
    }
}
