package com.sumec.contract.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.sumec.contract.entity.TExpBcCmd;
/**
 * 
 * 功能描述：新采购合同表.<br/>
 * 
 * #date： 2017年8月31日 上午11:08:37<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
public class TExpBcBean implements Serializable {
    private BigDecimal bcId;

    private String cNo;

    private String cType;

    private BigDecimal pQuant;

    private BigDecimal pAmt;

    private String payTerm;

    private BigDecimal cellId;
    
    private String cellName;

    private BigDecimal fctId;

    private String currType;

    private Long ocuOrgId;
    
    private String ocuOrgName;

    private String sendTerm;

    private Long depOrgId;
    
    private String depOrgName;

    private Long purchaserId;

    private String bizMode;

    private Long destNationId;
    
    private String destNationName;

    private Long cmdCataId;
    
    private String cmdCataName;

    private String trademode;
    
    private String priceTerm;

    private String fctName;

    private String purchaserName;

    private List<TExpBcCmd> bcCmd;
    
    private List<ContractRelBean> relCon;
    
    private List<AttachmentRel> relAttachment;
    
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

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
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

    public String getPayTerm() {
        return payTerm;
    }

    public void setPayTerm(String payTerm) {
        this.payTerm = payTerm;
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

    public String getCurrType() {
        return currType;
    }

    public void setCurrType(String currType) {
        this.currType = currType;
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

    public String getBizMode() {
        return bizMode;
    }

    public void setBizMode(String bizMode) {
        this.bizMode = bizMode;
    }

    public Long getDestNationId() {
        return destNationId;
    }

    public void setDestNationId(Long destNationId) {
        this.destNationId = destNationId;
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

    public String getCellName(){
        return cellName;
    }

    public void setCellName(String cellName){
        this.cellName = cellName;
    }

    public String getOcuOrgName(){
        return ocuOrgName;
    }

    public void setOcuOrgName(String ocuOrgName){
        this.ocuOrgName = ocuOrgName;
    }

    public String getDepOrgName(){
        return depOrgName;
    }

    public void setDepOrgName(String depOrgName){
        this.depOrgName = depOrgName;
    }

    public String getDestNationName(){
        return destNationName;
    }

    public void setDestNationName(String destNationName){
        this.destNationName = destNationName;
    }

    public String getCmdCataName(){
        return cmdCataName;
    }

    public void setCmdCataName(String cmdCataName){
        this.cmdCataName = cmdCataName;
    }

    public String getTrademode(){
        return trademode;
    }

    public void setTrademode(String trademode){
        this.trademode = trademode;
    }

    public List<TExpBcCmd> getBcCmd(){
        return bcCmd;
    }

    public void setBcCmd(List<TExpBcCmd> bcCmd){
        this.bcCmd = bcCmd;
    }

    public List<ContractRelBean> getRelCon(){
        return relCon;
    }

    public void setRelCon(List<ContractRelBean> relCon){
        this.relCon = relCon;
    }

    public List<AttachmentRel> getRelAttachment(){
        return relAttachment;
    }

    public void setRelAttachment(List<AttachmentRel> relAttachment){
        this.relAttachment = relAttachment;
    }
    
}