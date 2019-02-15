package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the trans_promo_wak2 database table.
 * 
 */
@Entity
@Table(name="trans_promo_wak2")
@NamedQuery(name="TransPromoWak2.findAll", query="SELECT t FROM TransPromoWak2 t")
public class TransPromoWak2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trans_promo_wak2_id")
	private String transPromoWak2Id;

	private String art;

	private String bb;

	@Column(name="bb_desc")
	private String bbDesc;

	private String bb1;

	private String cc;

	@Column(name="company_code")
	private String companyCode;

	@Column(name="discount_type")
	private String discountType;

	@Column(name="discount_value")
	private double discountValue;

	private String distr;

	private BigInteger grouping;

	@Column(name="promo_id")
	private BigInteger promoId;

	@Column(name="sap_discount_value")
	private String sapDiscountValue;

	@Column(name="sap_grouping")
	private String sapGrouping;

	@Column(name="sap_push_status")
	private BigInteger sapPushStatus;

	private String scaling;

	@Column(name="ticket_no")
	private BigInteger ticketNo;

	public TransPromoWak2() {
	}

	public String getTransPromoWak2Id() {
		return this.transPromoWak2Id;
	}

	public void setTransPromoWak2Id(String transPromoWak2Id) {
		this.transPromoWak2Id = transPromoWak2Id;
	}

	public String getArt() {
		return this.art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getBb() {
		return this.bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

	public String getBbDesc() {
		return this.bbDesc;
	}

	public void setBbDesc(String bbDesc) {
		this.bbDesc = bbDesc;
	}

	public String getBb1() {
		return this.bb1;
	}

	public void setBb1(String bb1) {
		this.bb1 = bb1;
	}

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public double getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

	public String getDistr() {
		return this.distr;
	}

	public void setDistr(String distr) {
		this.distr = distr;
	}

	public BigInteger getGrouping() {
		return this.grouping;
	}

	public void setGrouping(BigInteger grouping) {
		this.grouping = grouping;
	}

	public BigInteger getPromoId() {
		return this.promoId;
	}

	public void setPromoId(BigInteger promoId) {
		this.promoId = promoId;
	}

	public String getSapDiscountValue() {
		return this.sapDiscountValue;
	}

	public void setSapDiscountValue(String sapDiscountValue) {
		this.sapDiscountValue = sapDiscountValue;
	}

	public String getSapGrouping() {
		return this.sapGrouping;
	}

	public void setSapGrouping(String sapGrouping) {
		this.sapGrouping = sapGrouping;
	}

	public BigInteger getSapPushStatus() {
		return this.sapPushStatus;
	}

	public void setSapPushStatus(BigInteger sapPushStatus) {
		this.sapPushStatus = sapPushStatus;
	}

	public String getScaling() {
		return this.scaling;
	}

	public void setScaling(String scaling) {
		this.scaling = scaling;
	}

	public BigInteger getTicketNo() {
		return this.ticketNo;
	}

	public void setTicketNo(BigInteger ticketNo) {
		this.ticketNo = ticketNo;
	}

}