package com.spring.mongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongoDB.repository.BooksRepository;
import com.spring.mongoDB.repository.entities.Books;

@RestController
@RequestMapping("/mongo")
public class MongoAPI {

	@Autowired
	BooksRepository booksRepository;
	
	@GetMapping("/all")
	public List<Books> getAll(@RequestHeader HttpHeaders httpHeaders){
		
		List<Books> books = booksRepository.findAll();
		return books;
	}
}
