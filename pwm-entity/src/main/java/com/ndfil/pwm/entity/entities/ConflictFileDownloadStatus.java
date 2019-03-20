package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the conflict_file_download_status database table.
 * 
 */
@Entity
@Table(name="conflict_file_download_status")
@NamedQuery(name="ConflictFileDownloadStatus.findAll", query="SELECT c FROM ConflictFileDownloadStatus c")
public class ConflictFileDownloadStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="batch_id")
	private String batchId;

	private String action;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="dup_type")
	private int dupType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="file_path")
	private String filePath;

	@Column(name="request_count")
	private int requestCount;

	@Column(name="selected_request_id")
	private String selectedRequestId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee;

	//bi-directional many-to-one association to MstStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private MstStatus mstStatus;

	//bi-directional many-to-one association to PromoFileBatch
	@ManyToOne
	@JoinColumn(name="promo_file_batch_key")
	private PromoFileBatch promoFileBatch;

	//bi-directional many-to-one association to SelfConflictResolution
	@OneToMany(mappedBy="conflictFileDownloadStatus")
	private List<SelfConflictResolution> selfConflictResolutions;

	public ConflictFileDownloadStatus() {
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getDupType() {
		return this.dupType;
	}

	public void setDupType(int dupType) {
		this.dupType = dupType;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getRequestCount() {
		return this.requestCount;
	}

	public void setRequestCount(int requestCount) {
		this.requestCount = requestCount;
	}

	public String getSelectedRequestId() {
		return this.selectedRequestId;
	}

	public void setSelectedRequestId(String selectedRequestId) {
		this.selectedRequestId = selectedRequestId;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public MstEmployee getMstEmployee() {
		return this.mstEmployee;
	}

	public void setMstEmployee(MstEmployee mstEmployee) {
		this.mstEmployee = mstEmployee;
	}

	public MstStatus getMstStatus() {
		return this.mstStatus;
	}

	public void setMstStatus(MstStatus mstStatus) {
		this.mstStatus = mstStatus;
	}

	public PromoFileBatch getPromoFileBatch() {
		return this.promoFileBatch;
	}

	public void setPromoFileBatch(PromoFileBatch promoFileBatch) {
		this.promoFileBatch = promoFileBatch;
	}

	public List<SelfConflictResolution> getSelfConflictResolutions() {
		return this.selfConflictResolutions;
	}

	public void setSelfConflictResolutions(List<SelfConflictResolution> selfConflictResolutions) {
		this.selfConflictResolutions = selfConflictResolutions;
	}

	public SelfConflictResolution addSelfConflictResolution(SelfConflictResolution selfConflictResolution) {
		getSelfConflictResolutions().add(selfConflictResolution);
		selfConflictResolution.setConflictFileDownloadStatus(this);

		return selfConflictResolution;
	}

	public SelfConflictResolution removeSelfConflictResolution(SelfConflictResolution selfConflictResolution) {
		getSelfConflictResolutions().remove(selfConflictResolution);
		selfConflictResolution.setConflictFileDownloadStatus(null);

		return selfConflictResolution;
	}

}