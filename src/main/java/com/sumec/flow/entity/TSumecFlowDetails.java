package com.sumec.flow.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSumecFlowDetails implements Serializable {
    private Long intId;

    private Long fmId;

    private String refValue;

    private Long faId;

    private Long fsId;

    private Long userId;

    private Date dealTime;

    private String dealFlag;

    private Short dtlStep;

    private String notion;

    private Short seq;

    private String flag;

    private String isGd;

    private Long gdIntId;

    private Long grantUserId;

    private String isRead;

    private String dtlDesc;

    private String isEnd;

    private Date postTime;

    private Long spUserId;

    private String baked;

    private BigDecimal fmSeqId;

    private String dealWay;

    private static final long serialVersionUID = 1L;

    public Long getIntId() {
        return intId;
    }

    public void setIntId(Long intId) {
        this.intId = intId;
    }

    public Long getFmId() {
        return fmId;
    }

    public void setFmId(Long fmId) {
        this.fmId = fmId;
    }

    public String getRefValue() {
        return refValue;
    }

    public void setRefValue(String refValue) {
        this.refValue = refValue;
    }

    public Long getFaId() {
        return faId;
    }

    public void setFaId(Long faId) {
        this.faId = faId;
    }

    public Long getFsId() {
        return fsId;
    }

    public void setFsId(Long fsId) {
        this.fsId = fsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(String dealFlag) {
        this.dealFlag = dealFlag;
    }

    public Short getDtlStep() {
        return dtlStep;
    }

    public void setDtlStep(Short dtlStep) {
        this.dtlStep = dtlStep;
    }

    public String getNotion() {
        return notion;
    }

    public void setNotion(String notion) {
        this.notion = notion;
    }

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getIsGd() {
        return isGd;
    }

    public void setIsGd(String isGd) {
        this.isGd = isGd;
    }

    public Long getGdIntId() {
        return gdIntId;
    }

    public void setGdIntId(Long gdIntId) {
        this.gdIntId = gdIntId;
    }

    public Long getGrantUserId() {
        return grantUserId;
    }

    public void setGrantUserId(Long grantUserId) {
        this.grantUserId = grantUserId;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getDtlDesc() {
        return dtlDesc;
    }

    public void setDtlDesc(String dtlDesc) {
        this.dtlDesc = dtlDesc;
    }

    public String getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(String isEnd) {
        this.isEnd = isEnd;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Long getSpUserId() {
        return spUserId;
    }

    public void setSpUserId(Long spUserId) {
        this.spUserId = spUserId;
    }

    public String getBaked() {
        return baked;
    }

    public void setBaked(String baked) {
        this.baked = baked;
    }

    public BigDecimal getFmSeqId() {
        return fmSeqId;
    }

    public void setFmSeqId(BigDecimal fmSeqId) {
        this.fmSeqId = fmSeqId;
    }

    public String getDealWay() {
        return dealWay;
    }

    public void setDealWay(String dealWay) {
        this.dealWay = dealWay;
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
        TSumecFlowDetails other = (TSumecFlowDetails) that;
        return (this.getIntId() == null ? other.getIntId() == null : this.getIntId().equals(other.getIntId()))
            && (this.getFmId() == null ? other.getFmId() == null : this.getFmId().equals(other.getFmId()))
            && (this.getRefValue() == null ? other.getRefValue() == null : this.getRefValue().equals(other.getRefValue()))
            && (this.getFaId() == null ? other.getFaId() == null : this.getFaId().equals(other.getFaId()))
            && (this.getFsId() == null ? other.getFsId() == null : this.getFsId().equals(other.getFsId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getDealTime() == null ? other.getDealTime() == null : this.getDealTime().equals(other.getDealTime()))
            && (this.getDealFlag() == null ? other.getDealFlag() == null : this.getDealFlag().equals(other.getDealFlag()))
            && (this.getDtlStep() == null ? other.getDtlStep() == null : this.getDtlStep().equals(other.getDtlStep()))
            && (this.getNotion() == null ? other.getNotion() == null : this.getNotion().equals(other.getNotion()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getIsGd() == null ? other.getIsGd() == null : this.getIsGd().equals(other.getIsGd()))
            && (this.getGdIntId() == null ? other.getGdIntId() == null : this.getGdIntId().equals(other.getGdIntId()))
            && (this.getGrantUserId() == null ? other.getGrantUserId() == null : this.getGrantUserId().equals(other.getGrantUserId()))
            && (this.getIsRead() == null ? other.getIsRead() == null : this.getIsRead().equals(other.getIsRead()))
            && (this.getDtlDesc() == null ? other.getDtlDesc() == null : this.getDtlDesc().equals(other.getDtlDesc()))
            && (this.getIsEnd() == null ? other.getIsEnd() == null : this.getIsEnd().equals(other.getIsEnd()))
            && (this.getPostTime() == null ? other.getPostTime() == null : this.getPostTime().equals(other.getPostTime()))
            && (this.getSpUserId() == null ? other.getSpUserId() == null : this.getSpUserId().equals(other.getSpUserId()))
            && (this.getBaked() == null ? other.getBaked() == null : this.getBaked().equals(other.getBaked()))
            && (this.getFmSeqId() == null ? other.getFmSeqId() == null : this.getFmSeqId().equals(other.getFmSeqId()))
            && (this.getDealWay() == null ? other.getDealWay() == null : this.getDealWay().equals(other.getDealWay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntId() == null) ? 0 : getIntId().hashCode());
        result = prime * result + ((getFmId() == null) ? 0 : getFmId().hashCode());
        result = prime * result + ((getRefValue() == null) ? 0 : getRefValue().hashCode());
        result = prime * result + ((getFaId() == null) ? 0 : getFaId().hashCode());
        result = prime * result + ((getFsId() == null) ? 0 : getFsId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getDealTime() == null) ? 0 : getDealTime().hashCode());
        result = prime * result + ((getDealFlag() == null) ? 0 : getDealFlag().hashCode());
        result = prime * result + ((getDtlStep() == null) ? 0 : getDtlStep().hashCode());
        result = prime * result + ((getNotion() == null) ? 0 : getNotion().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getIsGd() == null) ? 0 : getIsGd().hashCode());
        result = prime * result + ((getGdIntId() == null) ? 0 : getGdIntId().hashCode());
        result = prime * result + ((getGrantUserId() == null) ? 0 : getGrantUserId().hashCode());
        result = prime * result + ((getIsRead() == null) ? 0 : getIsRead().hashCode());
        result = prime * result + ((getDtlDesc() == null) ? 0 : getDtlDesc().hashCode());
        result = prime * result + ((getIsEnd() == null) ? 0 : getIsEnd().hashCode());
        result = prime * result + ((getPostTime() == null) ? 0 : getPostTime().hashCode());
        result = prime * result + ((getSpUserId() == null) ? 0 : getSpUserId().hashCode());
        result = prime * result + ((getBaked() == null) ? 0 : getBaked().hashCode());
        result = prime * result + ((getFmSeqId() == null) ? 0 : getFmSeqId().hashCode());
        result = prime * result + ((getDealWay() == null) ? 0 : getDealWay().hashCode());
        return result;
    }
}