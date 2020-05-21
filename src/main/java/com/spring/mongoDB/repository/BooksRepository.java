package com.spring.mongoDB.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongoDB.repository.entities.Books;

public interface BooksRepository extends MongoRepository<Books, ObjectId> {

}
