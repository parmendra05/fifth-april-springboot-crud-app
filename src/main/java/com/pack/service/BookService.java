package com.pack.service;

import com.pack.entity.Book;

public interface BookService {
	
	public Book saveBook(Book book) ;
	public Book getBook(Integer id) ;
	public void deleteBook(Integer id);
}
