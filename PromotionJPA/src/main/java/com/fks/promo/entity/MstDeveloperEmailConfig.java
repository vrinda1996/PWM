package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the mst_developer_email_config database table.
 * 
 */
@Entity
@Table(name="mst_developer_email_config")
@NamedQuery(name="MstDeveloperEmailConfig.findAll", query="SELECT m FROM MstDeveloperEmailConfig m")
public class MstDeveloperEmailConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_id")
	private String empId;

	@Column(name="emp_email_id")
	private String empEmailId;

	@Column(name="emp_name")
	private String empName;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="user_id")
	private BigInteger userId;

	public MstDeveloperEmailConfig() {
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpEmailId() {
		return this.empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

}