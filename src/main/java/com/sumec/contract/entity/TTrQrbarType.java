package com.sumec.contract.entity;

import java.io.Serializable;

public class TTrQrbarType implements Serializable {
    private String tId;

    private String tName;

    private String fTId;

    private String tCode;

    private static final long serialVersionUID = 1L;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getfTId() {
        return fTId;
    }

    public void setfTId(String fTId) {
        this.fTId = fTId;
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode;
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
        TTrQrbarType other = (TTrQrbarType) that;
        return (this.gettId() == null ? other.gettId() == null : this.gettId().equals(other.gettId()))
            && (this.gettName() == null ? other.gettName() == null : this.gettName().equals(other.gettName()))
            && (this.getfTId() == null ? other.getfTId() == null : this.getfTId().equals(other.getfTId()))
            && (this.gettCode() == null ? other.gettCode() == null : this.gettCode().equals(other.gettCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gettId() == null) ? 0 : gettId().hashCode());
        result = prime * result + ((gettName() == null) ? 0 : gettName().hashCode());
        result = prime * result + ((getfTId() == null) ? 0 : getfTId().hashCode());
        result = prime * result + ((gettCode() == null) ? 0 : gettCode().hashCode());
        return result;
    }
}