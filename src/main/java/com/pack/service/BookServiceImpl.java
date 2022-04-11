package com.pack.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.Book;
import com.pack.error.BookNotFoundException;
import com.pack.repository.BookDao;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao dao;

	public Book saveBook(Book book) {
		Book theBook = dao.save(book);
		return theBook;
	}

	public Book getBook(Integer id) {
		Optional<Book> theBook = dao.findById(id);
		if (theBook.isPresent())
			return theBook.get();
		else
			throw new BookNotFoundException("Book doesn't exit for id : "+id);
	}

	@Override
	public void deleteBook(Integer id) {
		dao.deleteById(id);

	}

}
