package com.jdriven.ng2boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdriven.ng2boot.model.Analysis;
import com.jdriven.ng2boot.model.Communication;
import com.jdriven.ng2boot.model.Node;
import com.jdriven.ng2boot.model.Notification;
import com.jdriven.ng2boot.model.ScheduledUpdates;
import com.jdriven.ng2boot.model.ScheduledUpdatesDTO;
import com.jdriven.ng2boot.model.ServiceInstances;
import com.jdriven.ng2boot.repository.AnalysisRepository;
import com.jdriven.ng2boot.repository.CommunicationRespository;
import com.jdriven.ng2boot.repository.NodeRepository;
import com.jdriven.ng2boot.repository.NotificationRepository;
import com.jdriven.ng2boot.repository.ScheduledUpdatesRepository;
import com.jdriven.ng2boot.repository.ServiceInstanceRespository;

@RestController
@EnableAutoConfiguration
public class MainController {
	
	@Autowired
	private AnalysisRepository analysisRepository;
	
	@Autowired
	private NodeRepository nodeRepository;
		
	@Autowired
	private NotificationRepository notificationRepository;
	
	@Autowired
	private ServiceInstanceRespository serviceInstanceRespository;
	
	@Autowired
	private CommunicationRespository communicationRespository;
	
	@Autowired
	private ScheduledUpdatesRepository scheduledUpdatesRepository;
	
	@RequestMapping(value="/getAllAnalysis", produces= "application/json")
	public List<Analysis> getAllAnalysis() {
		return analysisRepository.findAll();
	}

	@RequestMapping("/getAllNodes")
	public List<Node> getAllNodes() {
		return nodeRepository.findAll();
	}
	
	@RequestMapping("/getAllNotifications")
	public List<Notification> getAllNotifications() {
		return notificationRepository.findAll();
	}
	
	@RequestMapping("/getAllInstances")
	public List<ServiceInstances> getAllInstances() {
		return serviceInstanceRespository.findAll();
	}
	
	@RequestMapping("/getAllCommunications")
	public List<Communication> getAllCommunications() {
		return communicationRespository.findAll();
	}
	
	@RequestMapping("/getScheduledUpdates")
	public ScheduledUpdatesDTO getScheduledUpdates() {
		List<ScheduledUpdates> suList = scheduledUpdatesRepository.findAll();
		ScheduledUpdatesDTO suDto = new ScheduledUpdatesDTO();
		int disabledRules = 0;
		int enabledRules = 0;
		int activeRules = 0;
		int failedRules = 0;
		int inProgressRules = 0;
		for (ScheduledUpdates scheduledUpdates : suList) {
			if("DISABLED".equalsIgnoreCase(scheduledUpdates.getRuleStatus())) {
				disabledRules++;
			} else if("ENABLED".equalsIgnoreCase(scheduledUpdates.getRuleStatus())) {
				enabledRules++;
				if("FAILED".equalsIgnoreCase(scheduledUpdates.getLastExecutionStatus())) {
					failedRules++;
				} else if("SUCCESS".equalsIgnoreCase(scheduledUpdates.getLastExecutionStatus())) {
					activeRules++;
				} else if("INPROGESS".equalsIgnoreCase(scheduledUpdates.getLastExecutionStatus())) {
					inProgressRules++;
				}
			}
		}
		suDto.setDisabledRules(disabledRules);
		suDto.setEnabledRules(enabledRules);
		suDto.setActiveRules(activeRules);
		suDto.setFailedRules(failedRules);
		suDto.setInProgressRules(inProgressRules);
		return suDto;
	}
	
	
}
