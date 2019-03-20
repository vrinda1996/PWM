package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the conflict_resolution_transaction database table.
 * 
 */
@Entity
@Table(name="conflict_resolution_transaction")
@NamedQuery(name="ConflictResolutionTransaction.findAll", query="SELECT c FROM ConflictResolutionTransaction c")
public class ConflictResolutionTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="conflict_resolution_transaction_id")
	private String conflictResolutionTransactionId;

	@Column(name="batch_id")
	private BigInteger batchId;

	@Column(name="created_by")
	private BigInteger createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Lob
	@Column(name="removed_article_details")
	private String removedArticleDetails;

	@Column(name="request_id")
	private BigInteger requestId;

	@Column(name="request_status_id")
	private BigInteger requestStatusId;

	@Column(name="request_type")
	private String requestType;

	@Column(name="ticket_id")
	private BigInteger ticketId;

	@Column(name="ticket_type")
	private String ticketType;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_from")
	private Date validFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_to")
	private Date validTo;

	public ConflictResolutionTransaction() {
	}

	public String getConflictResolutionTransactionId() {
		return this.conflictResolutionTransactionId;
	}

	public void setConflictResolutionTransactionId(String conflictResolutionTransactionId) {
		this.conflictResolutionTransactionId = conflictResolutionTransactionId;
	}

	public BigInteger getBatchId() {
		return this.batchId;
	}

	public void setBatchId(BigInteger batchId) {
		this.batchId = batchId;
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

	public String getRemovedArticleDetails() {
		return this.removedArticleDetails;
	}

	public void setRemovedArticleDetails(String removedArticleDetails) {
		this.removedArticleDetails = removedArticleDetails;
	}

	public BigInteger getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigInteger requestId) {
		this.requestId = requestId;
	}

	public BigInteger getRequestStatusId() {
		return this.requestStatusId;
	}

	public void setRequestStatusId(BigInteger requestStatusId) {
		this.requestStatusId = requestStatusId;
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public BigInteger getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(BigInteger ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
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

}