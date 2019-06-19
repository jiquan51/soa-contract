package com.sumec.project.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sumec.project.entity.TSubContractCmd;
import com.sumec.project.entity.TTrPurPayPlanDtl;

/**
 * Created by daitiantian on 2017/11/16.
 */
public class SubcontractDetailsEntity implements Serializable {

    private static final long serialVersionUID = 5017892809180822853L;
    private BigDecimal bcId;
    private String cNo;
    private String cStatus;
    private String conName;
    private String fctName;
    private Long destNationId;
    private String purchaserName;
    private BigDecimal pQuant;
    private String currType;
    private BigDecimal pAmt;
    private String cType;
    private Date mDate;
    private String makerName;
    private List<TSubContractCmd> subContractCmd;
    private List<TTrPurPayPlanDtl> trPurPayPlanDtl;

    public SubcontractReview getSubcontractReview() {
        return subcontractReview;
    }

    public void setSubcontractReview(SubcontractReview subcontractReview) {
        this.subcontractReview = subcontractReview;
    }

    private SubcontractReview subcontractReview;


    public List<TTrPurPayPlanDtl> getTrPurPayPlanDtl() {
        return trPurPayPlanDtl;
    }

    public void setTrPurPayPlanDtl(List<TTrPurPayPlanDtl> trPurPayPlanDtl) {
        this.trPurPayPlanDtl = trPurPayPlanDtl;
    }

    public List<TSubContractCmd> getSubContractCmd() {
        return subContractCmd;
    }

    public void setSubContractCmd(List<TSubContractCmd> subContractCmd) {
        this.subContractCmd = subContractCmd;
    }





    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
    }

    public Long getDestNationId() {
        return destNationId;
    }

    public void setDestNationId(Long destNationId) {
        this.destNationId = destNationId;
    }

    public String getFctName() {
        return fctName;
    }

    public void setFctName(String fctName) {
        this.fctName = fctName;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public BigDecimal getpAmt() {
        return pAmt;
    }

    public void setpAmt(BigDecimal pAmt) {
        this.pAmt = pAmt;
    }

    public BigDecimal getpQuant() {
        return pQuant;
    }

    public void setpQuant(BigDecimal pQuant) {
        this.pQuant = pQuant;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }


}
