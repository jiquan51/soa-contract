package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TTrContractRel implements Serializable {
    private String relId;

    private String relType;

    private String tobTypeA;

    private BigDecimal tobIdA;

    private String tobTypeB;

    private BigDecimal tobIdB;

    private static final long serialVersionUID = 1L;

    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId;
    }

    public String getRelType() {
        return relType;
    }

    public void setRelType(String relType) {
        this.relType = relType;
    }

    public String getTobTypeA() {
        return tobTypeA;
    }

    public void setTobTypeA(String tobTypeA) {
        this.tobTypeA = tobTypeA;
    }

    public BigDecimal getTobIdA() {
        return tobIdA;
    }

    public void setTobIdA(BigDecimal tobIdA) {
        this.tobIdA = tobIdA;
    }

    public String getTobTypeB() {
        return tobTypeB;
    }

    public void setTobTypeB(String tobTypeB) {
        this.tobTypeB = tobTypeB;
    }

    public BigDecimal getTobIdB() {
        return tobIdB;
    }

    public void setTobIdB(BigDecimal tobIdB) {
        this.tobIdB = tobIdB;
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
        TTrContractRel other = (TTrContractRel) that;
        return (this.getRelId() == null ? other.getRelId() == null : this.getRelId().equals(other.getRelId()))
            && (this.getRelType() == null ? other.getRelType() == null : this.getRelType().equals(other.getRelType()))
            && (this.getTobTypeA() == null ? other.getTobTypeA() == null : this.getTobTypeA().equals(other.getTobTypeA()))
            && (this.getTobIdA() == null ? other.getTobIdA() == null : this.getTobIdA().equals(other.getTobIdA()))
            && (this.getTobTypeB() == null ? other.getTobTypeB() == null : this.getTobTypeB().equals(other.getTobTypeB()))
            && (this.getTobIdB() == null ? other.getTobIdB() == null : this.getTobIdB().equals(other.getTobIdB()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRelId() == null) ? 0 : getRelId().hashCode());
        result = prime * result + ((getRelType() == null) ? 0 : getRelType().hashCode());
        result = prime * result + ((getTobTypeA() == null) ? 0 : getTobTypeA().hashCode());
        result = prime * result + ((getTobIdA() == null) ? 0 : getTobIdA().hashCode());
        result = prime * result + ((getTobTypeB() == null) ? 0 : getTobTypeB().hashCode());
        result = prime * result + ((getTobIdB() == null) ? 0 : getTobIdB().hashCode());
        return result;
    }
}