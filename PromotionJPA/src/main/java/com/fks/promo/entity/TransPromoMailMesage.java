package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the trans_promo_mail_mesage database table.
 * 
 */
@Entity
@Table(name="trans_promo_mail_mesage")
@NamedQuery(name="TransPromoMailMesage.findAll", query="SELECT t FROM TransPromoMailMesage t")
public class TransPromoMailMesage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mail_date")
	private Date mailDate;

	@Lob
	private byte[] msg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="send_date")
	private Date sendDate;

	@Column(name="status_id")
	private int statusId;

	public TransPromoMailMesage() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getMailDate() {
		return this.mailDate;
	}

	public void setMailDate(Date mailDate) {
		this.mailDate = mailDate;
	}

	public byte[] getMsg() {
		return this.msg;
	}

	public void setMsg(byte[] msg) {
		this.msg = msg;
	}

	public Date getSendDate() {
		return this.sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

}