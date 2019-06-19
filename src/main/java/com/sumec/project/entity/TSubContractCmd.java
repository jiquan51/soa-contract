package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSubContractCmd implements Serializable {
    private BigDecimal pId;

    private BigDecimal bcId;

    private String cNo;

    private String pNo;

    private Short pOrder;

    private String techNo;

    private String customerNo;

    private String brand;

    private String pName;

    private String pDesc;

    private String pUnit;

    private BigDecimal pQuant;

    private BigDecimal taxPrice;

    private BigDecimal realCostPrice;

    private String pUnit2;

    private BigDecimal pQuant2;

    private BigDecimal taxPrice2;

    private BigDecimal taxRate;

    private String nNo;

    private Date deliD;

    private String isPriceFix;

    private BigDecimal priceLimit;

    private String facCode;

    private BigDecimal pPrice;

    private BigDecimal pPrice2;

    private String standardNo;

    private String isProm;

    private String is2unit;

    private Long subId;

    private String erpNo;

    private BigDecimal treatyId;

    private BigDecimal scPId;

    private String treatyNo;

    private BigDecimal pRate;

    private Date cutDate;

    private String pDesc2;

    private BigDecimal facSendQuant;

    private BigDecimal commId;

    private BigDecimal proCmdId;

    private BigDecimal proId;

    private String proType;

    private String cmdType;

    private BigDecimal nW;

    private BigDecimal et;

    private String pcd;

    private BigDecimal cb;

    private String color;

    private BigDecimal itemId;

    private BigDecimal facSendQuant2;

    private String fromType;

    private BigDecimal wheelSize;

    private String sumecCode;

    private Long commUnit;

    private Long commUnitPack;

    private Long commUnitStat;

    private BigDecimal commQuantStat;

    private BigDecimal packRate;

    private BigDecimal statRate;

    private BigDecimal tariffRate;

    private BigDecimal exciseRate;

    private BigDecimal objPrice;

    private Long commUnit2;

    private BigDecimal commQuantPack;

    private BigDecimal incomeAmt;

    private String incomeCurrType;

    private BigDecimal commAmt;

    private String isLogi;

    private BigDecimal incomePrice;

    private String isThirdInspect;

    private String hsCode;

    private String isNeedInspect;

    private String commNameEn;

    private BigDecimal antiDumpRate;

    private BigDecimal rtnRate;

    private BigDecimal marketPrice;

    private String isShEquip;

    private static final long serialVersionUID = 1L;

    public BigDecimal getpId() {
        return pId;
    }

    public void setpId(BigDecimal pId) {
        this.pId = pId;
    }

    public BigDecimal getBcId() {
        return bcId;
    }

    public void setBcId(BigDecimal bcId) {
        this.bcId = bcId;
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

    public String getTechNo() {
        return techNo;
    }

    public void setTechNo(String techNo) {
        this.techNo = techNo;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
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
        return pQuant;
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

    public BigDecimal getRealCostPrice() {
        return realCostPrice;
    }

    public void setRealCostPrice(BigDecimal realCostPrice) {
        this.realCostPrice = realCostPrice;
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

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getnNo() {
        return nNo;
    }

    public void setnNo(String nNo) {
        this.nNo = nNo;
    }

    public Date getDeliD() {
        return deliD;
    }

    public void setDeliD(Date deliD) {
        this.deliD = deliD;
    }

    public String getIsPriceFix() {
        return isPriceFix;
    }

    public void setIsPriceFix(String isPriceFix) {
        this.isPriceFix = isPriceFix;
    }

    public BigDecimal getPriceLimit() {
        return priceLimit;
    }

    public void setPriceLimit(BigDecimal priceLimit) {
        this.priceLimit = priceLimit;
    }

    public String getFacCode() {
        return facCode;
    }

    public void setFacCode(String facCode) {
        this.facCode = facCode;
    }

    public BigDecimal getpPrice() {
        return pPrice;
    }

    public void setpPrice(BigDecimal pPrice) {
        this.pPrice = pPrice;
    }

    public BigDecimal getpPrice2() {
        return pPrice2;
    }

    public void setpPrice2(BigDecimal pPrice2) {
        this.pPrice2 = pPrice2;
    }

    public String getStandardNo() {
        return standardNo;
    }

    public void setStandardNo(String standardNo) {
        this.standardNo = standardNo;
    }

    public String getIsProm() {
        return isProm;
    }

    public void setIsProm(String isProm) {
        this.isProm = isProm;
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

    public String getErpNo() {
        return erpNo;
    }

    public void setErpNo(String erpNo) {
        this.erpNo = erpNo;
    }

    public BigDecimal getTreatyId() {
        return treatyId;
    }

    public void setTreatyId(BigDecimal treatyId) {
        this.treatyId = treatyId;
    }

    public BigDecimal getScPId() {
        return scPId;
    }

    public void setScPId(BigDecimal scPId) {
        this.scPId = scPId;
    }

    public String getTreatyNo() {
        return treatyNo;
    }

    public void setTreatyNo(String treatyNo) {
        this.treatyNo = treatyNo;
    }

    public BigDecimal getpRate() {
        return pRate;
    }

    public void setpRate(BigDecimal pRate) {
        this.pRate = pRate;
    }

    public Date getCutDate() {
        return cutDate;
    }

    public void setCutDate(Date cutDate) {
        this.cutDate = cutDate;
    }

    public String getpDesc2() {
        return pDesc2;
    }

    public void setpDesc2(String pDesc2) {
        this.pDesc2 = pDesc2;
    }

    public BigDecimal getFacSendQuant() {
        return facSendQuant;
    }

    public void setFacSendQuant(BigDecimal facSendQuant) {
        this.facSendQuant = facSendQuant;
    }

    public BigDecimal getCommId() {
        return commId;
    }

    public void setCommId(BigDecimal commId) {
        this.commId = commId;
    }

    public BigDecimal getProCmdId() {
        return proCmdId;
    }

    public void setProCmdId(BigDecimal proCmdId) {
        this.proCmdId = proCmdId;
    }

    public BigDecimal getProId() {
        return proId;
    }

    public void setProId(BigDecimal proId) {
        this.proId = proId;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getCmdType() {
        return cmdType;
    }

    public void setCmdType(String cmdType) {
        this.cmdType = cmdType;
    }

    public BigDecimal getnW() {
        return nW;
    }

    public void setnW(BigDecimal nW) {
        this.nW = nW;
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

    public BigDecimal getItemId() {
        return itemId;
    }

    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getFacSendQuant2() {
        return facSendQuant2;
    }

    public void setFacSendQuant2(BigDecimal facSendQuant2) {
        this.facSendQuant2 = facSendQuant2;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
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

    public BigDecimal getTariffRate() {
        return tariffRate;
    }

    public void setTariffRate(BigDecimal tariffRate) {
        this.tariffRate = tariffRate;
    }

    public BigDecimal getExciseRate() {
        return exciseRate;
    }

    public void setExciseRate(BigDecimal exciseRate) {
        this.exciseRate = exciseRate;
    }

    public BigDecimal getObjPrice() {
        return objPrice;
    }

    public void setObjPrice(BigDecimal objPrice) {
        this.objPrice = objPrice;
    }

    public Long getCommUnit2() {
        return commUnit2;
    }

    public void setCommUnit2(Long commUnit2) {
        this.commUnit2 = commUnit2;
    }

    public BigDecimal getCommQuantPack() {
        return commQuantPack;
    }

    public void setCommQuantPack(BigDecimal commQuantPack) {
        this.commQuantPack = commQuantPack;
    }

    public BigDecimal getIncomeAmt() {
        return incomeAmt;
    }

    public void setIncomeAmt(BigDecimal incomeAmt) {
        this.incomeAmt = incomeAmt;
    }

    public String getIncomeCurrType() {
        return incomeCurrType;
    }

    public void setIncomeCurrType(String incomeCurrType) {
        this.incomeCurrType = incomeCurrType;
    }

    public BigDecimal getCommAmt() {
        return commAmt;
    }

    public void setCommAmt(BigDecimal commAmt) {
        this.commAmt = commAmt;
    }

    public String getIsLogi() {
        return isLogi;
    }

    public void setIsLogi(String isLogi) {
        this.isLogi = isLogi;
    }

    public BigDecimal getIncomePrice() {
        return incomePrice;
    }

    public void setIncomePrice(BigDecimal incomePrice) {
        this.incomePrice = incomePrice;
    }

    public String getIsThirdInspect() {
        return isThirdInspect;
    }

    public void setIsThirdInspect(String isThirdInspect) {
        this.isThirdInspect = isThirdInspect;
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getIsNeedInspect() {
        return isNeedInspect;
    }

    public void setIsNeedInspect(String isNeedInspect) {
        this.isNeedInspect = isNeedInspect;
    }

    public String getCommNameEn() {
        return commNameEn;
    }

    public void setCommNameEn(String commNameEn) {
        this.commNameEn = commNameEn;
    }

    public BigDecimal getAntiDumpRate() {
        return antiDumpRate;
    }

    public void setAntiDumpRate(BigDecimal antiDumpRate) {
        this.antiDumpRate = antiDumpRate;
    }

    public BigDecimal getRtnRate() {
        return rtnRate;
    }

    public void setRtnRate(BigDecimal rtnRate) {
        this.rtnRate = rtnRate;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getIsShEquip() {
        return isShEquip;
    }

    public void setIsShEquip(String isShEquip) {
        this.isShEquip = isShEquip;
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
        TSubContractCmd other = (TSubContractCmd) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getBcId() == null ? other.getBcId() == null : this.getBcId().equals(other.getBcId()))
            && (this.getcNo() == null ? other.getcNo() == null : this.getcNo().equals(other.getcNo()))
            && (this.getpNo() == null ? other.getpNo() == null : this.getpNo().equals(other.getpNo()))
            && (this.getpOrder() == null ? other.getpOrder() == null : this.getpOrder().equals(other.getpOrder()))
            && (this.getTechNo() == null ? other.getTechNo() == null : this.getTechNo().equals(other.getTechNo()))
            && (this.getCustomerNo() == null ? other.getCustomerNo() == null : this.getCustomerNo().equals(other.getCustomerNo()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getpName() == null ? other.getpName() == null : this.getpName().equals(other.getpName()))
            && (this.getpDesc() == null ? other.getpDesc() == null : this.getpDesc().equals(other.getpDesc()))
            && (this.getpUnit() == null ? other.getpUnit() == null : this.getpUnit().equals(other.getpUnit()))
            && (this.getpQuant() == null ? other.getpQuant() == null : this.getpQuant().equals(other.getpQuant()))
            && (this.getTaxPrice() == null ? other.getTaxPrice() == null : this.getTaxPrice().equals(other.getTaxPrice()))
            && (this.getRealCostPrice() == null ? other.getRealCostPrice() == null : this.getRealCostPrice().equals(other.getRealCostPrice()))
            && (this.getpUnit2() == null ? other.getpUnit2() == null : this.getpUnit2().equals(other.getpUnit2()))
            && (this.getpQuant2() == null ? other.getpQuant2() == null : this.getpQuant2().equals(other.getpQuant2()))
            && (this.getTaxPrice2() == null ? other.getTaxPrice2() == null : this.getTaxPrice2().equals(other.getTaxPrice2()))
            && (this.getTaxRate() == null ? other.getTaxRate() == null : this.getTaxRate().equals(other.getTaxRate()))
            && (this.getnNo() == null ? other.getnNo() == null : this.getnNo().equals(other.getnNo()))
            && (this.getDeliD() == null ? other.getDeliD() == null : this.getDeliD().equals(other.getDeliD()))
            && (this.getIsPriceFix() == null ? other.getIsPriceFix() == null : this.getIsPriceFix().equals(other.getIsPriceFix()))
            && (this.getPriceLimit() == null ? other.getPriceLimit() == null : this.getPriceLimit().equals(other.getPriceLimit()))
            && (this.getFacCode() == null ? other.getFacCode() == null : this.getFacCode().equals(other.getFacCode()))
            && (this.getpPrice() == null ? other.getpPrice() == null : this.getpPrice().equals(other.getpPrice()))
            && (this.getpPrice2() == null ? other.getpPrice2() == null : this.getpPrice2().equals(other.getpPrice2()))
            && (this.getStandardNo() == null ? other.getStandardNo() == null : this.getStandardNo().equals(other.getStandardNo()))
            && (this.getIsProm() == null ? other.getIsProm() == null : this.getIsProm().equals(other.getIsProm()))
            && (this.getIs2unit() == null ? other.getIs2unit() == null : this.getIs2unit().equals(other.getIs2unit()))
            && (this.getSubId() == null ? other.getSubId() == null : this.getSubId().equals(other.getSubId()))
            && (this.getErpNo() == null ? other.getErpNo() == null : this.getErpNo().equals(other.getErpNo()))
            && (this.getTreatyId() == null ? other.getTreatyId() == null : this.getTreatyId().equals(other.getTreatyId()))
            && (this.getScPId() == null ? other.getScPId() == null : this.getScPId().equals(other.getScPId()))
            && (this.getTreatyNo() == null ? other.getTreatyNo() == null : this.getTreatyNo().equals(other.getTreatyNo()))
            && (this.getpRate() == null ? other.getpRate() == null : this.getpRate().equals(other.getpRate()))
            && (this.getCutDate() == null ? other.getCutDate() == null : this.getCutDate().equals(other.getCutDate()))
            && (this.getpDesc2() == null ? other.getpDesc2() == null : this.getpDesc2().equals(other.getpDesc2()))
            && (this.getFacSendQuant() == null ? other.getFacSendQuant() == null : this.getFacSendQuant().equals(other.getFacSendQuant()))
            && (this.getCommId() == null ? other.getCommId() == null : this.getCommId().equals(other.getCommId()))
            && (this.getProCmdId() == null ? other.getProCmdId() == null : this.getProCmdId().equals(other.getProCmdId()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProType() == null ? other.getProType() == null : this.getProType().equals(other.getProType()))
            && (this.getCmdType() == null ? other.getCmdType() == null : this.getCmdType().equals(other.getCmdType()))
            && (this.getnW() == null ? other.getnW() == null : this.getnW().equals(other.getnW()))
            && (this.getEt() == null ? other.getEt() == null : this.getEt().equals(other.getEt()))
            && (this.getPcd() == null ? other.getPcd() == null : this.getPcd().equals(other.getPcd()))
            && (this.getCb() == null ? other.getCb() == null : this.getCb().equals(other.getCb()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getFacSendQuant2() == null ? other.getFacSendQuant2() == null : this.getFacSendQuant2().equals(other.getFacSendQuant2()))
            && (this.getFromType() == null ? other.getFromType() == null : this.getFromType().equals(other.getFromType()))
            && (this.getWheelSize() == null ? other.getWheelSize() == null : this.getWheelSize().equals(other.getWheelSize()))
            && (this.getSumecCode() == null ? other.getSumecCode() == null : this.getSumecCode().equals(other.getSumecCode()))
            && (this.getCommUnit() == null ? other.getCommUnit() == null : this.getCommUnit().equals(other.getCommUnit()))
            && (this.getCommUnitPack() == null ? other.getCommUnitPack() == null : this.getCommUnitPack().equals(other.getCommUnitPack()))
            && (this.getCommUnitStat() == null ? other.getCommUnitStat() == null : this.getCommUnitStat().equals(other.getCommUnitStat()))
            && (this.getCommQuantStat() == null ? other.getCommQuantStat() == null : this.getCommQuantStat().equals(other.getCommQuantStat()))
            && (this.getPackRate() == null ? other.getPackRate() == null : this.getPackRate().equals(other.getPackRate()))
            && (this.getStatRate() == null ? other.getStatRate() == null : this.getStatRate().equals(other.getStatRate()))
            && (this.getTariffRate() == null ? other.getTariffRate() == null : this.getTariffRate().equals(other.getTariffRate()))
            && (this.getExciseRate() == null ? other.getExciseRate() == null : this.getExciseRate().equals(other.getExciseRate()))
            && (this.getObjPrice() == null ? other.getObjPrice() == null : this.getObjPrice().equals(other.getObjPrice()))
            && (this.getCommUnit2() == null ? other.getCommUnit2() == null : this.getCommUnit2().equals(other.getCommUnit2()))
            && (this.getCommQuantPack() == null ? other.getCommQuantPack() == null : this.getCommQuantPack().equals(other.getCommQuantPack()))
            && (this.getIncomeAmt() == null ? other.getIncomeAmt() == null : this.getIncomeAmt().equals(other.getIncomeAmt()))
            && (this.getIncomeCurrType() == null ? other.getIncomeCurrType() == null : this.getIncomeCurrType().equals(other.getIncomeCurrType()))
            && (this.getCommAmt() == null ? other.getCommAmt() == null : this.getCommAmt().equals(other.getCommAmt()))
            && (this.getIsLogi() == null ? other.getIsLogi() == null : this.getIsLogi().equals(other.getIsLogi()))
            && (this.getIncomePrice() == null ? other.getIncomePrice() == null : this.getIncomePrice().equals(other.getIncomePrice()))
            && (this.getIsThirdInspect() == null ? other.getIsThirdInspect() == null : this.getIsThirdInspect().equals(other.getIsThirdInspect()))
            && (this.getHsCode() == null ? other.getHsCode() == null : this.getHsCode().equals(other.getHsCode()))
            && (this.getIsNeedInspect() == null ? other.getIsNeedInspect() == null : this.getIsNeedInspect().equals(other.getIsNeedInspect()))
            && (this.getCommNameEn() == null ? other.getCommNameEn() == null : this.getCommNameEn().equals(other.getCommNameEn()))
            && (this.getAntiDumpRate() == null ? other.getAntiDumpRate() == null : this.getAntiDumpRate().equals(other.getAntiDumpRate()))
            && (this.getRtnRate() == null ? other.getRtnRate() == null : this.getRtnRate().equals(other.getRtnRate()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getIsShEquip() == null ? other.getIsShEquip() == null : this.getIsShEquip().equals(other.getIsShEquip()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getBcId() == null) ? 0 : getBcId().hashCode());
        result = prime * result + ((getcNo() == null) ? 0 : getcNo().hashCode());
        result = prime * result + ((getpNo() == null) ? 0 : getpNo().hashCode());
        result = prime * result + ((getpOrder() == null) ? 0 : getpOrder().hashCode());
        result = prime * result + ((getTechNo() == null) ? 0 : getTechNo().hashCode());
        result = prime * result + ((getCustomerNo() == null) ? 0 : getCustomerNo().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getpName() == null) ? 0 : getpName().hashCode());
        result = prime * result + ((getpDesc() == null) ? 0 : getpDesc().hashCode());
        result = prime * result + ((getpUnit() == null) ? 0 : getpUnit().hashCode());
        result = prime * result + ((getpQuant() == null) ? 0 : getpQuant().hashCode());
        result = prime * result + ((getTaxPrice() == null) ? 0 : getTaxPrice().hashCode());
        result = prime * result + ((getRealCostPrice() == null) ? 0 : getRealCostPrice().hashCode());
        result = prime * result + ((getpUnit2() == null) ? 0 : getpUnit2().hashCode());
        result = prime * result + ((getpQuant2() == null) ? 0 : getpQuant2().hashCode());
        result = prime * result + ((getTaxPrice2() == null) ? 0 : getTaxPrice2().hashCode());
        result = prime * result + ((getTaxRate() == null) ? 0 : getTaxRate().hashCode());
        result = prime * result + ((getnNo() == null) ? 0 : getnNo().hashCode());
        result = prime * result + ((getDeliD() == null) ? 0 : getDeliD().hashCode());
        result = prime * result + ((getIsPriceFix() == null) ? 0 : getIsPriceFix().hashCode());
        result = prime * result + ((getPriceLimit() == null) ? 0 : getPriceLimit().hashCode());
        result = prime * result + ((getFacCode() == null) ? 0 : getFacCode().hashCode());
        result = prime * result + ((getpPrice() == null) ? 0 : getpPrice().hashCode());
        result = prime * result + ((getpPrice2() == null) ? 0 : getpPrice2().hashCode());
        result = prime * result + ((getStandardNo() == null) ? 0 : getStandardNo().hashCode());
        result = prime * result + ((getIsProm() == null) ? 0 : getIsProm().hashCode());
        result = prime * result + ((getIs2unit() == null) ? 0 : getIs2unit().hashCode());
        result = prime * result + ((getSubId() == null) ? 0 : getSubId().hashCode());
        result = prime * result + ((getErpNo() == null) ? 0 : getErpNo().hashCode());
        result = prime * result + ((getTreatyId() == null) ? 0 : getTreatyId().hashCode());
        result = prime * result + ((getScPId() == null) ? 0 : getScPId().hashCode());
        result = prime * result + ((getTreatyNo() == null) ? 0 : getTreatyNo().hashCode());
        result = prime * result + ((getpRate() == null) ? 0 : getpRate().hashCode());
        result = prime * result + ((getCutDate() == null) ? 0 : getCutDate().hashCode());
        result = prime * result + ((getpDesc2() == null) ? 0 : getpDesc2().hashCode());
        result = prime * result + ((getFacSendQuant() == null) ? 0 : getFacSendQuant().hashCode());
        result = prime * result + ((getCommId() == null) ? 0 : getCommId().hashCode());
        result = prime * result + ((getProCmdId() == null) ? 0 : getProCmdId().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProType() == null) ? 0 : getProType().hashCode());
        result = prime * result + ((getCmdType() == null) ? 0 : getCmdType().hashCode());
        result = prime * result + ((getnW() == null) ? 0 : getnW().hashCode());
        result = prime * result + ((getEt() == null) ? 0 : getEt().hashCode());
        result = prime * result + ((getPcd() == null) ? 0 : getPcd().hashCode());
        result = prime * result + ((getCb() == null) ? 0 : getCb().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getFacSendQuant2() == null) ? 0 : getFacSendQuant2().hashCode());
        result = prime * result + ((getFromType() == null) ? 0 : getFromType().hashCode());
        result = prime * result + ((getWheelSize() == null) ? 0 : getWheelSize().hashCode());
        result = prime * result + ((getSumecCode() == null) ? 0 : getSumecCode().hashCode());
        result = prime * result + ((getCommUnit() == null) ? 0 : getCommUnit().hashCode());
        result = prime * result + ((getCommUnitPack() == null) ? 0 : getCommUnitPack().hashCode());
        result = prime * result + ((getCommUnitStat() == null) ? 0 : getCommUnitStat().hashCode());
        result = prime * result + ((getCommQuantStat() == null) ? 0 : getCommQuantStat().hashCode());
        result = prime * result + ((getPackRate() == null) ? 0 : getPackRate().hashCode());
        result = prime * result + ((getStatRate() == null) ? 0 : getStatRate().hashCode());
        result = prime * result + ((getTariffRate() == null) ? 0 : getTariffRate().hashCode());
        result = prime * result + ((getExciseRate() == null) ? 0 : getExciseRate().hashCode());
        result = prime * result + ((getObjPrice() == null) ? 0 : getObjPrice().hashCode());
        result = prime * result + ((getCommUnit2() == null) ? 0 : getCommUnit2().hashCode());
        result = prime * result + ((getCommQuantPack() == null) ? 0 : getCommQuantPack().hashCode());
        result = prime * result + ((getIncomeAmt() == null) ? 0 : getIncomeAmt().hashCode());
        result = prime * result + ((getIncomeCurrType() == null) ? 0 : getIncomeCurrType().hashCode());
        result = prime * result + ((getCommAmt() == null) ? 0 : getCommAmt().hashCode());
        result = prime * result + ((getIsLogi() == null) ? 0 : getIsLogi().hashCode());
        result = prime * result + ((getIncomePrice() == null) ? 0 : getIncomePrice().hashCode());
        result = prime * result + ((getIsThirdInspect() == null) ? 0 : getIsThirdInspect().hashCode());
        result = prime * result + ((getHsCode() == null) ? 0 : getHsCode().hashCode());
        result = prime * result + ((getIsNeedInspect() == null) ? 0 : getIsNeedInspect().hashCode());
        result = prime * result + ((getCommNameEn() == null) ? 0 : getCommNameEn().hashCode());
        result = prime * result + ((getAntiDumpRate() == null) ? 0 : getAntiDumpRate().hashCode());
        result = prime * result + ((getRtnRate() == null) ? 0 : getRtnRate().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getIsShEquip() == null) ? 0 : getIsShEquip().hashCode());
        return result;
    }
}