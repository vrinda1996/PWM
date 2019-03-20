package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_user_mch_f2 database table.
 * 
 */
@Entity
@Table(name="map_user_mch_f2")
@NamedQuery(name="MapUserMchF2.findAll", query="SELECT m FROM MapUserMchF2 m")
public class MapUserMchF2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String map_user_MCH_F2_id;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="emp_id")
	private MstEmployee mstEmployee;

	//bi-directional many-to-one association to Mch
	@ManyToOne
	@JoinColumn(name="mc_code")
	private Mch mch;

	public MapUserMchF2() {
	}

	public String getMap_user_MCH_F2_id() {
		return this.map_user_MCH_F2_id;
	}

	public void setMap_user_MCH_F2_id(String map_user_MCH_F2_id) {
		this.map_user_MCH_F2_id = map_user_MCH_F2_id;
	}

	public MstEmployee getMstEmployee() {
		return this.mstEmployee;
	}

	public void setMstEmployee(MstEmployee mstEmployee) {
		this.mstEmployee = mstEmployee;
	}

	public Mch getMch() {
		return this.mch;
	}

	public void setMch(Mch mch) {
		this.mch = mch;
	}

}