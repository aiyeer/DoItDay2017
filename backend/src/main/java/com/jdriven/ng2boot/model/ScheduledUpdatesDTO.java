package com.jdriven.ng2boot.model;


public class ScheduledUpdatesDTO {

    private int enabledRules;
    private int disabledRules;
    private int activeRules;
    private int failedRules;
    private int inProgressRules;

    public ScheduledUpdatesDTO() {
    }

	/**
	 * @return the enabledRules
	 */
	public int getEnabledRules() {
		return enabledRules;
	}

	/**
	 * @param enabledRules the enabledRules to set
	 */
	public void setEnabledRules(int enabledRules) {
		this.enabledRules = enabledRules;
	}

	/**
	 * @return the disabledRules
	 */
	public int getDisabledRules() {
		return disabledRules;
	}

	/**
	 * @param disabledRules the disabledRules to set
	 */
	public void setDisabledRules(int disabledRules) {
		this.disabledRules = disabledRules;
	}

	/**
	 * @return the activeRules
	 */
	public int getActiveRules() {
		return activeRules;
	}

	/**
	 * @param activeRules the activeRules to set
	 */
	public void setActiveRules(int activeRules) {
		this.activeRules = activeRules;
	}

	/**
	 * @return the failedRules
	 */
	public int getFailedRules() {
		return failedRules;
	}

	/**
	 * @param failedRules the failedRules to set
	 */
	public void setFailedRules(int failedRules) {
		this.failedRules = failedRules;
	}

	/**
	 * @return the inProgressRules
	 */
	public int getInProgressRules() {
		return inProgressRules;
	}

	/**
	 * @param inProgressRules the inProgressRules to set
	 */
	public void setInProgressRules(int inProgressRules) {
		this.inProgressRules = inProgressRules;
	}

}
