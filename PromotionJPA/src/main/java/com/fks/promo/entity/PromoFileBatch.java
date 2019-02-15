package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the promo_file_batch database table.
 * 
 */
@Entity
@Table(name="promo_file_batch")
@NamedQuery(name="PromoFileBatch.findAll", query="SELECT p FROM PromoFileBatch p")
public class PromoFileBatch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="promo_file_batch_id")
	private String promoFileBatchId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="file_batch_no")
	private String fileBatchNo;

	//bi-directional many-to-one association to ConflictFileDownloadStatus
	@OneToMany(mappedBy="promoFileBatch")
	private List<ConflictFileDownloadStatus> conflictFileDownloadStatuses;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="created_by")
	private MstEmployee mstEmployee;

	//bi-directional many-to-one association to ThreeLevelDupBatchMaster
	@OneToMany(mappedBy="promoFileBatch")
	private List<ThreeLevelDupBatchMaster> threeLevelDupBatchMasters;

	//bi-directional many-to-one association to TransPromoModification
	@OneToMany(mappedBy="promoFileBatch")
	private List<TransPromoModification> transPromoModifications;

	public PromoFileBatch() {
	}

	public String getPromoFileBatchId() {
		return this.promoFileBatchId;
	}

	public void setPromoFileBatchId(String promoFileBatchId) {
		this.promoFileBatchId = promoFileBatchId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getFileBatchNo() {
		return this.fileBatchNo;
	}

	public void setFileBatchNo(String fileBatchNo) {
		this.fileBatchNo = fileBatchNo;
	}

	public List<ConflictFileDownloadStatus> getConflictFileDownloadStatuses() {
		return this.conflictFileDownloadStatuses;
	}

	public void setConflictFileDownloadStatuses(List<ConflictFileDownloadStatus> conflictFileDownloadStatuses) {
		this.conflictFileDownloadStatuses = conflictFileDownloadStatuses;
	}

	public ConflictFileDownloadStatus addConflictFileDownloadStatus(ConflictFileDownloadStatus conflictFileDownloadStatus) {
		getConflictFileDownloadStatuses().add(conflictFileDownloadStatus);
		conflictFileDownloadStatus.setPromoFileBatch(this);

		return conflictFileDownloadStatus;
	}

	public ConflictFileDownloadStatus removeConflictFileDownloadStatus(ConflictFileDownloadStatus conflictFileDownloadStatus) {
		getConflictFileDownloadStatuses().remove(conflictFileDownloadStatus);
		conflictFileDownloadStatus.setPromoFileBatch(null);

		return conflictFileDownloadStatus;
	}

	public MstEmployee getMstEmployee() {
		return this.mstEmployee;
	}

	public void setMstEmployee(MstEmployee mstEmployee) {
		this.mstEmployee = mstEmployee;
	}

	public List<ThreeLevelDupBatchMaster> getThreeLevelDupBatchMasters() {
		return this.threeLevelDupBatchMasters;
	}

	public void setThreeLevelDupBatchMasters(List<ThreeLevelDupBatchMaster> threeLevelDupBatchMasters) {
		this.threeLevelDupBatchMasters = threeLevelDupBatchMasters;
	}

	public ThreeLevelDupBatchMaster addThreeLevelDupBatchMaster(ThreeLevelDupBatchMaster threeLevelDupBatchMaster) {
		getThreeLevelDupBatchMasters().add(threeLevelDupBatchMaster);
		threeLevelDupBatchMaster.setPromoFileBatch(this);

		return threeLevelDupBatchMaster;
	}

	public ThreeLevelDupBatchMaster removeThreeLevelDupBatchMaster(ThreeLevelDupBatchMaster threeLevelDupBatchMaster) {
		getThreeLevelDupBatchMasters().remove(threeLevelDupBatchMaster);
		threeLevelDupBatchMaster.setPromoFileBatch(null);

		return threeLevelDupBatchMaster;
	}

	public List<TransPromoModification> getTransPromoModifications() {
		return this.transPromoModifications;
	}

	public void setTransPromoModifications(List<TransPromoModification> transPromoModifications) {
		this.transPromoModifications = transPromoModifications;
	}

	public TransPromoModification addTransPromoModification(TransPromoModification transPromoModification) {
		getTransPromoModifications().add(transPromoModification);
		transPromoModification.setPromoFileBatch(this);

		return transPromoModification;
	}

	public TransPromoModification removeTransPromoModification(TransPromoModification transPromoModification) {
		getTransPromoModifications().remove(transPromoModification);
		transPromoModification.setPromoFileBatch(null);

		return transPromoModification;
	}

}