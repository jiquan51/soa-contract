package com.sumec.project.entity;

import java.io.Serializable;

public class TProjCeecBudBasic implements Serializable {
    private String intId;

    private String bbudType;

    private String bbudCode;

    private String bbudName;

    private String bbudDefCurr;

    private String bbudRemark;

    private String fIntId;

    private String isBud;

    private String isUse;

    private String bbudTypeCata;

    private String addMinusTag;

    private String isSign;

    private static final long serialVersionUID = 1L;

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getBbudType() {
        return bbudType;
    }

    public void setBbudType(String bbudType) {
        this.bbudType = bbudType;
    }

    public String getBbudCode() {
        return bbudCode;
    }

    public void setBbudCode(String bbudCode) {
        this.bbudCode = bbudCode;
    }

    public String getBbudName() {
        return bbudName;
    }

    public void setBbudName(String bbudName) {
        this.bbudName = bbudName;
    }

    public String getBbudDefCurr() {
        return bbudDefCurr;
    }

    public void setBbudDefCurr(String bbudDefCurr) {
        this.bbudDefCurr = bbudDefCurr;
    }

    public String getBbudRemark() {
        return bbudRemark;
    }

    public void setBbudRemark(String bbudRemark) {
        this.bbudRemark = bbudRemark;
    }

    public String getfIntId() {
        return fIntId;
    }

    public void setfIntId(String fIntId) {
        this.fIntId = fIntId;
    }

    public String getIsBud() {
        return isBud;
    }

    public void setIsBud(String isBud) {
        this.isBud = isBud;
    }

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }

    public String getBbudTypeCata() {
        return bbudTypeCata;
    }

    public void setBbudTypeCata(String bbudTypeCata) {
        this.bbudTypeCata = bbudTypeCata;
    }

    public String getAddMinusTag() {
        return addMinusTag;
    }

    public void setAddMinusTag(String addMinusTag) {
        this.addMinusTag = addMinusTag;
    }

    public String getIsSign() {
        return isSign;
    }

    public void setIsSign(String isSign) {
        this.isSign = isSign;
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
        TProjCeecBudBasic other = (TProjCeecBudBasic) that;
        return (this.getIntId() == null ? other.getIntId() == null : this.getIntId().equals(other.getIntId()))
            && (this.getBbudType() == null ? other.getBbudType() == null : this.getBbudType().equals(other.getBbudType()))
            && (this.getBbudCode() == null ? other.getBbudCode() == null : this.getBbudCode().equals(other.getBbudCode()))
            && (this.getBbudName() == null ? other.getBbudName() == null : this.getBbudName().equals(other.getBbudName()))
            && (this.getBbudDefCurr() == null ? other.getBbudDefCurr() == null : this.getBbudDefCurr().equals(other.getBbudDefCurr()))
            && (this.getBbudRemark() == null ? other.getBbudRemark() == null : this.getBbudRemark().equals(other.getBbudRemark()))
            && (this.getfIntId() == null ? other.getfIntId() == null : this.getfIntId().equals(other.getfIntId()))
            && (this.getIsBud() == null ? other.getIsBud() == null : this.getIsBud().equals(other.getIsBud()))
            && (this.getIsUse() == null ? other.getIsUse() == null : this.getIsUse().equals(other.getIsUse()))
            && (this.getBbudTypeCata() == null ? other.getBbudTypeCata() == null : this.getBbudTypeCata().equals(other.getBbudTypeCata()))
            && (this.getAddMinusTag() == null ? other.getAddMinusTag() == null : this.getAddMinusTag().equals(other.getAddMinusTag()))
            && (this.getIsSign() == null ? other.getIsSign() == null : this.getIsSign().equals(other.getIsSign()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntId() == null) ? 0 : getIntId().hashCode());
        result = prime * result + ((getBbudType() == null) ? 0 : getBbudType().hashCode());
        result = prime * result + ((getBbudCode() == null) ? 0 : getBbudCode().hashCode());
        result = prime * result + ((getBbudName() == null) ? 0 : getBbudName().hashCode());
        result = prime * result + ((getBbudDefCurr() == null) ? 0 : getBbudDefCurr().hashCode());
        result = prime * result + ((getBbudRemark() == null) ? 0 : getBbudRemark().hashCode());
        result = prime * result + ((getfIntId() == null) ? 0 : getfIntId().hashCode());
        result = prime * result + ((getIsBud() == null) ? 0 : getIsBud().hashCode());
        result = prime * result + ((getIsUse() == null) ? 0 : getIsUse().hashCode());
        result = prime * result + ((getBbudTypeCata() == null) ? 0 : getBbudTypeCata().hashCode());
        result = prime * result + ((getAddMinusTag() == null) ? 0 : getAddMinusTag().hashCode());
        result = prime * result + ((getIsSign() == null) ? 0 : getIsSign().hashCode());
        return result;
    }
}