package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the mst_leadtime_mc database table.
 * 
 */
@Entity
@Table(name="mst_leadtime_mc")
@NamedQuery(name="MstLeadtimeMc.findAll", query="SELECT m FROM MstLeadtimeMc m")
public class MstLeadtimeMc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lead_id")
	private String leadId;

	private int hours;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="mc_code")
	private String mcCode;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_from")
	private Date validFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_to")
	private Date validTo;

	@Column(name="zone_id")
	private BigInteger zoneId;

	public MstLeadtimeMc() {
	}

	public String getLeadId() {
		return this.leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getMcCode() {
		return this.mcCode;
	}

	public void setMcCode(String mcCode) {
		this.mcCode = mcCode;
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