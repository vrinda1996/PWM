package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mst_offer database table.
 * 
 */
@Entity
@Table(name="mst_offer")
@NamedQuery(name="MstOffer.findAll", query="SELECT m FROM MstOffer m")
public class MstOffer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_id")
	private String offerId;

	@Column(name="is_blocked")
	private byte isBlocked;

	@Column(name="offer_name")
	private String offerName;

	//bi-directional many-to-one association to MstPromo
	@OneToMany(mappedBy="mstOffer")
	private List<MstPromo> mstPromos;

	public MstOffer() {
	}

	public String getOfferId() {
		return this.offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public byte getIsBlocked() {
		return this.isBlocked;
	}

	public void setIsBlocked(byte isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getOfferName() {
		return this.offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public List<MstPromo> getMstPromos() {
		return this.mstPromos;
	}

	public void setMstPromos(List<MstPromo> mstPromos) {
		this.mstPromos = mstPromos;
	}

	public MstPromo addMstPromo(MstPromo mstPromo) {
		getMstPromos().add(mstPromo);
		mstPromo.setMstOffer(this);

		return mstPromo;
	}

	public MstPromo removeMstPromo(MstPromo mstPromo) {
		getMstPromos().remove(mstPromo);
		mstPromo.setMstOffer(null);

		return mstPromo;
	}

}