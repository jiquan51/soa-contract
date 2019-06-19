package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TPubExc implements Serializable {
    private BigDecimal excId;

    private BigDecimal proIdFrom;

    private BigDecimal proIdTo;

    private String proTypeFrom;

    private String proTypeTo;

    private String proCodeFrom;

    private String proCodeTo;

    private BigDecimal cIdFrom;

    private BigDecimal cIdTo;

    private String cTypeFrom;

    private String cTypeTo;

    private String cNoFrom;

    private String cNoTo;

    private Long cstIdFrom;

    private Long cstIdTo;

    private String cstNoFrom;

    private String cstNoTo;

    private String cstNameFrom;

    private String cstNameTo;

    private String notes;

    private String confirm;

    private Date mDate;

    private Long orgId;

    private Long ocuId;

    private Long userId;

    private Long modifyUserId;

    private Date modifyDate;

    private Long checkUserId;

    private Date checkDate;

    private String excType;

    private String currType;

    private BigDecimal currRate;

    private BigDecimal excAmt;

    private String excFromType;

    private String excToType;

    private String calcAgent;

    private String excPayTrm;

    private Date excPayCdOpenDate;

    private Date excPayCdEndDate;

    private String excPayCdPayType;

    private String invStatus;

    private String overTag;

    private String dsfType;

    private BigDecimal oriId;

    private Short pzTag;

    private Date excDate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getExcId() {
        return excId;
    }

    public void setExcId(BigDecimal excId) {
        this.excId = excId;
    }

    public BigDecimal getProIdFrom() {
        return proIdFrom;
    }

    public void setProIdFrom(BigDecimal proIdFrom) {
        this.proIdFrom = proIdFrom;
    }

    public BigDecimal getProIdTo() {
        return proIdTo;
    }

    public void setProIdTo(BigDecimal proIdTo) {
        this.proIdTo = proIdTo;
    }

    public String getProTypeFrom() {
        return proTypeFrom;
    }

    public void setProTypeFrom(String proTypeFrom) {
        this.proTypeFrom = proTypeFrom;
    }

    public String getProTypeTo() {
        return proTypeTo;
    }

    public void setProTypeTo(String proTypeTo) {
        this.proTypeTo = proTypeTo;
    }

    public String getProCodeFrom() {
        return proCodeFrom;
    }

    public void setProCodeFrom(String proCodeFrom) {
        this.proCodeFrom = proCodeFrom;
    }

    public String getProCodeTo() {
        return proCodeTo;
    }

    public void setProCodeTo(String proCodeTo) {
        this.proCodeTo = proCodeTo;
    }

    public BigDecimal getcIdFrom() {
        return cIdFrom;
    }

    public void setcIdFrom(BigDecimal cIdFrom) {
        this.cIdFrom = cIdFrom;
    }

    public BigDecimal getcIdTo() {
        return cIdTo;
    }

    public void setcIdTo(BigDecimal cIdTo) {
        this.cIdTo = cIdTo;
    }

    public String getcTypeFrom() {
        return cTypeFrom;
    }

    public void setcTypeFrom(String cTypeFrom) {
        this.cTypeFrom = cTypeFrom;
    }

    public String getcTypeTo() {
        return cTypeTo;
    }

    public void setcTypeTo(String cTypeTo) {
        this.cTypeTo = cTypeTo;
    }

    public String getcNoFrom() {
        return cNoFrom;
    }

    public void setcNoFrom(String cNoFrom) {
        this.cNoFrom = cNoFrom;
    }

    public String getcNoTo() {
        return cNoTo;
    }

    public void setcNoTo(String cNoTo) {
        this.cNoTo = cNoTo;
    }

    public Long getCstIdFrom() {
        return cstIdFrom;
    }

    public void setCstIdFrom(Long cstIdFrom) {
        this.cstIdFrom = cstIdFrom;
    }

    public Long getCstIdTo() {
        return cstIdTo;
    }

    public void setCstIdTo(Long cstIdTo) {
        this.cstIdTo = cstIdTo;
    }

    public String getCstNoFrom() {
        return cstNoFrom;
    }

    public void setCstNoFrom(String cstNoFrom) {
        this.cstNoFrom = cstNoFrom;
    }

    public String getCstNoTo() {
        return cstNoTo;
    }

    public void setCstNoTo(String cstNoTo) {
        this.cstNoTo = cstNoTo;
    }

    public String getCstNameFrom() {
        return cstNameFrom;
    }

    public void setCstNameFrom(String cstNameFrom) {
        this.cstNameFrom = cstNameFrom;
    }

    public String getCstNameTo() {
        return cstNameTo;
    }

    public void setCstNameTo(String cstNameTo) {
        this.cstNameTo = cstNameTo;
    }

    public String getNotes() {
        return notes == null? "" : notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getOcuId() {
        return ocuId;
    }

    public void setOcuId(Long ocuId) {
        this.ocuId = ocuId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getExcType() {
        return excType;
    }

    public void setExcType(String excType) {
        this.excType = excType;
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

    public BigDecimal getExcAmt() {
        return excAmt;
    }

    public void setExcAmt(BigDecimal excAmt) {
        this.excAmt = excAmt;
    }

    public String getExcFromType() {
        return excFromType;
    }

    public void setExcFromType(String excFromType) {
        this.excFromType = excFromType;
    }

    public String getExcToType() {
        return excToType;
    }

    public void setExcToType(String excToType) {
        this.excToType = excToType;
    }

    public String getCalcAgent() {
        return calcAgent;
    }

    public void setCalcAgent(String calcAgent) {
        this.calcAgent = calcAgent;
    }

    public String getExcPayTrm() {
        return excPayTrm;
    }

    public void setExcPayTrm(String excPayTrm) {
        this.excPayTrm = excPayTrm;
    }

    public Date getExcPayCdOpenDate() {
        return excPayCdOpenDate;
    }

    public void setExcPayCdOpenDate(Date excPayCdOpenDate) {
        this.excPayCdOpenDate = excPayCdOpenDate;
    }

    public Date getExcPayCdEndDate() {
        return excPayCdEndDate;
    }

    public void setExcPayCdEndDate(Date excPayCdEndDate) {
        this.excPayCdEndDate = excPayCdEndDate;
    }

    public String getExcPayCdPayType() {
        return excPayCdPayType;
    }

    public void setExcPayCdPayType(String excPayCdPayType) {
        this.excPayCdPayType = excPayCdPayType;
    }

    public String getInvStatus() {
        return invStatus;
    }

    public void setInvStatus(String invStatus) {
        this.invStatus = invStatus;
    }

    public String getOverTag() {
        return overTag;
    }

    public void setOverTag(String overTag) {
        this.overTag = overTag;
    }

    public String getDsfType() {
        return dsfType;
    }

    public void setDsfType(String dsfType) {
        this.dsfType = dsfType;
    }

    public BigDecimal getOriId() {
        return oriId;
    }

    public void setOriId(BigDecimal oriId) {
        this.oriId = oriId;
    }

    public Short getPzTag() {
        return pzTag;
    }

    public void setPzTag(Short pzTag) {
        this.pzTag = pzTag;
    }

    public Date getExcDate() {
        return excDate;
    }

    public void setExcDate(Date excDate) {
        this.excDate = excDate;
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
        TPubExc other = (TPubExc) that;
        return (this.getExcId() == null ? other.getExcId() == null : this.getExcId().equals(other.getExcId()))
            && (this.getProIdFrom() == null ? other.getProIdFrom() == null : this.getProIdFrom().equals(other.getProIdFrom()))
            && (this.getProIdTo() == null ? other.getProIdTo() == null : this.getProIdTo().equals(other.getProIdTo()))
            && (this.getProTypeFrom() == null ? other.getProTypeFrom() == null : this.getProTypeFrom().equals(other.getProTypeFrom()))
            && (this.getProTypeTo() == null ? other.getProTypeTo() == null : this.getProTypeTo().equals(other.getProTypeTo()))
            && (this.getProCodeFrom() == null ? other.getProCodeFrom() == null : this.getProCodeFrom().equals(other.getProCodeFrom()))
            && (this.getProCodeTo() == null ? other.getProCodeTo() == null : this.getProCodeTo().equals(other.getProCodeTo()))
            && (this.getcIdFrom() == null ? other.getcIdFrom() == null : this.getcIdFrom().equals(other.getcIdFrom()))
            && (this.getcIdTo() == null ? other.getcIdTo() == null : this.getcIdTo().equals(other.getcIdTo()))
            && (this.getcTypeFrom() == null ? other.getcTypeFrom() == null : this.getcTypeFrom().equals(other.getcTypeFrom()))
            && (this.getcTypeTo() == null ? other.getcTypeTo() == null : this.getcTypeTo().equals(other.getcTypeTo()))
            && (this.getcNoFrom() == null ? other.getcNoFrom() == null : this.getcNoFrom().equals(other.getcNoFrom()))
            && (this.getcNoTo() == null ? other.getcNoTo() == null : this.getcNoTo().equals(other.getcNoTo()))
            && (this.getCstIdFrom() == null ? other.getCstIdFrom() == null : this.getCstIdFrom().equals(other.getCstIdFrom()))
            && (this.getCstIdTo() == null ? other.getCstIdTo() == null : this.getCstIdTo().equals(other.getCstIdTo()))
            && (this.getCstNoFrom() == null ? other.getCstNoFrom() == null : this.getCstNoFrom().equals(other.getCstNoFrom()))
            && (this.getCstNoTo() == null ? other.getCstNoTo() == null : this.getCstNoTo().equals(other.getCstNoTo()))
            && (this.getCstNameFrom() == null ? other.getCstNameFrom() == null : this.getCstNameFrom().equals(other.getCstNameFrom()))
            && (this.getCstNameTo() == null ? other.getCstNameTo() == null : this.getCstNameTo().equals(other.getCstNameTo()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getConfirm() == null ? other.getConfirm() == null : this.getConfirm().equals(other.getConfirm()))
            && (this.getmDate() == null ? other.getmDate() == null : this.getmDate().equals(other.getmDate()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOcuId() == null ? other.getOcuId() == null : this.getOcuId().equals(other.getOcuId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getModifyUserId() == null ? other.getModifyUserId() == null : this.getModifyUserId().equals(other.getModifyUserId()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getCheckUserId() == null ? other.getCheckUserId() == null : this.getCheckUserId().equals(other.getCheckUserId()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
            && (this.getExcType() == null ? other.getExcType() == null : this.getExcType().equals(other.getExcType()))
            && (this.getCurrType() == null ? other.getCurrType() == null : this.getCurrType().equals(other.getCurrType()))
            && (this.getCurrRate() == null ? other.getCurrRate() == null : this.getCurrRate().equals(other.getCurrRate()))
            && (this.getExcAmt() == null ? other.getExcAmt() == null : this.getExcAmt().equals(other.getExcAmt()))
            && (this.getExcFromType() == null ? other.getExcFromType() == null : this.getExcFromType().equals(other.getExcFromType()))
            && (this.getExcToType() == null ? other.getExcToType() == null : this.getExcToType().equals(other.getExcToType()))
            && (this.getCalcAgent() == null ? other.getCalcAgent() == null : this.getCalcAgent().equals(other.getCalcAgent()))
            && (this.getExcPayTrm() == null ? other.getExcPayTrm() == null : this.getExcPayTrm().equals(other.getExcPayTrm()))
            && (this.getExcPayCdOpenDate() == null ? other.getExcPayCdOpenDate() == null : this.getExcPayCdOpenDate().equals(other.getExcPayCdOpenDate()))
            && (this.getExcPayCdEndDate() == null ? other.getExcPayCdEndDate() == null : this.getExcPayCdEndDate().equals(other.getExcPayCdEndDate()))
            && (this.getExcPayCdPayType() == null ? other.getExcPayCdPayType() == null : this.getExcPayCdPayType().equals(other.getExcPayCdPayType()))
            && (this.getInvStatus() == null ? other.getInvStatus() == null : this.getInvStatus().equals(other.getInvStatus()))
            && (this.getOverTag() == null ? other.getOverTag() == null : this.getOverTag().equals(other.getOverTag()))
            && (this.getDsfType() == null ? other.getDsfType() == null : this.getDsfType().equals(other.getDsfType()))
            && (this.getOriId() == null ? other.getOriId() == null : this.getOriId().equals(other.getOriId()))
            && (this.getPzTag() == null ? other.getPzTag() == null : this.getPzTag().equals(other.getPzTag()))
            && (this.getExcDate() == null ? other.getExcDate() == null : this.getExcDate().equals(other.getExcDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExcId() == null) ? 0 : getExcId().hashCode());
        result = prime * result + ((getProIdFrom() == null) ? 0 : getProIdFrom().hashCode());
        result = prime * result + ((getProIdTo() == null) ? 0 : getProIdTo().hashCode());
        result = prime * result + ((getProTypeFrom() == null) ? 0 : getProTypeFrom().hashCode());
        result = prime * result + ((getProTypeTo() == null) ? 0 : getProTypeTo().hashCode());
        result = prime * result + ((getProCodeFrom() == null) ? 0 : getProCodeFrom().hashCode());
        result = prime * result + ((getProCodeTo() == null) ? 0 : getProCodeTo().hashCode());
        result = prime * result + ((getcIdFrom() == null) ? 0 : getcIdFrom().hashCode());
        result = prime * result + ((getcIdTo() == null) ? 0 : getcIdTo().hashCode());
        result = prime * result + ((getcTypeFrom() == null) ? 0 : getcTypeFrom().hashCode());
        result = prime * result + ((getcTypeTo() == null) ? 0 : getcTypeTo().hashCode());
        result = prime * result + ((getcNoFrom() == null) ? 0 : getcNoFrom().hashCode());
        result = prime * result + ((getcNoTo() == null) ? 0 : getcNoTo().hashCode());
        result = prime * result + ((getCstIdFrom() == null) ? 0 : getCstIdFrom().hashCode());
        result = prime * result + ((getCstIdTo() == null) ? 0 : getCstIdTo().hashCode());
        result = prime * result + ((getCstNoFrom() == null) ? 0 : getCstNoFrom().hashCode());
        result = prime * result + ((getCstNoTo() == null) ? 0 : getCstNoTo().hashCode());
        result = prime * result + ((getCstNameFrom() == null) ? 0 : getCstNameFrom().hashCode());
        result = prime * result + ((getCstNameTo() == null) ? 0 : getCstNameTo().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getConfirm() == null) ? 0 : getConfirm().hashCode());
        result = prime * result + ((getmDate() == null) ? 0 : getmDate().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOcuId() == null) ? 0 : getOcuId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getModifyUserId() == null) ? 0 : getModifyUserId().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getCheckUserId() == null) ? 0 : getCheckUserId().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getExcType() == null) ? 0 : getExcType().hashCode());
        result = prime * result + ((getCurrType() == null) ? 0 : getCurrType().hashCode());
        result = prime * result + ((getCurrRate() == null) ? 0 : getCurrRate().hashCode());
        result = prime * result + ((getExcAmt() == null) ? 0 : getExcAmt().hashCode());
        result = prime * result + ((getExcFromType() == null) ? 0 : getExcFromType().hashCode());
        result = prime * result + ((getExcToType() == null) ? 0 : getExcToType().hashCode());
        result = prime * result + ((getCalcAgent() == null) ? 0 : getCalcAgent().hashCode());
        result = prime * result + ((getExcPayTrm() == null) ? 0 : getExcPayTrm().hashCode());
        result = prime * result + ((getExcPayCdOpenDate() == null) ? 0 : getExcPayCdOpenDate().hashCode());
        result = prime * result + ((getExcPayCdEndDate() == null) ? 0 : getExcPayCdEndDate().hashCode());
        result = prime * result + ((getExcPayCdPayType() == null) ? 0 : getExcPayCdPayType().hashCode());
        result = prime * result + ((getInvStatus() == null) ? 0 : getInvStatus().hashCode());
        result = prime * result + ((getOverTag() == null) ? 0 : getOverTag().hashCode());
        result = prime * result + ((getDsfType() == null) ? 0 : getDsfType().hashCode());
        result = prime * result + ((getOriId() == null) ? 0 : getOriId().hashCode());
        result = prime * result + ((getPzTag() == null) ? 0 : getPzTag().hashCode());
        result = prime * result + ((getExcDate() == null) ? 0 : getExcDate().hashCode());
        return result;
    }
}