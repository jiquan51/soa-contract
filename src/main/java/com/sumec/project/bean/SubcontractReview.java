package com.sumec.project.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by daitiantian on 2017/11/17.
 */
public class SubcontractReview implements Serializable {

    private static final long serialVersionUID = -8272984801898723665L;
    /** 项目总收款进度 */
    private String projIncomeSch;

    public String getExpBcSch() {
        return expBcSch;
    }

    public void setExpBcSch(String expBcSch) {
        this.expBcSch = expBcSch;
    }

    public BigDecimal getExpBcBudAmt() {
        return expBcBudAmt;
    }

    public void setExpBcBudAmt(BigDecimal expBcBudAmt) {
        this.expBcBudAmt = expBcBudAmt;
    }

    public String getExpBcBudName() {
        return expBcBudName;
    }

    public void setExpBcBudName(String expBcBudName) {
        this.expBcBudName = expBcBudName;
    }

    public BigDecimal getExpBcForIncome() {
        return expBcForIncome;
    }

    public void setExpBcForIncome(BigDecimal expBcForIncome) {
        this.expBcForIncome = expBcForIncome;
    }

    public BigDecimal getExpBcIncome() {
        return expBcIncome;
    }

    public void setExpBcIncome(BigDecimal expBcIncome) {
        this.expBcIncome = expBcIncome;
    }

    public String getProjIncomeSch() {
        return projIncomeSch;
    }

    public void setProjIncomeSch(String projIncomeSch) {
        this.projIncomeSch = projIncomeSch;
    }

    public String getProjSch() {
        return projSch;
    }

    public void setProjSch(String projSch) {
        this.projSch = projSch;
    }

    /** 总采购进度 */
    private String expBcSch;
    /** 预算项目总执行进度 */
    private String projSch;


    /** 当前采购预算名称 */
    private String expBcBudName;
    /** 预算金额 */
    private BigDecimal expBcBudAmt;
    /** 合同预估收入 */
    private BigDecimal expBcForIncome;
    /** 毛利 */
    private BigDecimal expBcIncome;
}
