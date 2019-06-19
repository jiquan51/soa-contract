package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TProjKind implements Serializable {
    private BigDecimal kId;

    private String kCode;

    private String kName;

    private String inlandOrOverseas;

    private static final long serialVersionUID = 1L;

    public BigDecimal getkId() {
        return kId;
    }

    public void setkId(BigDecimal kId) {
        this.kId = kId;
    }

    public String getkCode() {
        return kCode;
    }

    public void setkCode(String kCode) {
        this.kCode = kCode;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public String getInlandOrOverseas() {
        return inlandOrOverseas;
    }

    public void setInlandOrOverseas(String inlandOrOverseas) {
        this.inlandOrOverseas = inlandOrOverseas;
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
        TProjKind other = (TProjKind) that;
        return (this.getkId() == null ? other.getkId() == null : this.getkId().equals(other.getkId()))
            && (this.getkCode() == null ? other.getkCode() == null : this.getkCode().equals(other.getkCode()))
            && (this.getkName() == null ? other.getkName() == null : this.getkName().equals(other.getkName()))
            && (this.getInlandOrOverseas() == null ? other.getInlandOrOverseas() == null : this.getInlandOrOverseas().equals(other.getInlandOrOverseas()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getkId() == null) ? 0 : getkId().hashCode());
        result = prime * result + ((getkCode() == null) ? 0 : getkCode().hashCode());
        result = prime * result + ((getkName() == null) ? 0 : getkName().hashCode());
        result = prime * result + ((getInlandOrOverseas() == null) ? 0 : getInlandOrOverseas().hashCode());
        return result;
    }
}