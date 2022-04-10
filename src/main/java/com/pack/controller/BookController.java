package com.pack.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Book> saveBook(@Valid @RequestBody Book book) {
			
		Book bookObject=service.saveBook(book);
		
		return new ResponseEntity<>(bookObject,HttpStatus.CREATED);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Book> getBook(@PathVariable ("id") Integer id) {
	Book bookObject=service.getBook(id);
		return new ResponseEntity<>(bookObject,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> DeltBook(@PathVariable ("id") Integer id) {
		service.deleteBook(id);
		String msg="Data Deleted";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) {
			
		Book bookObject=service.saveBook(book);
		return new ResponseEntity<>(bookObject,HttpStatus.OK);
	}
}
