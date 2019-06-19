package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TProjCeec implements Serializable {
    private BigDecimal projId;

    private String projNo;

    private String projName;

    private String projAddress;

    private BigDecimal kId;

    private String inlandOrOverseas;

    private Long projNationId;

    private BigDecimal ownerId;

    private String ownerName;

    private String fundType;

    private String signCNo;

    private Date signDate;

    private String signAddress;

    private BigDecimal signerId;

    private String accNo;

    private String signAmtInfo;

    private Date effectDate;

    private Long projOrgId;

    private Long pmUserId;

    private Date yStartDate;

    private Date yEndDate;

    private BigDecimal projTl;

    private String projTlUnit;

    private String remark;

    private String projStatus;

    private Long mUserId;

    private Date mDate;

    private Long muOrgId;

    private Long uUserId;

    private Date uDate;

    private String confirm;

    private BigDecimal rgeTmplId;

    private BigDecimal detTmplId;

    private BigDecimal budTmplId;

    private BigDecimal cellId;

    private String signerName;

    private String projCode;

    private BigDecimal startId;

    private BigDecimal tId;

    private String ownerCNo;

    private String projBussType;

    private String isMig;

    private static final long serialVersionUID = 1L;

    public BigDecimal getProjId() {
        return projId;
    }

    public void setProjId(BigDecimal projId) {
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

    public String getProjAddress() {
        return projAddress;
    }

    public void setProjAddress(String projAddress) {
        this.projAddress = projAddress;
    }

    public BigDecimal getkId() {
        return kId;
    }

    public void setkId(BigDecimal kId) {
        this.kId = kId;
    }

    public String getInlandOrOverseas() {
        return inlandOrOverseas;
    }

    public void setInlandOrOverseas(String inlandOrOverseas) {
        this.inlandOrOverseas = inlandOrOverseas;
    }

    public Long getProjNationId() {
        return projNationId;
    }

    public void setProjNationId(Long projNationId) {
        this.projNationId = projNationId;
    }

    public BigDecimal getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(BigDecimal ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getSignCNo() {
        return signCNo;
    }

    public void setSignCNo(String signCNo) {
        this.signCNo = signCNo;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getSignAddress() {
        return signAddress;
    }

    public void setSignAddress(String signAddress) {
        this.signAddress = signAddress;
    }

    public BigDecimal getSignerId() {
        return signerId;
    }

    public void setSignerId(BigDecimal signerId) {
        this.signerId = signerId;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getSignAmtInfo() {
        return signAmtInfo;
    }

    public void setSignAmtInfo(String signAmtInfo) {
        this.signAmtInfo = signAmtInfo;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Long getProjOrgId() {
        return projOrgId;
    }

    public void setProjOrgId(Long projOrgId) {
        this.projOrgId = projOrgId;
    }

    public Long getPmUserId() {
        return pmUserId;
    }

    public void setPmUserId(Long pmUserId) {
        this.pmUserId = pmUserId;
    }

    public Date getyStartDate() {
        return yStartDate;
    }

    public void setyStartDate(Date yStartDate) {
        this.yStartDate = yStartDate;
    }

    public Date getyEndDate() {
        return yEndDate;
    }

    public void setyEndDate(Date yEndDate) {
        this.yEndDate = yEndDate;
    }

    public BigDecimal getProjTl() {
        return projTl;
    }

    public void setProjTl(BigDecimal projTl) {
        this.projTl = projTl;
    }

    public String getProjTlUnit() {
        return projTlUnit;
    }

    public void setProjTlUnit(String projTlUnit) {
        this.projTlUnit = projTlUnit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProjStatus() {
        if(projStatus == null){
            projStatus = "";
        }
        return projStatus;
    }

    public void setProjStatus(String projStatus) {
        this.projStatus = projStatus;
    }

    public Long getmUserId() {
        return mUserId;
    }

    public void setmUserId(Long mUserId) {
        this.mUserId = mUserId;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Long getMuOrgId() {
        return muOrgId;
    }

    public void setMuOrgId(Long muOrgId) {
        this.muOrgId = muOrgId;
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

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public BigDecimal getRgeTmplId() {
        return rgeTmplId;
    }

    public void setRgeTmplId(BigDecimal rgeTmplId) {
        this.rgeTmplId = rgeTmplId;
    }

    public BigDecimal getDetTmplId() {
        return detTmplId;
    }

    public void setDetTmplId(BigDecimal detTmplId) {
        this.detTmplId = detTmplId;
    }

    public BigDecimal getBudTmplId() {
        return budTmplId;
    }

    public void setBudTmplId(BigDecimal budTmplId) {
        this.budTmplId = budTmplId;
    }

    public BigDecimal getCellId() {
        return cellId;
    }

    public void setCellId(BigDecimal cellId) {
        this.cellId = cellId;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }

    public String getProjCode() {
        return projCode;
    }

    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public BigDecimal getStartId() {
        return startId;
    }

    public void setStartId(BigDecimal startId) {
        this.startId = startId;
    }

    public BigDecimal gettId() {
        return tId;
    }

    public void settId(BigDecimal tId) {
        this.tId = tId;
    }

    public String getOwnerCNo() {
        return ownerCNo;
    }

    public void setOwnerCNo(String ownerCNo) {
        this.ownerCNo = ownerCNo;
    }

    public String getProjBussType() {
        return projBussType;
    }

    public void setProjBussType(String projBussType) {
        this.projBussType = projBussType;
    }

    public String getIsMig() {
        return isMig;
    }

    public void setIsMig(String isMig) {
        this.isMig = isMig;
    }
}