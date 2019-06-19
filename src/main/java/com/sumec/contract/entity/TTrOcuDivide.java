package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.alibaba.fastjson.annotation.JSONField;

public class TTrOcuDivide implements Serializable {
    @JSONField(serialize=false)  
    private String divId;
    @JSONField(serialize=false)  
    private String divType;

    private String tobType;

    private BigDecimal tobId;

    private Long ocuId;
    @JSONField(serialize=false)  
    private BigDecimal divRate;
    @JSONField(serialize=false)  
    private String remark;

    private static final long serialVersionUID = 1L;

    public String getDivId() {
        return divId;
    }

    public void setDivId(String divId) {
        this.divId = divId;
    }

    public String getDivType() {
        return divType;
    }

    public void setDivType(String divType) {
        this.divType = divType;
    }

    public String getTobType() {
        return tobType;
    }

    public void setTobType(String tobType) {
        this.tobType = tobType;
    }

    public BigDecimal getTobId() {
        return tobId;
    }

    public void setTobId(BigDecimal tobId) {
        this.tobId = tobId;
    }

    public Long getOcuId() {
        return ocuId;
    }

    public void setOcuId(Long ocuId) {
        this.ocuId = ocuId;
    }

    public BigDecimal getDivRate() {
        return divRate;
    }

    public void setDivRate(BigDecimal divRate) {
        this.divRate = divRate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        TTrOcuDivide other = (TTrOcuDivide) that;
        return 
           ((this.getTobType() == null ? other.getTobType() == null : this.getTobType().equals(other.getTobType()))
            && (this.getTobId() == null ? other.getTobId() == null : this.getTobId().equals(other.getTobId()))
            && (this.getOcuId() == null ? other.getOcuId() == null : this.getOcuId().equals(other.getOcuId())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDivId() == null) ? 0 : getDivId().hashCode());
        result = prime * result + ((getDivType() == null) ? 0 : getDivType().hashCode());
        result = prime * result + ((getTobType() == null) ? 0 : getTobType().hashCode());
        result = prime * result + ((getTobId() == null) ? 0 : getTobId().hashCode());
        result = prime * result + ((getOcuId() == null) ? 0 : getOcuId().hashCode());
        result = prime * result + ((getDivRate() == null) ? 0 : getDivRate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}