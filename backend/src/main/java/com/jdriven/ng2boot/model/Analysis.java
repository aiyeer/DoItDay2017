package com.jdriven.ng2boot.model;

import javax.persistence.*;

@Entity
@Table(name = "ANALYSIS")
public class Analysis {

    @Id
    private String id;
    private String name;
    private int userCount;
    private int instancesCount;
    private String originator;

    public Analysis() {
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
	 * @return the userCount
	 */
	public int getUserCount() {
		return userCount;
	}


	/**
	 * @param userCount the userCount to set
	 */
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}


	/**
	 * @return the instancesCount
	 */
	public int getInstancesCount() {
		return instancesCount;
	}


	/**
	 * @param instancesCount the instancesCount to set
	 */
	public void setInstancesCount(int instancesCount) {
		this.instancesCount = instancesCount;
	}


	/**
	 * @return the originator
	 */
	public String getOriginator() {
		return originator;
	}


	/**
	 * @param originator the originator to set
	 */
	public void setOriginator(String originator) {
		this.originator = originator;
	}


	@Override
    public String toString() {
        return this.name;
    }
}
