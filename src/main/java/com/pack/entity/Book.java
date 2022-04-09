package com.pack.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Book {
	@Id
private Integer id;
	
	
@NotEmpty(message = "Name field can't be empty")
private String name;
	
	
@NotEmpty(message = "Author field can't be empty")
private String author;


@NotEmpty(message = "Price field can't be empty")
private String price;

public Book() {
	// TODO Auto-generated constructor stub
}

public Book(Integer id, String name, String author, String price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}



}
