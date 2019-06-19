package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProjCeecBudUseReview implements Serializable {
    private String intId;

    private String projId;

    private String basicUseId;

    private String basicBudId;

    private String tobType;

    private String tobId;

    private Date createDate;

    private BigDecimal useAmt;

    private String useCurrType;

    private BigDecimal useCurrRate;

    private BigDecimal useAmtRmb;

    private String tagType;

    private static final long serialVersionUID = 1L;

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getBasicUseId() {
        return basicUseId;
    }

    public void setBasicUseId(String basicUseId) {
        this.basicUseId = basicUseId;
    }

    public String getBasicBudId() {
        return basicBudId;
    }

    public void setBasicBudId(String basicBudId) {
        this.basicBudId = basicBudId;
    }

    public String getTobType() {
        return tobType;
    }

    public void setTobType(String tobType) {
        this.tobType = tobType;
    }

    public String getTobId() {
        return tobId;
    }

    public void setTobId(String tobId) {
        this.tobId = tobId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getUseAmt() {
        return useAmt;
    }

    public void setUseAmt(BigDecimal useAmt) {
        this.useAmt = useAmt;
    }

    public String getUseCurrType() {
        return useCurrType;
    }

    public void setUseCurrType(String useCurrType) {
        this.useCurrType = useCurrType;
    }

    public BigDecimal getUseCurrRate() {
        return useCurrRate;
    }

    public void setUseCurrRate(BigDecimal useCurrRate) {
        this.useCurrRate = useCurrRate;
    }

    public BigDecimal getUseAmtRmb() {
        return useAmtRmb;
    }

    public void setUseAmtRmb(BigDecimal useAmtRmb) {
        this.useAmtRmb = useAmtRmb;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
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
        TProjCeecBudUseReview other = (TProjCeecBudUseReview) that;
        return (this.getIntId() == null ? other.getIntId() == null : this.getIntId().equals(other.getIntId()))
            && (this.getProjId() == null ? other.getProjId() == null : this.getProjId().equals(other.getProjId()))
            && (this.getBasicUseId() == null ? other.getBasicUseId() == null : this.getBasicUseId().equals(other.getBasicUseId()))
            && (this.getBasicBudId() == null ? other.getBasicBudId() == null : this.getBasicBudId().equals(other.getBasicBudId()))
            && (this.getTobType() == null ? other.getTobType() == null : this.getTobType().equals(other.getTobType()))
            && (this.getTobId() == null ? other.getTobId() == null : this.getTobId().equals(other.getTobId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUseAmt() == null ? other.getUseAmt() == null : this.getUseAmt().equals(other.getUseAmt()))
            && (this.getUseCurrType() == null ? other.getUseCurrType() == null : this.getUseCurrType().equals(other.getUseCurrType()))
            && (this.getUseCurrRate() == null ? other.getUseCurrRate() == null : this.getUseCurrRate().equals(other.getUseCurrRate()))
            && (this.getUseAmtRmb() == null ? other.getUseAmtRmb() == null : this.getUseAmtRmb().equals(other.getUseAmtRmb()))
            && (this.getTagType() == null ? other.getTagType() == null : this.getTagType().equals(other.getTagType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntId() == null) ? 0 : getIntId().hashCode());
        result = prime * result + ((getProjId() == null) ? 0 : getProjId().hashCode());
        result = prime * result + ((getBasicUseId() == null) ? 0 : getBasicUseId().hashCode());
        result = prime * result + ((getBasicBudId() == null) ? 0 : getBasicBudId().hashCode());
        result = prime * result + ((getTobType() == null) ? 0 : getTobType().hashCode());
        result = prime * result + ((getTobId() == null) ? 0 : getTobId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUseAmt() == null) ? 0 : getUseAmt().hashCode());
        result = prime * result + ((getUseCurrType() == null) ? 0 : getUseCurrType().hashCode());
        result = prime * result + ((getUseCurrRate() == null) ? 0 : getUseCurrRate().hashCode());
        result = prime * result + ((getUseAmtRmb() == null) ? 0 : getUseAmtRmb().hashCode());
        result = prime * result + ((getTagType() == null) ? 0 : getTagType().hashCode());
        return result;
    }
}