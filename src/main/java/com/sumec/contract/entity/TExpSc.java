package com.sumec.contract.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.sumec.base.BaseEntity;

public class TExpSc extends BaseEntity implements Serializable {
    private BigDecimal scId;

    private String cNo;

    private Date mDate;

    private String cStatus;

    private String cstNo;

    private String currTyp;

    private String trademode;

    private Short advanceDay;

    private String priceTerm;

    private String payment;

    private Short payDay;

    private Date shipD;

    private String depatureNo;

    private String depatureName;

    private String destNo;

    private String destName;

    private String packTerm;

    private String insuTerm;

    private BigDecimal tAmt;

    private BigDecimal pAmt;

    private BigDecimal insuFee;

    private BigDecimal transFee;

    private BigDecimal packFee;

    private BigDecimal commissionFee;

    private BigDecimal discountFee;

    private String discountNote;

    private String depNo;

    private String notes;

    private String orderNo;

    private String qualityTime;

    private String supplyScope;

    private String corpRes;

    private String isCoop;

    private String payCoopTerm;

    private BigDecimal coopAmt;

    private String empNo;

    private String empName;

    private String makerNo;

    private String makerName;

    private String groupNo;

    private String modifyNo;

    private String modifyName;

    private Date modifyDate;

    private String checkNo;

    private String checkName;

    private Date checkDate;

    private String endId;

    private String tag;

    private String isValid;

    private String confirm;

    private String fromId;

    private String cType;

    private BigDecimal usdRate;

    private BigDecimal rmbRate;

    private String copyNum;

    private String tradeType;

    private String payTerm;

    private Long ocId;

    private BigDecimal usdamt;

    private String preNo;

    private String accNo;

    private String kcType;

    private BigDecimal grossProfit;

    private BigDecimal discountRate;

    private Date installDate;

    private String cTag;

    private String docBs;

    private String docSc;

    private String docBc;

    private String docYj;

    private String docCert;

    private String docYs;

    private BigDecimal sdAmt;

    private BigDecimal yqAmt;

    private BigDecimal kpQuant;

    private BigDecimal kpAmt;

    private BigDecimal fpQuant;

    private BigDecimal fpAmt;

    private BigDecimal orgId;

    private BigDecimal userId;

    private BigDecimal cellId;

    private BigDecimal cstId;

    private String guarantee;

    private String cstName;

    private BigDecimal creditLeft;

    private String proName;

    private BigDecimal pQuant;

    private String confirmCondition;

    private String yqNotes;

    private BigDecimal qualityYear;

    private Date yjInstallDate;

    private String jhLateTerm;

    private String yhTerm;

    private BigDecimal proId;

    private String proType;

    private String outOverTag;

    private Date outOverDate;

    private Date validDate;

    private String undo;

    private String endTag;

    private Date ysDate;

    private Date sjDate;

    private String qualityUnit;

    private String tbType;

    private Date guranteeTrackday;

    private BigDecimal dbCheckUserId;

    private Date dbCheckDate;

    private BigDecimal commissionId;

    private String commissionNo;

    private String commissionName;

    private BigDecimal buyerId;

    private String buyerNo;

    private String buyerName;

    private String dbCheckTag;

    private String gdTag;

    private BigDecimal gdUserId;

    private Date gdDate;

    private BigDecimal refId;

    private String refType;

    private Long ocuOrgId;

    private String importNation;

    private BigDecimal grossRate;

    private String scType;

    private Date signDate;

    private String isXyx;

    private String isHyx;

    private String isFhEnd;

    private Date tsDate;

    private Long iuOcuId;

    private Long depatureId;

    private Long destId;

    private String nNo;

    private String inlandOrOverseas;

    private String typeOfCon;

    private String cataOfCon;

    private String propOfCon;

    private String bizMode;

    private BigDecimal relScId;

    private String conName;

    private String signPlace;

    private String conContent;

    private BigDecimal sellerId;

    private Long cstNationId;

    private BigDecimal senderId;

    private Long landNationId;

    private Long landPortId;

    private String landLocation;

    private BigDecimal recerId;

    private Long destNationId;

    private Long destPortId;

    private String destLocation;

    private String isBatches;

    private String isTransfer;

    private Long transferPortId;

    private BigDecimal commissionRate;

    private String commissionCurrType;

    private String shipmentWay;

    private String boxDeliveryType;

    private String deliveryPlace;

    private BigDecimal proxyCorpId;

    private String isArrignProxy;

    private String transResp;

    private String transWay;

    private BigDecimal transCorpId;

    private String isArrignTrans;

    private String transFeeResp;

    private String transInsuResp;

    private String sendTerm;

    private String arbitrationPlace;

    private String suePlace;

    private String isNeedSpecDocu;

    private String pricingWay;

    private String settleWay;

    private String selfSettleWay;

    private String dkStandard;

    private BigDecimal dkIntRate;

    private String isAgreeDk;

    private Integer conPeriod;

    private BigDecimal bailRate;

    private String profitScheme;

    private BigDecimal commQuantPack;

    private BigDecimal commQuantStat;

    private Long depOrgId;

    private String priceStandard;

    private String cstProp;

    private Long cmdCataId;

    private String sellerName;

    private String senderName;

    private String recerName;

    private String transCorpName;

    private String proxyCorpName;

    private String isClose;

    private Long closeUserId;

    private Date closeDate;

    private BigDecimal shortOrOver;

    private String conPeriodSType;

    private Long commUnit;

    private String isOa;

    private BigDecimal commPerUnit;

    private BigDecimal lackLoadRate;

    private BigDecimal overLoadRate;

    private String tradeOrSrv;

    private String trSrvOrGoods;

    private String profitSchemeDesc;

    private Long leaseCorpId;

    private String leaseCorpName;

    private String prFeeType;

    private BigDecimal prFeeRate;

    private String prFeeCurrType;

    private BigDecimal prFeeAmt;

    private String leaseMode;

    private Long planFctId;

    private String planFctName;

    private Long planManufacId;

    private String planManufacName;

    private BigDecimal complexLevel;

    private String commName;

    private Long commId;

    private String planPurInlOrOs;

    private String bailRateType;

    private String bizType;
    
    private String remarkClerk;	//商务审批提示
    private String whName;	//仓库单位

    private static final long serialVersionUID = 1L;

    public BigDecimal getScId() {
        return scId;
    }

    public void setScId(BigDecimal scId) {
        this.scId = scId;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public String getCstNo() {
        return cstNo;
    }

    public void setCstNo(String cstNo) {
        this.cstNo = cstNo;
    }

    public String getCurrTyp() {
        return currTyp;
    }

    public void setCurrTyp(String currTyp) {
        this.currTyp = currTyp;
    }

    public String getTrademode() {
        return trademode;
    }

    public void setTrademode(String trademode) {
        this.trademode = trademode;
    }

    public Short getAdvanceDay() {
        return advanceDay;
    }

    public void setAdvanceDay(Short advanceDay) {
        this.advanceDay = advanceDay;
    }

    public String getPriceTerm() {
        return priceTerm;
    }

    public void setPriceTerm(String priceTerm) {
        this.priceTerm = priceTerm;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Short getPayDay() {
        return payDay;
    }

    public void setPayDay(Short payDay) {
        this.payDay = payDay;
    }

    public Date getShipD() {
        return shipD;
    }

    public void setShipD(Date shipD) {
        this.shipD = shipD;
    }

    public String getDepatureNo() {
        return depatureNo;
    }

    public void setDepatureNo(String depatureNo) {
        this.depatureNo = depatureNo;
    }

    public String getDepatureName() {
        return depatureName;
    }

    public void setDepatureName(String depatureName) {
        this.depatureName = depatureName;
    }

    public String getDestNo() {
        return destNo;
    }

    public void setDestNo(String destNo) {
        this.destNo = destNo;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getPackTerm() {
        return packTerm;
    }

    public void setPackTerm(String packTerm) {
        this.packTerm = packTerm;
    }

    public String getInsuTerm() {
        return insuTerm;
    }

    public void setInsuTerm(String insuTerm) {
        this.insuTerm = insuTerm;
    }

    public BigDecimal gettAmt() {
        return tAmt;
    }

    public void settAmt(BigDecimal tAmt) {
        this.tAmt = tAmt;
    }

    public BigDecimal getpAmt() {
        return pAmt;
    }

    public void setpAmt(BigDecimal pAmt) {
        this.pAmt = pAmt;
    }

    public BigDecimal getInsuFee() {
        return insuFee;
    }

    public void setInsuFee(BigDecimal insuFee) {
        this.insuFee = insuFee;
    }

    public BigDecimal getTransFee() {
        return transFee;
    }

    public void setTransFee(BigDecimal transFee) {
        this.transFee = transFee;
    }

    public BigDecimal getPackFee() {
        return packFee;
    }

    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    public BigDecimal getCommissionFee() {
        return commissionFee;
    }

    public void setCommissionFee(BigDecimal commissionFee) {
        this.commissionFee = commissionFee;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }

    public String getDiscountNote() {
        return discountNote;
    }

    public void setDiscountNote(String discountNote) {
        this.discountNote = discountNote;
    }

    public String getDepNo() {
        return depNo;
    }

    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(String qualityTime) {
        this.qualityTime = qualityTime;
    }

    public String getSupplyScope() {
        return supplyScope;
    }

    public void setSupplyScope(String supplyScope) {
        this.supplyScope = supplyScope;
    }

    public String getCorpRes() {
        return corpRes;
    }

    public void setCorpRes(String corpRes) {
        this.corpRes = corpRes;
    }

    public String getIsCoop() {
        return isCoop;
    }

    public void setIsCoop(String isCoop) {
        this.isCoop = isCoop;
    }

    public String getPayCoopTerm() {
        return payCoopTerm;
    }

    public void setPayCoopTerm(String payCoopTerm) {
        this.payCoopTerm = payCoopTerm;
    }

    public BigDecimal getCoopAmt() {
        return coopAmt;
    }

    public void setCoopAmt(BigDecimal coopAmt) {
        this.coopAmt = coopAmt;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getMakerNo() {
        return makerNo;
    }

    public void setMakerNo(String makerNo) {
        this.makerNo = makerNo;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getModifyNo() {
        return modifyNo;
    }

    public void setModifyNo(String modifyNo) {
        this.modifyNo = modifyNo;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getEndId() {
        return endId;
    }

    public void setEndId(String endId) {
        this.endId = endId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getConfirm() {
        return confirm == null? "": confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public BigDecimal getUsdRate() {
        return usdRate;
    }

    public void setUsdRate(BigDecimal usdRate) {
        this.usdRate = usdRate;
    }

    public BigDecimal getRmbRate() {
        return rmbRate;
    }

    public void setRmbRate(BigDecimal rmbRate) {
        this.rmbRate = rmbRate;
    }

    public String getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(String copyNum) {
        this.copyNum = copyNum;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getPayTerm() {
        return payTerm == null? "" : payTerm;
    }

    public void setPayTerm(String payTerm) {
        this.payTerm = payTerm;
    }

    public Long getOcId() {
        return ocId;
    }

    public void setOcId(Long ocId) {
        this.ocId = ocId;
    }

    public BigDecimal getUsdamt() {
        return usdamt;
    }

    public void setUsdamt(BigDecimal usdamt) {
        this.usdamt = usdamt;
    }

    public String getPreNo() {
        return preNo;
    }

    public void setPreNo(String preNo) {
        this.preNo = preNo;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getKcType() {
        return kcType;
    }

    public void setKcType(String kcType) {
        this.kcType = kcType;
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public Date getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    public String getcTag() {
        return cTag;
    }

    public void setcTag(String cTag) {
        this.cTag = cTag;
    }

    public String getDocBs() {
        return docBs;
    }

    public void setDocBs(String docBs) {
        this.docBs = docBs;
    }

    public String getDocSc() {
        return docSc;
    }

    public void setDocSc(String docSc) {
        this.docSc = docSc;
    }

    public String getDocBc() {
        return docBc;
    }

    public void setDocBc(String docBc) {
        this.docBc = docBc;
    }

    public String getDocYj() {
        return docYj;
    }

    public void setDocYj(String docYj) {
        this.docYj = docYj;
    }

    public String getDocCert() {
        return docCert;
    }

    public void setDocCert(String docCert) {
        this.docCert = docCert;
    }

    public String getDocYs() {
        return docYs;
    }

    public void setDocYs(String docYs) {
        this.docYs = docYs;
    }

    public BigDecimal getSdAmt() {
        return sdAmt;
    }

    public void setSdAmt(BigDecimal sdAmt) {
        this.sdAmt = sdAmt;
    }

    public BigDecimal getYqAmt() {
        return yqAmt;
    }

    public void setYqAmt(BigDecimal yqAmt) {
        this.yqAmt = yqAmt;
    }

    public BigDecimal getKpQuant() {
        return kpQuant;
    }

    public void setKpQuant(BigDecimal kpQuant) {
        this.kpQuant = kpQuant;
    }

    public BigDecimal getKpAmt() {
        return kpAmt;
    }

    public void setKpAmt(BigDecimal kpAmt) {
        this.kpAmt = kpAmt;
    }

    public BigDecimal getFpQuant() {
        return fpQuant;
    }

    public void setFpQuant(BigDecimal fpQuant) {
        this.fpQuant = fpQuant;
    }

    public BigDecimal getFpAmt() {
        return fpAmt;
    }

    public void setFpAmt(BigDecimal fpAmt) {
        this.fpAmt = fpAmt;
    }

    public BigDecimal getOrgId() {
        return orgId;
    }

    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getCellId() {
        return cellId;
    }

    public void setCellId(BigDecimal cellId) {
        this.cellId = cellId;
    }

    public BigDecimal getCstId() {
        return cstId;
    }

    public void setCstId(BigDecimal cstId) {
        this.cstId = cstId;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getCstName() {
        return cstName;
    }

    public void setCstName(String cstName) {
        this.cstName = cstName;
    }

    public BigDecimal getCreditLeft() {
        return creditLeft;
    }

    public void setCreditLeft(BigDecimal creditLeft) {
        this.creditLeft = creditLeft;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public BigDecimal getpQuant() {
        return pQuant;
    }

    public void setpQuant(BigDecimal pQuant) {
        this.pQuant = pQuant;
    }

    public String getConfirmCondition() {
        return confirmCondition;
    }

    public void setConfirmCondition(String confirmCondition) {
        this.confirmCondition = confirmCondition;
    }

    public String getYqNotes() {
        return yqNotes;
    }

    public void setYqNotes(String yqNotes) {
        this.yqNotes = yqNotes;
    }

    public BigDecimal getQualityYear() {
        return qualityYear;
    }

    public void setQualityYear(BigDecimal qualityYear) {
        this.qualityYear = qualityYear;
    }

    public Date getYjInstallDate() {
        return yjInstallDate;
    }

    public void setYjInstallDate(Date yjInstallDate) {
        this.yjInstallDate = yjInstallDate;
    }

    public String getJhLateTerm() {
        return jhLateTerm;
    }

    public void setJhLateTerm(String jhLateTerm) {
        this.jhLateTerm = jhLateTerm;
    }

    public String getYhTerm() {
        return yhTerm;
    }

    public void setYhTerm(String yhTerm) {
        this.yhTerm = yhTerm;
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

    public String getOutOverTag() {
        return outOverTag;
    }

    public void setOutOverTag(String outOverTag) {
        this.outOverTag = outOverTag;
    }

    public Date getOutOverDate() {
        return outOverDate;
    }

    public void setOutOverDate(Date outOverDate) {
        this.outOverDate = outOverDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getUndo() {
        return undo;
    }

    public void setUndo(String undo) {
        this.undo = undo;
    }

    public String getEndTag() {
        return endTag;
    }

    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    public Date getYsDate() {
        return ysDate;
    }

    public void setYsDate(Date ysDate) {
        this.ysDate = ysDate;
    }

    public Date getSjDate() {
        return sjDate;
    }

    public void setSjDate(Date sjDate) {
        this.sjDate = sjDate;
    }

    public String getQualityUnit() {
        return qualityUnit;
    }

    public void setQualityUnit(String qualityUnit) {
        this.qualityUnit = qualityUnit;
    }

    public String getTbType() {
        return tbType;
    }

    public void setTbType(String tbType) {
        this.tbType = tbType;
    }

    public Date getGuranteeTrackday() {
        return guranteeTrackday;
    }

    public void setGuranteeTrackday(Date guranteeTrackday) {
        this.guranteeTrackday = guranteeTrackday;
    }

    public BigDecimal getDbCheckUserId() {
        return dbCheckUserId;
    }

    public void setDbCheckUserId(BigDecimal dbCheckUserId) {
        this.dbCheckUserId = dbCheckUserId;
    }

    public Date getDbCheckDate() {
        return dbCheckDate;
    }

    public void setDbCheckDate(Date dbCheckDate) {
        this.dbCheckDate = dbCheckDate;
    }

    public BigDecimal getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(BigDecimal commissionId) {
        this.commissionId = commissionId;
    }

    public String getCommissionNo() {
        return commissionNo;
    }

    public void setCommissionNo(String commissionNo) {
        this.commissionNo = commissionNo;
    }

    public String getCommissionName() {
        return commissionName;
    }

    public void setCommissionName(String commissionName) {
        this.commissionName = commissionName;
    }

    public BigDecimal getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(BigDecimal buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerNo() {
        return buyerNo;
    }

    public void setBuyerNo(String buyerNo) {
        this.buyerNo = buyerNo;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getDbCheckTag() {
        return dbCheckTag;
    }

    public void setDbCheckTag(String dbCheckTag) {
        this.dbCheckTag = dbCheckTag;
    }

    public String getGdTag() {
        return gdTag;
    }

    public void setGdTag(String gdTag) {
        this.gdTag = gdTag;
    }

    public BigDecimal getGdUserId() {
        return gdUserId;
    }

    public void setGdUserId(BigDecimal gdUserId) {
        this.gdUserId = gdUserId;
    }

    public Date getGdDate() {
        return gdDate;
    }

    public void setGdDate(Date gdDate) {
        this.gdDate = gdDate;
    }

    public BigDecimal getRefId() {
        return refId;
    }

    public void setRefId(BigDecimal refId) {
        this.refId = refId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public Long getOcuOrgId() {
        return ocuOrgId;
    }

    public void setOcuOrgId(Long ocuOrgId) {
        this.ocuOrgId = ocuOrgId;
    }

    public String getImportNation() {
        return importNation;
    }

    public void setImportNation(String importNation) {
        this.importNation = importNation;
    }

    public BigDecimal getGrossRate() {
        return grossRate;
    }

    public void setGrossRate(BigDecimal grossRate) {
        this.grossRate = grossRate;
    }

    public String getScType() {
        return scType;
    }

    public void setScType(String scType) {
        this.scType = scType;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getIsXyx() {
        return isXyx;
    }

    public void setIsXyx(String isXyx) {
        this.isXyx = isXyx;
    }

    public String getIsHyx() {
        return isHyx;
    }

    public void setIsHyx(String isHyx) {
        this.isHyx = isHyx;
    }

    public String getIsFhEnd() {
        return isFhEnd;
    }

    public void setIsFhEnd(String isFhEnd) {
        this.isFhEnd = isFhEnd;
    }

    public Date getTsDate() {
        return tsDate;
    }

    public void setTsDate(Date tsDate) {
        this.tsDate = tsDate;
    }

    public Long getIuOcuId() {
        return iuOcuId;
    }

    public void setIuOcuId(Long iuOcuId) {
        this.iuOcuId = iuOcuId;
    }

    public Long getDepatureId() {
        return depatureId;
    }

    public void setDepatureId(Long depatureId) {
        this.depatureId = depatureId;
    }

    public Long getDestId() {
        return destId;
    }

    public void setDestId(Long destId) {
        this.destId = destId;
    }

    public String getnNo() {
        return nNo;
    }

    public void setnNo(String nNo) {
        this.nNo = nNo;
    }

    public String getInlandOrOverseas() {
        return inlandOrOverseas;
    }

    public void setInlandOrOverseas(String inlandOrOverseas) {
        this.inlandOrOverseas = inlandOrOverseas;
    }

    public String getTypeOfCon() {
        return typeOfCon;
    }

    public void setTypeOfCon(String typeOfCon) {
        this.typeOfCon = typeOfCon;
    }

    public String getCataOfCon() {
        return cataOfCon;
    }

    public void setCataOfCon(String cataOfCon) {
        this.cataOfCon = cataOfCon;
    }

    public String getPropOfCon() {
        return propOfCon;
    }

    public void setPropOfCon(String propOfCon) {
        this.propOfCon = propOfCon;
    }

    public String getBizMode() {
        return bizMode;
    }

    public void setBizMode(String bizMode) {
        this.bizMode = bizMode;
    }

    public BigDecimal getRelScId() {
        return relScId;
    }

    public void setRelScId(BigDecimal relScId) {
        this.relScId = relScId;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getSignPlace() {
        return signPlace;
    }

    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }

    public String getConContent() {
        return conContent;
    }

    public void setConContent(String conContent) {
        this.conContent = conContent;
    }

    public BigDecimal getSellerId() {
        return sellerId;
    }

    public void setSellerId(BigDecimal sellerId) {
        this.sellerId = sellerId;
    }

    public Long getCstNationId() {
        return cstNationId;
    }

    public void setCstNationId(Long cstNationId) {
        this.cstNationId = cstNationId;
    }

    public BigDecimal getSenderId() {
        return senderId;
    }

    public void setSenderId(BigDecimal senderId) {
        this.senderId = senderId;
    }

    public Long getLandNationId() {
        return landNationId;
    }

    public void setLandNationId(Long landNationId) {
        this.landNationId = landNationId;
    }

    public Long getLandPortId() {
        return landPortId;
    }

    public void setLandPortId(Long landPortId) {
        this.landPortId = landPortId;
    }

    public String getLandLocation() {
        return landLocation;
    }

    public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }

    public BigDecimal getRecerId() {
        return recerId;
    }

    public void setRecerId(BigDecimal recerId) {
        this.recerId = recerId;
    }

    public Long getDestNationId() {
        return destNationId;
    }

    public void setDestNationId(Long destNationId) {
        this.destNationId = destNationId;
    }

    public Long getDestPortId() {
        return destPortId;
    }

    public void setDestPortId(Long destPortId) {
        this.destPortId = destPortId;
    }

    public String getDestLocation() {
        return destLocation;
    }

    public void setDestLocation(String destLocation) {
        this.destLocation = destLocation;
    }

    public String getIsBatches() {
        return isBatches;
    }

    public void setIsBatches(String isBatches) {
        this.isBatches = isBatches;
    }

    public String getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Long getTransferPortId() {
        return transferPortId;
    }

    public void setTransferPortId(Long transferPortId) {
        this.transferPortId = transferPortId;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getCommissionCurrType() {
        return commissionCurrType;
    }

    public void setCommissionCurrType(String commissionCurrType) {
        this.commissionCurrType = commissionCurrType;
    }

    public String getShipmentWay() {
        return shipmentWay;
    }

    public void setShipmentWay(String shipmentWay) {
        this.shipmentWay = shipmentWay;
    }

    public String getBoxDeliveryType() {
        return boxDeliveryType;
    }

    public void setBoxDeliveryType(String boxDeliveryType) {
        this.boxDeliveryType = boxDeliveryType;
    }

    public String getDeliveryPlace() {
        return deliveryPlace == null ? "" : deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public BigDecimal getProxyCorpId() {
        return proxyCorpId;
    }

    public void setProxyCorpId(BigDecimal proxyCorpId) {
        this.proxyCorpId = proxyCorpId;
    }

    public String getIsArrignProxy() {
        return isArrignProxy;
    }

    public void setIsArrignProxy(String isArrignProxy) {
        this.isArrignProxy = isArrignProxy;
    }

    public String getTransResp() {
        return transResp;
    }

    public void setTransResp(String transResp) {
        this.transResp = transResp;
    }

    public String getTransWay() {
        return transWay;
    }

    public void setTransWay(String transWay) {
        this.transWay = transWay;
    }

    public BigDecimal getTransCorpId() {
        return transCorpId;
    }

    public void setTransCorpId(BigDecimal transCorpId) {
        this.transCorpId = transCorpId;
    }

    public String getIsArrignTrans() {
        return isArrignTrans;
    }

    public void setIsArrignTrans(String isArrignTrans) {
        this.isArrignTrans = isArrignTrans;
    }

    public String getTransFeeResp() {
        return transFeeResp;
    }

    public void setTransFeeResp(String transFeeResp) {
        this.transFeeResp = transFeeResp;
    }

    public String getTransInsuResp() {
        return transInsuResp;
    }

    public void setTransInsuResp(String transInsuResp) {
        this.transInsuResp = transInsuResp;
    }

    public String getSendTerm() {
        return sendTerm;
    }

    public void setSendTerm(String sendTerm) {
        this.sendTerm = sendTerm;
    }

    public String getArbitrationPlace() {
        return arbitrationPlace;
    }

    public void setArbitrationPlace(String arbitrationPlace) {
        this.arbitrationPlace = arbitrationPlace;
    }

    public String getSuePlace() {
        return suePlace;
    }

    public void setSuePlace(String suePlace) {
        this.suePlace = suePlace;
    }

    public String getIsNeedSpecDocu() {
        return isNeedSpecDocu;
    }

    public void setIsNeedSpecDocu(String isNeedSpecDocu) {
        this.isNeedSpecDocu = isNeedSpecDocu;
    }

    public String getPricingWay() {
        return pricingWay;
    }

    public void setPricingWay(String pricingWay) {
        this.pricingWay = pricingWay;
    }

    public String getSettleWay() {
        return settleWay;
    }

    public void setSettleWay(String settleWay) {
        this.settleWay = settleWay;
    }

    public String getSelfSettleWay() {
        return selfSettleWay;
    }

    public void setSelfSettleWay(String selfSettleWay) {
        this.selfSettleWay = selfSettleWay;
    }

    public String getDkStandard() {
        return dkStandard;
    }

    public void setDkStandard(String dkStandard) {
        this.dkStandard = dkStandard;
    }

    public BigDecimal getDkIntRate() {
        return dkIntRate;
    }

    public void setDkIntRate(BigDecimal dkIntRate) {
        this.dkIntRate = dkIntRate;
    }

    public String getIsAgreeDk() {
        return isAgreeDk;
    }

    public void setIsAgreeDk(String isAgreeDk) {
        this.isAgreeDk = isAgreeDk;
    }

    public Integer getConPeriod() {
        return conPeriod;
    }

    public void setConPeriod(Integer conPeriod) {
        this.conPeriod = conPeriod;
    }

    public BigDecimal getBailRate() {
        return bailRate == null ? BigDecimal.ZERO : bailRate;
    }

    public void setBailRate(BigDecimal bailRate) {
        this.bailRate = bailRate;
    }

    public String getProfitScheme() {
        return profitScheme;
    }

    public void setProfitScheme(String profitScheme) {
        this.profitScheme = profitScheme;
    }

    public BigDecimal getCommQuantPack() {
        return commQuantPack;
    }

    public void setCommQuantPack(BigDecimal commQuantPack) {
        this.commQuantPack = commQuantPack;
    }

    public BigDecimal getCommQuantStat() {
        return commQuantStat;
    }

    public void setCommQuantStat(BigDecimal commQuantStat) {
        this.commQuantStat = commQuantStat;
    }

    public Long getDepOrgId() {
        return depOrgId;
    }

    public void setDepOrgId(Long depOrgId) {
        this.depOrgId = depOrgId;
    }

    public String getPriceStandard() {
        return priceStandard;
    }

    public void setPriceStandard(String priceStandard) {
        this.priceStandard = priceStandard;
    }

    public String getCstProp() {
        return cstProp;
    }

    public void setCstProp(String cstProp) {
        this.cstProp = cstProp;
    }

    public Long getCmdCataId() {
        return cmdCataId;
    }

    public void setCmdCataId(Long cmdCataId) {
        this.cmdCataId = cmdCataId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecerName() {
        return recerName;
    }

    public void setRecerName(String recerName) {
        this.recerName = recerName;
    }

    public String getTransCorpName() {
        return transCorpName == null ? "" : transCorpName;
    }

    public void setTransCorpName(String transCorpName) {
        this.transCorpName = transCorpName;
    }

    public String getProxyCorpName() {
        return proxyCorpName;
    }

    public void setProxyCorpName(String proxyCorpName) {
        this.proxyCorpName = proxyCorpName;
    }

    public String getIsClose() {
        return isClose;
    }

    public void setIsClose(String isClose) {
        this.isClose = isClose;
    }

    public Long getCloseUserId() {
        return closeUserId;
    }

    public void setCloseUserId(Long closeUserId) {
        this.closeUserId = closeUserId;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public BigDecimal getShortOrOver() {
        return shortOrOver;
    }

    public void setShortOrOver(BigDecimal shortOrOver) {
        this.shortOrOver = shortOrOver;
    }

    public String getConPeriodSType() {
        return conPeriodSType;
    }

    public void setConPeriodSType(String conPeriodSType) {
        this.conPeriodSType = conPeriodSType;
    }

    public Long getCommUnit() {
        return commUnit;
    }

    public void setCommUnit(Long commUnit) {
        this.commUnit = commUnit;
    }

    public String getIsOa() {
        return isOa;
    }

    public void setIsOa(String isOa) {
        this.isOa = isOa;
    }

    public BigDecimal getCommPerUnit() {
        return commPerUnit;
    }

    public void setCommPerUnit(BigDecimal commPerUnit) {
        this.commPerUnit = commPerUnit;
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

    public String getTradeOrSrv() {
        return tradeOrSrv;
    }

    public void setTradeOrSrv(String tradeOrSrv) {
        this.tradeOrSrv = tradeOrSrv;
    }

    public String getTrSrvOrGoods() {
        return trSrvOrGoods;
    }

    public void setTrSrvOrGoods(String trSrvOrGoods) {
        this.trSrvOrGoods = trSrvOrGoods;
    }

    public String getProfitSchemeDesc() {
        return profitSchemeDesc;
    }

    public void setProfitSchemeDesc(String profitSchemeDesc) {
        this.profitSchemeDesc = profitSchemeDesc;
    }

    public Long getLeaseCorpId() {
        return leaseCorpId;
    }

    public void setLeaseCorpId(Long leaseCorpId) {
        this.leaseCorpId = leaseCorpId;
    }

    public String getLeaseCorpName() {
        return leaseCorpName;
    }

    public void setLeaseCorpName(String leaseCorpName) {
        this.leaseCorpName = leaseCorpName;
    }

    public String getPrFeeType() {
        return prFeeType;
    }

    public void setPrFeeType(String prFeeType) {
        this.prFeeType = prFeeType;
    }

    public BigDecimal getPrFeeRate() {
        return prFeeRate;
    }

    public void setPrFeeRate(BigDecimal prFeeRate) {
        this.prFeeRate = prFeeRate;
    }

    public String getPrFeeCurrType() {
        return prFeeCurrType;
    }

    public void setPrFeeCurrType(String prFeeCurrType) {
        this.prFeeCurrType = prFeeCurrType;
    }

    public BigDecimal getPrFeeAmt() {
        return prFeeAmt;
    }

    public void setPrFeeAmt(BigDecimal prFeeAmt) {
        this.prFeeAmt = prFeeAmt;
    }

    public String getLeaseMode() {
        return leaseMode;
    }

    public void setLeaseMode(String leaseMode) {
        this.leaseMode = leaseMode;
    }

    public Long getPlanFctId() {
        return planFctId;
    }

    public void setPlanFctId(Long planFctId) {
        this.planFctId = planFctId;
    }

    public String getPlanFctName() {
        return planFctName;
    }

    public void setPlanFctName(String planFctName) {
        this.planFctName = planFctName;
    }

    public Long getPlanManufacId() {
        return planManufacId;
    }

    public void setPlanManufacId(Long planManufacId) {
        this.planManufacId = planManufacId;
    }

    public String getPlanManufacName() {
        return planManufacName;
    }

    public void setPlanManufacName(String planManufacName) {
        this.planManufacName = planManufacName;
    }

    public BigDecimal getComplexLevel() {
        return complexLevel;
    }

    public void setComplexLevel(BigDecimal complexLevel) {
        this.complexLevel = complexLevel;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }

    public Long getCommId() {
        return commId;
    }

    public void setCommId(Long commId) {
        this.commId = commId;
    }

    public String getPlanPurInlOrOs() {
        return planPurInlOrOs;
    }

    public void setPlanPurInlOrOs(String planPurInlOrOs) {
        this.planPurInlOrOs = planPurInlOrOs;
    }

    public String getBailRateType() {
        return bailRateType;
    }

    public void setBailRateType(String bailRateType) {
        this.bailRateType = bailRateType;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
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
        TExpSc other = (TExpSc) that;
        return (this.getScId() == null ? other.getScId() == null : this.getScId().equals(other.getScId()))
            && (this.getcNo() == null ? other.getcNo() == null : this.getcNo().equals(other.getcNo()))
            && (this.getmDate() == null ? other.getmDate() == null : this.getmDate().equals(other.getmDate()))
            && (this.getcStatus() == null ? other.getcStatus() == null : this.getcStatus().equals(other.getcStatus()))
            && (this.getCstNo() == null ? other.getCstNo() == null : this.getCstNo().equals(other.getCstNo()))
            && (this.getCurrTyp() == null ? other.getCurrTyp() == null : this.getCurrTyp().equals(other.getCurrTyp()))
            && (this.getTrademode() == null ? other.getTrademode() == null : this.getTrademode().equals(other.getTrademode()))
            && (this.getAdvanceDay() == null ? other.getAdvanceDay() == null : this.getAdvanceDay().equals(other.getAdvanceDay()))
            && (this.getPriceTerm() == null ? other.getPriceTerm() == null : this.getPriceTerm().equals(other.getPriceTerm()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getPayDay() == null ? other.getPayDay() == null : this.getPayDay().equals(other.getPayDay()))
            && (this.getShipD() == null ? other.getShipD() == null : this.getShipD().equals(other.getShipD()))
            && (this.getDepatureNo() == null ? other.getDepatureNo() == null : this.getDepatureNo().equals(other.getDepatureNo()))
            && (this.getDepatureName() == null ? other.getDepatureName() == null : this.getDepatureName().equals(other.getDepatureName()))
            && (this.getDestNo() == null ? other.getDestNo() == null : this.getDestNo().equals(other.getDestNo()))
            && (this.getDestName() == null ? other.getDestName() == null : this.getDestName().equals(other.getDestName()))
            && (this.getPackTerm() == null ? other.getPackTerm() == null : this.getPackTerm().equals(other.getPackTerm()))
            && (this.getInsuTerm() == null ? other.getInsuTerm() == null : this.getInsuTerm().equals(other.getInsuTerm()))
            && (this.gettAmt() == null ? other.gettAmt() == null : this.gettAmt().equals(other.gettAmt()))
            && (this.getpAmt() == null ? other.getpAmt() == null : this.getpAmt().equals(other.getpAmt()))
            && (this.getInsuFee() == null ? other.getInsuFee() == null : this.getInsuFee().equals(other.getInsuFee()))
            && (this.getTransFee() == null ? other.getTransFee() == null : this.getTransFee().equals(other.getTransFee()))
            && (this.getPackFee() == null ? other.getPackFee() == null : this.getPackFee().equals(other.getPackFee()))
            && (this.getCommissionFee() == null ? other.getCommissionFee() == null : this.getCommissionFee().equals(other.getCommissionFee()))
            && (this.getDiscountFee() == null ? other.getDiscountFee() == null : this.getDiscountFee().equals(other.getDiscountFee()))
            && (this.getDiscountNote() == null ? other.getDiscountNote() == null : this.getDiscountNote().equals(other.getDiscountNote()))
            && (this.getDepNo() == null ? other.getDepNo() == null : this.getDepNo().equals(other.getDepNo()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getQualityTime() == null ? other.getQualityTime() == null : this.getQualityTime().equals(other.getQualityTime()))
            && (this.getSupplyScope() == null ? other.getSupplyScope() == null : this.getSupplyScope().equals(other.getSupplyScope()))
            && (this.getCorpRes() == null ? other.getCorpRes() == null : this.getCorpRes().equals(other.getCorpRes()))
            && (this.getIsCoop() == null ? other.getIsCoop() == null : this.getIsCoop().equals(other.getIsCoop()))
            && (this.getPayCoopTerm() == null ? other.getPayCoopTerm() == null : this.getPayCoopTerm().equals(other.getPayCoopTerm()))
            && (this.getCoopAmt() == null ? other.getCoopAmt() == null : this.getCoopAmt().equals(other.getCoopAmt()))
            && (this.getEmpNo() == null ? other.getEmpNo() == null : this.getEmpNo().equals(other.getEmpNo()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getMakerNo() == null ? other.getMakerNo() == null : this.getMakerNo().equals(other.getMakerNo()))
            && (this.getMakerName() == null ? other.getMakerName() == null : this.getMakerName().equals(other.getMakerName()))
            && (this.getGroupNo() == null ? other.getGroupNo() == null : this.getGroupNo().equals(other.getGroupNo()))
            && (this.getModifyNo() == null ? other.getModifyNo() == null : this.getModifyNo().equals(other.getModifyNo()))
            && (this.getModifyName() == null ? other.getModifyName() == null : this.getModifyName().equals(other.getModifyName()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getCheckNo() == null ? other.getCheckNo() == null : this.getCheckNo().equals(other.getCheckNo()))
            && (this.getCheckName() == null ? other.getCheckName() == null : this.getCheckName().equals(other.getCheckName()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
            && (this.getEndId() == null ? other.getEndId() == null : this.getEndId().equals(other.getEndId()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getConfirm() == null ? other.getConfirm() == null : this.getConfirm().equals(other.getConfirm()))
            && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
            && (this.getcType() == null ? other.getcType() == null : this.getcType().equals(other.getcType()))
            && (this.getUsdRate() == null ? other.getUsdRate() == null : this.getUsdRate().equals(other.getUsdRate()))
            && (this.getRmbRate() == null ? other.getRmbRate() == null : this.getRmbRate().equals(other.getRmbRate()))
            && (this.getCopyNum() == null ? other.getCopyNum() == null : this.getCopyNum().equals(other.getCopyNum()))
            && (this.getTradeType() == null ? other.getTradeType() == null : this.getTradeType().equals(other.getTradeType()))
            && (this.getPayTerm() == null ? other.getPayTerm() == null : this.getPayTerm().equals(other.getPayTerm()))
            && (this.getOcId() == null ? other.getOcId() == null : this.getOcId().equals(other.getOcId()))
            && (this.getUsdamt() == null ? other.getUsdamt() == null : this.getUsdamt().equals(other.getUsdamt()))
            && (this.getPreNo() == null ? other.getPreNo() == null : this.getPreNo().equals(other.getPreNo()))
            && (this.getAccNo() == null ? other.getAccNo() == null : this.getAccNo().equals(other.getAccNo()))
            && (this.getKcType() == null ? other.getKcType() == null : this.getKcType().equals(other.getKcType()))
            && (this.getGrossProfit() == null ? other.getGrossProfit() == null : this.getGrossProfit().equals(other.getGrossProfit()))
            && (this.getDiscountRate() == null ? other.getDiscountRate() == null : this.getDiscountRate().equals(other.getDiscountRate()))
            && (this.getInstallDate() == null ? other.getInstallDate() == null : this.getInstallDate().equals(other.getInstallDate()))
            && (this.getcTag() == null ? other.getcTag() == null : this.getcTag().equals(other.getcTag()))
            && (this.getDocBs() == null ? other.getDocBs() == null : this.getDocBs().equals(other.getDocBs()))
            && (this.getDocSc() == null ? other.getDocSc() == null : this.getDocSc().equals(other.getDocSc()))
            && (this.getDocBc() == null ? other.getDocBc() == null : this.getDocBc().equals(other.getDocBc()))
            && (this.getDocYj() == null ? other.getDocYj() == null : this.getDocYj().equals(other.getDocYj()))
            && (this.getDocCert() == null ? other.getDocCert() == null : this.getDocCert().equals(other.getDocCert()))
            && (this.getDocYs() == null ? other.getDocYs() == null : this.getDocYs().equals(other.getDocYs()))
            && (this.getSdAmt() == null ? other.getSdAmt() == null : this.getSdAmt().equals(other.getSdAmt()))
            && (this.getYqAmt() == null ? other.getYqAmt() == null : this.getYqAmt().equals(other.getYqAmt()))
            && (this.getKpQuant() == null ? other.getKpQuant() == null : this.getKpQuant().equals(other.getKpQuant()))
            && (this.getKpAmt() == null ? other.getKpAmt() == null : this.getKpAmt().equals(other.getKpAmt()))
            && (this.getFpQuant() == null ? other.getFpQuant() == null : this.getFpQuant().equals(other.getFpQuant()))
            && (this.getFpAmt() == null ? other.getFpAmt() == null : this.getFpAmt().equals(other.getFpAmt()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCellId() == null ? other.getCellId() == null : this.getCellId().equals(other.getCellId()))
            && (this.getCstId() == null ? other.getCstId() == null : this.getCstId().equals(other.getCstId()))
            && (this.getGuarantee() == null ? other.getGuarantee() == null : this.getGuarantee().equals(other.getGuarantee()))
            && (this.getCstName() == null ? other.getCstName() == null : this.getCstName().equals(other.getCstName()))
            && (this.getCreditLeft() == null ? other.getCreditLeft() == null : this.getCreditLeft().equals(other.getCreditLeft()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getpQuant() == null ? other.getpQuant() == null : this.getpQuant().equals(other.getpQuant()))
            && (this.getConfirmCondition() == null ? other.getConfirmCondition() == null : this.getConfirmCondition().equals(other.getConfirmCondition()))
            && (this.getYqNotes() == null ? other.getYqNotes() == null : this.getYqNotes().equals(other.getYqNotes()))
            && (this.getQualityYear() == null ? other.getQualityYear() == null : this.getQualityYear().equals(other.getQualityYear()))
            && (this.getYjInstallDate() == null ? other.getYjInstallDate() == null : this.getYjInstallDate().equals(other.getYjInstallDate()))
            && (this.getJhLateTerm() == null ? other.getJhLateTerm() == null : this.getJhLateTerm().equals(other.getJhLateTerm()))
            && (this.getYhTerm() == null ? other.getYhTerm() == null : this.getYhTerm().equals(other.getYhTerm()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProType() == null ? other.getProType() == null : this.getProType().equals(other.getProType()))
            && (this.getOutOverTag() == null ? other.getOutOverTag() == null : this.getOutOverTag().equals(other.getOutOverTag()))
            && (this.getOutOverDate() == null ? other.getOutOverDate() == null : this.getOutOverDate().equals(other.getOutOverDate()))
            && (this.getValidDate() == null ? other.getValidDate() == null : this.getValidDate().equals(other.getValidDate()))
            && (this.getUndo() == null ? other.getUndo() == null : this.getUndo().equals(other.getUndo()))
            && (this.getEndTag() == null ? other.getEndTag() == null : this.getEndTag().equals(other.getEndTag()))
            && (this.getYsDate() == null ? other.getYsDate() == null : this.getYsDate().equals(other.getYsDate()))
            && (this.getSjDate() == null ? other.getSjDate() == null : this.getSjDate().equals(other.getSjDate()))
            && (this.getQualityUnit() == null ? other.getQualityUnit() == null : this.getQualityUnit().equals(other.getQualityUnit()))
            && (this.getTbType() == null ? other.getTbType() == null : this.getTbType().equals(other.getTbType()))
            && (this.getGuranteeTrackday() == null ? other.getGuranteeTrackday() == null : this.getGuranteeTrackday().equals(other.getGuranteeTrackday()))
            && (this.getDbCheckUserId() == null ? other.getDbCheckUserId() == null : this.getDbCheckUserId().equals(other.getDbCheckUserId()))
            && (this.getDbCheckDate() == null ? other.getDbCheckDate() == null : this.getDbCheckDate().equals(other.getDbCheckDate()))
            && (this.getCommissionId() == null ? other.getCommissionId() == null : this.getCommissionId().equals(other.getCommissionId()))
            && (this.getCommissionNo() == null ? other.getCommissionNo() == null : this.getCommissionNo().equals(other.getCommissionNo()))
            && (this.getCommissionName() == null ? other.getCommissionName() == null : this.getCommissionName().equals(other.getCommissionName()))
            && (this.getBuyerId() == null ? other.getBuyerId() == null : this.getBuyerId().equals(other.getBuyerId()))
            && (this.getBuyerNo() == null ? other.getBuyerNo() == null : this.getBuyerNo().equals(other.getBuyerNo()))
            && (this.getBuyerName() == null ? other.getBuyerName() == null : this.getBuyerName().equals(other.getBuyerName()))
            && (this.getDbCheckTag() == null ? other.getDbCheckTag() == null : this.getDbCheckTag().equals(other.getDbCheckTag()))
            && (this.getGdTag() == null ? other.getGdTag() == null : this.getGdTag().equals(other.getGdTag()))
            && (this.getGdUserId() == null ? other.getGdUserId() == null : this.getGdUserId().equals(other.getGdUserId()))
            && (this.getGdDate() == null ? other.getGdDate() == null : this.getGdDate().equals(other.getGdDate()))
            && (this.getRefId() == null ? other.getRefId() == null : this.getRefId().equals(other.getRefId()))
            && (this.getRefType() == null ? other.getRefType() == null : this.getRefType().equals(other.getRefType()))
            && (this.getOcuOrgId() == null ? other.getOcuOrgId() == null : this.getOcuOrgId().equals(other.getOcuOrgId()))
            && (this.getImportNation() == null ? other.getImportNation() == null : this.getImportNation().equals(other.getImportNation()))
            && (this.getGrossRate() == null ? other.getGrossRate() == null : this.getGrossRate().equals(other.getGrossRate()))
            && (this.getScType() == null ? other.getScType() == null : this.getScType().equals(other.getScType()))
            && (this.getSignDate() == null ? other.getSignDate() == null : this.getSignDate().equals(other.getSignDate()))
            && (this.getIsXyx() == null ? other.getIsXyx() == null : this.getIsXyx().equals(other.getIsXyx()))
            && (this.getIsHyx() == null ? other.getIsHyx() == null : this.getIsHyx().equals(other.getIsHyx()))
            && (this.getIsFhEnd() == null ? other.getIsFhEnd() == null : this.getIsFhEnd().equals(other.getIsFhEnd()))
            && (this.getTsDate() == null ? other.getTsDate() == null : this.getTsDate().equals(other.getTsDate()))
            && (this.getIuOcuId() == null ? other.getIuOcuId() == null : this.getIuOcuId().equals(other.getIuOcuId()))
            && (this.getDepatureId() == null ? other.getDepatureId() == null : this.getDepatureId().equals(other.getDepatureId()))
            && (this.getDestId() == null ? other.getDestId() == null : this.getDestId().equals(other.getDestId()))
            && (this.getnNo() == null ? other.getnNo() == null : this.getnNo().equals(other.getnNo()))
            && (this.getInlandOrOverseas() == null ? other.getInlandOrOverseas() == null : this.getInlandOrOverseas().equals(other.getInlandOrOverseas()))
            && (this.getTypeOfCon() == null ? other.getTypeOfCon() == null : this.getTypeOfCon().equals(other.getTypeOfCon()))
            && (this.getCataOfCon() == null ? other.getCataOfCon() == null : this.getCataOfCon().equals(other.getCataOfCon()))
            && (this.getPropOfCon() == null ? other.getPropOfCon() == null : this.getPropOfCon().equals(other.getPropOfCon()))
            && (this.getBizMode() == null ? other.getBizMode() == null : this.getBizMode().equals(other.getBizMode()))
            && (this.getRelScId() == null ? other.getRelScId() == null : this.getRelScId().equals(other.getRelScId()))
            && (this.getConName() == null ? other.getConName() == null : this.getConName().equals(other.getConName()))
            && (this.getSignPlace() == null ? other.getSignPlace() == null : this.getSignPlace().equals(other.getSignPlace()))
            && (this.getConContent() == null ? other.getConContent() == null : this.getConContent().equals(other.getConContent()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getCstNationId() == null ? other.getCstNationId() == null : this.getCstNationId().equals(other.getCstNationId()))
            && (this.getSenderId() == null ? other.getSenderId() == null : this.getSenderId().equals(other.getSenderId()))
            && (this.getLandNationId() == null ? other.getLandNationId() == null : this.getLandNationId().equals(other.getLandNationId()))
            && (this.getLandPortId() == null ? other.getLandPortId() == null : this.getLandPortId().equals(other.getLandPortId()))
            && (this.getLandLocation() == null ? other.getLandLocation() == null : this.getLandLocation().equals(other.getLandLocation()))
            && (this.getRecerId() == null ? other.getRecerId() == null : this.getRecerId().equals(other.getRecerId()))
            && (this.getDestNationId() == null ? other.getDestNationId() == null : this.getDestNationId().equals(other.getDestNationId()))
            && (this.getDestPortId() == null ? other.getDestPortId() == null : this.getDestPortId().equals(other.getDestPortId()))
            && (this.getDestLocation() == null ? other.getDestLocation() == null : this.getDestLocation().equals(other.getDestLocation()))
            && (this.getIsBatches() == null ? other.getIsBatches() == null : this.getIsBatches().equals(other.getIsBatches()))
            && (this.getIsTransfer() == null ? other.getIsTransfer() == null : this.getIsTransfer().equals(other.getIsTransfer()))
            && (this.getTransferPortId() == null ? other.getTransferPortId() == null : this.getTransferPortId().equals(other.getTransferPortId()))
            && (this.getCommissionRate() == null ? other.getCommissionRate() == null : this.getCommissionRate().equals(other.getCommissionRate()))
            && (this.getCommissionCurrType() == null ? other.getCommissionCurrType() == null : this.getCommissionCurrType().equals(other.getCommissionCurrType()))
            && (this.getShipmentWay() == null ? other.getShipmentWay() == null : this.getShipmentWay().equals(other.getShipmentWay()))
            && (this.getBoxDeliveryType() == null ? other.getBoxDeliveryType() == null : this.getBoxDeliveryType().equals(other.getBoxDeliveryType()))
            && (this.getDeliveryPlace() == null ? other.getDeliveryPlace() == null : this.getDeliveryPlace().equals(other.getDeliveryPlace()))
            && (this.getProxyCorpId() == null ? other.getProxyCorpId() == null : this.getProxyCorpId().equals(other.getProxyCorpId()))
            && (this.getIsArrignProxy() == null ? other.getIsArrignProxy() == null : this.getIsArrignProxy().equals(other.getIsArrignProxy()))
            && (this.getTransResp() == null ? other.getTransResp() == null : this.getTransResp().equals(other.getTransResp()))
            && (this.getTransWay() == null ? other.getTransWay() == null : this.getTransWay().equals(other.getTransWay()))
            && (this.getTransCorpId() == null ? other.getTransCorpId() == null : this.getTransCorpId().equals(other.getTransCorpId()))
            && (this.getIsArrignTrans() == null ? other.getIsArrignTrans() == null : this.getIsArrignTrans().equals(other.getIsArrignTrans()))
            && (this.getTransFeeResp() == null ? other.getTransFeeResp() == null : this.getTransFeeResp().equals(other.getTransFeeResp()))
            && (this.getTransInsuResp() == null ? other.getTransInsuResp() == null : this.getTransInsuResp().equals(other.getTransInsuResp()))
            && (this.getSendTerm() == null ? other.getSendTerm() == null : this.getSendTerm().equals(other.getSendTerm()))
            && (this.getArbitrationPlace() == null ? other.getArbitrationPlace() == null : this.getArbitrationPlace().equals(other.getArbitrationPlace()))
            && (this.getSuePlace() == null ? other.getSuePlace() == null : this.getSuePlace().equals(other.getSuePlace()))
            && (this.getIsNeedSpecDocu() == null ? other.getIsNeedSpecDocu() == null : this.getIsNeedSpecDocu().equals(other.getIsNeedSpecDocu()))
            && (this.getPricingWay() == null ? other.getPricingWay() == null : this.getPricingWay().equals(other.getPricingWay()))
            && (this.getSettleWay() == null ? other.getSettleWay() == null : this.getSettleWay().equals(other.getSettleWay()))
            && (this.getSelfSettleWay() == null ? other.getSelfSettleWay() == null : this.getSelfSettleWay().equals(other.getSelfSettleWay()))
            && (this.getDkStandard() == null ? other.getDkStandard() == null : this.getDkStandard().equals(other.getDkStandard()))
            && (this.getDkIntRate() == null ? other.getDkIntRate() == null : this.getDkIntRate().equals(other.getDkIntRate()))
            && (this.getIsAgreeDk() == null ? other.getIsAgreeDk() == null : this.getIsAgreeDk().equals(other.getIsAgreeDk()))
            && (this.getConPeriod() == null ? other.getConPeriod() == null : this.getConPeriod().equals(other.getConPeriod()))
            && (this.getBailRate() == null ? other.getBailRate() == null : this.getBailRate().equals(other.getBailRate()))
            && (this.getProfitScheme() == null ? other.getProfitScheme() == null : this.getProfitScheme().equals(other.getProfitScheme()))
            && (this.getCommQuantPack() == null ? other.getCommQuantPack() == null : this.getCommQuantPack().equals(other.getCommQuantPack()))
            && (this.getCommQuantStat() == null ? other.getCommQuantStat() == null : this.getCommQuantStat().equals(other.getCommQuantStat()))
            && (this.getDepOrgId() == null ? other.getDepOrgId() == null : this.getDepOrgId().equals(other.getDepOrgId()))
            && (this.getPriceStandard() == null ? other.getPriceStandard() == null : this.getPriceStandard().equals(other.getPriceStandard()))
            && (this.getCstProp() == null ? other.getCstProp() == null : this.getCstProp().equals(other.getCstProp()))
            && (this.getCmdCataId() == null ? other.getCmdCataId() == null : this.getCmdCataId().equals(other.getCmdCataId()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getSenderName() == null ? other.getSenderName() == null : this.getSenderName().equals(other.getSenderName()))
            && (this.getRecerName() == null ? other.getRecerName() == null : this.getRecerName().equals(other.getRecerName()))
            && (this.getTransCorpName() == null ? other.getTransCorpName() == null : this.getTransCorpName().equals(other.getTransCorpName()))
            && (this.getProxyCorpName() == null ? other.getProxyCorpName() == null : this.getProxyCorpName().equals(other.getProxyCorpName()))
            && (this.getIsClose() == null ? other.getIsClose() == null : this.getIsClose().equals(other.getIsClose()))
            && (this.getCloseUserId() == null ? other.getCloseUserId() == null : this.getCloseUserId().equals(other.getCloseUserId()))
            && (this.getCloseDate() == null ? other.getCloseDate() == null : this.getCloseDate().equals(other.getCloseDate()))
            && (this.getShortOrOver() == null ? other.getShortOrOver() == null : this.getShortOrOver().equals(other.getShortOrOver()))
            && (this.getConPeriodSType() == null ? other.getConPeriodSType() == null : this.getConPeriodSType().equals(other.getConPeriodSType()))
            && (this.getCommUnit() == null ? other.getCommUnit() == null : this.getCommUnit().equals(other.getCommUnit()))
            && (this.getIsOa() == null ? other.getIsOa() == null : this.getIsOa().equals(other.getIsOa()))
            && (this.getCommPerUnit() == null ? other.getCommPerUnit() == null : this.getCommPerUnit().equals(other.getCommPerUnit()))
            && (this.getLackLoadRate() == null ? other.getLackLoadRate() == null : this.getLackLoadRate().equals(other.getLackLoadRate()))
            && (this.getOverLoadRate() == null ? other.getOverLoadRate() == null : this.getOverLoadRate().equals(other.getOverLoadRate()))
            && (this.getTradeOrSrv() == null ? other.getTradeOrSrv() == null : this.getTradeOrSrv().equals(other.getTradeOrSrv()))
            && (this.getTrSrvOrGoods() == null ? other.getTrSrvOrGoods() == null : this.getTrSrvOrGoods().equals(other.getTrSrvOrGoods()))
            && (this.getProfitSchemeDesc() == null ? other.getProfitSchemeDesc() == null : this.getProfitSchemeDesc().equals(other.getProfitSchemeDesc()))
            && (this.getLeaseCorpId() == null ? other.getLeaseCorpId() == null : this.getLeaseCorpId().equals(other.getLeaseCorpId()))
            && (this.getLeaseCorpName() == null ? other.getLeaseCorpName() == null : this.getLeaseCorpName().equals(other.getLeaseCorpName()))
            && (this.getPrFeeType() == null ? other.getPrFeeType() == null : this.getPrFeeType().equals(other.getPrFeeType()))
            && (this.getPrFeeRate() == null ? other.getPrFeeRate() == null : this.getPrFeeRate().equals(other.getPrFeeRate()))
            && (this.getPrFeeCurrType() == null ? other.getPrFeeCurrType() == null : this.getPrFeeCurrType().equals(other.getPrFeeCurrType()))
            && (this.getPrFeeAmt() == null ? other.getPrFeeAmt() == null : this.getPrFeeAmt().equals(other.getPrFeeAmt()))
            && (this.getLeaseMode() == null ? other.getLeaseMode() == null : this.getLeaseMode().equals(other.getLeaseMode()))
            && (this.getPlanFctId() == null ? other.getPlanFctId() == null : this.getPlanFctId().equals(other.getPlanFctId()))
            && (this.getPlanFctName() == null ? other.getPlanFctName() == null : this.getPlanFctName().equals(other.getPlanFctName()))
            && (this.getPlanManufacId() == null ? other.getPlanManufacId() == null : this.getPlanManufacId().equals(other.getPlanManufacId()))
            && (this.getPlanManufacName() == null ? other.getPlanManufacName() == null : this.getPlanManufacName().equals(other.getPlanManufacName()))
            && (this.getComplexLevel() == null ? other.getComplexLevel() == null : this.getComplexLevel().equals(other.getComplexLevel()))
            && (this.getCommName() == null ? other.getCommName() == null : this.getCommName().equals(other.getCommName()))
            && (this.getCommId() == null ? other.getCommId() == null : this.getCommId().equals(other.getCommId()))
            && (this.getPlanPurInlOrOs() == null ? other.getPlanPurInlOrOs() == null : this.getPlanPurInlOrOs().equals(other.getPlanPurInlOrOs()))
            && (this.getBailRateType() == null ? other.getBailRateType() == null : this.getBailRateType().equals(other.getBailRateType()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScId() == null) ? 0 : getScId().hashCode());
        result = prime * result + ((getcNo() == null) ? 0 : getcNo().hashCode());
        result = prime * result + ((getmDate() == null) ? 0 : getmDate().hashCode());
        result = prime * result + ((getcStatus() == null) ? 0 : getcStatus().hashCode());
        result = prime * result + ((getCstNo() == null) ? 0 : getCstNo().hashCode());
        result = prime * result + ((getCurrTyp() == null) ? 0 : getCurrTyp().hashCode());
        result = prime * result + ((getTrademode() == null) ? 0 : getTrademode().hashCode());
        result = prime * result + ((getAdvanceDay() == null) ? 0 : getAdvanceDay().hashCode());
        result = prime * result + ((getPriceTerm() == null) ? 0 : getPriceTerm().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getPayDay() == null) ? 0 : getPayDay().hashCode());
        result = prime * result + ((getShipD() == null) ? 0 : getShipD().hashCode());
        result = prime * result + ((getDepatureNo() == null) ? 0 : getDepatureNo().hashCode());
        result = prime * result + ((getDepatureName() == null) ? 0 : getDepatureName().hashCode());
        result = prime * result + ((getDestNo() == null) ? 0 : getDestNo().hashCode());
        result = prime * result + ((getDestName() == null) ? 0 : getDestName().hashCode());
        result = prime * result + ((getPackTerm() == null) ? 0 : getPackTerm().hashCode());
        result = prime * result + ((getInsuTerm() == null) ? 0 : getInsuTerm().hashCode());
        result = prime * result + ((gettAmt() == null) ? 0 : gettAmt().hashCode());
        result = prime * result + ((getpAmt() == null) ? 0 : getpAmt().hashCode());
        result = prime * result + ((getInsuFee() == null) ? 0 : getInsuFee().hashCode());
        result = prime * result + ((getTransFee() == null) ? 0 : getTransFee().hashCode());
        result = prime * result + ((getPackFee() == null) ? 0 : getPackFee().hashCode());
        result = prime * result + ((getCommissionFee() == null) ? 0 : getCommissionFee().hashCode());
        result = prime * result + ((getDiscountFee() == null) ? 0 : getDiscountFee().hashCode());
        result = prime * result + ((getDiscountNote() == null) ? 0 : getDiscountNote().hashCode());
        result = prime * result + ((getDepNo() == null) ? 0 : getDepNo().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getQualityTime() == null) ? 0 : getQualityTime().hashCode());
        result = prime * result + ((getSupplyScope() == null) ? 0 : getSupplyScope().hashCode());
        result = prime * result + ((getCorpRes() == null) ? 0 : getCorpRes().hashCode());
        result = prime * result + ((getIsCoop() == null) ? 0 : getIsCoop().hashCode());
        result = prime * result + ((getPayCoopTerm() == null) ? 0 : getPayCoopTerm().hashCode());
        result = prime * result + ((getCoopAmt() == null) ? 0 : getCoopAmt().hashCode());
        result = prime * result + ((getEmpNo() == null) ? 0 : getEmpNo().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getMakerNo() == null) ? 0 : getMakerNo().hashCode());
        result = prime * result + ((getMakerName() == null) ? 0 : getMakerName().hashCode());
        result = prime * result + ((getGroupNo() == null) ? 0 : getGroupNo().hashCode());
        result = prime * result + ((getModifyNo() == null) ? 0 : getModifyNo().hashCode());
        result = prime * result + ((getModifyName() == null) ? 0 : getModifyName().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getCheckNo() == null) ? 0 : getCheckNo().hashCode());
        result = prime * result + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getEndId() == null) ? 0 : getEndId().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getConfirm() == null) ? 0 : getConfirm().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getcType() == null) ? 0 : getcType().hashCode());
        result = prime * result + ((getUsdRate() == null) ? 0 : getUsdRate().hashCode());
        result = prime * result + ((getRmbRate() == null) ? 0 : getRmbRate().hashCode());
        result = prime * result + ((getCopyNum() == null) ? 0 : getCopyNum().hashCode());
        result = prime * result + ((getTradeType() == null) ? 0 : getTradeType().hashCode());
        result = prime * result + ((getPayTerm() == null) ? 0 : getPayTerm().hashCode());
        result = prime * result + ((getOcId() == null) ? 0 : getOcId().hashCode());
        result = prime * result + ((getUsdamt() == null) ? 0 : getUsdamt().hashCode());
        result = prime * result + ((getPreNo() == null) ? 0 : getPreNo().hashCode());
        result = prime * result + ((getAccNo() == null) ? 0 : getAccNo().hashCode());
        result = prime * result + ((getKcType() == null) ? 0 : getKcType().hashCode());
        result = prime * result + ((getGrossProfit() == null) ? 0 : getGrossProfit().hashCode());
        result = prime * result + ((getDiscountRate() == null) ? 0 : getDiscountRate().hashCode());
        result = prime * result + ((getInstallDate() == null) ? 0 : getInstallDate().hashCode());
        result = prime * result + ((getcTag() == null) ? 0 : getcTag().hashCode());
        result = prime * result + ((getDocBs() == null) ? 0 : getDocBs().hashCode());
        result = prime * result + ((getDocSc() == null) ? 0 : getDocSc().hashCode());
        result = prime * result + ((getDocBc() == null) ? 0 : getDocBc().hashCode());
        result = prime * result + ((getDocYj() == null) ? 0 : getDocYj().hashCode());
        result = prime * result + ((getDocCert() == null) ? 0 : getDocCert().hashCode());
        result = prime * result + ((getDocYs() == null) ? 0 : getDocYs().hashCode());
        result = prime * result + ((getSdAmt() == null) ? 0 : getSdAmt().hashCode());
        result = prime * result + ((getYqAmt() == null) ? 0 : getYqAmt().hashCode());
        result = prime * result + ((getKpQuant() == null) ? 0 : getKpQuant().hashCode());
        result = prime * result + ((getKpAmt() == null) ? 0 : getKpAmt().hashCode());
        result = prime * result + ((getFpQuant() == null) ? 0 : getFpQuant().hashCode());
        result = prime * result + ((getFpAmt() == null) ? 0 : getFpAmt().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCellId() == null) ? 0 : getCellId().hashCode());
        result = prime * result + ((getCstId() == null) ? 0 : getCstId().hashCode());
        result = prime * result + ((getGuarantee() == null) ? 0 : getGuarantee().hashCode());
        result = prime * result + ((getCstName() == null) ? 0 : getCstName().hashCode());
        result = prime * result + ((getCreditLeft() == null) ? 0 : getCreditLeft().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getpQuant() == null) ? 0 : getpQuant().hashCode());
        result = prime * result + ((getConfirmCondition() == null) ? 0 : getConfirmCondition().hashCode());
        result = prime * result + ((getYqNotes() == null) ? 0 : getYqNotes().hashCode());
        result = prime * result + ((getQualityYear() == null) ? 0 : getQualityYear().hashCode());
        result = prime * result + ((getYjInstallDate() == null) ? 0 : getYjInstallDate().hashCode());
        result = prime * result + ((getJhLateTerm() == null) ? 0 : getJhLateTerm().hashCode());
        result = prime * result + ((getYhTerm() == null) ? 0 : getYhTerm().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProType() == null) ? 0 : getProType().hashCode());
        result = prime * result + ((getOutOverTag() == null) ? 0 : getOutOverTag().hashCode());
        result = prime * result + ((getOutOverDate() == null) ? 0 : getOutOverDate().hashCode());
        result = prime * result + ((getValidDate() == null) ? 0 : getValidDate().hashCode());
        result = prime * result + ((getUndo() == null) ? 0 : getUndo().hashCode());
        result = prime * result + ((getEndTag() == null) ? 0 : getEndTag().hashCode());
        result = prime * result + ((getYsDate() == null) ? 0 : getYsDate().hashCode());
        result = prime * result + ((getSjDate() == null) ? 0 : getSjDate().hashCode());
        result = prime * result + ((getQualityUnit() == null) ? 0 : getQualityUnit().hashCode());
        result = prime * result + ((getTbType() == null) ? 0 : getTbType().hashCode());
        result = prime * result + ((getGuranteeTrackday() == null) ? 0 : getGuranteeTrackday().hashCode());
        result = prime * result + ((getDbCheckUserId() == null) ? 0 : getDbCheckUserId().hashCode());
        result = prime * result + ((getDbCheckDate() == null) ? 0 : getDbCheckDate().hashCode());
        result = prime * result + ((getCommissionId() == null) ? 0 : getCommissionId().hashCode());
        result = prime * result + ((getCommissionNo() == null) ? 0 : getCommissionNo().hashCode());
        result = prime * result + ((getCommissionName() == null) ? 0 : getCommissionName().hashCode());
        result = prime * result + ((getBuyerId() == null) ? 0 : getBuyerId().hashCode());
        result = prime * result + ((getBuyerNo() == null) ? 0 : getBuyerNo().hashCode());
        result = prime * result + ((getBuyerName() == null) ? 0 : getBuyerName().hashCode());
        result = prime * result + ((getDbCheckTag() == null) ? 0 : getDbCheckTag().hashCode());
        result = prime * result + ((getGdTag() == null) ? 0 : getGdTag().hashCode());
        result = prime * result + ((getGdUserId() == null) ? 0 : getGdUserId().hashCode());
        result = prime * result + ((getGdDate() == null) ? 0 : getGdDate().hashCode());
        result = prime * result + ((getRefId() == null) ? 0 : getRefId().hashCode());
        result = prime * result + ((getRefType() == null) ? 0 : getRefType().hashCode());
        result = prime * result + ((getOcuOrgId() == null) ? 0 : getOcuOrgId().hashCode());
        result = prime * result + ((getImportNation() == null) ? 0 : getImportNation().hashCode());
        result = prime * result + ((getGrossRate() == null) ? 0 : getGrossRate().hashCode());
        result = prime * result + ((getScType() == null) ? 0 : getScType().hashCode());
        result = prime * result + ((getSignDate() == null) ? 0 : getSignDate().hashCode());
        result = prime * result + ((getIsXyx() == null) ? 0 : getIsXyx().hashCode());
        result = prime * result + ((getIsHyx() == null) ? 0 : getIsHyx().hashCode());
        result = prime * result + ((getIsFhEnd() == null) ? 0 : getIsFhEnd().hashCode());
        result = prime * result + ((getTsDate() == null) ? 0 : getTsDate().hashCode());
        result = prime * result + ((getIuOcuId() == null) ? 0 : getIuOcuId().hashCode());
        result = prime * result + ((getDepatureId() == null) ? 0 : getDepatureId().hashCode());
        result = prime * result + ((getDestId() == null) ? 0 : getDestId().hashCode());
        result = prime * result + ((getnNo() == null) ? 0 : getnNo().hashCode());
        result = prime * result + ((getInlandOrOverseas() == null) ? 0 : getInlandOrOverseas().hashCode());
        result = prime * result + ((getTypeOfCon() == null) ? 0 : getTypeOfCon().hashCode());
        result = prime * result + ((getCataOfCon() == null) ? 0 : getCataOfCon().hashCode());
        result = prime * result + ((getPropOfCon() == null) ? 0 : getPropOfCon().hashCode());
        result = prime * result + ((getBizMode() == null) ? 0 : getBizMode().hashCode());
        result = prime * result + ((getRelScId() == null) ? 0 : getRelScId().hashCode());
        result = prime * result + ((getConName() == null) ? 0 : getConName().hashCode());
        result = prime * result + ((getSignPlace() == null) ? 0 : getSignPlace().hashCode());
        result = prime * result + ((getConContent() == null) ? 0 : getConContent().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getCstNationId() == null) ? 0 : getCstNationId().hashCode());
        result = prime * result + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        result = prime * result + ((getLandNationId() == null) ? 0 : getLandNationId().hashCode());
        result = prime * result + ((getLandPortId() == null) ? 0 : getLandPortId().hashCode());
        result = prime * result + ((getLandLocation() == null) ? 0 : getLandLocation().hashCode());
        result = prime * result + ((getRecerId() == null) ? 0 : getRecerId().hashCode());
        result = prime * result + ((getDestNationId() == null) ? 0 : getDestNationId().hashCode());
        result = prime * result + ((getDestPortId() == null) ? 0 : getDestPortId().hashCode());
        result = prime * result + ((getDestLocation() == null) ? 0 : getDestLocation().hashCode());
        result = prime * result + ((getIsBatches() == null) ? 0 : getIsBatches().hashCode());
        result = prime * result + ((getIsTransfer() == null) ? 0 : getIsTransfer().hashCode());
        result = prime * result + ((getTransferPortId() == null) ? 0 : getTransferPortId().hashCode());
        result = prime * result + ((getCommissionRate() == null) ? 0 : getCommissionRate().hashCode());
        result = prime * result + ((getCommissionCurrType() == null) ? 0 : getCommissionCurrType().hashCode());
        result = prime * result + ((getShipmentWay() == null) ? 0 : getShipmentWay().hashCode());
        result = prime * result + ((getBoxDeliveryType() == null) ? 0 : getBoxDeliveryType().hashCode());
        result = prime * result + ((getDeliveryPlace() == null) ? 0 : getDeliveryPlace().hashCode());
        result = prime * result + ((getProxyCorpId() == null) ? 0 : getProxyCorpId().hashCode());
        result = prime * result + ((getIsArrignProxy() == null) ? 0 : getIsArrignProxy().hashCode());
        result = prime * result + ((getTransResp() == null) ? 0 : getTransResp().hashCode());
        result = prime * result + ((getTransWay() == null) ? 0 : getTransWay().hashCode());
        result = prime * result + ((getTransCorpId() == null) ? 0 : getTransCorpId().hashCode());
        result = prime * result + ((getIsArrignTrans() == null) ? 0 : getIsArrignTrans().hashCode());
        result = prime * result + ((getTransFeeResp() == null) ? 0 : getTransFeeResp().hashCode());
        result = prime * result + ((getTransInsuResp() == null) ? 0 : getTransInsuResp().hashCode());
        result = prime * result + ((getSendTerm() == null) ? 0 : getSendTerm().hashCode());
        result = prime * result + ((getArbitrationPlace() == null) ? 0 : getArbitrationPlace().hashCode());
        result = prime * result + ((getSuePlace() == null) ? 0 : getSuePlace().hashCode());
        result = prime * result + ((getIsNeedSpecDocu() == null) ? 0 : getIsNeedSpecDocu().hashCode());
        result = prime * result + ((getPricingWay() == null) ? 0 : getPricingWay().hashCode());
        result = prime * result + ((getSettleWay() == null) ? 0 : getSettleWay().hashCode());
        result = prime * result + ((getSelfSettleWay() == null) ? 0 : getSelfSettleWay().hashCode());
        result = prime * result + ((getDkStandard() == null) ? 0 : getDkStandard().hashCode());
        result = prime * result + ((getDkIntRate() == null) ? 0 : getDkIntRate().hashCode());
        result = prime * result + ((getIsAgreeDk() == null) ? 0 : getIsAgreeDk().hashCode());
        result = prime * result + ((getConPeriod() == null) ? 0 : getConPeriod().hashCode());
        result = prime * result + ((getBailRate() == null) ? 0 : getBailRate().hashCode());
        result = prime * result + ((getProfitScheme() == null) ? 0 : getProfitScheme().hashCode());
        result = prime * result + ((getCommQuantPack() == null) ? 0 : getCommQuantPack().hashCode());
        result = prime * result + ((getCommQuantStat() == null) ? 0 : getCommQuantStat().hashCode());
        result = prime * result + ((getDepOrgId() == null) ? 0 : getDepOrgId().hashCode());
        result = prime * result + ((getPriceStandard() == null) ? 0 : getPriceStandard().hashCode());
        result = prime * result + ((getCstProp() == null) ? 0 : getCstProp().hashCode());
        result = prime * result + ((getCmdCataId() == null) ? 0 : getCmdCataId().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getSenderName() == null) ? 0 : getSenderName().hashCode());
        result = prime * result + ((getRecerName() == null) ? 0 : getRecerName().hashCode());
        result = prime * result + ((getTransCorpName() == null) ? 0 : getTransCorpName().hashCode());
        result = prime * result + ((getProxyCorpName() == null) ? 0 : getProxyCorpName().hashCode());
        result = prime * result + ((getIsClose() == null) ? 0 : getIsClose().hashCode());
        result = prime * result + ((getCloseUserId() == null) ? 0 : getCloseUserId().hashCode());
        result = prime * result + ((getCloseDate() == null) ? 0 : getCloseDate().hashCode());
        result = prime * result + ((getShortOrOver() == null) ? 0 : getShortOrOver().hashCode());
        result = prime * result + ((getConPeriodSType() == null) ? 0 : getConPeriodSType().hashCode());
        result = prime * result + ((getCommUnit() == null) ? 0 : getCommUnit().hashCode());
        result = prime * result + ((getIsOa() == null) ? 0 : getIsOa().hashCode());
        result = prime * result + ((getCommPerUnit() == null) ? 0 : getCommPerUnit().hashCode());
        result = prime * result + ((getLackLoadRate() == null) ? 0 : getLackLoadRate().hashCode());
        result = prime * result + ((getOverLoadRate() == null) ? 0 : getOverLoadRate().hashCode());
        result = prime * result + ((getTradeOrSrv() == null) ? 0 : getTradeOrSrv().hashCode());
        result = prime * result + ((getTrSrvOrGoods() == null) ? 0 : getTrSrvOrGoods().hashCode());
        result = prime * result + ((getProfitSchemeDesc() == null) ? 0 : getProfitSchemeDesc().hashCode());
        result = prime * result + ((getLeaseCorpId() == null) ? 0 : getLeaseCorpId().hashCode());
        result = prime * result + ((getLeaseCorpName() == null) ? 0 : getLeaseCorpName().hashCode());
        result = prime * result + ((getPrFeeType() == null) ? 0 : getPrFeeType().hashCode());
        result = prime * result + ((getPrFeeRate() == null) ? 0 : getPrFeeRate().hashCode());
        result = prime * result + ((getPrFeeCurrType() == null) ? 0 : getPrFeeCurrType().hashCode());
        result = prime * result + ((getPrFeeAmt() == null) ? 0 : getPrFeeAmt().hashCode());
        result = prime * result + ((getLeaseMode() == null) ? 0 : getLeaseMode().hashCode());
        result = prime * result + ((getPlanFctId() == null) ? 0 : getPlanFctId().hashCode());
        result = prime * result + ((getPlanFctName() == null) ? 0 : getPlanFctName().hashCode());
        result = prime * result + ((getPlanManufacId() == null) ? 0 : getPlanManufacId().hashCode());
        result = prime * result + ((getPlanManufacName() == null) ? 0 : getPlanManufacName().hashCode());
        result = prime * result + ((getComplexLevel() == null) ? 0 : getComplexLevel().hashCode());
        result = prime * result + ((getCommName() == null) ? 0 : getCommName().hashCode());
        result = prime * result + ((getCommId() == null) ? 0 : getCommId().hashCode());
        result = prime * result + ((getPlanPurInlOrOs() == null) ? 0 : getPlanPurInlOrOs().hashCode());
        result = prime * result + ((getBailRateType() == null) ? 0 : getBailRateType().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        return result;
    }

	public String getRemarkClerk() {
		return remarkClerk;
	}

	public void setRemarkClerk(String remarkClerk) {
		this.remarkClerk = remarkClerk;
	}

	public String getWhName() {
		return whName;
	}

	public void setWhName(String whName) {
		this.whName = whName;
	}
}