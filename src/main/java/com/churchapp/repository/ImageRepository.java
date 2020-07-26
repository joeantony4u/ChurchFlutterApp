package com.churchapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.churchapp.model.Photo;

@Repository
public interface ImageRepository extends MongoRepository<Photo, String>{
}
