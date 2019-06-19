package com.sumec.flow.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TSumecFlowModule implements Serializable {
    private Long fmId;

    private String fmCode;

    private String fmName;

    private String tableName;

    private String pkColumn;

    private String fmViewName;

    private String dwObject;

    private String winformName;

    private String confirmColumn;

    private String allowGene;

    private String isDel;

    private Long orderId;

    private Long maId;

    private String grantDir;

    private String displayColumn;

    private String displayDw;

    private BigDecimal mobileFmId;

    private String callbackhandler;

    private String assistObject;

    private static final long serialVersionUID = 1L;

    public Long getFmId() {
        return fmId;
    }

    public void setFmId(Long fmId) {
        this.fmId = fmId;
    }

    public String getFmCode() {
        return fmCode;
    }

    public void setFmCode(String fmCode) {
        this.fmCode = fmCode;
    }

    public String getFmName() {
        return fmName;
    }

    public void setFmName(String fmName) {
        this.fmName = fmName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPkColumn() {
        return pkColumn;
    }

    public void setPkColumn(String pkColumn) {
        this.pkColumn = pkColumn;
    }

    public String getFmViewName() {
        return fmViewName;
    }

    public void setFmViewName(String fmViewName) {
        this.fmViewName = fmViewName;
    }

    public String getDwObject() {
        return dwObject;
    }

    public void setDwObject(String dwObject) {
        this.dwObject = dwObject;
    }

    public String getWinformName() {
        return winformName;
    }

    public void setWinformName(String winformName) {
        this.winformName = winformName;
    }

    public String getConfirmColumn() {
        return confirmColumn;
    }

    public void setConfirmColumn(String confirmColumn) {
        this.confirmColumn = confirmColumn;
    }

    public String getAllowGene() {
        return allowGene;
    }

    public void setAllowGene(String allowGene) {
        this.allowGene = allowGene;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getMaId() {
        return maId;
    }

    public void setMaId(Long maId) {
        this.maId = maId;
    }

    public String getGrantDir() {
        return grantDir;
    }

    public void setGrantDir(String grantDir) {
        this.grantDir = grantDir;
    }

    public String getDisplayColumn() {
        return displayColumn;
    }

    public void setDisplayColumn(String displayColumn) {
        this.displayColumn = displayColumn;
    }

    public String getDisplayDw() {
        return displayDw;
    }

    public void setDisplayDw(String displayDw) {
        this.displayDw = displayDw;
    }

    public BigDecimal getMobileFmId() {
        return mobileFmId;
    }

    public void setMobileFmId(BigDecimal mobileFmId) {
        this.mobileFmId = mobileFmId;
    }

    public String getCallbackhandler() {
        return callbackhandler;
    }

    public void setCallbackhandler(String callbackhandler) {
        this.callbackhandler = callbackhandler;
    }

    public String getAssistObject() {
        return assistObject;
    }

    public void setAssistObject(String assistObject) {
        this.assistObject = assistObject;
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
        TSumecFlowModule other = (TSumecFlowModule) that;
        return (this.getFmId() == null ? other.getFmId() == null : this.getFmId().equals(other.getFmId()))
            && (this.getFmCode() == null ? other.getFmCode() == null : this.getFmCode().equals(other.getFmCode()))
            && (this.getFmName() == null ? other.getFmName() == null : this.getFmName().equals(other.getFmName()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getPkColumn() == null ? other.getPkColumn() == null : this.getPkColumn().equals(other.getPkColumn()))
            && (this.getFmViewName() == null ? other.getFmViewName() == null : this.getFmViewName().equals(other.getFmViewName()))
            && (this.getDwObject() == null ? other.getDwObject() == null : this.getDwObject().equals(other.getDwObject()))
            && (this.getWinformName() == null ? other.getWinformName() == null : this.getWinformName().equals(other.getWinformName()))
            && (this.getConfirmColumn() == null ? other.getConfirmColumn() == null : this.getConfirmColumn().equals(other.getConfirmColumn()))
            && (this.getAllowGene() == null ? other.getAllowGene() == null : this.getAllowGene().equals(other.getAllowGene()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getMaId() == null ? other.getMaId() == null : this.getMaId().equals(other.getMaId()))
            && (this.getGrantDir() == null ? other.getGrantDir() == null : this.getGrantDir().equals(other.getGrantDir()))
            && (this.getDisplayColumn() == null ? other.getDisplayColumn() == null : this.getDisplayColumn().equals(other.getDisplayColumn()))
            && (this.getDisplayDw() == null ? other.getDisplayDw() == null : this.getDisplayDw().equals(other.getDisplayDw()))
            && (this.getMobileFmId() == null ? other.getMobileFmId() == null : this.getMobileFmId().equals(other.getMobileFmId()))
            && (this.getCallbackhandler() == null ? other.getCallbackhandler() == null : this.getCallbackhandler().equals(other.getCallbackhandler()))
            && (this.getAssistObject() == null ? other.getAssistObject() == null : this.getAssistObject().equals(other.getAssistObject()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFmId() == null) ? 0 : getFmId().hashCode());
        result = prime * result + ((getFmCode() == null) ? 0 : getFmCode().hashCode());
        result = prime * result + ((getFmName() == null) ? 0 : getFmName().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getPkColumn() == null) ? 0 : getPkColumn().hashCode());
        result = prime * result + ((getFmViewName() == null) ? 0 : getFmViewName().hashCode());
        result = prime * result + ((getDwObject() == null) ? 0 : getDwObject().hashCode());
        result = prime * result + ((getWinformName() == null) ? 0 : getWinformName().hashCode());
        result = prime * result + ((getConfirmColumn() == null) ? 0 : getConfirmColumn().hashCode());
        result = prime * result + ((getAllowGene() == null) ? 0 : getAllowGene().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getMaId() == null) ? 0 : getMaId().hashCode());
        result = prime * result + ((getGrantDir() == null) ? 0 : getGrantDir().hashCode());
        result = prime * result + ((getDisplayColumn() == null) ? 0 : getDisplayColumn().hashCode());
        result = prime * result + ((getDisplayDw() == null) ? 0 : getDisplayDw().hashCode());
        result = prime * result + ((getMobileFmId() == null) ? 0 : getMobileFmId().hashCode());
        result = prime * result + ((getCallbackhandler() == null) ? 0 : getCallbackhandler().hashCode());
        result = prime * result + ((getAssistObject() == null) ? 0 : getAssistObject().hashCode());
        return result;
    }
}