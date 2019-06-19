package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProjCeecBudUse implements Serializable {
    private String intId;

    private String basicUseId;

    private String basicBudId;

    private String tobType;

    private String tobId;

    private BigDecimal useAmt;

    private String currType;

    private BigDecimal currRate;

    private BigDecimal useAmtRmb;

    private Date createDate;

    private String isBudControl;

    private String projId;

    private static final long serialVersionUID = 1L;

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
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

    public BigDecimal getUseAmt() {
        return useAmt;
    }

    public void setUseAmt(BigDecimal useAmt) {
        this.useAmt = useAmt;
    }

    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
    }

    public BigDecimal getCurrRate() {
        return currRate;
    }

    public void setCurrRate(BigDecimal currRate) {
        this.currRate = currRate;
    }

    public BigDecimal getUseAmtRmb() {
        return useAmtRmb;
    }

    public void setUseAmtRmb(BigDecimal useAmtRmb) {
        this.useAmtRmb = useAmtRmb;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsBudControl() {
        return isBudControl;
    }

    public void setIsBudControl(String isBudControl) {
        this.isBudControl = isBudControl;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }
}