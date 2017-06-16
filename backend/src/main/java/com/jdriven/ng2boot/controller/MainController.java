package com.jdriven.ng2boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdriven.ng2boot.model.Analysis;
import com.jdriven.ng2boot.model.Communication;
import com.jdriven.ng2boot.model.Node;
import com.jdriven.ng2boot.model.Notification;
import com.jdriven.ng2boot.model.ServiceInstances;
import com.jdriven.ng2boot.repository.AnalysisRepository;
import com.jdriven.ng2boot.repository.CommunicationRespository;
import com.jdriven.ng2boot.repository.NodeRepository;
import com.jdriven.ng2boot.repository.NotificationRepository;
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
	
}
