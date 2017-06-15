package com.jdriven.ng2boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NODES")
public class Node {
	
	@Id
    private String id;
	private String name;
	private boolean onlineStatus;
	private double cpuUsage;
	private double memoryAvailable;
	
	public Node() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the onlineStatus
	 */
	public boolean isOnlineStatus() {
		return onlineStatus;
	}

	/**
	 * @param onlineStatus the onlineStatus to set
	 */
	public void setOnlineStatus(boolean onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	/**
	 * @return the cpuUsage
	 */
	public double getCpuUsage() {
		return cpuUsage;
	}

	/**
	 * @param cpuUsage the cpuUsage to set
	 */
	public void setCpuUsage(double cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	/**
	 * @return the memoryAvailable
	 */
	public double getMemoryAvailable() {
		return memoryAvailable;
	}

	/**
	 * @param memoryAvailable the memoryAvailable to set
	 */
	public void setMemoryAvailable(double memoryAvailable) {
		this.memoryAvailable = memoryAvailable;
	}
	
}
