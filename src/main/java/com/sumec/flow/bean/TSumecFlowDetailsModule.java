package com.sumec.flow.bean;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能描述：用于放置流程审批的多表查询结果的实体
 * Created by sunhc on 2018/2/28.
 */
public class TSumecFlowDetailsModule implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long intId;

	private Long fmId;

	private String refValue;

	private Long faId;

	private Long fsId;

	private Long userId;

	private Date dealTime;

	private String dealFlag;

	private Short dtlStep;

	private String notion;

	private Short seq;

	private String flag;

	private String isGd;

	private Long gdIntId;

	private Long grantUserId;

	private String isRead;

	private String dtlDesc;

	private String isEnd;

	private Date postTime;

	private Long spUserId;

	private String baked;

	private BigDecimal fmSeqId;

	private String dealWay;

	private String fmCode;

	private String fmName;

	private String tableName;

	private String pkColumn;

	private String fmViewName;

	private String dwObject;

	private String winformName;

	private String confirmColumn;

	private String allowGene;

	private String isDel;

	private Long orderId;

	private Long maId;

	private String grantDir;

	private String displayColumn;

	private String displayDw;

	private BigDecimal mobileFmId;

	private String callbackhandler;

	private String assistObject;

	public Long getIntId() {
		return intId;
	}

	public void setIntId(Long intId) {
		this.intId = intId;
	}

	public Long getFmId() {
		return fmId;
	}

	public void setFmId(Long fmId) {
		this.fmId = fmId;
	}

	public String getRefValue() {
		return refValue;
	}

	public void setRefValue(String refValue) {
		this.refValue = refValue;
	}

	public Long getFaId() {
		return faId;
	}

	public void setFaId(Long faId) {
		this.faId = faId;
	}

	public Long getFsId() {
		return fsId;
	}

	public void setFsId(Long fsId) {
		this.fsId = fsId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public String getDealFlag() {
		return dealFlag;
	}

	public void setDealFlag(String dealFlag) {
		this.dealFlag = dealFlag;
	}

	public Short getDtlStep() {
		return dtlStep;
	}

	public void setDtlStep(Short dtlStep) {
		this.dtlStep = dtlStep;
	}

	public String getNotion() {
		return notion;
	}

	public void setNotion(String notion) {
		this.notion = notion;
	}

	public Short getSeq() {
		return seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIsGd() {
		return isGd;
	}

	public void setIsGd(String isGd) {
		this.isGd = isGd;
	}

	public Long getGdIntId() {
		return gdIntId;
	}

	public void setGdIntId(Long gdIntId) {
		this.gdIntId = gdIntId;
	}

	public Long getGrantUserId() {
		return grantUserId;
	}

	public void setGrantUserId(Long grantUserId) {
		this.grantUserId = grantUserId;
	}

	public String getIsRead() {
		return isRead;
	}

	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}

	public String getDtlDesc() {
		return dtlDesc;
	}

	public void setDtlDesc(String dtlDesc) {
		this.dtlDesc = dtlDesc;
	}

	public String getIsEnd() {
		return isEnd;
	}

	public void setIsEnd(String isEnd) {
		this.isEnd = isEnd;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public Long getSpUserId() {
		return spUserId;
	}

	public void setSpUserId(Long spUserId) {
		this.spUserId = spUserId;
	}

	public String getBaked() {
		return baked;
	}

	public void setBaked(String baked) {
		this.baked = baked;
	}

	public BigDecimal getFmSeqId() {
		return fmSeqId;
	}

	public void setFmSeqId(BigDecimal fmSeqId) {
		this.fmSeqId = fmSeqId;
	}

	public String getDealWay() {
		return dealWay;
	}

	public void setDealWay(String dealWay) {
		this.dealWay = dealWay;
	}

	public String getFmCode() {
		return fmCode;
	}

	public void setFmCode(String fmCode) {
		this.fmCode = fmCode;
	}

	public String getFmName() {
		return fmName;
	}

	public void setFmName(String fmName) {
		this.fmName = fmName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getPkColumn() {
		return pkColumn;
	}

	public void setPkColumn(String pkColumn) {
		this.pkColumn = pkColumn;
	}

	public String getFmViewName() {
		return fmViewName;
	}

	public void setFmViewName(String fmViewName) {
		this.fmViewName = fmViewName;
	}

	public String getDwObject() {
		return dwObject;
	}

	public void setDwObject(String dwObject) {
		this.dwObject = dwObject;
	}

	public String getWinformName() {
		return winformName;
	}

	public void setWinformName(String winformName) {
		this.winformName = winformName;
	}

	public String getConfirmColumn() {
		return confirmColumn;
	}

	public void setConfirmColumn(String confirmColumn) {
		this.confirmColumn = confirmColumn;
	}

	public String getAllowGene() {
		return allowGene;
	}

	public void setAllowGene(String allowGene) {
		this.allowGene = allowGene;
	}

	public String getIsDel() {
		return isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getMaId() {
		return maId;
	}

	public void setMaId(Long maId) {
		this.maId = maId;
	}

	public String getGrantDir() {
		return grantDir;
	}

	public void setGrantDir(String grantDir) {
		this.grantDir = grantDir;
	}

	public String getDisplayColumn() {
		return displayColumn;
	}

	public void setDisplayColumn(String displayColumn) {
		this.displayColumn = displayColumn;
	}

	public String getDisplayDw() {
		return displayDw;
	}

	public void setDisplayDw(String displayDw) {
		this.displayDw = displayDw;
	}

	public BigDecimal getMobileFmId() {
		return mobileFmId;
	}

	public void setMobileFmId(BigDecimal mobileFmId) {
		this.mobileFmId = mobileFmId;
	}

	public String getCallbackhandler() {
		return callbackhandler;
	}

	public void setCallbackhandler(String callbackhandler) {
		this.callbackhandler = callbackhandler;
	}

	public String getAssistObject() {
		return assistObject;
	}

	public void setAssistObject(String assistObject) {
		this.assistObject = assistObject;
	}
}
