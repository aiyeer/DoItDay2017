package com.jdriven.ng2boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdriven.ng2boot.model.ScheduledUpdates;

@Repository
public interface ScheduledUpdatesRepository extends JpaRepository<ScheduledUpdates, Long>{
	
}
