package com.example.movies.repository;

import com.example.movies.entities.Reviews;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Reviews, ObjectId> {
}
