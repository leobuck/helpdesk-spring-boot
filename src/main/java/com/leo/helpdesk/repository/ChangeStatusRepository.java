package com.leo.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leo.helpdesk.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}
