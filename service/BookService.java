package com.verinite.bookdatabase.service;

import java.util.List;

import com.verinite.bookdatabase.entity.Book;



public interface BookService  {
	Book insertBook(Book book);
	  List<Book> getBook();
	Book getbookbyauthor(String author);
	 void  delete(String bookname);
	 void deleteByid(int book_id);
	
	void save(Book book);
	
	
}
