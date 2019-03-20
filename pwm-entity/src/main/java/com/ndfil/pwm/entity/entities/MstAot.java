package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mst_aot database table.
 * 
 */
@Entity
@Table(name="mst_aot")
@NamedQuery(name="MstAot.findAll", query="SELECT m FROM MstAot m")
public class MstAot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="aot_id")
	private String aotId;

	@Column(name="aot_name")
	private String aotName;

	@Column(name="is_blocked")
	private byte isBlocked;

	//bi-directional many-to-one association to MstPromo
	@OneToMany(mappedBy="mstAot")
	private List<MstPromo> mstPromos;

	public MstAot() {
	}

	public String getAotId() {
		return this.aotId;
	}

	public void setAotId(String aotId) {
		this.aotId = aotId;
	}

	public String getAotName() {
		return this.aotName;
	}

	public void setAotName(String aotName) {
		this.aotName = aotName;
	}

	public byte getIsBlocked() {
		return this.isBlocked;
	}

	public void setIsBlocked(byte isBlocked) {
		this.isBlocked = isBlocked;
	}

	public List<MstPromo> getMstPromos() {
		return this.mstPromos;
	}

	public void setMstPromos(List<MstPromo> mstPromos) {
		this.mstPromos = mstPromos;
	}

	public MstPromo addMstPromo(MstPromo mstPromo) {
		getMstPromos().add(mstPromo);
		mstPromo.setMstAot(this);

		return mstPromo;
	}

	public MstPromo removeMstPromo(MstPromo mstPromo) {
		getMstPromos().remove(mstPromo);
		mstPromo.setMstAot(null);

		return mstPromo;
	}

}