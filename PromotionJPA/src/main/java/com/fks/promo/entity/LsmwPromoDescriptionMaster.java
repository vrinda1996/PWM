package com.fks.promo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the lsmw_promo_description_master database table.
 * 
 */
@Entity
@Table(name="lsmw_promo_description_master")
@NamedQuery(name="LsmwPromoDescriptionMaster.findAll", query="SELECT l FROM LsmwPromoDescriptionMaster l")
public class LsmwPromoDescriptionMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lsmw_promo_description_master_id")
	private String lsmwPromoDescriptionMasterId;

	private String description;

	@Column(name="mc_cat_sub_lob")
	private BigInteger mcCatSubLob;

	@Column(name="mc_code")
	private String mcCode;

	public LsmwPromoDescriptionMaster() {
	}

	public String getLsmwPromoDescriptionMasterId() {
		return this.lsmwPromoDescriptionMasterId;
	}

	public void setLsmwPromoDescriptionMasterId(String lsmwPromoDescriptionMasterId) {
		this.lsmwPromoDescriptionMasterId = lsmwPromoDescriptionMasterId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getMcCatSubLob() {
		return this.mcCatSubLob;
	}

	public void setMcCatSubLob(BigInteger mcCatSubLob) {
		this.mcCatSubLob = mcCatSubLob;
	}

	public String getMcCode() {
		return this.mcCode;
	}

	public void setMcCode(String mcCode) {
		this.mcCode = mcCode;
	}

}