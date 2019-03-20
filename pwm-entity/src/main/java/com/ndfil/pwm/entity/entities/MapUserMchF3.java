package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the map_user_mch_f3 database table.
 * 
 */
@Entity
@Table(name="map_user_mch_f3")
@NamedQuery(name="MapUserMchF3.findAll", query="SELECT m FROM MapUserMchF3 m")
public class MapUserMchF3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String map_user_MCH_F3_id;

	//bi-directional many-to-one association to MstEmployee
	@ManyToOne
	@JoinColumn(name="emp_id")
	private MstEmployee mstEmployee;

	//bi-directional many-to-one association to Mch
	@ManyToOne
	@JoinColumn(name="mc_code")
	private Mch mch;

	public MapUserMchF3() {
	}

	public String getMap_user_MCH_F3_id() {
		return this.map_user_MCH_F3_id;
	}

	public void setMap_user_MCH_F3_id(String map_user_MCH_F3_id) {
		this.map_user_MCH_F3_id = map_user_MCH_F3_id;
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