package com.verinite.bookdatabase.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.Column;
@Setter
@Getter
@Entity(name="book")

public class Book {
@Id
private Integer bookId;
@Column(name = "bookname")
private String bookname;
private String author;
private Integer price;
	
	

}
