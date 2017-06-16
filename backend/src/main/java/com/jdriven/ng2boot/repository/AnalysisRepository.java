package com.jdriven.ng2boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdriven.ng2boot.model.Analysis;

@Repository
public interface AnalysisRepository extends JpaRepository<Analysis, Long>{
	
}
