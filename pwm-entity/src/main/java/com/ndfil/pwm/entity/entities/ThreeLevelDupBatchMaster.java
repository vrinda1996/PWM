package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the three_level_dup_batch_master database table.
 * 
 */
@Entity
@Table(name="three_level_dup_batch_master")
@NamedQuery(name="ThreeLevelDupBatchMaster.findAll", query="SELECT t FROM ThreeLevelDupBatchMaster t")
public class ThreeLevelDupBatchMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="batch_id")
	private String batchId;

	@Column(name="batch_action")
	private String batchAction;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="dup_type")
	private int dupType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="file_status")
	private byte fileStatus;

	@Column(name="request_count")
	private int requestCount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="resolution_end_time")
	private Date resolutionEndTime;

	@Column(name="resolution_file_path")
	private String resolutionFilePath;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="resolution_start_time")
	private Date resolutionStartTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	@Column(name="status_file_path")
	private String statusFilePath;

	@Lob
	@Column(name="trans_promo_ids")
	private String transPromoIds;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	@Column(name="uploaded_file_path")
	private String uploadedFilePath;

	@Column(name="view_file_path")
	private String viewFilePath;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee1;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="updated_by")
	private MstEmployee mstEmployee2;

	//bi-directional many-to-one association to MstStatus
	@ManyToOne
	@JoinColumn(name="status_id")
	private MstStatus mstStatus;

	//bi-directional many-to-one association to PromoFileBatch
	@ManyToOne
	@JoinColumn(name="promo_file_batch_key")
	private PromoFileBatch promoFileBatch;

	public ThreeLevelDupBatchMaster() {
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchAction() {
		return this.batchAction;
	}

	public void setBatchAction(String batchAction) {
		this.batchAction = batchAction;
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

	public byte getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(byte fileStatus) {
		this.fileStatus = fileStatus;
	}

	public int getRequestCount() {
		return this.requestCount;
	}

	public void setRequestCount(int requestCount) {
		this.requestCount = requestCount;
	}

	public Date getResolutionEndTime() {
		return this.resolutionEndTime;
	}

	public void setResolutionEndTime(Date resolutionEndTime) {
		this.resolutionEndTime = resolutionEndTime;
	}

	public String getResolutionFilePath() {
		return this.resolutionFilePath;
	}

	public void setResolutionFilePath(String resolutionFilePath) {
		this.resolutionFilePath = resolutionFilePath;
	}

	public Date getResolutionStartTime() {
		return this.resolutionStartTime;
	}

	public void setResolutionStartTime(Date resolutionStartTime) {
		this.resolutionStartTime = resolutionStartTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatusFilePath() {
		return this.statusFilePath;
	}

	public void setStatusFilePath(String statusFilePath) {
		this.statusFilePath = statusFilePath;
	}

	public String getTransPromoIds() {
		return this.transPromoIds;
	}

	public void setTransPromoIds(String transPromoIds) {
		this.transPromoIds = transPromoIds;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUploadedFilePath() {
		return this.uploadedFilePath;
	}

	public void setUploadedFilePath(String uploadedFilePath) {
		this.uploadedFilePath = uploadedFilePath;
	}

	public String getViewFilePath() {
		return this.viewFilePath;
	}

	public void setViewFilePath(String viewFilePath) {
		this.viewFilePath = viewFilePath;
	}

	public MstEmployee getMstEmployee1() {
		return this.mstEmployee1;
	}

	public void setMstEmployee1(MstEmployee mstEmployee1) {
		this.mstEmployee1 = mstEmployee1;
	}

	public MstEmployee getMstEmployee2() {
		return this.mstEmployee2;
	}

	public void setMstEmployee2(MstEmployee mstEmployee2) {
		this.mstEmployee2 = mstEmployee2;
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

}