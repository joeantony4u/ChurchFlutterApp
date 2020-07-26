package com.churchapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.churchapp.model.Church;

@Repository
public interface ChurchRepository extends MongoRepository<Church, String>{
	
	public Church findByName(String name);
	
	public Church findById(Integer id);

}
