package com.jdriven.ng2boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdriven.ng2boot.dao.AnalysisDao;
import com.jdriven.ng2boot.model.Analysis;

@RestController
@EnableAutoConfiguration
public class MainController {
	
	@Autowired
	private AnalysisDao analysisDao;
	
	@RequestMapping("/getAllAnalysis")
	public List<Analysis> getAllAnalysis() {
		return analysisDao.findAll();
	}

}
