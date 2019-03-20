package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mst_mktg database table.
 * 
 */
@Entity
@Table(name="mst_mktg")
@NamedQuery(name="MstMktg.findAll", query="SELECT m FROM MstMktg m")
public class MstMktg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mktg_id")
	private String mktgId;

	@Column(name="is_blocked")
	private byte isBlocked;

	@Column(name="mktg_name")
	private String mktgName;

	@Column(name="mst_sap_id")
	private String mstSapId;

	//bi-directional many-to-one association to MstPromo
	@OneToMany(mappedBy="mstMktg")
	private List<MstPromo> mstPromos;

	public MstMktg() {
	}

	public String getMktgId() {
		return this.mktgId;
	}

	public void setMktgId(String mktgId) {
		this.mktgId = mktgId;
	}

	public byte getIsBlocked() {
		return this.isBlocked;
	}

	public void setIsBlocked(byte isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getMktgName() {
		return this.mktgName;
	}

	public void setMktgName(String mktgName) {
		this.mktgName = mktgName;
	}

	public String getMstSapId() {
		return this.mstSapId;
	}

	public void setMstSapId(String mstSapId) {
		this.mstSapId = mstSapId;
	}

	public List<MstPromo> getMstPromos() {
		return this.mstPromos;
	}

	public void setMstPromos(List<MstPromo> mstPromos) {
		this.mstPromos = mstPromos;
	}

	public MstPromo addMstPromo(MstPromo mstPromo) {
		getMstPromos().add(mstPromo);
		mstPromo.setMstMktg(this);

		return mstPromo;
	}

	public MstPromo removeMstPromo(MstPromo mstPromo) {
		getMstPromos().remove(mstPromo);
		mstPromo.setMstMktg(null);

		return mstPromo;
	}

}