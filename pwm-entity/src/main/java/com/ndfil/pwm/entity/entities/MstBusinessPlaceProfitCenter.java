package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the mst_business_place_profit_center database table.
 * 
 */
@Entity
@Table(name="mst_business_place_profit_center")
@NamedQuery(name="MstBusinessPlaceProfitCenter.findAll", query="SELECT m FROM MstBusinessPlaceProfitCenter m")
public class MstBusinessPlaceProfitCenter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="business_place_profit_center_id")
	private String businessPlaceProfitCenterId;

	@Column(name="business_place")
	private BigInteger businessPlace;

	@Column(name="profit_center")
	private BigInteger profitCenter;

	//bi-directional many-to-one association to Mch
	@ManyToOne
	@JoinColumn(name="mc_code")
	private Mch mch;

	//bi-directional many-to-one association to MstZone
	@ManyToOne
	@JoinColumn(name="zone_id")
	private MstZone mstZone;

	public MstBusinessPlaceProfitCenter() {
	}

	public String getBusinessPlaceProfitCenterId() {
		return this.businessPlaceProfitCenterId;
	}

	public void setBusinessPlaceProfitCenterId(String businessPlaceProfitCenterId) {
		this.businessPlaceProfitCenterId = businessPlaceProfitCenterId;
	}

	public BigInteger getBusinessPlace() {
		return this.businessPlace;
	}

	public void setBusinessPlace(BigInteger businessPlace) {
		this.businessPlace = businessPlace;
	}

	public BigInteger getProfitCenter() {
		return this.profitCenter;
	}

	public void setProfitCenter(BigInteger profitCenter) {
		this.profitCenter = profitCenter;
	}

	public Mch getMch() {
		return this.mch;
	}

	public void setMch(Mch mch) {
		this.mch = mch;
	}

	public MstZone getMstZone() {
		return this.mstZone;
	}

	public void setMstZone(MstZone mstZone) {
		this.mstZone = mstZone;
	}

}