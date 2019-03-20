package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the mst_user_type database table.
 * 
 */
@Entity
@Table(name="mst_user_type")
@NamedQuery(name="MstUserType.findAll", query="SELECT m FROM MstUserType m")
public class MstUserType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mst_user_type_id")
	private String mstUserTypeId;

	@Column(name="created_by")
	private BigInteger createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="updated_by")
	private BigInteger updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="user_type_name")
	private String userTypeName;

	public MstUserType() {
	}

	public String getMstUserTypeId() {
		return this.mstUserTypeId;
	}

	public void setMstUserTypeId(String mstUserTypeId) {
		this.mstUserTypeId = mstUserTypeId;
	}

	public BigInteger getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public BigInteger getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigInteger updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUserTypeName() {
		return this.userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

}