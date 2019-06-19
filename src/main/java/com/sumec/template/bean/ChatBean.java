package com.sumec.template.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>功能描述：添加功能描述.</p><br/>
 * 
 */
public class ChatBean implements Serializable{


    /**
	 * a.c_no, a.curr_type, a.p_amt, a.comm_id, a.p_quant, a.comm_unit, a.dep_org_id, a.ocu_org_id, a.cell_id, a.user_id
	 */
	private static final long serialVersionUID = 3201676683840645034L;

	private String cNo;
    
    private String currType;
    
    private BigDecimal pAmt;
    
    private Long commId;
    
    private BigDecimal pQuant;
    
    private Long commUnit;
    
    private Long depOrgId;
    
    private Long ocuOrgId;
    
    private Long cellId;
    
    private Long userId;

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getCurrType() {
		return currType;
	}

	public void setCurrType(String currType) {
		this.currType = currType;
	}

	public BigDecimal getpAmt() {
		return pAmt;
	}

	public void setpAmt(BigDecimal pAmt) {
		this.pAmt = pAmt;
	}

	public BigDecimal getpQuant() {
		return pQuant;
	}

	public void setpQuant(BigDecimal pQuant) {
		this.pQuant = pQuant;
	}

	public Long getDepOrgId() {
		return depOrgId;
	}

	public void setDepOrgId(Long depOrgId) {
		this.depOrgId = depOrgId;
	}

	public Long getOcuOrgId() {
		return ocuOrgId;
	}

	public void setOcuOrgId(Long ocuOrgId) {
		this.ocuOrgId = ocuOrgId;
	}

	public Long getCellId() {
		return cellId;
	}

	public void setCellId(Long cellId) {
		this.cellId = cellId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCommId() {
		return commId;
	}

	public void setCommId(Long commId) {
		this.commId = commId;
	}

	public Long getCommUnit() {
		return commUnit;
	}

	public void setCommUnit(Long commUnit) {
		this.commUnit = commUnit;
	}
}
