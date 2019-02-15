package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the trans_promo_date_modification database table.
 * 
 */
@Entity
@Table(name="trans_promo_date_modification")
@NamedQuery(name="TransPromoDateModification.findAll", query="SELECT t FROM TransPromoDateModification t")
public class TransPromoDateModification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trans_promo_date_modification_id")
	private String transPromoDateModificationId;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="new_valid_from")
	private Date newValidFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="new_valid_to")
	private Date newValidTo;

	@Temporal(TemporalType.DATE)
	@Column(name="previous_valid_from")
	private Date previousValidFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="previous_valid_to")
	private Date previousValidTo;

	private String remarks;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to TransPromo
	@ManyToOne
	@JoinColumn(name="trans_promo_id")
	private TransPromo transPromo;

	public TransPromoDateModification() {
	}

	public String getTransPromoDateModificationId() {
		return this.transPromoDateModificationId;
	}

	public void setTransPromoDateModificationId(String transPromoDateModificationId) {
		this.transPromoDateModificationId = transPromoDateModificationId;
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

	public Date getNewValidFrom() {
		return this.newValidFrom;
	}

	public void setNewValidFrom(Date newValidFrom) {
		this.newValidFrom = newValidFrom;
	}

	public Date getNewValidTo() {
		return this.newValidTo;
	}

	public void setNewValidTo(Date newValidTo) {
		this.newValidTo = newValidTo;
	}

	public Date getPreviousValidFrom() {
		return this.previousValidFrom;
	}

	public void setPreviousValidFrom(Date previousValidFrom) {
		this.previousValidFrom = previousValidFrom;
	}

	public Date getPreviousValidTo() {
		return this.previousValidTo;
	}

	public void setPreviousValidTo(Date previousValidTo) {
		this.previousValidTo = previousValidTo;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public TransPromo getTransPromo() {
		return this.transPromo;
	}

	public void setTransPromo(TransPromo transPromo) {
		this.transPromo = transPromo;
	}

}