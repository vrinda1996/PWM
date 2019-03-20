package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the trans_promo_vistex database table.
 * 
 */
@Entity
@Table(name="trans_promo_vistex")
@NamedQuery(name="TransPromoVistex.findAll", query="SELECT t FROM TransPromoVistex t")
public class TransPromoVistex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trans_promo_vistex_id")
	private String transPromoVistexId;

	@Temporal(TemporalType.DATE)
	@Column(name="crt_date")
	private Date crtDate;

	@Column(name="trans_promo_id")
	private BigInteger transPromoId;

	public TransPromoVistex() {
	}

	public String getTransPromoVistexId() {
		return this.transPromoVistexId;
	}

	public void setTransPromoVistexId(String transPromoVistexId) {
		this.transPromoVistexId = transPromoVistexId;
	}

	public Date getCrtDate() {
		return this.crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	public BigInteger getTransPromoId() {
		return this.transPromoId;
	}

	public void setTransPromoId(BigInteger transPromoId) {
		this.transPromoId = transPromoId;
	}

}