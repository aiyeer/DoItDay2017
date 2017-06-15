package com.jdriven.ng2boot.model;

import javax.persistence.*;

@Entity
@Table(name = "ANALYSIS_ROUTING")
public class AnalysisRouting {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String analysisId;
    private String serviceId;

    public AnalysisRouting() {
    }

	/**
	 * @return the analyisId
	 */
	public String getAnalysisId() {
		return analysisId;
	}

	/**
	 * @param analyisId the analyisId to set
	 */
	public void setAnalysisId(String analysisId) {
		this.analysisId = analysisId;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
