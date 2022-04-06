package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.Book;
import com.pack.repository.BookDao;

@Service
public class BookService {
@Autowired	
private BookDao   dao;

	public Book saveBook(Book book) {
	Book theBook=dao.save(book);
		return theBook;
	}
	
	public Book getBook(Integer id) {
		Book theBook=dao.findById(id).get();
			return theBook;
		}
		
	
}
