package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the trans_promo_wak1 database table.
 * 
 */
@Entity
@Table(name="trans_promo_wak1")
@NamedQuery(name="TransPromoWak1.findAll", query="SELECT t FROM TransPromoWak1 t")
public class TransPromoWak1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trans_promo_wak1_id")
	private String transPromoWak1Id;

	private String bb;

	@Column(name="bb_desc")
	private String bbDesc;

	@Column(name="bb_desc1")
	private String bbDesc1;

	@Column(name="bb_format")
	private String bbFormat;

	private String event;

	private String frm;

	@Column(name="promo_id")
	private BigInteger promoId;

	@Column(name="sap_push_status")
	private BigInteger sapPushStatus;

	private String stgrp;

	@Column(name="ticket_no")
	private BigInteger ticketNo;

	private String tto;

	public TransPromoWak1() {
	}

	public String getTransPromoWak1Id() {
		return this.transPromoWak1Id;
	}

	public void setTransPromoWak1Id(String transPromoWak1Id) {
		this.transPromoWak1Id = transPromoWak1Id;
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

	public String getBbDesc1() {
		return this.bbDesc1;
	}

	public void setBbDesc1(String bbDesc1) {
		this.bbDesc1 = bbDesc1;
	}

	public String getBbFormat() {
		return this.bbFormat;
	}

	public void setBbFormat(String bbFormat) {
		this.bbFormat = bbFormat;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getFrm() {
		return this.frm;
	}

	public void setFrm(String frm) {
		this.frm = frm;
	}

	public BigInteger getPromoId() {
		return this.promoId;
	}

	public void setPromoId(BigInteger promoId) {
		this.promoId = promoId;
	}

	public BigInteger getSapPushStatus() {
		return this.sapPushStatus;
	}

	public void setSapPushStatus(BigInteger sapPushStatus) {
		this.sapPushStatus = sapPushStatus;
	}

	public String getStgrp() {
		return this.stgrp;
	}

	public void setStgrp(String stgrp) {
		this.stgrp = stgrp;
	}

	public BigInteger getTicketNo() {
		return this.ticketNo;
	}

	public void setTicketNo(BigInteger ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getTto() {
		return this.tto;
	}

	public void setTto(String tto) {
		this.tto = tto;
	}

}