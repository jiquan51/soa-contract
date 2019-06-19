package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TExpScCmd implements Serializable {
    private BigDecimal pId;

    private String cNo;

    private String pNo;

    private Short pOrder;

    private String pName;

    private String techNo;

    private String pDesc;

    private String pUnit;

    private BigDecimal pQuant;

    private BigDecimal taxPrice;

    private String pUnit2;

    private BigDecimal pQuant2;

    private BigDecimal taxPrice2;

    private String outlook;

    private BigDecimal nW;

    private BigDecimal gW;

    private String statCod;

    private Date shipD;

    private Integer packing;

    private String packmode;

    private BigDecimal scId;

    private String brand;

    private BigDecimal taxRate;

    private String quoteNo;

    private String customerNo;

    private String is2unit;

    private Long subId;

    private String orderNo;

    private Date deliveryD;

    private String erpNo;

    private BigDecimal costPrice;

    private BigDecimal discountRate;

    private BigDecimal rtnQuant;

    private String developYn;

    private BigDecimal pRate;

    private Long commId;

    private BigDecimal proCmdId;

    private String cmdType;

    private BigDecimal et;

    private String pcd;

    private BigDecimal cb;

    private String color;

    private BigDecimal bcPId;

    private BigDecimal outQuant;

    private BigDecimal outQuant2;

    private BigDecimal pAmt;

    private String remark;

    private Date protocolDate;

    private String protocolNo;

    private BigDecimal wheelSize;

    private String sumecCode;

    private BigDecimal quotationId;

    private Long commUnit;

    private Long commUnitPack;

    private Long commUnitStat;

    private BigDecimal commQuantStat;

    private BigDecimal packRate;

    private BigDecimal statRate;

    private BigDecimal pPrice;

    private BigDecimal objPrice;

    private BigDecimal rtnRate;

    private BigDecimal tariffRate;

    private String isSubPur;

    private BigDecimal commQuantPack;

    private BigDecimal lackLoadRate;

    private BigDecimal overLoadRate;

    private Long commUnitAux;

    private BigDecimal auxRate;

    private BigDecimal commQuantAux;

    private String isShEquip;

    private String texture;

    private String refType;

    private String refId;

    private static final long serialVersionUID = 1L;

    public BigDecimal getpId() {
        return pId;
    }

    public void setpId(BigDecimal pId) {
        this.pId = pId;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public Short getpOrder() {
        return pOrder;
    }

    public void setpOrder(Short pOrder) {
        this.pOrder = pOrder;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getTechNo() {
        return techNo;
    }

    public void setTechNo(String techNo) {
        this.techNo = techNo;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public String getpUnit() {
        return pUnit;
    }

    public void setpUnit(String pUnit) {
        this.pUnit = pUnit;
    }

    public BigDecimal getpQuant() {
        return pQuant == null ? BigDecimal.ZERO : pQuant;
    }

    public void setpQuant(BigDecimal pQuant) {
        this.pQuant = pQuant;
    }

    public BigDecimal getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
    }

    public String getpUnit2() {
        return pUnit2;
    }

    public void setpUnit2(String pUnit2) {
        this.pUnit2 = pUnit2;
    }

    public BigDecimal getpQuant2() {
        return pQuant2;
    }

    public void setpQuant2(BigDecimal pQuant2) {
        this.pQuant2 = pQuant2;
    }

    public BigDecimal getTaxPrice2() {
        return taxPrice2;
    }

    public void setTaxPrice2(BigDecimal taxPrice2) {
        this.taxPrice2 = taxPrice2;
    }

    public String getOutlook() {
        return outlook;
    }

    public void setOutlook(String outlook) {
        this.outlook = outlook;
    }

    public BigDecimal getnW() {
        return nW;
    }

    public void setnW(BigDecimal nW) {
        this.nW = nW;
    }

    public BigDecimal getgW() {
        return gW;
    }

    public void setgW(BigDecimal gW) {
        this.gW = gW;
    }

    public String getStatCod() {
        return statCod;
    }

    public void setStatCod(String statCod) {
        this.statCod = statCod;
    }

    public Date getShipD() {
        return shipD;
    }

    public void setShipD(Date shipD) {
        this.shipD = shipD;
    }

    public Integer getPacking() {
        return packing;
    }

    public void setPacking(Integer packing) {
        this.packing = packing;
    }

    public String getPackmode() {
        return packmode;
    }

    public void setPackmode(String packmode) {
        this.packmode = packmode;
    }

    public BigDecimal getScId() {
        return scId;
    }

    public void setScId(BigDecimal scId) {
        this.scId = scId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getQuoteNo() {
        return quoteNo;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getIs2unit() {
        return is2unit;
    }

    public void setIs2unit(String is2unit) {
        this.is2unit = is2unit;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getDeliveryD() {
        return deliveryD;
    }

    public void setDeliveryD(Date deliveryD) {
        this.deliveryD = deliveryD;
    }

    public String getErpNo() {
        return erpNo;
    }

    public void setErpNo(String erpNo) {
        this.erpNo = erpNo;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getRtnQuant() {
        return rtnQuant;
    }

    public void setRtnQuant(BigDecimal rtnQuant) {
        this.rtnQuant = rtnQuant;
    }

    public String getDevelopYn() {
        return developYn;
    }

    public void setDevelopYn(String developYn) {
        this.developYn = developYn;
    }

    public BigDecimal getpRate() {
        return pRate;
    }

    public void setpRate(BigDecimal pRate) {
        this.pRate = pRate;
    }

    public Long getCommId() {
        return commId;
    }

    public void setCommId(Long commId) {
        this.commId = commId;
    }

    public BigDecimal getProCmdId() {
        return proCmdId;
    }

    public void setProCmdId(BigDecimal proCmdId) {
        this.proCmdId = proCmdId;
    }

    public String getCmdType() {
        return cmdType;
    }

    public void setCmdType(String cmdType) {
        this.cmdType = cmdType;
    }

    public BigDecimal getEt() {
        return et;
    }

    public void setEt(BigDecimal et) {
        this.et = et;
    }

    public String getPcd() {
        return pcd;
    }

    public void setPcd(String pcd) {
        this.pcd = pcd;
    }

    public BigDecimal getCb() {
        return cb;
    }

    public void setCb(BigDecimal cb) {
        this.cb = cb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getBcPId() {
        return bcPId;
    }

    public void setBcPId(BigDecimal bcPId) {
        this.bcPId = bcPId;
    }

    public BigDecimal getOutQuant() {
        return outQuant;
    }

    public void setOutQuant(BigDecimal outQuant) {
        this.outQuant = outQuant;
    }

    public BigDecimal getOutQuant2() {
        return outQuant2;
    }

    public void setOutQuant2(BigDecimal outQuant2) {
        this.outQuant2 = outQuant2;
    }

    public BigDecimal getpAmt() {
        return pAmt;
    }

    public void setpAmt(BigDecimal pAmt) {
        this.pAmt = pAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getProtocolDate() {
        return protocolDate;
    }

    public void setProtocolDate(Date protocolDate) {
        this.protocolDate = protocolDate;
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }

    public BigDecimal getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(BigDecimal wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getSumecCode() {
        return sumecCode;
    }

    public void setSumecCode(String sumecCode) {
        this.sumecCode = sumecCode;
    }

    public BigDecimal getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(BigDecimal quotationId) {
        this.quotationId = quotationId;
    }

    public Long getCommUnit() {
        return commUnit;
    }

    public void setCommUnit(Long commUnit) {
        this.commUnit = commUnit;
    }

    public Long getCommUnitPack() {
        return commUnitPack;
    }

    public void setCommUnitPack(Long commUnitPack) {
        this.commUnitPack = commUnitPack;
    }

    public Long getCommUnitStat() {
        return commUnitStat;
    }

    public void setCommUnitStat(Long commUnitStat) {
        this.commUnitStat = commUnitStat;
    }

    public BigDecimal getCommQuantStat() {
        return commQuantStat;
    }

    public void setCommQuantStat(BigDecimal commQuantStat) {
        this.commQuantStat = commQuantStat;
    }

    public BigDecimal getPackRate() {
        return packRate;
    }

    public void setPackRate(BigDecimal packRate) {
        this.packRate = packRate;
    }

    public BigDecimal getStatRate() {
        return statRate;
    }

    public void setStatRate(BigDecimal statRate) {
        this.statRate = statRate;
    }

    public BigDecimal getpPrice() {
        return pPrice;
    }

    public void setpPrice(BigDecimal pPrice) {
        this.pPrice = pPrice;
    }

    public BigDecimal getObjPrice() {
        return objPrice;
    }

    public void setObjPrice(BigDecimal objPrice) {
        this.objPrice = objPrice;
    }

    public BigDecimal getRtnRate() {
        return rtnRate;
    }

    public void setRtnRate(BigDecimal rtnRate) {
        this.rtnRate = rtnRate;
    }

    public BigDecimal getTariffRate() {
        return tariffRate;
    }

    public void setTariffRate(BigDecimal tariffRate) {
        this.tariffRate = tariffRate;
    }

    public String getIsSubPur() {
        return isSubPur;
    }

    public void setIsSubPur(String isSubPur) {
        this.isSubPur = isSubPur;
    }

    public BigDecimal getCommQuantPack() {
        return commQuantPack;
    }

    public void setCommQuantPack(BigDecimal commQuantPack) {
        this.commQuantPack = commQuantPack;
    }

    public BigDecimal getLackLoadRate() {
        return lackLoadRate;
    }

    public void setLackLoadRate(BigDecimal lackLoadRate) {
        this.lackLoadRate = lackLoadRate;
    }

    public BigDecimal getOverLoadRate() {
        return overLoadRate;
    }

    public void setOverLoadRate(BigDecimal overLoadRate) {
        this.overLoadRate = overLoadRate;
    }

    public Long getCommUnitAux() {
        return commUnitAux;
    }

    public void setCommUnitAux(Long commUnitAux) {
        this.commUnitAux = commUnitAux;
    }

    public BigDecimal getAuxRate() {
        return auxRate;
    }

    public void setAuxRate(BigDecimal auxRate) {
        this.auxRate = auxRate;
    }

    public BigDecimal getCommQuantAux() {
        return commQuantAux;
    }

    public void setCommQuantAux(BigDecimal commQuantAux) {
        this.commQuantAux = commQuantAux;
    }

    public String getIsShEquip() {
        return isShEquip;
    }

    public void setIsShEquip(String isShEquip) {
        this.isShEquip = isShEquip;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
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
        TExpScCmd other = (TExpScCmd) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getcNo() == null ? other.getcNo() == null : this.getcNo().equals(other.getcNo()))
            && (this.getpNo() == null ? other.getpNo() == null : this.getpNo().equals(other.getpNo()))
            && (this.getpOrder() == null ? other.getpOrder() == null : this.getpOrder().equals(other.getpOrder()))
            && (this.getpName() == null ? other.getpName() == null : this.getpName().equals(other.getpName()))
            && (this.getTechNo() == null ? other.getTechNo() == null : this.getTechNo().equals(other.getTechNo()))
            && (this.getpDesc() == null ? other.getpDesc() == null : this.getpDesc().equals(other.getpDesc()))
            && (this.getpUnit() == null ? other.getpUnit() == null : this.getpUnit().equals(other.getpUnit()))
            && (this.getpQuant() == null ? other.getpQuant() == null : this.getpQuant().equals(other.getpQuant()))
            && (this.getTaxPrice() == null ? other.getTaxPrice() == null : this.getTaxPrice().equals(other.getTaxPrice()))
            && (this.getpUnit2() == null ? other.getpUnit2() == null : this.getpUnit2().equals(other.getpUnit2()))
            && (this.getpQuant2() == null ? other.getpQuant2() == null : this.getpQuant2().equals(other.getpQuant2()))
            && (this.getTaxPrice2() == null ? other.getTaxPrice2() == null : this.getTaxPrice2().equals(other.getTaxPrice2()))
            && (this.getOutlook() == null ? other.getOutlook() == null : this.getOutlook().equals(other.getOutlook()))
            && (this.getnW() == null ? other.getnW() == null : this.getnW().equals(other.getnW()))
            && (this.getgW() == null ? other.getgW() == null : this.getgW().equals(other.getgW()))
            && (this.getStatCod() == null ? other.getStatCod() == null : this.getStatCod().equals(other.getStatCod()))
            && (this.getShipD() == null ? other.getShipD() == null : this.getShipD().equals(other.getShipD()))
            && (this.getPacking() == null ? other.getPacking() == null : this.getPacking().equals(other.getPacking()))
            && (this.getPackmode() == null ? other.getPackmode() == null : this.getPackmode().equals(other.getPackmode()))
            && (this.getScId() == null ? other.getScId() == null : this.getScId().equals(other.getScId()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getTaxRate() == null ? other.getTaxRate() == null : this.getTaxRate().equals(other.getTaxRate()))
            && (this.getQuoteNo() == null ? other.getQuoteNo() == null : this.getQuoteNo().equals(other.getQuoteNo()))
            && (this.getCustomerNo() == null ? other.getCustomerNo() == null : this.getCustomerNo().equals(other.getCustomerNo()))
            && (this.getIs2unit() == null ? other.getIs2unit() == null : this.getIs2unit().equals(other.getIs2unit()))
            && (this.getSubId() == null ? other.getSubId() == null : this.getSubId().equals(other.getSubId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getDeliveryD() == null ? other.getDeliveryD() == null : this.getDeliveryD().equals(other.getDeliveryD()))
            && (this.getErpNo() == null ? other.getErpNo() == null : this.getErpNo().equals(other.getErpNo()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getDiscountRate() == null ? other.getDiscountRate() == null : this.getDiscountRate().equals(other.getDiscountRate()))
            && (this.getRtnQuant() == null ? other.getRtnQuant() == null : this.getRtnQuant().equals(other.getRtnQuant()))
            && (this.getDevelopYn() == null ? other.getDevelopYn() == null : this.getDevelopYn().equals(other.getDevelopYn()))
            && (this.getpRate() == null ? other.getpRate() == null : this.getpRate().equals(other.getpRate()))
            && (this.getCommId() == null ? other.getCommId() == null : this.getCommId().equals(other.getCommId()))
            && (this.getProCmdId() == null ? other.getProCmdId() == null : this.getProCmdId().equals(other.getProCmdId()))
            && (this.getCmdType() == null ? other.getCmdType() == null : this.getCmdType().equals(other.getCmdType()))
            && (this.getEt() == null ? other.getEt() == null : this.getEt().equals(other.getEt()))
            && (this.getPcd() == null ? other.getPcd() == null : this.getPcd().equals(other.getPcd()))
            && (this.getCb() == null ? other.getCb() == null : this.getCb().equals(other.getCb()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getBcPId() == null ? other.getBcPId() == null : this.getBcPId().equals(other.getBcPId()))
            && (this.getOutQuant() == null ? other.getOutQuant() == null : this.getOutQuant().equals(other.getOutQuant()))
            && (this.getOutQuant2() == null ? other.getOutQuant2() == null : this.getOutQuant2().equals(other.getOutQuant2()))
            && (this.getpAmt() == null ? other.getpAmt() == null : this.getpAmt().equals(other.getpAmt()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getProtocolDate() == null ? other.getProtocolDate() == null : this.getProtocolDate().equals(other.getProtocolDate()))
            && (this.getProtocolNo() == null ? other.getProtocolNo() == null : this.getProtocolNo().equals(other.getProtocolNo()))
            && (this.getWheelSize() == null ? other.getWheelSize() == null : this.getWheelSize().equals(other.getWheelSize()))
            && (this.getSumecCode() == null ? other.getSumecCode() == null : this.getSumecCode().equals(other.getSumecCode()))
            && (this.getQuotationId() == null ? other.getQuotationId() == null : this.getQuotationId().equals(other.getQuotationId()))
            && (this.getCommUnit() == null ? other.getCommUnit() == null : this.getCommUnit().equals(other.getCommUnit()))
            && (this.getCommUnitPack() == null ? other.getCommUnitPack() == null : this.getCommUnitPack().equals(other.getCommUnitPack()))
            && (this.getCommUnitStat() == null ? other.getCommUnitStat() == null : this.getCommUnitStat().equals(other.getCommUnitStat()))
            && (this.getCommQuantStat() == null ? other.getCommQuantStat() == null : this.getCommQuantStat().equals(other.getCommQuantStat()))
            && (this.getPackRate() == null ? other.getPackRate() == null : this.getPackRate().equals(other.getPackRate()))
            && (this.getStatRate() == null ? other.getStatRate() == null : this.getStatRate().equals(other.getStatRate()))
            && (this.getpPrice() == null ? other.getpPrice() == null : this.getpPrice().equals(other.getpPrice()))
            && (this.getObjPrice() == null ? other.getObjPrice() == null : this.getObjPrice().equals(other.getObjPrice()))
            && (this.getRtnRate() == null ? other.getRtnRate() == null : this.getRtnRate().equals(other.getRtnRate()))
            && (this.getTariffRate() == null ? other.getTariffRate() == null : this.getTariffRate().equals(other.getTariffRate()))
            && (this.getIsSubPur() == null ? other.getIsSubPur() == null : this.getIsSubPur().equals(other.getIsSubPur()))
            && (this.getCommQuantPack() == null ? other.getCommQuantPack() == null : this.getCommQuantPack().equals(other.getCommQuantPack()))
            && (this.getLackLoadRate() == null ? other.getLackLoadRate() == null : this.getLackLoadRate().equals(other.getLackLoadRate()))
            && (this.getOverLoadRate() == null ? other.getOverLoadRate() == null : this.getOverLoadRate().equals(other.getOverLoadRate()))
            && (this.getCommUnitAux() == null ? other.getCommUnitAux() == null : this.getCommUnitAux().equals(other.getCommUnitAux()))
            && (this.getAuxRate() == null ? other.getAuxRate() == null : this.getAuxRate().equals(other.getAuxRate()))
            && (this.getCommQuantAux() == null ? other.getCommQuantAux() == null : this.getCommQuantAux().equals(other.getCommQuantAux()))
            && (this.getIsShEquip() == null ? other.getIsShEquip() == null : this.getIsShEquip().equals(other.getIsShEquip()))
            && (this.getTexture() == null ? other.getTexture() == null : this.getTexture().equals(other.getTexture()))
            && (this.getRefType() == null ? other.getRefType() == null : this.getRefType().equals(other.getRefType()))
            && (this.getRefId() == null ? other.getRefId() == null : this.getRefId().equals(other.getRefId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getcNo() == null) ? 0 : getcNo().hashCode());
        result = prime * result + ((getpNo() == null) ? 0 : getpNo().hashCode());
        result = prime * result + ((getpOrder() == null) ? 0 : getpOrder().hashCode());
        result = prime * result + ((getpName() == null) ? 0 : getpName().hashCode());
        result = prime * result + ((getTechNo() == null) ? 0 : getTechNo().hashCode());
        result = prime * result + ((getpDesc() == null) ? 0 : getpDesc().hashCode());
        result = prime * result + ((getpUnit() == null) ? 0 : getpUnit().hashCode());
        result = prime * result + ((getpQuant() == null) ? 0 : getpQuant().hashCode());
        result = prime * result + ((getTaxPrice() == null) ? 0 : getTaxPrice().hashCode());
        result = prime * result + ((getpUnit2() == null) ? 0 : getpUnit2().hashCode());
        result = prime * result + ((getpQuant2() == null) ? 0 : getpQuant2().hashCode());
        result = prime * result + ((getTaxPrice2() == null) ? 0 : getTaxPrice2().hashCode());
        result = prime * result + ((getOutlook() == null) ? 0 : getOutlook().hashCode());
        result = prime * result + ((getnW() == null) ? 0 : getnW().hashCode());
        result = prime * result + ((getgW() == null) ? 0 : getgW().hashCode());
        result = prime * result + ((getStatCod() == null) ? 0 : getStatCod().hashCode());
        result = prime * result + ((getShipD() == null) ? 0 : getShipD().hashCode());
        result = prime * result + ((getPacking() == null) ? 0 : getPacking().hashCode());
        result = prime * result + ((getPackmode() == null) ? 0 : getPackmode().hashCode());
        result = prime * result + ((getScId() == null) ? 0 : getScId().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getTaxRate() == null) ? 0 : getTaxRate().hashCode());
        result = prime * result + ((getQuoteNo() == null) ? 0 : getQuoteNo().hashCode());
        result = prime * result + ((getCustomerNo() == null) ? 0 : getCustomerNo().hashCode());
        result = prime * result + ((getIs2unit() == null) ? 0 : getIs2unit().hashCode());
        result = prime * result + ((getSubId() == null) ? 0 : getSubId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getDeliveryD() == null) ? 0 : getDeliveryD().hashCode());
        result = prime * result + ((getErpNo() == null) ? 0 : getErpNo().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getDiscountRate() == null) ? 0 : getDiscountRate().hashCode());
        result = prime * result + ((getRtnQuant() == null) ? 0 : getRtnQuant().hashCode());
        result = prime * result + ((getDevelopYn() == null) ? 0 : getDevelopYn().hashCode());
        result = prime * result + ((getpRate() == null) ? 0 : getpRate().hashCode());
        result = prime * result + ((getCommId() == null) ? 0 : getCommId().hashCode());
        result = prime * result + ((getProCmdId() == null) ? 0 : getProCmdId().hashCode());
        result = prime * result + ((getCmdType() == null) ? 0 : getCmdType().hashCode());
        result = prime * result + ((getEt() == null) ? 0 : getEt().hashCode());
        result = prime * result + ((getPcd() == null) ? 0 : getPcd().hashCode());
        result = prime * result + ((getCb() == null) ? 0 : getCb().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getBcPId() == null) ? 0 : getBcPId().hashCode());
        result = prime * result + ((getOutQuant() == null) ? 0 : getOutQuant().hashCode());
        result = prime * result + ((getOutQuant2() == null) ? 0 : getOutQuant2().hashCode());
        result = prime * result + ((getpAmt() == null) ? 0 : getpAmt().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getProtocolDate() == null) ? 0 : getProtocolDate().hashCode());
        result = prime * result + ((getProtocolNo() == null) ? 0 : getProtocolNo().hashCode());
        result = prime * result + ((getWheelSize() == null) ? 0 : getWheelSize().hashCode());
        result = prime * result + ((getSumecCode() == null) ? 0 : getSumecCode().hashCode());
        result = prime * result + ((getQuotationId() == null) ? 0 : getQuotationId().hashCode());
        result = prime * result + ((getCommUnit() == null) ? 0 : getCommUnit().hashCode());
        result = prime * result + ((getCommUnitPack() == null) ? 0 : getCommUnitPack().hashCode());
        result = prime * result + ((getCommUnitStat() == null) ? 0 : getCommUnitStat().hashCode());
        result = prime * result + ((getCommQuantStat() == null) ? 0 : getCommQuantStat().hashCode());
        result = prime * result + ((getPackRate() == null) ? 0 : getPackRate().hashCode());
        result = prime * result + ((getStatRate() == null) ? 0 : getStatRate().hashCode());
        result = prime * result + ((getpPrice() == null) ? 0 : getpPrice().hashCode());
        result = prime * result + ((getObjPrice() == null) ? 0 : getObjPrice().hashCode());
        result = prime * result + ((getRtnRate() == null) ? 0 : getRtnRate().hashCode());
        result = prime * result + ((getTariffRate() == null) ? 0 : getTariffRate().hashCode());
        result = prime * result + ((getIsSubPur() == null) ? 0 : getIsSubPur().hashCode());
        result = prime * result + ((getCommQuantPack() == null) ? 0 : getCommQuantPack().hashCode());
        result = prime * result + ((getLackLoadRate() == null) ? 0 : getLackLoadRate().hashCode());
        result = prime * result + ((getOverLoadRate() == null) ? 0 : getOverLoadRate().hashCode());
        result = prime * result + ((getCommUnitAux() == null) ? 0 : getCommUnitAux().hashCode());
        result = prime * result + ((getAuxRate() == null) ? 0 : getAuxRate().hashCode());
        result = prime * result + ((getCommQuantAux() == null) ? 0 : getCommQuantAux().hashCode());
        result = prime * result + ((getIsShEquip() == null) ? 0 : getIsShEquip().hashCode());
        result = prime * result + ((getTexture() == null) ? 0 : getTexture().hashCode());
        result = prime * result + ((getRefType() == null) ? 0 : getRefType().hashCode());
        result = prime * result + ((getRefId() == null) ? 0 : getRefId().hashCode());
        return result;
    }
}