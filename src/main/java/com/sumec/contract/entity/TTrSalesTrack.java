package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TTrSalesTrack implements Serializable {
    private String trkGuid;

    private String srcScType;

    private String srcScId;

    private BigDecimal scAmtAcc;

    private BigDecimal scAmtUsd;

    private BigDecimal scAmtCny;

    private BigDecimal sendQuant;

    private BigDecimal sendAmt;

    private BigDecimal unSendQuant;

    private BigDecimal unSendAmt;

    private BigDecimal overdueUnSendQuant;

    private BigDecimal overdueUnSendAmt;

    private String hasSendOver;

    private BigDecimal cstSignQuant;

    private BigDecimal cstSignAmt;

    private String hasSignOver;

    private BigDecimal purQuant;

    private BigDecimal purAmt;

    private String hasPurOver;

    private BigDecimal collAmt;

    private BigDecimal collAmtBail;

    private BigDecimal collAmtHk;

    private BigDecimal collAmtFee;

    private BigDecimal collAmtOther;

    private BigDecimal preCollAmt;

    private BigDecimal cstLeftAmt;

    private BigDecimal receivableAmt;

    private BigDecimal overdueReceivableAmt;

    private String hasCollOver;

    private BigDecimal kpQuant;

    private BigDecimal kpAmt;

    private String hasKpOver;

    private BigDecimal settleQuant;

    private BigDecimal settleAmt;

    private String hasSettleOver;

    private String closeStatus;

    private BigDecimal bizSellInAmt;

    private BigDecimal bizCostAmt;

    private BigDecimal bizFeeAmt;

    private BigDecimal bizProfitAmt;

    private BigDecimal accSellInAmt;

    private BigDecimal accCostAmt;

    private BigDecimal accFeeAmt;

    private BigDecimal accProfitAmt;

    private Date syncTime;

    private BigDecimal scExecQuant;

    private BigDecimal scExecAmt;

    private BigDecimal scExecAmtAcc;

    private BigDecimal scExecAmtUsd;

    private BigDecimal scExecAmtCny;

    private BigDecimal purPrice;

    private BigDecimal purInvPrice;

    private Date firstPayDate;

    private Date lastPayDate;

    private BigDecimal calcPrFee;

    private BigDecimal purSendQuant;

    private BigDecimal purSendAmt;

    private BigDecimal stQuant;

    private BigDecimal stAmt;

    private static final long serialVersionUID = 1L;

    public String getTrkGuid() {
        return trkGuid;
    }

    public void setTrkGuid(String trkGuid) {
        this.trkGuid = trkGuid;
    }

    public String getSrcScType() {
        return srcScType;
    }

    public void setSrcScType(String srcScType) {
        this.srcScType = srcScType;
    }

    public String getSrcScId() {
        return srcScId;
    }

    public void setSrcScId(String srcScId) {
        this.srcScId = srcScId;
    }

    public BigDecimal getScAmtAcc() {
        return scAmtAcc;
    }

    public void setScAmtAcc(BigDecimal scAmtAcc) {
        this.scAmtAcc = scAmtAcc;
    }

    public BigDecimal getScAmtUsd() {
        return scAmtUsd;
    }

    public void setScAmtUsd(BigDecimal scAmtUsd) {
        this.scAmtUsd = scAmtUsd;
    }

    public BigDecimal getScAmtCny() {
        return scAmtCny;
    }

    public void setScAmtCny(BigDecimal scAmtCny) {
        this.scAmtCny = scAmtCny;
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

    public BigDecimal getCstSignQuant() {
        return cstSignQuant;
    }

    public void setCstSignQuant(BigDecimal cstSignQuant) {
        this.cstSignQuant = cstSignQuant;
    }

    public BigDecimal getCstSignAmt() {
        return cstSignAmt;
    }

    public void setCstSignAmt(BigDecimal cstSignAmt) {
        this.cstSignAmt = cstSignAmt;
    }

    public String getHasSignOver() {
        return hasSignOver;
    }

    public void setHasSignOver(String hasSignOver) {
        this.hasSignOver = hasSignOver;
    }

    public BigDecimal getPurQuant() {
        return purQuant;
    }

    public void setPurQuant(BigDecimal purQuant) {
        this.purQuant = purQuant;
    }

    public BigDecimal getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(BigDecimal purAmt) {
        this.purAmt = purAmt;
    }

    public String getHasPurOver() {
        return hasPurOver;
    }

    public void setHasPurOver(String hasPurOver) {
        this.hasPurOver = hasPurOver;
    }

    public BigDecimal getCollAmt() {
        return collAmt;
    }

    public void setCollAmt(BigDecimal collAmt) {
        this.collAmt = collAmt;
    }

    public BigDecimal getCollAmtBail() {
        return collAmtBail;
    }

    public void setCollAmtBail(BigDecimal collAmtBail) {
        this.collAmtBail = collAmtBail;
    }

    public BigDecimal getCollAmtHk() {
        return collAmtHk;
    }

    public void setCollAmtHk(BigDecimal collAmtHk) {
        this.collAmtHk = collAmtHk;
    }

    public BigDecimal getCollAmtFee() {
        return collAmtFee;
    }

    public void setCollAmtFee(BigDecimal collAmtFee) {
        this.collAmtFee = collAmtFee;
    }

    public BigDecimal getCollAmtOther() {
        return collAmtOther;
    }

    public void setCollAmtOther(BigDecimal collAmtOther) {
        this.collAmtOther = collAmtOther;
    }

    public BigDecimal getPreCollAmt() {
        return preCollAmt;
    }

    public void setPreCollAmt(BigDecimal preCollAmt) {
        this.preCollAmt = preCollAmt;
    }

    public BigDecimal getCstLeftAmt() {
        return cstLeftAmt;
    }

    public void setCstLeftAmt(BigDecimal cstLeftAmt) {
        this.cstLeftAmt = cstLeftAmt;
    }

    public BigDecimal getReceivableAmt() {
        return receivableAmt;
    }

    public void setReceivableAmt(BigDecimal receivableAmt) {
        this.receivableAmt = receivableAmt;
    }

    public BigDecimal getOverdueReceivableAmt() {
        return overdueReceivableAmt;
    }

    public void setOverdueReceivableAmt(BigDecimal overdueReceivableAmt) {
        this.overdueReceivableAmt = overdueReceivableAmt;
    }

    public String getHasCollOver() {
        return hasCollOver;
    }

    public void setHasCollOver(String hasCollOver) {
        this.hasCollOver = hasCollOver;
    }

    public BigDecimal getKpQuant() {
        return kpQuant;
    }

    public void setKpQuant(BigDecimal kpQuant) {
        this.kpQuant = kpQuant;
    }

    public BigDecimal getKpAmt() {
        return kpAmt;
    }

    public void setKpAmt(BigDecimal kpAmt) {
        this.kpAmt = kpAmt;
    }

    public String getHasKpOver() {
        return hasKpOver;
    }

    public void setHasKpOver(String hasKpOver) {
        this.hasKpOver = hasKpOver;
    }

    public BigDecimal getSettleQuant() {
        return settleQuant;
    }

    public void setSettleQuant(BigDecimal settleQuant) {
        this.settleQuant = settleQuant;
    }

    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    public String getHasSettleOver() {
        return hasSettleOver;
    }

    public void setHasSettleOver(String hasSettleOver) {
        this.hasSettleOver = hasSettleOver;
    }

    public String getCloseStatus() {
        return closeStatus;
    }

    public void setCloseStatus(String closeStatus) {
        this.closeStatus = closeStatus;
    }

    public BigDecimal getBizSellInAmt() {
        return bizSellInAmt;
    }

    public void setBizSellInAmt(BigDecimal bizSellInAmt) {
        this.bizSellInAmt = bizSellInAmt;
    }

    public BigDecimal getBizCostAmt() {
        return bizCostAmt;
    }

    public void setBizCostAmt(BigDecimal bizCostAmt) {
        this.bizCostAmt = bizCostAmt;
    }

    public BigDecimal getBizFeeAmt() {
        return bizFeeAmt;
    }

    public void setBizFeeAmt(BigDecimal bizFeeAmt) {
        this.bizFeeAmt = bizFeeAmt;
    }

    public BigDecimal getBizProfitAmt() {
        return bizProfitAmt;
    }

    public void setBizProfitAmt(BigDecimal bizProfitAmt) {
        this.bizProfitAmt = bizProfitAmt;
    }

    public BigDecimal getAccSellInAmt() {
        return accSellInAmt;
    }

    public void setAccSellInAmt(BigDecimal accSellInAmt) {
        this.accSellInAmt = accSellInAmt;
    }

    public BigDecimal getAccCostAmt() {
        return accCostAmt;
    }

    public void setAccCostAmt(BigDecimal accCostAmt) {
        this.accCostAmt = accCostAmt;
    }

    public BigDecimal getAccFeeAmt() {
        return accFeeAmt;
    }

    public void setAccFeeAmt(BigDecimal accFeeAmt) {
        this.accFeeAmt = accFeeAmt;
    }

    public BigDecimal getAccProfitAmt() {
        return accProfitAmt;
    }

    public void setAccProfitAmt(BigDecimal accProfitAmt) {
        this.accProfitAmt = accProfitAmt;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public BigDecimal getScExecQuant() {
        return scExecQuant;
    }

    public void setScExecQuant(BigDecimal scExecQuant) {
        this.scExecQuant = scExecQuant;
    }

    public BigDecimal getScExecAmt() {
        return scExecAmt;
    }

    public void setScExecAmt(BigDecimal scExecAmt) {
        this.scExecAmt = scExecAmt;
    }

    public BigDecimal getScExecAmtAcc() {
        return scExecAmtAcc;
    }

    public void setScExecAmtAcc(BigDecimal scExecAmtAcc) {
        this.scExecAmtAcc = scExecAmtAcc;
    }

    public BigDecimal getScExecAmtUsd() {
        return scExecAmtUsd;
    }

    public void setScExecAmtUsd(BigDecimal scExecAmtUsd) {
        this.scExecAmtUsd = scExecAmtUsd;
    }

    public BigDecimal getScExecAmtCny() {
        return scExecAmtCny;
    }

    public void setScExecAmtCny(BigDecimal scExecAmtCny) {
        this.scExecAmtCny = scExecAmtCny;
    }

    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    public BigDecimal getPurInvPrice() {
        return purInvPrice;
    }

    public void setPurInvPrice(BigDecimal purInvPrice) {
        this.purInvPrice = purInvPrice;
    }

    public Date getFirstPayDate() {
        return firstPayDate;
    }

    public void setFirstPayDate(Date firstPayDate) {
        this.firstPayDate = firstPayDate;
    }

    public Date getLastPayDate() {
        return lastPayDate;
    }

    public void setLastPayDate(Date lastPayDate) {
        this.lastPayDate = lastPayDate;
    }

    public BigDecimal getCalcPrFee() {
        return calcPrFee;
    }

    public void setCalcPrFee(BigDecimal calcPrFee) {
        this.calcPrFee = calcPrFee;
    }

    public BigDecimal getPurSendQuant() {
        return purSendQuant;
    }

    public void setPurSendQuant(BigDecimal purSendQuant) {
        this.purSendQuant = purSendQuant;
    }

    public BigDecimal getPurSendAmt() {
        return purSendAmt;
    }

    public void setPurSendAmt(BigDecimal purSendAmt) {
        this.purSendAmt = purSendAmt;
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
        TTrSalesTrack other = (TTrSalesTrack) that;
        return (this.getTrkGuid() == null ? other.getTrkGuid() == null : this.getTrkGuid().equals(other.getTrkGuid()))
            && (this.getSrcScType() == null ? other.getSrcScType() == null : this.getSrcScType().equals(other.getSrcScType()))
            && (this.getSrcScId() == null ? other.getSrcScId() == null : this.getSrcScId().equals(other.getSrcScId()))
            && (this.getScAmtAcc() == null ? other.getScAmtAcc() == null : this.getScAmtAcc().equals(other.getScAmtAcc()))
            && (this.getScAmtUsd() == null ? other.getScAmtUsd() == null : this.getScAmtUsd().equals(other.getScAmtUsd()))
            && (this.getScAmtCny() == null ? other.getScAmtCny() == null : this.getScAmtCny().equals(other.getScAmtCny()))
            && (this.getSendQuant() == null ? other.getSendQuant() == null : this.getSendQuant().equals(other.getSendQuant()))
            && (this.getSendAmt() == null ? other.getSendAmt() == null : this.getSendAmt().equals(other.getSendAmt()))
            && (this.getUnSendQuant() == null ? other.getUnSendQuant() == null : this.getUnSendQuant().equals(other.getUnSendQuant()))
            && (this.getUnSendAmt() == null ? other.getUnSendAmt() == null : this.getUnSendAmt().equals(other.getUnSendAmt()))
            && (this.getOverdueUnSendQuant() == null ? other.getOverdueUnSendQuant() == null : this.getOverdueUnSendQuant().equals(other.getOverdueUnSendQuant()))
            && (this.getOverdueUnSendAmt() == null ? other.getOverdueUnSendAmt() == null : this.getOverdueUnSendAmt().equals(other.getOverdueUnSendAmt()))
            && (this.getHasSendOver() == null ? other.getHasSendOver() == null : this.getHasSendOver().equals(other.getHasSendOver()))
            && (this.getCstSignQuant() == null ? other.getCstSignQuant() == null : this.getCstSignQuant().equals(other.getCstSignQuant()))
            && (this.getCstSignAmt() == null ? other.getCstSignAmt() == null : this.getCstSignAmt().equals(other.getCstSignAmt()))
            && (this.getHasSignOver() == null ? other.getHasSignOver() == null : this.getHasSignOver().equals(other.getHasSignOver()))
            && (this.getPurQuant() == null ? other.getPurQuant() == null : this.getPurQuant().equals(other.getPurQuant()))
            && (this.getPurAmt() == null ? other.getPurAmt() == null : this.getPurAmt().equals(other.getPurAmt()))
            && (this.getHasPurOver() == null ? other.getHasPurOver() == null : this.getHasPurOver().equals(other.getHasPurOver()))
            && (this.getCollAmt() == null ? other.getCollAmt() == null : this.getCollAmt().equals(other.getCollAmt()))
            && (this.getCollAmtBail() == null ? other.getCollAmtBail() == null : this.getCollAmtBail().equals(other.getCollAmtBail()))
            && (this.getCollAmtHk() == null ? other.getCollAmtHk() == null : this.getCollAmtHk().equals(other.getCollAmtHk()))
            && (this.getCollAmtFee() == null ? other.getCollAmtFee() == null : this.getCollAmtFee().equals(other.getCollAmtFee()))
            && (this.getCollAmtOther() == null ? other.getCollAmtOther() == null : this.getCollAmtOther().equals(other.getCollAmtOther()))
            && (this.getPreCollAmt() == null ? other.getPreCollAmt() == null : this.getPreCollAmt().equals(other.getPreCollAmt()))
            && (this.getCstLeftAmt() == null ? other.getCstLeftAmt() == null : this.getCstLeftAmt().equals(other.getCstLeftAmt()))
            && (this.getReceivableAmt() == null ? other.getReceivableAmt() == null : this.getReceivableAmt().equals(other.getReceivableAmt()))
            && (this.getOverdueReceivableAmt() == null ? other.getOverdueReceivableAmt() == null : this.getOverdueReceivableAmt().equals(other.getOverdueReceivableAmt()))
            && (this.getHasCollOver() == null ? other.getHasCollOver() == null : this.getHasCollOver().equals(other.getHasCollOver()))
            && (this.getKpQuant() == null ? other.getKpQuant() == null : this.getKpQuant().equals(other.getKpQuant()))
            && (this.getKpAmt() == null ? other.getKpAmt() == null : this.getKpAmt().equals(other.getKpAmt()))
            && (this.getHasKpOver() == null ? other.getHasKpOver() == null : this.getHasKpOver().equals(other.getHasKpOver()))
            && (this.getSettleQuant() == null ? other.getSettleQuant() == null : this.getSettleQuant().equals(other.getSettleQuant()))
            && (this.getSettleAmt() == null ? other.getSettleAmt() == null : this.getSettleAmt().equals(other.getSettleAmt()))
            && (this.getHasSettleOver() == null ? other.getHasSettleOver() == null : this.getHasSettleOver().equals(other.getHasSettleOver()))
            && (this.getCloseStatus() == null ? other.getCloseStatus() == null : this.getCloseStatus().equals(other.getCloseStatus()))
            && (this.getBizSellInAmt() == null ? other.getBizSellInAmt() == null : this.getBizSellInAmt().equals(other.getBizSellInAmt()))
            && (this.getBizCostAmt() == null ? other.getBizCostAmt() == null : this.getBizCostAmt().equals(other.getBizCostAmt()))
            && (this.getBizFeeAmt() == null ? other.getBizFeeAmt() == null : this.getBizFeeAmt().equals(other.getBizFeeAmt()))
            && (this.getBizProfitAmt() == null ? other.getBizProfitAmt() == null : this.getBizProfitAmt().equals(other.getBizProfitAmt()))
            && (this.getAccSellInAmt() == null ? other.getAccSellInAmt() == null : this.getAccSellInAmt().equals(other.getAccSellInAmt()))
            && (this.getAccCostAmt() == null ? other.getAccCostAmt() == null : this.getAccCostAmt().equals(other.getAccCostAmt()))
            && (this.getAccFeeAmt() == null ? other.getAccFeeAmt() == null : this.getAccFeeAmt().equals(other.getAccFeeAmt()))
            && (this.getAccProfitAmt() == null ? other.getAccProfitAmt() == null : this.getAccProfitAmt().equals(other.getAccProfitAmt()))
            && (this.getSyncTime() == null ? other.getSyncTime() == null : this.getSyncTime().equals(other.getSyncTime()))
            && (this.getScExecQuant() == null ? other.getScExecQuant() == null : this.getScExecQuant().equals(other.getScExecQuant()))
            && (this.getScExecAmt() == null ? other.getScExecAmt() == null : this.getScExecAmt().equals(other.getScExecAmt()))
            && (this.getScExecAmtAcc() == null ? other.getScExecAmtAcc() == null : this.getScExecAmtAcc().equals(other.getScExecAmtAcc()))
            && (this.getScExecAmtUsd() == null ? other.getScExecAmtUsd() == null : this.getScExecAmtUsd().equals(other.getScExecAmtUsd()))
            && (this.getScExecAmtCny() == null ? other.getScExecAmtCny() == null : this.getScExecAmtCny().equals(other.getScExecAmtCny()))
            && (this.getPurPrice() == null ? other.getPurPrice() == null : this.getPurPrice().equals(other.getPurPrice()))
            && (this.getPurInvPrice() == null ? other.getPurInvPrice() == null : this.getPurInvPrice().equals(other.getPurInvPrice()))
            && (this.getFirstPayDate() == null ? other.getFirstPayDate() == null : this.getFirstPayDate().equals(other.getFirstPayDate()))
            && (this.getLastPayDate() == null ? other.getLastPayDate() == null : this.getLastPayDate().equals(other.getLastPayDate()))
            && (this.getCalcPrFee() == null ? other.getCalcPrFee() == null : this.getCalcPrFee().equals(other.getCalcPrFee()))
            && (this.getPurSendQuant() == null ? other.getPurSendQuant() == null : this.getPurSendQuant().equals(other.getPurSendQuant()))
            && (this.getPurSendAmt() == null ? other.getPurSendAmt() == null : this.getPurSendAmt().equals(other.getPurSendAmt()))
            && (this.getStQuant() == null ? other.getStQuant() == null : this.getStQuant().equals(other.getStQuant()))
            && (this.getStAmt() == null ? other.getStAmt() == null : this.getStAmt().equals(other.getStAmt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrkGuid() == null) ? 0 : getTrkGuid().hashCode());
        result = prime * result + ((getSrcScType() == null) ? 0 : getSrcScType().hashCode());
        result = prime * result + ((getSrcScId() == null) ? 0 : getSrcScId().hashCode());
        result = prime * result + ((getScAmtAcc() == null) ? 0 : getScAmtAcc().hashCode());
        result = prime * result + ((getScAmtUsd() == null) ? 0 : getScAmtUsd().hashCode());
        result = prime * result + ((getScAmtCny() == null) ? 0 : getScAmtCny().hashCode());
        result = prime * result + ((getSendQuant() == null) ? 0 : getSendQuant().hashCode());
        result = prime * result + ((getSendAmt() == null) ? 0 : getSendAmt().hashCode());
        result = prime * result + ((getUnSendQuant() == null) ? 0 : getUnSendQuant().hashCode());
        result = prime * result + ((getUnSendAmt() == null) ? 0 : getUnSendAmt().hashCode());
        result = prime * result + ((getOverdueUnSendQuant() == null) ? 0 : getOverdueUnSendQuant().hashCode());
        result = prime * result + ((getOverdueUnSendAmt() == null) ? 0 : getOverdueUnSendAmt().hashCode());
        result = prime * result + ((getHasSendOver() == null) ? 0 : getHasSendOver().hashCode());
        result = prime * result + ((getCstSignQuant() == null) ? 0 : getCstSignQuant().hashCode());
        result = prime * result + ((getCstSignAmt() == null) ? 0 : getCstSignAmt().hashCode());
        result = prime * result + ((getHasSignOver() == null) ? 0 : getHasSignOver().hashCode());
        result = prime * result + ((getPurQuant() == null) ? 0 : getPurQuant().hashCode());
        result = prime * result + ((getPurAmt() == null) ? 0 : getPurAmt().hashCode());
        result = prime * result + ((getHasPurOver() == null) ? 0 : getHasPurOver().hashCode());
        result = prime * result + ((getCollAmt() == null) ? 0 : getCollAmt().hashCode());
        result = prime * result + ((getCollAmtBail() == null) ? 0 : getCollAmtBail().hashCode());
        result = prime * result + ((getCollAmtHk() == null) ? 0 : getCollAmtHk().hashCode());
        result = prime * result + ((getCollAmtFee() == null) ? 0 : getCollAmtFee().hashCode());
        result = prime * result + ((getCollAmtOther() == null) ? 0 : getCollAmtOther().hashCode());
        result = prime * result + ((getPreCollAmt() == null) ? 0 : getPreCollAmt().hashCode());
        result = prime * result + ((getCstLeftAmt() == null) ? 0 : getCstLeftAmt().hashCode());
        result = prime * result + ((getReceivableAmt() == null) ? 0 : getReceivableAmt().hashCode());
        result = prime * result + ((getOverdueReceivableAmt() == null) ? 0 : getOverdueReceivableAmt().hashCode());
        result = prime * result + ((getHasCollOver() == null) ? 0 : getHasCollOver().hashCode());
        result = prime * result + ((getKpQuant() == null) ? 0 : getKpQuant().hashCode());
        result = prime * result + ((getKpAmt() == null) ? 0 : getKpAmt().hashCode());
        result = prime * result + ((getHasKpOver() == null) ? 0 : getHasKpOver().hashCode());
        result = prime * result + ((getSettleQuant() == null) ? 0 : getSettleQuant().hashCode());
        result = prime * result + ((getSettleAmt() == null) ? 0 : getSettleAmt().hashCode());
        result = prime * result + ((getHasSettleOver() == null) ? 0 : getHasSettleOver().hashCode());
        result = prime * result + ((getCloseStatus() == null) ? 0 : getCloseStatus().hashCode());
        result = prime * result + ((getBizSellInAmt() == null) ? 0 : getBizSellInAmt().hashCode());
        result = prime * result + ((getBizCostAmt() == null) ? 0 : getBizCostAmt().hashCode());
        result = prime * result + ((getBizFeeAmt() == null) ? 0 : getBizFeeAmt().hashCode());
        result = prime * result + ((getBizProfitAmt() == null) ? 0 : getBizProfitAmt().hashCode());
        result = prime * result + ((getAccSellInAmt() == null) ? 0 : getAccSellInAmt().hashCode());
        result = prime * result + ((getAccCostAmt() == null) ? 0 : getAccCostAmt().hashCode());
        result = prime * result + ((getAccFeeAmt() == null) ? 0 : getAccFeeAmt().hashCode());
        result = prime * result + ((getAccProfitAmt() == null) ? 0 : getAccProfitAmt().hashCode());
        result = prime * result + ((getSyncTime() == null) ? 0 : getSyncTime().hashCode());
        result = prime * result + ((getScExecQuant() == null) ? 0 : getScExecQuant().hashCode());
        result = prime * result + ((getScExecAmt() == null) ? 0 : getScExecAmt().hashCode());
        result = prime * result + ((getScExecAmtAcc() == null) ? 0 : getScExecAmtAcc().hashCode());
        result = prime * result + ((getScExecAmtUsd() == null) ? 0 : getScExecAmtUsd().hashCode());
        result = prime * result + ((getScExecAmtCny() == null) ? 0 : getScExecAmtCny().hashCode());
        result = prime * result + ((getPurPrice() == null) ? 0 : getPurPrice().hashCode());
        result = prime * result + ((getPurInvPrice() == null) ? 0 : getPurInvPrice().hashCode());
        result = prime * result + ((getFirstPayDate() == null) ? 0 : getFirstPayDate().hashCode());
        result = prime * result + ((getLastPayDate() == null) ? 0 : getLastPayDate().hashCode());
        result = prime * result + ((getCalcPrFee() == null) ? 0 : getCalcPrFee().hashCode());
        result = prime * result + ((getPurSendQuant() == null) ? 0 : getPurSendQuant().hashCode());
        result = prime * result + ((getPurSendAmt() == null) ? 0 : getPurSendAmt().hashCode());
        result = prime * result + ((getStQuant() == null) ? 0 : getStQuant().hashCode());
        result = prime * result + ((getStAmt() == null) ? 0 : getStAmt().hashCode());
        return result;
    }
}