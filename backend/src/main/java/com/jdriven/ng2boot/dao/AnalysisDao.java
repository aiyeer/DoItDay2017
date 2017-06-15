package com.jdriven.ng2boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdriven.ng2boot.model.Analysis;

@Repository
public interface AnalysisDao extends JpaRepository<Analysis, Long>{
	
}
