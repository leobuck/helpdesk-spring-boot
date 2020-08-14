package com.leo.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leo.helpdesk.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByEmail(String email);

}
