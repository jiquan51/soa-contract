package com.sumec.pkg.entity;

import java.io.Serializable;
import java.util.Date;

public class TTrPkgRel implements Serializable {
    private String relId;

    private String pkgId;

    private String tobType;

    private String tobId;

    private Date relDate;

    private static final long serialVersionUID = 1L;

    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId;
    }

    public String getPkgId() {
        return pkgId;
    }

    public void setPkgId(String pkgId) {
        this.pkgId = pkgId;
    }

    public String getTobType() {
        return tobType;
    }

    public void setTobType(String tobType) {
        this.tobType = tobType;
    }

    public String getTobId() {
        return tobId;
    }

    public void setTobId(String tobId) {
        this.tobId = tobId;
    }

    public Date getRelDate() {
        return relDate;
    }

    public void setRelDate(Date relDate) {
        this.relDate = relDate;
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
        TTrPkgRel other = (TTrPkgRel) that;
        return (this.getRelId() == null ? other.getRelId() == null : this.getRelId().equals(other.getRelId()))
            && (this.getPkgId() == null ? other.getPkgId() == null : this.getPkgId().equals(other.getPkgId()))
            && (this.getTobType() == null ? other.getTobType() == null : this.getTobType().equals(other.getTobType()))
            && (this.getTobId() == null ? other.getTobId() == null : this.getTobId().equals(other.getTobId()))
            && (this.getRelDate() == null ? other.getRelDate() == null : this.getRelDate().equals(other.getRelDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRelId() == null) ? 0 : getRelId().hashCode());
        result = prime * result + ((getPkgId() == null) ? 0 : getPkgId().hashCode());
        result = prime * result + ((getTobType() == null) ? 0 : getTobType().hashCode());
        result = prime * result + ((getTobId() == null) ? 0 : getTobId().hashCode());
        result = prime * result + ((getRelDate() == null) ? 0 : getRelDate().hashCode());
        return result;
    }
}