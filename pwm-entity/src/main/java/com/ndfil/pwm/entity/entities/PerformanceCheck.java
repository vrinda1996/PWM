package com.ndfil.pwm.entity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the performance_check database table.
 * 
 */
@Entity
@Table(name="performance_check")
@NamedQuery(name="PerformanceCheck.findAll", query="SELECT p FROM PerformanceCheck p")
public class PerformanceCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="performance_id")
	private String performanceId;

	private String batch_ID;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="execution_time_ms")
	private BigInteger executionTimeMs;

	@Column(name="method_index")
	private int methodIndex;

	@Column(name="method_name")
	private String methodName;

	public PerformanceCheck() {
	}

	public String getPerformanceId() {
		return this.performanceId;
	}

	public void setPerformanceId(String performanceId) {
		this.performanceId = performanceId;
	}

	public String getBatch_ID() {
		return this.batch_ID;
	}

	public void setBatch_ID(String batch_ID) {
		this.batch_ID = batch_ID;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public BigInteger getExecutionTimeMs() {
		return this.executionTimeMs;
	}

	public void setExecutionTimeMs(BigInteger executionTimeMs) {
		this.executionTimeMs = executionTimeMs;
	}

	public int getMethodIndex() {
		return this.methodIndex;
	}

	public void setMethodIndex(int methodIndex) {
		this.methodIndex = methodIndex;
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}