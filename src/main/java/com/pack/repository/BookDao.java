package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

}
