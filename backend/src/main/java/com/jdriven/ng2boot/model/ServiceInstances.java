package com.jdriven.ng2boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICE_INSTANCES")
public class ServiceInstances {

	@Id
    private String id;
	private String nodeId;
	private String status;
	private String name;
	private double cpuUsage;
	private double memoryUsage;
	private int users;
	
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
	 * @return the nodeId
	 */
	public String getNodeId() {
		return nodeId;
	}
	/**
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the memoryUsage
	 */
	public double getMemoryUsage() {
		return memoryUsage;
	}
	/**
	 * @param memoryUsage the memoryUsage to set
	 */
	public void setMemoryUsage(double memoryUsage) {
		this.memoryUsage = memoryUsage;
	}
	/**
	 * @return the users
	 */
	public int getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(int users) {
		this.users = users;
	}
	
}
