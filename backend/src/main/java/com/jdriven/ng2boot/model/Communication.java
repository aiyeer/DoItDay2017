package com.jdriven.ng2boot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMMUNICATION")
public class Communication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String fromId;
	private String toId;
	private boolean canCommunicate;
	private String message;
	private Date lastModified;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the fromId
	 */
	public String getFromId() {
		return fromId;
	}
	/**
	 * @param fromId the fromId to set
	 */
	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	/**
	 * @return the toId
	 */
	public String getToId() {
		return toId;
	}
	/**
	 * @param toId the toId to set
	 */
	public void setToId(String toId) {
		this.toId = toId;
	}
	/**
	 * @return the canCommunicate
	 */
	public boolean isCanCommunicate() {
		return canCommunicate;
	}
	/**
	 * @param canCommunicate the canCommunicate to set
	 */
	public void setCanCommunicate(boolean canCommunicate) {
		this.canCommunicate = canCommunicate;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}
	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
}
