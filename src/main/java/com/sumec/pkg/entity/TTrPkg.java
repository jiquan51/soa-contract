package com.sumec.pkg.entity;

import java.io.Serializable;
import java.util.Date;

public class TTrPkg implements Serializable {
    private String pkgId;

    private String pkgCode;

    private String pkgName;

    private Date mDate;

    private Long mUserId;

    private String pkgType;

    private static final long serialVersionUID = 1L;

    public String getPkgId() {
        return pkgId;
    }

    public void setPkgId(String pkgId) {
        this.pkgId = pkgId;
    }

    public String getPkgCode() {
        return pkgCode;
    }

    public void setPkgCode(String pkgCode) {
        this.pkgCode = pkgCode;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Long getmUserId() {
        return mUserId;
    }

    public void setmUserId(Long mUserId) {
        this.mUserId = mUserId;
    }

    public String getPkgType() {
        return pkgType;
    }

    public void setPkgType(String pkgType) {
        this.pkgType = pkgType;
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
        TTrPkg other = (TTrPkg) that;
        return (this.getPkgId() == null ? other.getPkgId() == null : this.getPkgId().equals(other.getPkgId()))
            && (this.getPkgCode() == null ? other.getPkgCode() == null : this.getPkgCode().equals(other.getPkgCode()))
            && (this.getPkgName() == null ? other.getPkgName() == null : this.getPkgName().equals(other.getPkgName()))
            && (this.getmDate() == null ? other.getmDate() == null : this.getmDate().equals(other.getmDate()))
            && (this.getmUserId() == null ? other.getmUserId() == null : this.getmUserId().equals(other.getmUserId()))
            && (this.getPkgType() == null ? other.getPkgType() == null : this.getPkgType().equals(other.getPkgType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkgId() == null) ? 0 : getPkgId().hashCode());
        result = prime * result + ((getPkgCode() == null) ? 0 : getPkgCode().hashCode());
        result = prime * result + ((getPkgName() == null) ? 0 : getPkgName().hashCode());
        result = prime * result + ((getmDate() == null) ? 0 : getmDate().hashCode());
        result = prime * result + ((getmUserId() == null) ? 0 : getmUserId().hashCode());
        result = prime * result + ((getPkgType() == null) ? 0 : getPkgType().hashCode());
        return result;
    }
}