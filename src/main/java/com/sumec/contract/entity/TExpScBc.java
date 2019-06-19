package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TExpScBc implements Serializable {
    private String scNo;

    private String bcNo;

    private String pNo;

    private BigDecimal pQuant;

    private String pUnit;

    private String cType;

    private Long commId;

    private Long commUnit;
    
    private BigDecimal scId;

    private BigDecimal bcId;

    private BigDecimal scPId;

    private BigDecimal bcPId;

    private static final long serialVersionUID = 1L;

    public String getScNo() {
        return scNo;
    }

    public void setScNo(String scNo) {
        this.scNo = scNo;
    }

    public String getBcNo() {
        return bcNo;
    }

    public void setBcNo(String bcNo) {
        this.bcNo = bcNo;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public BigDecimal getpQuant() {
        return pQuant;
    }

    public void setpQuant(BigDecimal pQuant) {
        this.pQuant = pQuant;
    }

    public String getpUnit() {
        return pUnit;
    }

    public void setpUnit(String pUnit) {
        this.pUnit = pUnit;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public Long getCommId() {
        return commId;
    }

    public void setCommId(Long commId) {
        this.commId = commId;
    }

    public Long getCommUnit() {
        return commUnit;
    }

    public void setCommUnit(Long commUnit) {
        this.commUnit = commUnit;
    }
    
    public BigDecimal getScId() {
        return scId;
    }

    public void setScId(BigDecimal scId) {
        this.scId = scId;
    }

    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
    }

    public BigDecimal getScPId() {
        return scPId;
    }

    public void setScPId(BigDecimal scPId) {
        this.scPId = scPId;
    }

    public BigDecimal getBcPId() {
        return bcPId;
    }

    public void setBcPId(BigDecimal bcPId) {
        this.bcPId = bcPId;
    }
}