package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mst_task database table.
 * 
 */
@Entity
@Table(name="mst_task")
@NamedQuery(name="MstTask.findAll", query="SELECT m FROM MstTask m")
public class MstTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="task_id")
	private String taskId;

	@Column(name="is_blocked")
	private byte isBlocked;

	@Column(name="task_name")
	private String taskName;

	public MstTask() {
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public byte getIsBlocked() {
		return this.isBlocked;
	}

	public void setIsBlocked(byte isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}