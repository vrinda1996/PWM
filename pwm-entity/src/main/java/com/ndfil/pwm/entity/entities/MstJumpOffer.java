package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mst_jump_offer database table.
 * 
 */
@Entity
@Table(name="mst_jump_offer")
@NamedQuery(name="MstJumpOffer.findAll", query="SELECT m FROM MstJumpOffer m")
public class MstJumpOffer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="jump_offer_id")
	private String jumpOfferId;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="jump_offer_name")
	private String jumpOfferName;

	public MstJumpOffer() {
	}

	public String getJumpOfferId() {
		return this.jumpOfferId;
	}

	public void setJumpOfferId(String jumpOfferId) {
		this.jumpOfferId = jumpOfferId;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getJumpOfferName() {
		return this.jumpOfferName;
	}

	public void setJumpOfferName(String jumpOfferName) {
		this.jumpOfferName = jumpOfferName;
	}

}