package com.jdriven.ng2boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdriven.ng2boot.model.Analysis;
import com.jdriven.ng2boot.model.Node;

@Repository
public interface NodeRepository extends JpaRepository<Node, Long>{
	
}
