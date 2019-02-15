package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the auto_integrated_report_request database table.
 * 
 */
@Entity
@Table(name="auto_integrated_report_request")
@NamedQuery(name="AutoIntegratedReportRequest.findAll", query="SELECT a FROM AutoIntegratedReportRequest a")
public class AutoIntegratedReportRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="auto_integrated_report_request_id")
	private String autoIntegratedReportRequestId;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="is_active")
	private byte isActive;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	public AutoIntegratedReportRequest() {
	}

	public String getAutoIntegratedReportRequestId() {
		return this.autoIntegratedReportRequestId;
	}

	public void setAutoIntegratedReportRequestId(String autoIntegratedReportRequestId) {
		this.autoIntegratedReportRequestId = autoIntegratedReportRequestId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}