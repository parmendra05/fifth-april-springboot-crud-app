package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.Book;
import com.pack.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		//Book book=new Book(5, "Java ", "Nageshawar rao", "399 $");
		
		Book bookObject=service.saveBook(book);
		return bookObject;
	}
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable ("id") Integer id) {
		//Integer id =5;
		
		Book bookObject=service.getBook(id);
		return bookObject;
	}
}
