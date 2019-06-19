package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TTrPurPayPlanDtl implements Serializable {
    private String planDtlId;

    private String planId;

    private Integer orderId;

    private String payProp;

    private String befOrAftGoods;

    private Long pwId;

    private String dateTrm;

    private Integer days;

    private Date planPayDate;

    private String currType;

    private String isFixedCurrRate;

    private BigDecimal payRate;

    private String amtRefType;

    private BigDecimal payAmt;

    private String remark;

    private String payDesc;

    private static final long serialVersionUID = 1L;

    public String getPlanDtlId() {
        return planDtlId;
    }

    public void setPlanDtlId(String planDtlId) {
        this.planDtlId = planDtlId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPayProp() {
        return payProp;
    }

    public void setPayProp(String payProp) {
        this.payProp = payProp;
    }

    public String getBefOrAftGoods() {
        return befOrAftGoods;
    }

    public void setBefOrAftGoods(String befOrAftGoods) {
        this.befOrAftGoods = befOrAftGoods;
    }

    public Long getPwId() {
        return pwId;
    }

    public void setPwId(Long pwId) {
        this.pwId = pwId;
    }

    public String getDateTrm() {
        return dateTrm;
    }

    public void setDateTrm(String dateTrm) {
        this.dateTrm = dateTrm;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Date getPlanPayDate() {
        return planPayDate;
    }

    public void setPlanPayDate(Date planPayDate) {
        this.planPayDate = planPayDate;
    }

    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
    }

    public String getIsFixedCurrRate() {
        return isFixedCurrRate;
    }

    public void setIsFixedCurrRate(String isFixedCurrRate) {
        this.isFixedCurrRate = isFixedCurrRate;
    }

    public BigDecimal getPayRate() {
        return payRate;
    }

    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    public String getAmtRefType() {
        return amtRefType;
    }

    public void setAmtRefType(String amtRefType) {
        this.amtRefType = amtRefType;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TTrPurPayPlanDtl other = (TTrPurPayPlanDtl) that;
        return (this.getPlanDtlId() == null ? other.getPlanDtlId() == null : this.getPlanDtlId().equals(other.getPlanDtlId()))
            && (this.getPlanId() == null ? other.getPlanId() == null : this.getPlanId().equals(other.getPlanId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPayProp() == null ? other.getPayProp() == null : this.getPayProp().equals(other.getPayProp()))
            && (this.getBefOrAftGoods() == null ? other.getBefOrAftGoods() == null : this.getBefOrAftGoods().equals(other.getBefOrAftGoods()))
            && (this.getPwId() == null ? other.getPwId() == null : this.getPwId().equals(other.getPwId()))
            && (this.getDateTrm() == null ? other.getDateTrm() == null : this.getDateTrm().equals(other.getDateTrm()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()))
            && (this.getPlanPayDate() == null ? other.getPlanPayDate() == null : this.getPlanPayDate().equals(other.getPlanPayDate()))
            && (this.getCurrType() == null ? other.getCurrType() == null : this.getCurrType().equals(other.getCurrType()))
            && (this.getIsFixedCurrRate() == null ? other.getIsFixedCurrRate() == null : this.getIsFixedCurrRate().equals(other.getIsFixedCurrRate()))
            && (this.getPayRate() == null ? other.getPayRate() == null : this.getPayRate().equals(other.getPayRate()))
            && (this.getAmtRefType() == null ? other.getAmtRefType() == null : this.getAmtRefType().equals(other.getAmtRefType()))
            && (this.getPayAmt() == null ? other.getPayAmt() == null : this.getPayAmt().equals(other.getPayAmt()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPayDesc() == null ? other.getPayDesc() == null : this.getPayDesc().equals(other.getPayDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlanDtlId() == null) ? 0 : getPlanDtlId().hashCode());
        result = prime * result + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPayProp() == null) ? 0 : getPayProp().hashCode());
        result = prime * result + ((getBefOrAftGoods() == null) ? 0 : getBefOrAftGoods().hashCode());
        result = prime * result + ((getPwId() == null) ? 0 : getPwId().hashCode());
        result = prime * result + ((getDateTrm() == null) ? 0 : getDateTrm().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        result = prime * result + ((getPlanPayDate() == null) ? 0 : getPlanPayDate().hashCode());
        result = prime * result + ((getCurrType() == null) ? 0 : getCurrType().hashCode());
        result = prime * result + ((getIsFixedCurrRate() == null) ? 0 : getIsFixedCurrRate().hashCode());
        result = prime * result + ((getPayRate() == null) ? 0 : getPayRate().hashCode());
        result = prime * result + ((getAmtRefType() == null) ? 0 : getAmtRefType().hashCode());
        result = prime * result + ((getPayAmt() == null) ? 0 : getPayAmt().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPayDesc() == null) ? 0 : getPayDesc().hashCode());
        return result;
    }
}