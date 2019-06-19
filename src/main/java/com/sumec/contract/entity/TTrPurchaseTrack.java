package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TTrPurchaseTrack implements Serializable {
    private String trkGuid;

    private String srcPurType;

    private String srcPurId;

    private BigDecimal bcAmtAcc;

    private BigDecimal bcAmtUsd;

    private BigDecimal bcAmtCny;

    private BigDecimal sendQuant;

    private BigDecimal sendAmt;

    private BigDecimal unSendQuant;

    private BigDecimal unSendAmt;

    private BigDecimal overdueUnSendQuant;

    private BigDecimal overdueUnSendAmt;

    private String hasSendOver;

    private BigDecimal cstsRelsQuant;

    private BigDecimal cstsRelsAmt;

    private BigDecimal cstsRelsAmtUsd;

    private BigDecimal payedAmt;

    private BigDecimal payedAmtHk;

    private BigDecimal payedAmtHkUsd;

    private BigDecimal payedAmtHkAcc;

    private BigDecimal payedAmtFeeAcc;

    private BigDecimal payedAmtTaxAcc;

    private BigDecimal prePayedAmt;

    private String hasPayOver;

    private BigDecimal payableAmt;

    private BigDecimal payableAmtOver;

    private BigDecimal collInvQuant;

    private BigDecimal collInvAmt;

    private BigDecimal collInvAmtCost;

    private BigDecimal collInvAmtFee;

    private BigDecimal collInvAmtFeeCost;

    private String hasInvOver;

    private BigDecimal fctLeftAmt;

    private Integer chargeCnt;

    private BigDecimal chargeAmt;

    private BigDecimal stQuant;

    private BigDecimal stAmt;

    private BigDecimal stAmtCost;

    private String closeStatus;

    private Date syncTime;

    private BigDecimal stProcQuant;

    private BigDecimal stProcAmt;

    private BigDecimal stSaQuant;

    private BigDecimal stSaAmt;

    private BigDecimal stBlQuant;

    private BigDecimal stBlAmt;

    private BigDecimal stTrQuant;

    private BigDecimal stTrAmt;

    private BigDecimal stRkQuant;

    private BigDecimal stRkAmt;

    private BigDecimal stCkQuant;

    private BigDecimal stCkAmt;

    private BigDecimal stPkgQuant;

    private BigDecimal stPkgAmt;

    private BigDecimal bcExecQuant;

    private BigDecimal bcExecAmt;

    private BigDecimal bcExecAmtAcc;

    private BigDecimal bcExecAmtUsd;

    private BigDecimal bcExecAmtCny;

    private BigDecimal salesQuant;

    private BigDecimal salesAmt;

    private BigDecimal invPrice;

    private static final long serialVersionUID = 1L;

    public String getTrkGuid() {
        return trkGuid;
    }

    public void setTrkGuid(String trkGuid) {
        this.trkGuid = trkGuid;
    }

    public String getSrcPurType() {
        return srcPurType;
    }

    public void setSrcPurType(String srcPurType) {
        this.srcPurType = srcPurType;
    }

    public String getSrcPurId() {
        return srcPurId;
    }

    public void setSrcPurId(String srcPurId) {
        this.srcPurId = srcPurId;
    }

    public BigDecimal getBcAmtAcc() {
        return bcAmtAcc;
    }

    public void setBcAmtAcc(BigDecimal bcAmtAcc) {
        this.bcAmtAcc = bcAmtAcc;
    }

    public BigDecimal getBcAmtUsd() {
        return bcAmtUsd;
    }

    public void setBcAmtUsd(BigDecimal bcAmtUsd) {
        this.bcAmtUsd = bcAmtUsd;
    }

    public BigDecimal getBcAmtCny() {
        return bcAmtCny;
    }

    public void setBcAmtCny(BigDecimal bcAmtCny) {
        this.bcAmtCny = bcAmtCny;
    }

    public BigDecimal getSendQuant() {
        return sendQuant;
    }

    public void setSendQuant(BigDecimal sendQuant) {
        this.sendQuant = sendQuant;
    }

    public BigDecimal getSendAmt() {
        return sendAmt;
    }

    public void setSendAmt(BigDecimal sendAmt) {
        this.sendAmt = sendAmt;
    }

    public BigDecimal getUnSendQuant() {
        return unSendQuant;
    }

    public void setUnSendQuant(BigDecimal unSendQuant) {
        this.unSendQuant = unSendQuant;
    }

    public BigDecimal getUnSendAmt() {
        return unSendAmt;
    }

    public void setUnSendAmt(BigDecimal unSendAmt) {
        this.unSendAmt = unSendAmt;
    }

    public BigDecimal getOverdueUnSendQuant() {
        return overdueUnSendQuant;
    }

    public void setOverdueUnSendQuant(BigDecimal overdueUnSendQuant) {
        this.overdueUnSendQuant = overdueUnSendQuant;
    }

    public BigDecimal getOverdueUnSendAmt() {
        return overdueUnSendAmt;
    }

    public void setOverdueUnSendAmt(BigDecimal overdueUnSendAmt) {
        this.overdueUnSendAmt = overdueUnSendAmt;
    }

    public String getHasSendOver() {
        return hasSendOver;
    }

    public void setHasSendOver(String hasSendOver) {
        this.hasSendOver = hasSendOver;
    }

    public BigDecimal getCstsRelsQuant() {
        return cstsRelsQuant;
    }

    public void setCstsRelsQuant(BigDecimal cstsRelsQuant) {
        this.cstsRelsQuant = cstsRelsQuant;
    }

    public BigDecimal getCstsRelsAmt() {
        return cstsRelsAmt;
    }

    public void setCstsRelsAmt(BigDecimal cstsRelsAmt) {
        this.cstsRelsAmt = cstsRelsAmt;
    }

    public BigDecimal getCstsRelsAmtUsd() {
        return cstsRelsAmtUsd;
    }

    public void setCstsRelsAmtUsd(BigDecimal cstsRelsAmtUsd) {
        this.cstsRelsAmtUsd = cstsRelsAmtUsd;
    }

    public BigDecimal getPayedAmt() {
        return payedAmt;
    }

    public void setPayedAmt(BigDecimal payedAmt) {
        this.payedAmt = payedAmt;
    }

    public BigDecimal getPayedAmtHk() {
        return payedAmtHk;
    }

    public void setPayedAmtHk(BigDecimal payedAmtHk) {
        this.payedAmtHk = payedAmtHk;
    }

    public BigDecimal getPayedAmtHkUsd() {
        return payedAmtHkUsd;
    }

    public void setPayedAmtHkUsd(BigDecimal payedAmtHkUsd) {
        this.payedAmtHkUsd = payedAmtHkUsd;
    }

    public BigDecimal getPayedAmtHkAcc() {
        return payedAmtHkAcc;
    }

    public void setPayedAmtHkAcc(BigDecimal payedAmtHkAcc) {
        this.payedAmtHkAcc = payedAmtHkAcc;
    }

    public BigDecimal getPayedAmtFeeAcc() {
        return payedAmtFeeAcc;
    }

    public void setPayedAmtFeeAcc(BigDecimal payedAmtFeeAcc) {
        this.payedAmtFeeAcc = payedAmtFeeAcc;
    }

    public BigDecimal getPayedAmtTaxAcc() {
        return payedAmtTaxAcc;
    }

    public void setPayedAmtTaxAcc(BigDecimal payedAmtTaxAcc) {
        this.payedAmtTaxAcc = payedAmtTaxAcc;
    }

    public BigDecimal getPrePayedAmt() {
        return prePayedAmt;
    }

    public void setPrePayedAmt(BigDecimal prePayedAmt) {
        this.prePayedAmt = prePayedAmt;
    }

    public String getHasPayOver() {
        return hasPayOver;
    }

    public void setHasPayOver(String hasPayOver) {
        this.hasPayOver = hasPayOver;
    }

    public BigDecimal getPayableAmt() {
        return payableAmt;
    }

    public void setPayableAmt(BigDecimal payableAmt) {
        this.payableAmt = payableAmt;
    }

    public BigDecimal getPayableAmtOver() {
        return payableAmtOver;
    }

    public void setPayableAmtOver(BigDecimal payableAmtOver) {
        this.payableAmtOver = payableAmtOver;
    }

    public BigDecimal getCollInvQuant() {
        return collInvQuant;
    }

    public void setCollInvQuant(BigDecimal collInvQuant) {
        this.collInvQuant = collInvQuant;
    }

    public BigDecimal getCollInvAmt() {
        return collInvAmt;
    }

    public void setCollInvAmt(BigDecimal collInvAmt) {
        this.collInvAmt = collInvAmt;
    }

    public BigDecimal getCollInvAmtCost() {
        return collInvAmtCost;
    }

    public void setCollInvAmtCost(BigDecimal collInvAmtCost) {
        this.collInvAmtCost = collInvAmtCost;
    }

    public BigDecimal getCollInvAmtFee() {
        return collInvAmtFee;
    }

    public void setCollInvAmtFee(BigDecimal collInvAmtFee) {
        this.collInvAmtFee = collInvAmtFee;
    }

    public BigDecimal getCollInvAmtFeeCost() {
        return collInvAmtFeeCost;
    }

    public void setCollInvAmtFeeCost(BigDecimal collInvAmtFeeCost) {
        this.collInvAmtFeeCost = collInvAmtFeeCost;
    }

    public String getHasInvOver() {
        return hasInvOver;
    }

    public void setHasInvOver(String hasInvOver) {
        this.hasInvOver = hasInvOver;
    }

    public BigDecimal getFctLeftAmt() {
        return fctLeftAmt;
    }

    public void setFctLeftAmt(BigDecimal fctLeftAmt) {
        this.fctLeftAmt = fctLeftAmt;
    }

    public Integer getChargeCnt() {
        return chargeCnt;
    }

    public void setChargeCnt(Integer chargeCnt) {
        this.chargeCnt = chargeCnt;
    }

    public BigDecimal getChargeAmt() {
        return chargeAmt;
    }

    public void setChargeAmt(BigDecimal chargeAmt) {
        this.chargeAmt = chargeAmt;
    }

    public BigDecimal getStQuant() {
        return stQuant;
    }

    public void setStQuant(BigDecimal stQuant) {
        this.stQuant = stQuant;
    }

    public BigDecimal getStAmt() {
        return stAmt;
    }

    public void setStAmt(BigDecimal stAmt) {
        this.stAmt = stAmt;
    }

    public BigDecimal getStAmtCost() {
        return stAmtCost;
    }

    public void setStAmtCost(BigDecimal stAmtCost) {
        this.stAmtCost = stAmtCost;
    }

    public String getCloseStatus() {
        return closeStatus;
    }

    public void setCloseStatus(String closeStatus) {
        this.closeStatus = closeStatus;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public BigDecimal getStProcQuant() {
        return stProcQuant;
    }

    public void setStProcQuant(BigDecimal stProcQuant) {
        this.stProcQuant = stProcQuant;
    }

    public BigDecimal getStProcAmt() {
        return stProcAmt;
    }

    public void setStProcAmt(BigDecimal stProcAmt) {
        this.stProcAmt = stProcAmt;
    }

    public BigDecimal getStSaQuant() {
        return stSaQuant;
    }

    public void setStSaQuant(BigDecimal stSaQuant) {
        this.stSaQuant = stSaQuant;
    }

    public BigDecimal getStSaAmt() {
        return stSaAmt;
    }

    public void setStSaAmt(BigDecimal stSaAmt) {
        this.stSaAmt = stSaAmt;
    }

    public BigDecimal getStBlQuant() {
        return stBlQuant;
    }

    public void setStBlQuant(BigDecimal stBlQuant) {
        this.stBlQuant = stBlQuant;
    }

    public BigDecimal getStBlAmt() {
        return stBlAmt;
    }

    public void setStBlAmt(BigDecimal stBlAmt) {
        this.stBlAmt = stBlAmt;
    }

    public BigDecimal getStTrQuant() {
        return stTrQuant;
    }

    public void setStTrQuant(BigDecimal stTrQuant) {
        this.stTrQuant = stTrQuant;
    }

    public BigDecimal getStTrAmt() {
        return stTrAmt;
    }

    public void setStTrAmt(BigDecimal stTrAmt) {
        this.stTrAmt = stTrAmt;
    }

    public BigDecimal getStRkQuant() {
        return stRkQuant;
    }

    public void setStRkQuant(BigDecimal stRkQuant) {
        this.stRkQuant = stRkQuant;
    }

    public BigDecimal getStRkAmt() {
        return stRkAmt;
    }

    public void setStRkAmt(BigDecimal stRkAmt) {
        this.stRkAmt = stRkAmt;
    }

    public BigDecimal getStCkQuant() {
        return stCkQuant;
    }

    public void setStCkQuant(BigDecimal stCkQuant) {
        this.stCkQuant = stCkQuant;
    }

    public BigDecimal getStCkAmt() {
        return stCkAmt;
    }

    public void setStCkAmt(BigDecimal stCkAmt) {
        this.stCkAmt = stCkAmt;
    }

    public BigDecimal getStPkgQuant() {
        return stPkgQuant;
    }

    public void setStPkgQuant(BigDecimal stPkgQuant) {
        this.stPkgQuant = stPkgQuant;
    }

    public BigDecimal getStPkgAmt() {
        return stPkgAmt;
    }

    public void setStPkgAmt(BigDecimal stPkgAmt) {
        this.stPkgAmt = stPkgAmt;
    }

    public BigDecimal getBcExecQuant() {
        return bcExecQuant;
    }

    public void setBcExecQuant(BigDecimal bcExecQuant) {
        this.bcExecQuant = bcExecQuant;
    }

    public BigDecimal getBcExecAmt() {
        return bcExecAmt;
    }

    public void setBcExecAmt(BigDecimal bcExecAmt) {
        this.bcExecAmt = bcExecAmt;
    }

    public BigDecimal getBcExecAmtAcc() {
        return bcExecAmtAcc;
    }

    public void setBcExecAmtAcc(BigDecimal bcExecAmtAcc) {
        this.bcExecAmtAcc = bcExecAmtAcc;
    }

    public BigDecimal getBcExecAmtUsd() {
        return bcExecAmtUsd;
    }

    public void setBcExecAmtUsd(BigDecimal bcExecAmtUsd) {
        this.bcExecAmtUsd = bcExecAmtUsd;
    }

    public BigDecimal getBcExecAmtCny() {
        return bcExecAmtCny;
    }

    public void setBcExecAmtCny(BigDecimal bcExecAmtCny) {
        this.bcExecAmtCny = bcExecAmtCny;
    }

    public BigDecimal getSalesQuant() {
        return salesQuant;
    }

    public void setSalesQuant(BigDecimal salesQuant) {
        this.salesQuant = salesQuant;
    }

    public BigDecimal getSalesAmt() {
        return salesAmt;
    }

    public void setSalesAmt(BigDecimal salesAmt) {
        this.salesAmt = salesAmt;
    }

    public BigDecimal getInvPrice() {
        return invPrice;
    }

    public void setInvPrice(BigDecimal invPrice) {
        this.invPrice = invPrice;
    }

}