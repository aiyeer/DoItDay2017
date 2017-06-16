package com.jdriven.ng2boot.model;

import javax.persistence.*;

@Entity
@Table(name = "SCHEDULED_UPDATES")
public class ScheduledUpdates {

    @Id
    private String ruleId;
    private String name;
    private String analysisId;
    private String lastExecutionStatus;
    private String ruleStatus;

    public ScheduledUpdates() {
    }

	/**
	 * @return the ruleId
	 */
	public String getRuleId() {
		return ruleId;
	}

	/**
	 * @param ruleId the ruleId to set
	 */
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
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
	 * @return the analysisId
	 */
	public String getAnalysisId() {
		return analysisId;
	}

	/**
	 * @param analysisId the analysisId to set
	 */
	public void setAnalysisId(String analysisId) {
		this.analysisId = analysisId;
	}

	/**
	 * @return the lastExecutionStatus
	 */
	public String getLastExecutionStatus() {
		return lastExecutionStatus;
	}

	/**
	 * @param lastExecutionStatus the lastExecutionStatus to set
	 */
	public void setLastExecutionStatus(String lastExecutionStatus) {
		this.lastExecutionStatus = lastExecutionStatus;
	}

	/**
	 * @return the ruleStatus
	 */
	public String getRuleStatus() {
		return ruleStatus;
	}

	/**
	 * @param ruleStatus the ruleStatus to set
	 */
	public void setRuleStatus(String ruleStatus) {
		this.ruleStatus = ruleStatus;
	}
    
}
