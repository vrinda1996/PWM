package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the self_conflict_resolution database table.
 * 
 */
@Entity
@Table(name="self_conflict_resolution")
@NamedQuery(name="SelfConflictResolution.findAll", query="SELECT s FROM SelfConflictResolution s")
public class SelfConflictResolution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="self_conflict_resolution_id")
	private String selfConflictResolutionId;

	private String article;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="delete_request")
	private byte deleteRequest;

	@Column(name="mc_code")
	private String mcCode;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_from")
	private Date validFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_to")
	private Date validTo;

	//bi-directional many-to-one association to ConflictFileDownloadStatus
	@ManyToOne
	@JoinColumn(name="batch_id")
	private ConflictFileDownloadStatus conflictFileDownloadStatus;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee;

	//bi-directional many-to-one association to MstPromo
	@ManyToOne
	@JoinColumn(name="promo_id")
	private MstPromo mstPromo;

	//bi-directional many-to-one association to TransPromo
	@ManyToOne
	@JoinColumn(name="trans_promo_id")
	private TransPromo transPromo;

	public SelfConflictResolution() {
	}

	public String getSelfConflictResolutionId() {
		return this.selfConflictResolutionId;
	}

	public void setSelfConflictResolutionId(String selfConflictResolutionId) {
		this.selfConflictResolutionId = selfConflictResolutionId;
	}

	public String getArticle() {
		return this.article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public byte getDeleteRequest() {
		return this.deleteRequest;
	}

	public void setDeleteRequest(byte deleteRequest) {
		this.deleteRequest = deleteRequest;
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

	public ConflictFileDownloadStatus getConflictFileDownloadStatus() {
		return this.conflictFileDownloadStatus;
	}

	public void setConflictFileDownloadStatus(ConflictFileDownloadStatus conflictFileDownloadStatus) {
		this.conflictFileDownloadStatus = conflictFileDownloadStatus;
	}

	public MstEmployee getMstEmployee() {
		return this.mstEmployee;
	}

	public void setMstEmployee(MstEmployee mstEmployee) {
		this.mstEmployee = mstEmployee;
	}

	public MstPromo getMstPromo() {
		return this.mstPromo;
	}

	public void setMstPromo(MstPromo mstPromo) {
		this.mstPromo = mstPromo;
	}

	public TransPromo getTransPromo() {
		return this.transPromo;
	}

	public void setTransPromo(TransPromo transPromo) {
		this.transPromo = transPromo;
	}

}