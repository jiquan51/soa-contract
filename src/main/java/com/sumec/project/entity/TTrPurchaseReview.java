package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TTrPurchaseReview implements Serializable {
    private String intId;

    private String fmSeqId;

    private String userName;

    private Date mDate;

    private String ocuName;

    private String ocuOrgName;

    private String refType;

    private String refId;

    private String bcNo;

    private Date signDate;

    private String accName;

    private String fctShortName;

    private String fctName;

    private Date deliDate;

    private BigDecimal amt;

    private String currType;

    private BigDecimal quant;

    private String payTerm;

    private String proId;

    private String proNo;

    private String proName;

    private String proType;

    private String proCust;

    private BigDecimal proAmt;

    private BigDecimal proSignAmt;

    private BigDecimal proIncome;

    private BigDecimal proCost;

    private BigDecimal proProfit;

    private BigDecimal proProfitRate;

    private String commDesc;

    private String commMat;

    private BigDecimal dhRate;

    private BigDecimal payRate;

    private BigDecimal invRate;

    private String typeOfCon;

    private String scNo;

    private String scCurrType;

    private BigDecimal scAmt;

    private String scPatName;

    private BigDecimal scProfitAmt;

    private BigDecimal scExchangecost;

    private BigDecimal inhandConNum;

    private BigDecimal inhandAmt;

    private BigDecimal overdueQuant;

    private BigDecimal overdueAmt;

    private String isValid;

    private String budName;

    private String conName;

    private static final long serialVersionUID = 1L;

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getFmSeqId() {
        return fmSeqId;
    }

    public void setFmSeqId(String fmSeqId) {
        this.fmSeqId = fmSeqId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getOcuName() {
        return ocuName;
    }

    public void setOcuName(String ocuName) {
        this.ocuName = ocuName;
    }

    public String getOcuOrgName() {
        return ocuOrgName;
    }

    public void setOcuOrgName(String ocuOrgName) {
        this.ocuOrgName = ocuOrgName;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getBcNo() {
        return bcNo;
    }

    public void setBcNo(String bcNo) {
        this.bcNo = bcNo;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getFctShortName() {
        return fctShortName;
    }

    public void setFctShortName(String fctShortName) {
        this.fctShortName = fctShortName;
    }

    public String getFctName() {
        return fctName;
    }

    public void setFctName(String fctName) {
        this.fctName = fctName;
    }

    public Date getDeliDate() {
        return deliDate;
    }

    public void setDeliDate(Date deliDate) {
        this.deliDate = deliDate;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
    }

    public BigDecimal getQuant() {
        return quant;
    }

    public void setQuant(BigDecimal quant) {
        this.quant = quant;
    }

    public String getPayTerm() {
        return payTerm;
    }

    public void setPayTerm(String payTerm) {
        this.payTerm = payTerm;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProCust() {
        return proCust;
    }

    public void setProCust(String proCust) {
        this.proCust = proCust;
    }

    public BigDecimal getProAmt() {
        return proAmt;
    }

    public void setProAmt(BigDecimal proAmt) {
        this.proAmt = proAmt;
    }

    public BigDecimal getProSignAmt() {
        return proSignAmt;
    }

    public void setProSignAmt(BigDecimal proSignAmt) {
        this.proSignAmt = proSignAmt;
    }

    public BigDecimal getProIncome() {
        return proIncome;
    }

    public void setProIncome(BigDecimal proIncome) {
        this.proIncome = proIncome;
    }

    public BigDecimal getProCost() {
        return proCost;
    }

    public void setProCost(BigDecimal proCost) {
        this.proCost = proCost;
    }

    public BigDecimal getProProfit() {
        return proProfit;
    }

    public void setProProfit(BigDecimal proProfit) {
        this.proProfit = proProfit;
    }

    public BigDecimal getProProfitRate() {
        return proProfitRate;
    }

    public void setProProfitRate(BigDecimal proProfitRate) {
        this.proProfitRate = proProfitRate;
    }

    public String getCommDesc() {
        return commDesc;
    }

    public void setCommDesc(String commDesc) {
        this.commDesc = commDesc;
    }

    public String getCommMat() {
        return commMat;
    }

    public void setCommMat(String commMat) {
        this.commMat = commMat;
    }

    public BigDecimal getDhRate() {
        return dhRate;
    }

    public void setDhRate(BigDecimal dhRate) {
        this.dhRate = dhRate;
    }

    public BigDecimal getPayRate() {
        return payRate;
    }

    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    public BigDecimal getInvRate() {
        return invRate;
    }

    public void setInvRate(BigDecimal invRate) {
        this.invRate = invRate;
    }

    public String getTypeOfCon() {
        return typeOfCon;
    }

    public void setTypeOfCon(String typeOfCon) {
        this.typeOfCon = typeOfCon;
    }

    public String getScNo() {
        return scNo;
    }

    public void setScNo(String scNo) {
        this.scNo = scNo;
    }

    public String getScCurrType() {
        return scCurrType;
    }

    public void setScCurrType(String scCurrType) {
        this.scCurrType = scCurrType;
    }

    public BigDecimal getScAmt() {
        return scAmt;
    }

    public void setScAmt(BigDecimal scAmt) {
        this.scAmt = scAmt;
    }

    public String getScPatName() {
        return scPatName;
    }

    public void setScPatName(String scPatName) {
        this.scPatName = scPatName;
    }

    public BigDecimal getScProfitAmt() {
        return scProfitAmt;
    }

    public void setScProfitAmt(BigDecimal scProfitAmt) {
        this.scProfitAmt = scProfitAmt;
    }

    public BigDecimal getScExchangecost() {
        return scExchangecost;
    }

    public void setScExchangecost(BigDecimal scExchangecost) {
        this.scExchangecost = scExchangecost;
    }

    public BigDecimal getInhandConNum() {
        return inhandConNum;
    }

    public void setInhandConNum(BigDecimal inhandConNum) {
        this.inhandConNum = inhandConNum;
    }

    public BigDecimal getInhandAmt() {
        return inhandAmt;
    }

    public void setInhandAmt(BigDecimal inhandAmt) {
        this.inhandAmt = inhandAmt;
    }

    public BigDecimal getOverdueQuant() {
        return overdueQuant;
    }

    public void setOverdueQuant(BigDecimal overdueQuant) {
        this.overdueQuant = overdueQuant;
    }

    public BigDecimal getOverdueAmt() {
        return overdueAmt;
    }

    public void setOverdueAmt(BigDecimal overdueAmt) {
        this.overdueAmt = overdueAmt;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getBudName() {
        return budName;
    }

    public void setBudName(String budName) {
        this.budName = budName;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
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
        TTrPurchaseReview other = (TTrPurchaseReview) that;
        return (this.getIntId() == null ? other.getIntId() == null : this.getIntId().equals(other.getIntId()))
            && (this.getFmSeqId() == null ? other.getFmSeqId() == null : this.getFmSeqId().equals(other.getFmSeqId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getmDate() == null ? other.getmDate() == null : this.getmDate().equals(other.getmDate()))
            && (this.getOcuName() == null ? other.getOcuName() == null : this.getOcuName().equals(other.getOcuName()))
            && (this.getOcuOrgName() == null ? other.getOcuOrgName() == null : this.getOcuOrgName().equals(other.getOcuOrgName()))
            && (this.getRefType() == null ? other.getRefType() == null : this.getRefType().equals(other.getRefType()))
            && (this.getRefId() == null ? other.getRefId() == null : this.getRefId().equals(other.getRefId()))
            && (this.getBcNo() == null ? other.getBcNo() == null : this.getBcNo().equals(other.getBcNo()))
            && (this.getSignDate() == null ? other.getSignDate() == null : this.getSignDate().equals(other.getSignDate()))
            && (this.getAccName() == null ? other.getAccName() == null : this.getAccName().equals(other.getAccName()))
            && (this.getFctShortName() == null ? other.getFctShortName() == null : this.getFctShortName().equals(other.getFctShortName()))
            && (this.getFctName() == null ? other.getFctName() == null : this.getFctName().equals(other.getFctName()))
            && (this.getDeliDate() == null ? other.getDeliDate() == null : this.getDeliDate().equals(other.getDeliDate()))
            && (this.getAmt() == null ? other.getAmt() == null : this.getAmt().equals(other.getAmt()))
            && (this.getCurrType() == null ? other.getCurrType() == null : this.getCurrType().equals(other.getCurrType()))
            && (this.getQuant() == null ? other.getQuant() == null : this.getQuant().equals(other.getQuant()))
            && (this.getPayTerm() == null ? other.getPayTerm() == null : this.getPayTerm().equals(other.getPayTerm()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProNo() == null ? other.getProNo() == null : this.getProNo().equals(other.getProNo()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProType() == null ? other.getProType() == null : this.getProType().equals(other.getProType()))
            && (this.getProCust() == null ? other.getProCust() == null : this.getProCust().equals(other.getProCust()))
            && (this.getProAmt() == null ? other.getProAmt() == null : this.getProAmt().equals(other.getProAmt()))
            && (this.getProSignAmt() == null ? other.getProSignAmt() == null : this.getProSignAmt().equals(other.getProSignAmt()))
            && (this.getProIncome() == null ? other.getProIncome() == null : this.getProIncome().equals(other.getProIncome()))
            && (this.getProCost() == null ? other.getProCost() == null : this.getProCost().equals(other.getProCost()))
            && (this.getProProfit() == null ? other.getProProfit() == null : this.getProProfit().equals(other.getProProfit()))
            && (this.getProProfitRate() == null ? other.getProProfitRate() == null : this.getProProfitRate().equals(other.getProProfitRate()))
            && (this.getCommDesc() == null ? other.getCommDesc() == null : this.getCommDesc().equals(other.getCommDesc()))
            && (this.getCommMat() == null ? other.getCommMat() == null : this.getCommMat().equals(other.getCommMat()))
            && (this.getDhRate() == null ? other.getDhRate() == null : this.getDhRate().equals(other.getDhRate()))
            && (this.getPayRate() == null ? other.getPayRate() == null : this.getPayRate().equals(other.getPayRate()))
            && (this.getInvRate() == null ? other.getInvRate() == null : this.getInvRate().equals(other.getInvRate()))
            && (this.getTypeOfCon() == null ? other.getTypeOfCon() == null : this.getTypeOfCon().equals(other.getTypeOfCon()))
            && (this.getScNo() == null ? other.getScNo() == null : this.getScNo().equals(other.getScNo()))
            && (this.getScCurrType() == null ? other.getScCurrType() == null : this.getScCurrType().equals(other.getScCurrType()))
            && (this.getScAmt() == null ? other.getScAmt() == null : this.getScAmt().equals(other.getScAmt()))
            && (this.getScPatName() == null ? other.getScPatName() == null : this.getScPatName().equals(other.getScPatName()))
            && (this.getScProfitAmt() == null ? other.getScProfitAmt() == null : this.getScProfitAmt().equals(other.getScProfitAmt()))
            && (this.getScExchangecost() == null ? other.getScExchangecost() == null : this.getScExchangecost().equals(other.getScExchangecost()))
            && (this.getInhandConNum() == null ? other.getInhandConNum() == null : this.getInhandConNum().equals(other.getInhandConNum()))
            && (this.getInhandAmt() == null ? other.getInhandAmt() == null : this.getInhandAmt().equals(other.getInhandAmt()))
            && (this.getOverdueQuant() == null ? other.getOverdueQuant() == null : this.getOverdueQuant().equals(other.getOverdueQuant()))
            && (this.getOverdueAmt() == null ? other.getOverdueAmt() == null : this.getOverdueAmt().equals(other.getOverdueAmt()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getBudName() == null ? other.getBudName() == null : this.getBudName().equals(other.getBudName()))
            && (this.getConName() == null ? other.getConName() == null : this.getConName().equals(other.getConName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntId() == null) ? 0 : getIntId().hashCode());
        result = prime * result + ((getFmSeqId() == null) ? 0 : getFmSeqId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getmDate() == null) ? 0 : getmDate().hashCode());
        result = prime * result + ((getOcuName() == null) ? 0 : getOcuName().hashCode());
        result = prime * result + ((getOcuOrgName() == null) ? 0 : getOcuOrgName().hashCode());
        result = prime * result + ((getRefType() == null) ? 0 : getRefType().hashCode());
        result = prime * result + ((getRefId() == null) ? 0 : getRefId().hashCode());
        result = prime * result + ((getBcNo() == null) ? 0 : getBcNo().hashCode());
        result = prime * result + ((getSignDate() == null) ? 0 : getSignDate().hashCode());
        result = prime * result + ((getAccName() == null) ? 0 : getAccName().hashCode());
        result = prime * result + ((getFctShortName() == null) ? 0 : getFctShortName().hashCode());
        result = prime * result + ((getFctName() == null) ? 0 : getFctName().hashCode());
        result = prime * result + ((getDeliDate() == null) ? 0 : getDeliDate().hashCode());
        result = prime * result + ((getAmt() == null) ? 0 : getAmt().hashCode());
        result = prime * result + ((getCurrType() == null) ? 0 : getCurrType().hashCode());
        result = prime * result + ((getQuant() == null) ? 0 : getQuant().hashCode());
        result = prime * result + ((getPayTerm() == null) ? 0 : getPayTerm().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProNo() == null) ? 0 : getProNo().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProType() == null) ? 0 : getProType().hashCode());
        result = prime * result + ((getProCust() == null) ? 0 : getProCust().hashCode());
        result = prime * result + ((getProAmt() == null) ? 0 : getProAmt().hashCode());
        result = prime * result + ((getProSignAmt() == null) ? 0 : getProSignAmt().hashCode());
        result = prime * result + ((getProIncome() == null) ? 0 : getProIncome().hashCode());
        result = prime * result + ((getProCost() == null) ? 0 : getProCost().hashCode());
        result = prime * result + ((getProProfit() == null) ? 0 : getProProfit().hashCode());
        result = prime * result + ((getProProfitRate() == null) ? 0 : getProProfitRate().hashCode());
        result = prime * result + ((getCommDesc() == null) ? 0 : getCommDesc().hashCode());
        result = prime * result + ((getCommMat() == null) ? 0 : getCommMat().hashCode());
        result = prime * result + ((getDhRate() == null) ? 0 : getDhRate().hashCode());
        result = prime * result + ((getPayRate() == null) ? 0 : getPayRate().hashCode());
        result = prime * result + ((getInvRate() == null) ? 0 : getInvRate().hashCode());
        result = prime * result + ((getTypeOfCon() == null) ? 0 : getTypeOfCon().hashCode());
        result = prime * result + ((getScNo() == null) ? 0 : getScNo().hashCode());
        result = prime * result + ((getScCurrType() == null) ? 0 : getScCurrType().hashCode());
        result = prime * result + ((getScAmt() == null) ? 0 : getScAmt().hashCode());
        result = prime * result + ((getScPatName() == null) ? 0 : getScPatName().hashCode());
        result = prime * result + ((getScProfitAmt() == null) ? 0 : getScProfitAmt().hashCode());
        result = prime * result + ((getScExchangecost() == null) ? 0 : getScExchangecost().hashCode());
        result = prime * result + ((getInhandConNum() == null) ? 0 : getInhandConNum().hashCode());
        result = prime * result + ((getInhandAmt() == null) ? 0 : getInhandAmt().hashCode());
        result = prime * result + ((getOverdueQuant() == null) ? 0 : getOverdueQuant().hashCode());
        result = prime * result + ((getOverdueAmt() == null) ? 0 : getOverdueAmt().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getBudName() == null) ? 0 : getBudName().hashCode());
        result = prime * result + ((getConName() == null) ? 0 : getConName().hashCode());
        return result;
    }
}