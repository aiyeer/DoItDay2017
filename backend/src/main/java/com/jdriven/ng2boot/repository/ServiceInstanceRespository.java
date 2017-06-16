package com.jdriven.ng2boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdriven.ng2boot.model.Analysis;
import com.jdriven.ng2boot.model.Node;
import com.jdriven.ng2boot.model.Notification;
import com.jdriven.ng2boot.model.ServiceInstances;

@Repository
public interface ServiceInstanceRespository extends JpaRepository<ServiceInstances, Long>{
	
}
