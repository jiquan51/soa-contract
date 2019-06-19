package com.sumec.template.bean;

import java.io.Serializable;

/**
 * <p>
 * 功能描述：创建同步用户参数.
 * </p>
 * <br/>
 */
public class User implements Serializable {

	private static final long serialVersionUID = -3416246115868948971L;

	private Long orgid;
	private Long id;
	private String fullname;
	private String mobile;
	private String sex;
	private String telephone;
	private String email;

	public Long getOrgid() {
		return orgid;
	}

	public void setOrgid(Long orgid) {
		this.orgid = orgid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
