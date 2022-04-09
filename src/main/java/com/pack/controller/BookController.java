package com.pack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.Book;
import com.pack.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public Book saveBook(@Valid @RequestBody Book book) {
			
		Book bookObject=service.saveBook(book);
		return bookObject;
	}
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable ("id") Integer id) {
	
		
		Book bookObject=service.getBook(id);
		return bookObject;
	}
	
	@DeleteMapping("/delete/{id}")
	public String DeltBook(@PathVariable ("id") Integer id) {
		service.deleteBook(id);
		
		return "Data Deleted";
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
			
		Book bookObject=service.saveBook(book);
		return bookObject;
	}
}
