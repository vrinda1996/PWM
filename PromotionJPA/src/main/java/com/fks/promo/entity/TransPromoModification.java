package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the trans_promo_modification database table.
 * 
 */
@Entity
@Table(name="trans_promo_modification")
@NamedQuery(name="TransPromoModification.findAll", query="SELECT t FROM TransPromoModification t")
public class TransPromoModification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trans_promo_modification_id")
	private String transPromoModificationId;

	private String actions;

	private String article;

	@Column(name="avm_flag")
	private String avmFlag;

	@Column(name="base_ticket")
	private BigInteger baseTicket;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="is_duplicate")
	private byte isDuplicate;

	@Column(name="request_type")
	private String requestType;

	@Column(name="set_id")
	private int setId;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_from")
	private Date validFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="valid_to")
	private Date validTo;

	//bi-directional many-to-one association to Mch
	@ManyToOne
	@JoinColumn(name="mc_code")
	private Mch mch;

	//bi-directional many-to-one association to PromoFileBatch
	@ManyToOne
	@JoinColumn(name="promo_file_batch_key")
	private PromoFileBatch promoFileBatch;

	//bi-directional many-to-one association to MstPromo
	@ManyToOne
	@JoinColumn(name="promo_id")
	private MstPromo mstPromo;

	//bi-directional many-to-one association to TransPromo
	@ManyToOne
	@JoinColumn(name="trans_promo_id")
	private TransPromo transPromo;

	//bi-directional many-to-one association to MstPromotionType
	@ManyToOne
	@JoinColumn(name="promo_type_id")
	private MstPromotionType mstPromotionType;

	public TransPromoModification() {
	}

	public String getTransPromoModificationId() {
		return this.transPromoModificationId;
	}

	public void setTransPromoModificationId(String transPromoModificationId) {
		this.transPromoModificationId = transPromoModificationId;
	}

	public String getActions() {
		return this.actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public String getArticle() {
		return this.article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getAvmFlag() {
		return this.avmFlag;
	}

	public void setAvmFlag(String avmFlag) {
		this.avmFlag = avmFlag;
	}

	public BigInteger getBaseTicket() {
		return this.baseTicket;
	}

	public void setBaseTicket(BigInteger baseTicket) {
		this.baseTicket = baseTicket;
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

	public byte getIsDuplicate() {
		return this.isDuplicate;
	}

	public void setIsDuplicate(byte isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public int getSetId() {
		return this.setId;
	}

	public void setSetId(int setId) {
		this.setId = setId;
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

	public Mch getMch() {
		return this.mch;
	}

	public void setMch(Mch mch) {
		this.mch = mch;
	}

	public PromoFileBatch getPromoFileBatch() {
		return this.promoFileBatch;
	}

	public void setPromoFileBatch(PromoFileBatch promoFileBatch) {
		this.promoFileBatch = promoFileBatch;
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

	public MstPromotionType getMstPromotionType() {
		return this.mstPromotionType;
	}

	public void setMstPromotionType(MstPromotionType mstPromotionType) {
		this.mstPromotionType = mstPromotionType;
	}

}