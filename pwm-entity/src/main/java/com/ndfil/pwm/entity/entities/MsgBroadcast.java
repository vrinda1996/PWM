package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the msg_broadcast database table.
 * 
 */
@Entity
@Table(name="msg_broadcast")
@NamedQuery(name="MsgBroadcast.findAll", query="SELECT m FROM MsgBroadcast m")
public class MsgBroadcast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="msg_id")
	private String msgId;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_active")
	private byte isActive;

	private String msg;

	@Column(name="role_id")
	private BigInteger roleId;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_from")
	private Date validFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_to")
	private Date validTo;

	@Column(name="zone_id")
	private BigInteger zoneId;

	public MsgBroadcast() {
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
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

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public BigInteger getRoleId() {
		return this.roleId;
	}

	public void setRoleId(BigInteger roleId) {
		this.roleId = roleId;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return this.validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public BigInteger getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(BigInteger zoneId) {
		this.zoneId = zoneId;
	}

}