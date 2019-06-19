package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProjCeecBudReg implements Serializable {
    private String intId;

    private String preIntId;

    private Short regOrder;

    private String projType;

    private String projId;

    private String projNo;

    private String projName;

    private BigDecimal projIncomeRmb;

    private BigDecimal projCostRmb;

    private BigDecimal projProfitRmb;

    private String isValid;

    private Date mDate;

    private Long mUserId;

    private Long uUserId;

    private Date uDate;

    private String remark;

    private BigDecimal preProjIncomeRmb;

    private BigDecimal preProjCostRmb;

    private BigDecimal preProjProfitRmb;

    private String confirm;

    private static final long serialVersionUID = 1L;

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getPreIntId() {
        return preIntId;
    }

    public void setPreIntId(String preIntId) {
        this.preIntId = preIntId;
    }

    public Short getRegOrder() {
        return regOrder;
    }

    public void setRegOrder(Short regOrder) {
        this.regOrder = regOrder;
    }

    public String getProjType() {
        return projType;
    }

    public void setProjType(String projType) {
        this.projType = projType;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getProjNo() {
        return projNo;
    }

    public void setProjNo(String projNo) {
        this.projNo = projNo;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public BigDecimal getProjIncomeRmb() {
        return projIncomeRmb;
    }

    public void setProjIncomeRmb(BigDecimal projIncomeRmb) {
        this.projIncomeRmb = projIncomeRmb;
    }

    public BigDecimal getProjCostRmb() {
        return projCostRmb;
    }

    public void setProjCostRmb(BigDecimal projCostRmb) {
        this.projCostRmb = projCostRmb;
    }

    public BigDecimal getProjProfitRmb() {
        return projProfitRmb;
    }

    public void setProjProfitRmb(BigDecimal projProfitRmb) {
        this.projProfitRmb = projProfitRmb;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Long getmUserId() {
        return mUserId;
    }

    public void setmUserId(Long mUserId) {
        this.mUserId = mUserId;
    }

    public Long getuUserId() {
        return uUserId;
    }

    public void setuUserId(Long uUserId) {
        this.uUserId = uUserId;
    }

    public Date getuDate() {
        return uDate;
    }

    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getPreProjIncomeRmb() {
        return preProjIncomeRmb;
    }

    public void setPreProjIncomeRmb(BigDecimal preProjIncomeRmb) {
        this.preProjIncomeRmb = preProjIncomeRmb;
    }

    public BigDecimal getPreProjCostRmb() {
        return preProjCostRmb;
    }

    public void setPreProjCostRmb(BigDecimal preProjCostRmb) {
        this.preProjCostRmb = preProjCostRmb;
    }

    public BigDecimal getPreProjProfitRmb() {
        return preProjProfitRmb;
    }

    public void setPreProjProfitRmb(BigDecimal preProjProfitRmb) {
        this.preProjProfitRmb = preProjProfitRmb;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

}