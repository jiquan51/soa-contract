package com.sumec.project.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by daitiantian on 2017/11/16.
 */
public class TSubContract implements Serializable {

    private BigDecimal bcId;

    private String cNo;

    private Date mDate;

    private String cType;

    private String fctNo;

    private String firstParty;

    private String packTrm;

    private String quality;

    private String qualityTime;

    private String depature;

    private String note;

    private Date deliD;

    private String market;

    private BigDecimal pQuant;

    private BigDecimal pAmt;

    private String statusPs;

    private String endId;

    private String rohsBz;

    private String yh;

    private String isValid;

    private String depNo;

    private String groupNo;

    private String empNo;

    private String empName;

    private String makerNo;

    private String makerName;

    private String modifyNo;

    private String modifyName;

    private Date modifyDate;

    private String checkNo;

    private String checkName;

    private Date checkDate;

    private BigDecimal fromId;

    private String servTag;

    private String goodsSample;

    private String sampleGet;

    private String docs;

    private String confirm;

    private String reason;

    private BigDecimal fpAmt;

    private BigDecimal payAmt;

    private String whNo;

    private String nNo;

    private String realNo;

    private String manualNo;

    private String payTerm;

    private Long ocId;

    private String isInstall;

    private String tag;

    private String gjTerm;

    private String needCalc;

    private String accNo;

    private BigDecimal orgId;

    private BigDecimal userId;

    private BigDecimal cellId;

    private BigDecimal fctId;

    private String kcType;

    private String viewScope;

    private String prompt;

    private String isNeedSample;

    private String isGetSample;

    private String trademode;

    private String currType;

    private BigDecimal proId;

    private String proType;

    private String sendOverTag;

    private Date sendOverDate;

    private String fctOrderNo;

    private String isJsReal;

    private BigDecimal checkUserId;

    private BigDecimal modifyUserId;

    private String copyPartyNo;

    private BigDecimal copyPartyId;

    private String copyMoveNo;

    private BigDecimal copyMoveId;

    private String isJqOver;

    private String undo;

    private String isZyOver;

    private BigDecimal producerId;

    private String producerNo;

    private String producerName;

    private String gdTag;

    private BigDecimal gdUserId;

    private Date gdDate;

    private String gjFctNo;

    private BigDecimal gjFctId;

    private Long ocuOrgId;

    private String sendTerm;

    private Long sendDay;

    private Long sendoverDay;

    private Date sendDate;

    private Date sendoverDate;

    private BigDecimal whId;

    private String whName;

    private String bcType;

    private String transWay;

    private Date signDate;

    private String cTerm;

    private String cstShortName;

    private BigDecimal transCorpId;

    private String transCorpName;

    private String otherReq;

    private String isU8PurcharseReq;

    private String isMove;

    private String isClose;

    private Long closeUserId;

    private Date closeDate;

    private Long iuOcuId;

    private String inlandOrOverseas;

    private String typeOfCon;

    private String closeConfirm;

    private Long depOrgId;

    private Long purchaserId;

    private String cataOfCon;

    private String propOfCon;

    private String bizMode;

    private BigDecimal relBcId;

    private String conName;

    private Date validDate;

    private String signPlace;

    private String conContent;

    private Long sellerNationId;

    private String sellerProp;

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

    private BigDecimal commissionId;

    private BigDecimal commissionRate;

    private String commissionCurrType;

    private BigDecimal commissionFee;

    private String shipmentWay;

    private String boxDeliveryType;

    private String deliveryPlace;

    private String isPlanSt;

    private BigDecimal proxyCorpId;

    private String transResp;

    private String transFeeResp;

    private String transInsuResp;

    private String arbitrationPlace;

    private String suePlace;

    private String isNeedSpecDocu;

    private String pricingWay;

    private String priceStandard;

    private String examStandard;

    private Integer conPeriod;

    private BigDecimal bailRate;

    private String profitScheme;

    private BigDecimal commQuantPack;

    private BigDecimal commQuantStat;

    private String cStatus;

    private Long cmdCataId;

    private String priceTerm;

    private String fctName;

    private String purchaserName;

    private String senderName;

    private String recerName;

    private String commissionName;

    private String proxyCorpName;

    private String affectIncome;

    private BigDecimal affectIncomeRate;

    private BigDecimal manufacId;

    private String manufacName;

    private Long u8OpId;

    private BigDecimal cnyRate;

    private BigDecimal usdRate;

    private BigDecimal currRate;

    private BigDecimal shortOrOver;

    private String conPeriodSType;

    private Long commUnit;

    private String tradeOrSrv;

    private String trSrvOrGoods;

    private String profitSchemeDesc;

    private static final long serialVersionUID = 1L;

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

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String getFctNo() {
        return fctNo;
    }

    public void setFctNo(String fctNo) {
        this.fctNo = fctNo;
    }

    public String getFirstParty() {
        return firstParty;
    }

    public void setFirstParty(String firstParty) {
        this.firstParty = firstParty;
    }

    public String getPackTrm() {
        return packTrm;
    }

    public void setPackTrm(String packTrm) {
        this.packTrm = packTrm;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(String qualityTime) {
        this.qualityTime = qualityTime;
    }

    public String getDepature() {
        return depature;
    }

    public void setDepature(String depature) {
        this.depature = depature;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDeliD() {
        return deliD;
    }

    public void setDeliD(Date deliD) {
        this.deliD = deliD;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public BigDecimal getpQuant() {
        return pQuant;
    }

    public void setpQuant(BigDecimal pQuant) {
        this.pQuant = pQuant;
    }

    public BigDecimal getpAmt() {
        return pAmt;
    }

    public void setpAmt(BigDecimal pAmt) {
        this.pAmt = pAmt;
    }

    public String getStatusPs() {
        return statusPs;
    }

    public void setStatusPs(String statusPs) {
        this.statusPs = statusPs;
    }

    public String getEndId() {
        return endId;
    }

    public void setEndId(String endId) {
        this.endId = endId;
    }

    public String getRohsBz() {
        return rohsBz;
    }

    public void setRohsBz(String rohsBz) {
        this.rohsBz = rohsBz;
    }

    public String getYh() {
        return yh;
    }

    public void setYh(String yh) {
        this.yh = yh;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getDepNo() {
        return depNo;
    }

    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
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

    public BigDecimal getFromId() {
        return fromId;
    }

    public void setFromId(BigDecimal fromId) {
        this.fromId = fromId;
    }

    public String getServTag() {
        return servTag;
    }

    public void setServTag(String servTag) {
        this.servTag = servTag;
    }

    public String getGoodsSample() {
        return goodsSample;
    }

    public void setGoodsSample(String goodsSample) {
        this.goodsSample = goodsSample;
    }

    public String getSampleGet() {
        return sampleGet;
    }

    public void setSampleGet(String sampleGet) {
        this.sampleGet = sampleGet;
    }

    public String getDocs() {
        return docs;
    }

    public void setDocs(String docs) {
        this.docs = docs;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public BigDecimal getFpAmt() {
        return fpAmt;
    }

    public void setFpAmt(BigDecimal fpAmt) {
        this.fpAmt = fpAmt;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public String getWhNo() {
        return whNo;
    }

    public void setWhNo(String whNo) {
        this.whNo = whNo;
    }

    public String getnNo() {
        return nNo;
    }

    public void setnNo(String nNo) {
        this.nNo = nNo;
    }

    public String getRealNo() {
        return realNo;
    }

    public void setRealNo(String realNo) {
        this.realNo = realNo;
    }

    public String getManualNo() {
        return manualNo;
    }

    public void setManualNo(String manualNo) {
        this.manualNo = manualNo;
    }

    public String getPayTerm() {
        return payTerm;
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

    public String getIsInstall() {
        return isInstall;
    }

    public void setIsInstall(String isInstall) {
        this.isInstall = isInstall;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGjTerm() {
        return gjTerm;
    }

    public void setGjTerm(String gjTerm) {
        this.gjTerm = gjTerm;
    }

    public String getNeedCalc() {
        return needCalc;
    }

    public void setNeedCalc(String needCalc) {
        this.needCalc = needCalc;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
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

    public BigDecimal getFctId() {
        return fctId;
    }

    public void setFctId(BigDecimal fctId) {
        this.fctId = fctId;
    }

    public String getKcType() {
        return kcType;
    }

    public void setKcType(String kcType) {
        this.kcType = kcType;
    }

    public String getViewScope() {
        return viewScope;
    }

    public void setViewScope(String viewScope) {
        this.viewScope = viewScope;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getIsNeedSample() {
        return isNeedSample;
    }

    public void setIsNeedSample(String isNeedSample) {
        this.isNeedSample = isNeedSample;
    }

    public String getIsGetSample() {
        return isGetSample;
    }

    public void setIsGetSample(String isGetSample) {
        this.isGetSample = isGetSample;
    }

    public String getTrademode() {
        return trademode;
    }

    public void setTrademode(String trademode) {
        this.trademode = trademode;
    }

    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
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

    public String getSendOverTag() {
        return sendOverTag;
    }

    public void setSendOverTag(String sendOverTag) {
        this.sendOverTag = sendOverTag;
    }

    public Date getSendOverDate() {
        return sendOverDate;
    }

    public void setSendOverDate(Date sendOverDate) {
        this.sendOverDate = sendOverDate;
    }

    public String getFctOrderNo() {
        return fctOrderNo;
    }

    public void setFctOrderNo(String fctOrderNo) {
        this.fctOrderNo = fctOrderNo;
    }

    public String getIsJsReal() {
        return isJsReal;
    }

    public void setIsJsReal(String isJsReal) {
        this.isJsReal = isJsReal;
    }

    public BigDecimal getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(BigDecimal checkUserId) {
        this.checkUserId = checkUserId;
    }

    public BigDecimal getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(BigDecimal modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getCopyPartyNo() {
        return copyPartyNo;
    }

    public void setCopyPartyNo(String copyPartyNo) {
        this.copyPartyNo = copyPartyNo;
    }

    public BigDecimal getCopyPartyId() {
        return copyPartyId;
    }

    public void setCopyPartyId(BigDecimal copyPartyId) {
        this.copyPartyId = copyPartyId;
    }

    public String getCopyMoveNo() {
        return copyMoveNo;
    }

    public void setCopyMoveNo(String copyMoveNo) {
        this.copyMoveNo = copyMoveNo;
    }

    public BigDecimal getCopyMoveId() {
        return copyMoveId;
    }

    public void setCopyMoveId(BigDecimal copyMoveId) {
        this.copyMoveId = copyMoveId;
    }

    public String getIsJqOver() {
        return isJqOver;
    }

    public void setIsJqOver(String isJqOver) {
        this.isJqOver = isJqOver;
    }

    public String getUndo() {
        return undo;
    }

    public void setUndo(String undo) {
        this.undo = undo;
    }

    public String getIsZyOver() {
        return isZyOver;
    }

    public void setIsZyOver(String isZyOver) {
        this.isZyOver = isZyOver;
    }

    public BigDecimal getProducerId() {
        return producerId;
    }

    public void setProducerId(BigDecimal producerId) {
        this.producerId = producerId;
    }

    public String getProducerNo() {
        return producerNo;
    }

    public void setProducerNo(String producerNo) {
        this.producerNo = producerNo;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
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

    public String getGjFctNo() {
        return gjFctNo;
    }

    public void setGjFctNo(String gjFctNo) {
        this.gjFctNo = gjFctNo;
    }

    public BigDecimal getGjFctId() {
        return gjFctId;
    }

    public void setGjFctId(BigDecimal gjFctId) {
        this.gjFctId = gjFctId;
    }

    public Long getOcuOrgId() {
        return ocuOrgId;
    }

    public void setOcuOrgId(Long ocuOrgId) {
        this.ocuOrgId = ocuOrgId;
    }

    public String getSendTerm() {
        return sendTerm;
    }

    public void setSendTerm(String sendTerm) {
        this.sendTerm = sendTerm;
    }

    public Long getSendDay() {
        return sendDay;
    }

    public void setSendDay(Long sendDay) {
        this.sendDay = sendDay;
    }

    public Long getSendoverDay() {
        return sendoverDay;
    }

    public void setSendoverDay(Long sendoverDay) {
        this.sendoverDay = sendoverDay;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getSendoverDate() {
        return sendoverDate;
    }

    public void setSendoverDate(Date sendoverDate) {
        this.sendoverDate = sendoverDate;
    }

    public BigDecimal getWhId() {
        return whId;
    }

    public void setWhId(BigDecimal whId) {
        this.whId = whId;
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName;
    }

    public String getBcType() {
        return bcType;
    }

    public void setBcType(String bcType) {
        this.bcType = bcType;
    }

    public String getTransWay() {
        return transWay;
    }

    public void setTransWay(String transWay) {
        this.transWay = transWay;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getcTerm() {
        return cTerm;
    }

    public void setcTerm(String cTerm) {
        this.cTerm = cTerm;
    }

    public String getCstShortName() {
        return cstShortName;
    }

    public void setCstShortName(String cstShortName) {
        this.cstShortName = cstShortName;
    }

    public BigDecimal getTransCorpId() {
        return transCorpId;
    }

    public void setTransCorpId(BigDecimal transCorpId) {
        this.transCorpId = transCorpId;
    }

    public String getTransCorpName() {
        return transCorpName;
    }

    public void setTransCorpName(String transCorpName) {
        this.transCorpName = transCorpName;
    }

    public String getOtherReq() {
        return otherReq;
    }

    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq;
    }

    public String getIsU8PurcharseReq() {
        return isU8PurcharseReq;
    }

    public void setIsU8PurcharseReq(String isU8PurcharseReq) {
        this.isU8PurcharseReq = isU8PurcharseReq;
    }

    public String getIsMove() {
        return isMove;
    }

    public void setIsMove(String isMove) {
        this.isMove = isMove;
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

    public Long getIuOcuId() {
        return iuOcuId;
    }

    public void setIuOcuId(Long iuOcuId) {
        this.iuOcuId = iuOcuId;
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

    public String getCloseConfirm() {
        return closeConfirm;
    }

    public void setCloseConfirm(String closeConfirm) {
        this.closeConfirm = closeConfirm;
    }

    public Long getDepOrgId() {
        return depOrgId;
    }

    public void setDepOrgId(Long depOrgId) {
        this.depOrgId = depOrgId;
    }

    public Long getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Long purchaserId) {
        this.purchaserId = purchaserId;
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

    public BigDecimal getRelBcId() {
        return relBcId;
    }

    public void setRelBcId(BigDecimal relBcId) {
        this.relBcId = relBcId;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
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

    public Long getSellerNationId() {
        return sellerNationId;
    }

    public void setSellerNationId(Long sellerNationId) {
        this.sellerNationId = sellerNationId;
    }

    public String getSellerProp() {
        return sellerProp;
    }

    public void setSellerProp(String sellerProp) {
        this.sellerProp = sellerProp;
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

    public BigDecimal getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(BigDecimal commissionId) {
        this.commissionId = commissionId;
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

    public BigDecimal getCommissionFee() {
        return commissionFee;
    }

    public void setCommissionFee(BigDecimal commissionFee) {
        this.commissionFee = commissionFee;
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
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getIsPlanSt() {
        return isPlanSt;
    }

    public void setIsPlanSt(String isPlanSt) {
        this.isPlanSt = isPlanSt;
    }

    public BigDecimal getProxyCorpId() {
        return proxyCorpId;
    }

    public void setProxyCorpId(BigDecimal proxyCorpId) {
        this.proxyCorpId = proxyCorpId;
    }

    public String getTransResp() {
        return transResp;
    }

    public void setTransResp(String transResp) {
        this.transResp = transResp;
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

    public String getPriceStandard() {
        return priceStandard;
    }

    public void setPriceStandard(String priceStandard) {
        this.priceStandard = priceStandard;
    }

    public String getExamStandard() {
        return examStandard;
    }

    public void setExamStandard(String examStandard) {
        this.examStandard = examStandard;
    }

    public Integer getConPeriod() {
        return conPeriod;
    }

    public void setConPeriod(Integer conPeriod) {
        this.conPeriod = conPeriod;
    }

    public BigDecimal getBailRate() {
        return bailRate;
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

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }

    public Long getCmdCataId() {
        return cmdCataId;
    }

    public void setCmdCataId(Long cmdCataId) {
        this.cmdCataId = cmdCataId;
    }

    public String getPriceTerm() {
        return priceTerm;
    }

    public void setPriceTerm(String priceTerm) {
        this.priceTerm = priceTerm;
    }

    public String getFctName() {
        return fctName;
    }

    public void setFctName(String fctName) {
        this.fctName = fctName;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
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

    public String getCommissionName() {
        return commissionName;
    }

    public void setCommissionName(String commissionName) {
        this.commissionName = commissionName;
    }

    public String getProxyCorpName() {
        return proxyCorpName;
    }

    public void setProxyCorpName(String proxyCorpName) {
        this.proxyCorpName = proxyCorpName;
    }

    public String getAffectIncome() {
        return affectIncome;
    }

    public void setAffectIncome(String affectIncome) {
        this.affectIncome = affectIncome;
    }

    public BigDecimal getAffectIncomeRate() {
        return affectIncomeRate;
    }

    public void setAffectIncomeRate(BigDecimal affectIncomeRate) {
        this.affectIncomeRate = affectIncomeRate;
    }

    public BigDecimal getManufacId() {
        return manufacId;
    }

    public void setManufacId(BigDecimal manufacId) {
        this.manufacId = manufacId;
    }

    public String getManufacName() {
        return manufacName;
    }

    public void setManufacName(String manufacName) {
        this.manufacName = manufacName;
    }

    public Long getU8OpId() {
        return u8OpId;
    }

    public void setU8OpId(Long u8OpId) {
        this.u8OpId = u8OpId;
    }

    public BigDecimal getCnyRate() {
        return cnyRate;
    }

    public void setCnyRate(BigDecimal cnyRate) {
        this.cnyRate = cnyRate;
    }

    public BigDecimal getUsdRate() {
        return usdRate;
    }

    public void setUsdRate(BigDecimal usdRate) {
        this.usdRate = usdRate;
    }

    public BigDecimal getCurrRate() {
        return currRate;
    }

    public void setCurrRate(BigDecimal currRate) {
        this.currRate = currRate;
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
        TSubContract other = (TSubContract) that;
        return (this.getBcId() == null ? other.getBcId() == null : this.getBcId().equals(other.getBcId()))
                && (this.getcNo() == null ? other.getcNo() == null : this.getcNo().equals(other.getcNo()))
                && (this.getmDate() == null ? other.getmDate() == null : this.getmDate().equals(other.getmDate()))
                && (this.getcType() == null ? other.getcType() == null : this.getcType().equals(other.getcType()))
                && (this.getFctNo() == null ? other.getFctNo() == null : this.getFctNo().equals(other.getFctNo()))
                && (this.getFirstParty() == null ? other.getFirstParty() == null : this.getFirstParty().equals(other.getFirstParty()))
                && (this.getPackTrm() == null ? other.getPackTrm() == null : this.getPackTrm().equals(other.getPackTrm()))
                && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
                && (this.getQualityTime() == null ? other.getQualityTime() == null : this.getQualityTime().equals(other.getQualityTime()))
                && (this.getDepature() == null ? other.getDepature() == null : this.getDepature().equals(other.getDepature()))
                && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
                && (this.getDeliD() == null ? other.getDeliD() == null : this.getDeliD().equals(other.getDeliD()))
                && (this.getMarket() == null ? other.getMarket() == null : this.getMarket().equals(other.getMarket()))
                && (this.getpQuant() == null ? other.getpQuant() == null : this.getpQuant().equals(other.getpQuant()))
                && (this.getpAmt() == null ? other.getpAmt() == null : this.getpAmt().equals(other.getpAmt()))
                && (this.getStatusPs() == null ? other.getStatusPs() == null : this.getStatusPs().equals(other.getStatusPs()))
                && (this.getEndId() == null ? other.getEndId() == null : this.getEndId().equals(other.getEndId()))
                && (this.getRohsBz() == null ? other.getRohsBz() == null : this.getRohsBz().equals(other.getRohsBz()))
                && (this.getYh() == null ? other.getYh() == null : this.getYh().equals(other.getYh()))
                && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
                && (this.getDepNo() == null ? other.getDepNo() == null : this.getDepNo().equals(other.getDepNo()))
                && (this.getGroupNo() == null ? other.getGroupNo() == null : this.getGroupNo().equals(other.getGroupNo()))
                && (this.getEmpNo() == null ? other.getEmpNo() == null : this.getEmpNo().equals(other.getEmpNo()))
                && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
                && (this.getMakerNo() == null ? other.getMakerNo() == null : this.getMakerNo().equals(other.getMakerNo()))
                && (this.getMakerName() == null ? other.getMakerName() == null : this.getMakerName().equals(other.getMakerName()))
                && (this.getModifyNo() == null ? other.getModifyNo() == null : this.getModifyNo().equals(other.getModifyNo()))
                && (this.getModifyName() == null ? other.getModifyName() == null : this.getModifyName().equals(other.getModifyName()))
                && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
                && (this.getCheckNo() == null ? other.getCheckNo() == null : this.getCheckNo().equals(other.getCheckNo()))
                && (this.getCheckName() == null ? other.getCheckName() == null : this.getCheckName().equals(other.getCheckName()))
                && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
                && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
                && (this.getServTag() == null ? other.getServTag() == null : this.getServTag().equals(other.getServTag()))
                && (this.getGoodsSample() == null ? other.getGoodsSample() == null : this.getGoodsSample().equals(other.getGoodsSample()))
                && (this.getSampleGet() == null ? other.getSampleGet() == null : this.getSampleGet().equals(other.getSampleGet()))
                && (this.getDocs() == null ? other.getDocs() == null : this.getDocs().equals(other.getDocs()))
                && (this.getConfirm() == null ? other.getConfirm() == null : this.getConfirm().equals(other.getConfirm()))
                && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
                && (this.getFpAmt() == null ? other.getFpAmt() == null : this.getFpAmt().equals(other.getFpAmt()))
                && (this.getPayAmt() == null ? other.getPayAmt() == null : this.getPayAmt().equals(other.getPayAmt()))
                && (this.getWhNo() == null ? other.getWhNo() == null : this.getWhNo().equals(other.getWhNo()))
                && (this.getnNo() == null ? other.getnNo() == null : this.getnNo().equals(other.getnNo()))
                && (this.getRealNo() == null ? other.getRealNo() == null : this.getRealNo().equals(other.getRealNo()))
                && (this.getManualNo() == null ? other.getManualNo() == null : this.getManualNo().equals(other.getManualNo()))
                && (this.getPayTerm() == null ? other.getPayTerm() == null : this.getPayTerm().equals(other.getPayTerm()))
                && (this.getOcId() == null ? other.getOcId() == null : this.getOcId().equals(other.getOcId()))
                && (this.getIsInstall() == null ? other.getIsInstall() == null : this.getIsInstall().equals(other.getIsInstall()))
                && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
                && (this.getGjTerm() == null ? other.getGjTerm() == null : this.getGjTerm().equals(other.getGjTerm()))
                && (this.getNeedCalc() == null ? other.getNeedCalc() == null : this.getNeedCalc().equals(other.getNeedCalc()))
                && (this.getAccNo() == null ? other.getAccNo() == null : this.getAccNo().equals(other.getAccNo()))
                && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getCellId() == null ? other.getCellId() == null : this.getCellId().equals(other.getCellId()))
                && (this.getFctId() == null ? other.getFctId() == null : this.getFctId().equals(other.getFctId()))
                && (this.getKcType() == null ? other.getKcType() == null : this.getKcType().equals(other.getKcType()))
                && (this.getViewScope() == null ? other.getViewScope() == null : this.getViewScope().equals(other.getViewScope()))
                && (this.getPrompt() == null ? other.getPrompt() == null : this.getPrompt().equals(other.getPrompt()))
                && (this.getIsNeedSample() == null ? other.getIsNeedSample() == null : this.getIsNeedSample().equals(other.getIsNeedSample()))
                && (this.getIsGetSample() == null ? other.getIsGetSample() == null : this.getIsGetSample().equals(other.getIsGetSample()))
                && (this.getTrademode() == null ? other.getTrademode() == null : this.getTrademode().equals(other.getTrademode()))
                && (this.getCurrType() == null ? other.getCurrType() == null : this.getCurrType().equals(other.getCurrType()))
                && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
                && (this.getProType() == null ? other.getProType() == null : this.getProType().equals(other.getProType()))
                && (this.getSendOverTag() == null ? other.getSendOverTag() == null : this.getSendOverTag().equals(other.getSendOverTag()))
                && (this.getSendOverDate() == null ? other.getSendOverDate() == null : this.getSendOverDate().equals(other.getSendOverDate()))
                && (this.getFctOrderNo() == null ? other.getFctOrderNo() == null : this.getFctOrderNo().equals(other.getFctOrderNo()))
                && (this.getIsJsReal() == null ? other.getIsJsReal() == null : this.getIsJsReal().equals(other.getIsJsReal()))
                && (this.getCheckUserId() == null ? other.getCheckUserId() == null : this.getCheckUserId().equals(other.getCheckUserId()))
                && (this.getModifyUserId() == null ? other.getModifyUserId() == null : this.getModifyUserId().equals(other.getModifyUserId()))
                && (this.getCopyPartyNo() == null ? other.getCopyPartyNo() == null : this.getCopyPartyNo().equals(other.getCopyPartyNo()))
                && (this.getCopyPartyId() == null ? other.getCopyPartyId() == null : this.getCopyPartyId().equals(other.getCopyPartyId()))
                && (this.getCopyMoveNo() == null ? other.getCopyMoveNo() == null : this.getCopyMoveNo().equals(other.getCopyMoveNo()))
                && (this.getCopyMoveId() == null ? other.getCopyMoveId() == null : this.getCopyMoveId().equals(other.getCopyMoveId()))
                && (this.getIsJqOver() == null ? other.getIsJqOver() == null : this.getIsJqOver().equals(other.getIsJqOver()))
                && (this.getUndo() == null ? other.getUndo() == null : this.getUndo().equals(other.getUndo()))
                && (this.getIsZyOver() == null ? other.getIsZyOver() == null : this.getIsZyOver().equals(other.getIsZyOver()))
                && (this.getProducerId() == null ? other.getProducerId() == null : this.getProducerId().equals(other.getProducerId()))
                && (this.getProducerNo() == null ? other.getProducerNo() == null : this.getProducerNo().equals(other.getProducerNo()))
                && (this.getProducerName() == null ? other.getProducerName() == null : this.getProducerName().equals(other.getProducerName()))
                && (this.getGdTag() == null ? other.getGdTag() == null : this.getGdTag().equals(other.getGdTag()))
                && (this.getGdUserId() == null ? other.getGdUserId() == null : this.getGdUserId().equals(other.getGdUserId()))
                && (this.getGdDate() == null ? other.getGdDate() == null : this.getGdDate().equals(other.getGdDate()))
                && (this.getGjFctNo() == null ? other.getGjFctNo() == null : this.getGjFctNo().equals(other.getGjFctNo()))
                && (this.getGjFctId() == null ? other.getGjFctId() == null : this.getGjFctId().equals(other.getGjFctId()))
                && (this.getOcuOrgId() == null ? other.getOcuOrgId() == null : this.getOcuOrgId().equals(other.getOcuOrgId()))
                && (this.getSendTerm() == null ? other.getSendTerm() == null : this.getSendTerm().equals(other.getSendTerm()))
                && (this.getSendDay() == null ? other.getSendDay() == null : this.getSendDay().equals(other.getSendDay()))
                && (this.getSendoverDay() == null ? other.getSendoverDay() == null : this.getSendoverDay().equals(other.getSendoverDay()))
                && (this.getSendDate() == null ? other.getSendDate() == null : this.getSendDate().equals(other.getSendDate()))
                && (this.getSendoverDate() == null ? other.getSendoverDate() == null : this.getSendoverDate().equals(other.getSendoverDate()))
                && (this.getWhId() == null ? other.getWhId() == null : this.getWhId().equals(other.getWhId()))
                && (this.getWhName() == null ? other.getWhName() == null : this.getWhName().equals(other.getWhName()))
                && (this.getBcType() == null ? other.getBcType() == null : this.getBcType().equals(other.getBcType()))
                && (this.getTransWay() == null ? other.getTransWay() == null : this.getTransWay().equals(other.getTransWay()))
                && (this.getSignDate() == null ? other.getSignDate() == null : this.getSignDate().equals(other.getSignDate()))
                && (this.getcTerm() == null ? other.getcTerm() == null : this.getcTerm().equals(other.getcTerm()))
                && (this.getCstShortName() == null ? other.getCstShortName() == null : this.getCstShortName().equals(other.getCstShortName()))
                && (this.getTransCorpId() == null ? other.getTransCorpId() == null : this.getTransCorpId().equals(other.getTransCorpId()))
                && (this.getTransCorpName() == null ? other.getTransCorpName() == null : this.getTransCorpName().equals(other.getTransCorpName()))
                && (this.getOtherReq() == null ? other.getOtherReq() == null : this.getOtherReq().equals(other.getOtherReq()))
                && (this.getIsU8PurcharseReq() == null ? other.getIsU8PurcharseReq() == null : this.getIsU8PurcharseReq().equals(other.getIsU8PurcharseReq()))
                && (this.getIsMove() == null ? other.getIsMove() == null : this.getIsMove().equals(other.getIsMove()))
                && (this.getIsClose() == null ? other.getIsClose() == null : this.getIsClose().equals(other.getIsClose()))
                && (this.getCloseUserId() == null ? other.getCloseUserId() == null : this.getCloseUserId().equals(other.getCloseUserId()))
                && (this.getCloseDate() == null ? other.getCloseDate() == null : this.getCloseDate().equals(other.getCloseDate()))
                && (this.getIuOcuId() == null ? other.getIuOcuId() == null : this.getIuOcuId().equals(other.getIuOcuId()))
                && (this.getInlandOrOverseas() == null ? other.getInlandOrOverseas() == null : this.getInlandOrOverseas().equals(other.getInlandOrOverseas()))
                && (this.getTypeOfCon() == null ? other.getTypeOfCon() == null : this.getTypeOfCon().equals(other.getTypeOfCon()))
                && (this.getCloseConfirm() == null ? other.getCloseConfirm() == null : this.getCloseConfirm().equals(other.getCloseConfirm()))
                && (this.getDepOrgId() == null ? other.getDepOrgId() == null : this.getDepOrgId().equals(other.getDepOrgId()))
                && (this.getPurchaserId() == null ? other.getPurchaserId() == null : this.getPurchaserId().equals(other.getPurchaserId()))
                && (this.getCataOfCon() == null ? other.getCataOfCon() == null : this.getCataOfCon().equals(other.getCataOfCon()))
                && (this.getPropOfCon() == null ? other.getPropOfCon() == null : this.getPropOfCon().equals(other.getPropOfCon()))
                && (this.getBizMode() == null ? other.getBizMode() == null : this.getBizMode().equals(other.getBizMode()))
                && (this.getRelBcId() == null ? other.getRelBcId() == null : this.getRelBcId().equals(other.getRelBcId()))
                && (this.getConName() == null ? other.getConName() == null : this.getConName().equals(other.getConName()))
                && (this.getValidDate() == null ? other.getValidDate() == null : this.getValidDate().equals(other.getValidDate()))
                && (this.getSignPlace() == null ? other.getSignPlace() == null : this.getSignPlace().equals(other.getSignPlace()))
                && (this.getConContent() == null ? other.getConContent() == null : this.getConContent().equals(other.getConContent()))
                && (this.getSellerNationId() == null ? other.getSellerNationId() == null : this.getSellerNationId().equals(other.getSellerNationId()))
                && (this.getSellerProp() == null ? other.getSellerProp() == null : this.getSellerProp().equals(other.getSellerProp()))
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
                && (this.getCommissionId() == null ? other.getCommissionId() == null : this.getCommissionId().equals(other.getCommissionId()))
                && (this.getCommissionRate() == null ? other.getCommissionRate() == null : this.getCommissionRate().equals(other.getCommissionRate()))
                && (this.getCommissionCurrType() == null ? other.getCommissionCurrType() == null : this.getCommissionCurrType().equals(other.getCommissionCurrType()))
                && (this.getCommissionFee() == null ? other.getCommissionFee() == null : this.getCommissionFee().equals(other.getCommissionFee()))
                && (this.getShipmentWay() == null ? other.getShipmentWay() == null : this.getShipmentWay().equals(other.getShipmentWay()))
                && (this.getBoxDeliveryType() == null ? other.getBoxDeliveryType() == null : this.getBoxDeliveryType().equals(other.getBoxDeliveryType()))
                && (this.getDeliveryPlace() == null ? other.getDeliveryPlace() == null : this.getDeliveryPlace().equals(other.getDeliveryPlace()))
                && (this.getIsPlanSt() == null ? other.getIsPlanSt() == null : this.getIsPlanSt().equals(other.getIsPlanSt()))
                && (this.getProxyCorpId() == null ? other.getProxyCorpId() == null : this.getProxyCorpId().equals(other.getProxyCorpId()))
                && (this.getTransResp() == null ? other.getTransResp() == null : this.getTransResp().equals(other.getTransResp()))
                && (this.getTransFeeResp() == null ? other.getTransFeeResp() == null : this.getTransFeeResp().equals(other.getTransFeeResp()))
                && (this.getTransInsuResp() == null ? other.getTransInsuResp() == null : this.getTransInsuResp().equals(other.getTransInsuResp()))
                && (this.getArbitrationPlace() == null ? other.getArbitrationPlace() == null : this.getArbitrationPlace().equals(other.getArbitrationPlace()))
                && (this.getSuePlace() == null ? other.getSuePlace() == null : this.getSuePlace().equals(other.getSuePlace()))
                && (this.getIsNeedSpecDocu() == null ? other.getIsNeedSpecDocu() == null : this.getIsNeedSpecDocu().equals(other.getIsNeedSpecDocu()))
                && (this.getPricingWay() == null ? other.getPricingWay() == null : this.getPricingWay().equals(other.getPricingWay()))
                && (this.getPriceStandard() == null ? other.getPriceStandard() == null : this.getPriceStandard().equals(other.getPriceStandard()))
                && (this.getExamStandard() == null ? other.getExamStandard() == null : this.getExamStandard().equals(other.getExamStandard()))
                && (this.getConPeriod() == null ? other.getConPeriod() == null : this.getConPeriod().equals(other.getConPeriod()))
                && (this.getBailRate() == null ? other.getBailRate() == null : this.getBailRate().equals(other.getBailRate()))
                && (this.getProfitScheme() == null ? other.getProfitScheme() == null : this.getProfitScheme().equals(other.getProfitScheme()))
                && (this.getCommQuantPack() == null ? other.getCommQuantPack() == null : this.getCommQuantPack().equals(other.getCommQuantPack()))
                && (this.getCommQuantStat() == null ? other.getCommQuantStat() == null : this.getCommQuantStat().equals(other.getCommQuantStat()))
                && (this.getcStatus() == null ? other.getcStatus() == null : this.getcStatus().equals(other.getcStatus()))
                && (this.getCmdCataId() == null ? other.getCmdCataId() == null : this.getCmdCataId().equals(other.getCmdCataId()))
                && (this.getPriceTerm() == null ? other.getPriceTerm() == null : this.getPriceTerm().equals(other.getPriceTerm()))
                && (this.getFctName() == null ? other.getFctName() == null : this.getFctName().equals(other.getFctName()))
                && (this.getPurchaserName() == null ? other.getPurchaserName() == null : this.getPurchaserName().equals(other.getPurchaserName()))
                && (this.getSenderName() == null ? other.getSenderName() == null : this.getSenderName().equals(other.getSenderName()))
                && (this.getRecerName() == null ? other.getRecerName() == null : this.getRecerName().equals(other.getRecerName()))
                && (this.getCommissionName() == null ? other.getCommissionName() == null : this.getCommissionName().equals(other.getCommissionName()))
                && (this.getProxyCorpName() == null ? other.getProxyCorpName() == null : this.getProxyCorpName().equals(other.getProxyCorpName()))
                && (this.getAffectIncome() == null ? other.getAffectIncome() == null : this.getAffectIncome().equals(other.getAffectIncome()))
                && (this.getAffectIncomeRate() == null ? other.getAffectIncomeRate() == null : this.getAffectIncomeRate().equals(other.getAffectIncomeRate()))
                && (this.getManufacId() == null ? other.getManufacId() == null : this.getManufacId().equals(other.getManufacId()))
                && (this.getManufacName() == null ? other.getManufacName() == null : this.getManufacName().equals(other.getManufacName()))
                && (this.getU8OpId() == null ? other.getU8OpId() == null : this.getU8OpId().equals(other.getU8OpId()))
                && (this.getCnyRate() == null ? other.getCnyRate() == null : this.getCnyRate().equals(other.getCnyRate()))
                && (this.getUsdRate() == null ? other.getUsdRate() == null : this.getUsdRate().equals(other.getUsdRate()))
                && (this.getCurrRate() == null ? other.getCurrRate() == null : this.getCurrRate().equals(other.getCurrRate()))
                && (this.getShortOrOver() == null ? other.getShortOrOver() == null : this.getShortOrOver().equals(other.getShortOrOver()))
                && (this.getConPeriodSType() == null ? other.getConPeriodSType() == null : this.getConPeriodSType().equals(other.getConPeriodSType()))
                && (this.getCommUnit() == null ? other.getCommUnit() == null : this.getCommUnit().equals(other.getCommUnit()))
                && (this.getTradeOrSrv() == null ? other.getTradeOrSrv() == null : this.getTradeOrSrv().equals(other.getTradeOrSrv()))
                && (this.getTrSrvOrGoods() == null ? other.getTrSrvOrGoods() == null : this.getTrSrvOrGoods().equals(other.getTrSrvOrGoods()))
                && (this.getProfitSchemeDesc() == null ? other.getProfitSchemeDesc() == null : this.getProfitSchemeDesc().equals(other.getProfitSchemeDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBcId() == null) ? 0 : getBcId().hashCode());
        result = prime * result + ((getcNo() == null) ? 0 : getcNo().hashCode());
        result = prime * result + ((getmDate() == null) ? 0 : getmDate().hashCode());
        result = prime * result + ((getcType() == null) ? 0 : getcType().hashCode());
        result = prime * result + ((getFctNo() == null) ? 0 : getFctNo().hashCode());
        result = prime * result + ((getFirstParty() == null) ? 0 : getFirstParty().hashCode());
        result = prime * result + ((getPackTrm() == null) ? 0 : getPackTrm().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getQualityTime() == null) ? 0 : getQualityTime().hashCode());
        result = prime * result + ((getDepature() == null) ? 0 : getDepature().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getDeliD() == null) ? 0 : getDeliD().hashCode());
        result = prime * result + ((getMarket() == null) ? 0 : getMarket().hashCode());
        result = prime * result + ((getpQuant() == null) ? 0 : getpQuant().hashCode());
        result = prime * result + ((getpAmt() == null) ? 0 : getpAmt().hashCode());
        result = prime * result + ((getStatusPs() == null) ? 0 : getStatusPs().hashCode());
        result = prime * result + ((getEndId() == null) ? 0 : getEndId().hashCode());
        result = prime * result + ((getRohsBz() == null) ? 0 : getRohsBz().hashCode());
        result = prime * result + ((getYh() == null) ? 0 : getYh().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getDepNo() == null) ? 0 : getDepNo().hashCode());
        result = prime * result + ((getGroupNo() == null) ? 0 : getGroupNo().hashCode());
        result = prime * result + ((getEmpNo() == null) ? 0 : getEmpNo().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getMakerNo() == null) ? 0 : getMakerNo().hashCode());
        result = prime * result + ((getMakerName() == null) ? 0 : getMakerName().hashCode());
        result = prime * result + ((getModifyNo() == null) ? 0 : getModifyNo().hashCode());
        result = prime * result + ((getModifyName() == null) ? 0 : getModifyName().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getCheckNo() == null) ? 0 : getCheckNo().hashCode());
        result = prime * result + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getServTag() == null) ? 0 : getServTag().hashCode());
        result = prime * result + ((getGoodsSample() == null) ? 0 : getGoodsSample().hashCode());
        result = prime * result + ((getSampleGet() == null) ? 0 : getSampleGet().hashCode());
        result = prime * result + ((getDocs() == null) ? 0 : getDocs().hashCode());
        result = prime * result + ((getConfirm() == null) ? 0 : getConfirm().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getFpAmt() == null) ? 0 : getFpAmt().hashCode());
        result = prime * result + ((getPayAmt() == null) ? 0 : getPayAmt().hashCode());
        result = prime * result + ((getWhNo() == null) ? 0 : getWhNo().hashCode());
        result = prime * result + ((getnNo() == null) ? 0 : getnNo().hashCode());
        result = prime * result + ((getRealNo() == null) ? 0 : getRealNo().hashCode());
        result = prime * result + ((getManualNo() == null) ? 0 : getManualNo().hashCode());
        result = prime * result + ((getPayTerm() == null) ? 0 : getPayTerm().hashCode());
        result = prime * result + ((getOcId() == null) ? 0 : getOcId().hashCode());
        result = prime * result + ((getIsInstall() == null) ? 0 : getIsInstall().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getGjTerm() == null) ? 0 : getGjTerm().hashCode());
        result = prime * result + ((getNeedCalc() == null) ? 0 : getNeedCalc().hashCode());
        result = prime * result + ((getAccNo() == null) ? 0 : getAccNo().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCellId() == null) ? 0 : getCellId().hashCode());
        result = prime * result + ((getFctId() == null) ? 0 : getFctId().hashCode());
        result = prime * result + ((getKcType() == null) ? 0 : getKcType().hashCode());
        result = prime * result + ((getViewScope() == null) ? 0 : getViewScope().hashCode());
        result = prime * result + ((getPrompt() == null) ? 0 : getPrompt().hashCode());
        result = prime * result + ((getIsNeedSample() == null) ? 0 : getIsNeedSample().hashCode());
        result = prime * result + ((getIsGetSample() == null) ? 0 : getIsGetSample().hashCode());
        result = prime * result + ((getTrademode() == null) ? 0 : getTrademode().hashCode());
        result = prime * result + ((getCurrType() == null) ? 0 : getCurrType().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProType() == null) ? 0 : getProType().hashCode());
        result = prime * result + ((getSendOverTag() == null) ? 0 : getSendOverTag().hashCode());
        result = prime * result + ((getSendOverDate() == null) ? 0 : getSendOverDate().hashCode());
        result = prime * result + ((getFctOrderNo() == null) ? 0 : getFctOrderNo().hashCode());
        result = prime * result + ((getIsJsReal() == null) ? 0 : getIsJsReal().hashCode());
        result = prime * result + ((getCheckUserId() == null) ? 0 : getCheckUserId().hashCode());
        result = prime * result + ((getModifyUserId() == null) ? 0 : getModifyUserId().hashCode());
        result = prime * result + ((getCopyPartyNo() == null) ? 0 : getCopyPartyNo().hashCode());
        result = prime * result + ((getCopyPartyId() == null) ? 0 : getCopyPartyId().hashCode());
        result = prime * result + ((getCopyMoveNo() == null) ? 0 : getCopyMoveNo().hashCode());
        result = prime * result + ((getCopyMoveId() == null) ? 0 : getCopyMoveId().hashCode());
        result = prime * result + ((getIsJqOver() == null) ? 0 : getIsJqOver().hashCode());
        result = prime * result + ((getUndo() == null) ? 0 : getUndo().hashCode());
        result = prime * result + ((getIsZyOver() == null) ? 0 : getIsZyOver().hashCode());
        result = prime * result + ((getProducerId() == null) ? 0 : getProducerId().hashCode());
        result = prime * result + ((getProducerNo() == null) ? 0 : getProducerNo().hashCode());
        result = prime * result + ((getProducerName() == null) ? 0 : getProducerName().hashCode());
        result = prime * result + ((getGdTag() == null) ? 0 : getGdTag().hashCode());
        result = prime * result + ((getGdUserId() == null) ? 0 : getGdUserId().hashCode());
        result = prime * result + ((getGdDate() == null) ? 0 : getGdDate().hashCode());
        result = prime * result + ((getGjFctNo() == null) ? 0 : getGjFctNo().hashCode());
        result = prime * result + ((getGjFctId() == null) ? 0 : getGjFctId().hashCode());
        result = prime * result + ((getOcuOrgId() == null) ? 0 : getOcuOrgId().hashCode());
        result = prime * result + ((getSendTerm() == null) ? 0 : getSendTerm().hashCode());
        result = prime * result + ((getSendDay() == null) ? 0 : getSendDay().hashCode());
        result = prime * result + ((getSendoverDay() == null) ? 0 : getSendoverDay().hashCode());
        result = prime * result + ((getSendDate() == null) ? 0 : getSendDate().hashCode());
        result = prime * result + ((getSendoverDate() == null) ? 0 : getSendoverDate().hashCode());
        result = prime * result + ((getWhId() == null) ? 0 : getWhId().hashCode());
        result = prime * result + ((getWhName() == null) ? 0 : getWhName().hashCode());
        result = prime * result + ((getBcType() == null) ? 0 : getBcType().hashCode());
        result = prime * result + ((getTransWay() == null) ? 0 : getTransWay().hashCode());
        result = prime * result + ((getSignDate() == null) ? 0 : getSignDate().hashCode());
        result = prime * result + ((getcTerm() == null) ? 0 : getcTerm().hashCode());
        result = prime * result + ((getCstShortName() == null) ? 0 : getCstShortName().hashCode());
        result = prime * result + ((getTransCorpId() == null) ? 0 : getTransCorpId().hashCode());
        result = prime * result + ((getTransCorpName() == null) ? 0 : getTransCorpName().hashCode());
        result = prime * result + ((getOtherReq() == null) ? 0 : getOtherReq().hashCode());
        result = prime * result + ((getIsU8PurcharseReq() == null) ? 0 : getIsU8PurcharseReq().hashCode());
        result = prime * result + ((getIsMove() == null) ? 0 : getIsMove().hashCode());
        result = prime * result + ((getIsClose() == null) ? 0 : getIsClose().hashCode());
        result = prime * result + ((getCloseUserId() == null) ? 0 : getCloseUserId().hashCode());
        result = prime * result + ((getCloseDate() == null) ? 0 : getCloseDate().hashCode());
        result = prime * result + ((getIuOcuId() == null) ? 0 : getIuOcuId().hashCode());
        result = prime * result + ((getInlandOrOverseas() == null) ? 0 : getInlandOrOverseas().hashCode());
        result = prime * result + ((getTypeOfCon() == null) ? 0 : getTypeOfCon().hashCode());
        result = prime * result + ((getCloseConfirm() == null) ? 0 : getCloseConfirm().hashCode());
        result = prime * result + ((getDepOrgId() == null) ? 0 : getDepOrgId().hashCode());
        result = prime * result + ((getPurchaserId() == null) ? 0 : getPurchaserId().hashCode());
        result = prime * result + ((getCataOfCon() == null) ? 0 : getCataOfCon().hashCode());
        result = prime * result + ((getPropOfCon() == null) ? 0 : getPropOfCon().hashCode());
        result = prime * result + ((getBizMode() == null) ? 0 : getBizMode().hashCode());
        result = prime * result + ((getRelBcId() == null) ? 0 : getRelBcId().hashCode());
        result = prime * result + ((getConName() == null) ? 0 : getConName().hashCode());
        result = prime * result + ((getValidDate() == null) ? 0 : getValidDate().hashCode());
        result = prime * result + ((getSignPlace() == null) ? 0 : getSignPlace().hashCode());
        result = prime * result + ((getConContent() == null) ? 0 : getConContent().hashCode());
        result = prime * result + ((getSellerNationId() == null) ? 0 : getSellerNationId().hashCode());
        result = prime * result + ((getSellerProp() == null) ? 0 : getSellerProp().hashCode());
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
        result = prime * result + ((getCommissionId() == null) ? 0 : getCommissionId().hashCode());
        result = prime * result + ((getCommissionRate() == null) ? 0 : getCommissionRate().hashCode());
        result = prime * result + ((getCommissionCurrType() == null) ? 0 : getCommissionCurrType().hashCode());
        result = prime * result + ((getCommissionFee() == null) ? 0 : getCommissionFee().hashCode());
        result = prime * result + ((getShipmentWay() == null) ? 0 : getShipmentWay().hashCode());
        result = prime * result + ((getBoxDeliveryType() == null) ? 0 : getBoxDeliveryType().hashCode());
        result = prime * result + ((getDeliveryPlace() == null) ? 0 : getDeliveryPlace().hashCode());
        result = prime * result + ((getIsPlanSt() == null) ? 0 : getIsPlanSt().hashCode());
        result = prime * result + ((getProxyCorpId() == null) ? 0 : getProxyCorpId().hashCode());
        result = prime * result + ((getTransResp() == null) ? 0 : getTransResp().hashCode());
        result = prime * result + ((getTransFeeResp() == null) ? 0 : getTransFeeResp().hashCode());
        result = prime * result + ((getTransInsuResp() == null) ? 0 : getTransInsuResp().hashCode());
        result = prime * result + ((getArbitrationPlace() == null) ? 0 : getArbitrationPlace().hashCode());
        result = prime * result + ((getSuePlace() == null) ? 0 : getSuePlace().hashCode());
        result = prime * result + ((getIsNeedSpecDocu() == null) ? 0 : getIsNeedSpecDocu().hashCode());
        result = prime * result + ((getPricingWay() == null) ? 0 : getPricingWay().hashCode());
        result = prime * result + ((getPriceStandard() == null) ? 0 : getPriceStandard().hashCode());
        result = prime * result + ((getExamStandard() == null) ? 0 : getExamStandard().hashCode());
        result = prime * result + ((getConPeriod() == null) ? 0 : getConPeriod().hashCode());
        result = prime * result + ((getBailRate() == null) ? 0 : getBailRate().hashCode());
        result = prime * result + ((getProfitScheme() == null) ? 0 : getProfitScheme().hashCode());
        result = prime * result + ((getCommQuantPack() == null) ? 0 : getCommQuantPack().hashCode());
        result = prime * result + ((getCommQuantStat() == null) ? 0 : getCommQuantStat().hashCode());
        result = prime * result + ((getcStatus() == null) ? 0 : getcStatus().hashCode());
        result = prime * result + ((getCmdCataId() == null) ? 0 : getCmdCataId().hashCode());
        result = prime * result + ((getPriceTerm() == null) ? 0 : getPriceTerm().hashCode());
        result = prime * result + ((getFctName() == null) ? 0 : getFctName().hashCode());
        result = prime * result + ((getPurchaserName() == null) ? 0 : getPurchaserName().hashCode());
        result = prime * result + ((getSenderName() == null) ? 0 : getSenderName().hashCode());
        result = prime * result + ((getRecerName() == null) ? 0 : getRecerName().hashCode());
        result = prime * result + ((getCommissionName() == null) ? 0 : getCommissionName().hashCode());
        result = prime * result + ((getProxyCorpName() == null) ? 0 : getProxyCorpName().hashCode());
        result = prime * result + ((getAffectIncome() == null) ? 0 : getAffectIncome().hashCode());
        result = prime * result + ((getAffectIncomeRate() == null) ? 0 : getAffectIncomeRate().hashCode());
        result = prime * result + ((getManufacId() == null) ? 0 : getManufacId().hashCode());
        result = prime * result + ((getManufacName() == null) ? 0 : getManufacName().hashCode());
        result = prime * result + ((getU8OpId() == null) ? 0 : getU8OpId().hashCode());
        result = prime * result + ((getCnyRate() == null) ? 0 : getCnyRate().hashCode());
        result = prime * result + ((getUsdRate() == null) ? 0 : getUsdRate().hashCode());
        result = prime * result + ((getCurrRate() == null) ? 0 : getCurrRate().hashCode());
        result = prime * result + ((getShortOrOver() == null) ? 0 : getShortOrOver().hashCode());
        result = prime * result + ((getConPeriodSType() == null) ? 0 : getConPeriodSType().hashCode());
        result = prime * result + ((getCommUnit() == null) ? 0 : getCommUnit().hashCode());
        result = prime * result + ((getTradeOrSrv() == null) ? 0 : getTradeOrSrv().hashCode());
        result = prime * result + ((getTrSrvOrGoods() == null) ? 0 : getTrSrvOrGoods().hashCode());
        result = prime * result + ((getProfitSchemeDesc() == null) ? 0 : getProfitSchemeDesc().hashCode());
        return result;
    }
}