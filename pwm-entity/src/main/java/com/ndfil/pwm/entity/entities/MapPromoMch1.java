package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_promo_mch_1 database table.
 * 
 */
@Entity
@Table(name="map_promo_mch_1")
@NamedQuery(name="MapPromoMch1.findAll", query="SELECT m FROM MapPromoMch1 m")
public class MapPromoMch1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="map_promo_mch_id_1")
	private String mapPromoMchId1;

	//bi-directional many-to-one association to Mch
	@ManyToOne
	@JoinColumn(name="mch_code")
	private Mch mch;

	//bi-directional many-to-one association to MstPromo
	@ManyToOne
	@JoinColumn(name="mst_promo_id")
	private MstPromo mstPromo;

	public MapPromoMch1() {
	}

	public String getMapPromoMchId1() {
		return this.mapPromoMchId1;
	}

	public void setMapPromoMchId1(String mapPromoMchId1) {
		this.mapPromoMchId1 = mapPromoMchId1;
	}

	public Mch getMch() {
		return this.mch;
	}

	public void setMch(Mch mch) {
		this.mch = mch;
	}

	public MstPromo getMstPromo() {
		return this.mstPromo;
	}

	public void setMstPromo(MstPromo mstPromo) {
		this.mstPromo = mstPromo;
	}

}