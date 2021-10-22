package com.verinite.bookdatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verinite.bookdatabase.entity.Book;
import com.verinite.bookdatabase.repository.Bookrepo;

@Service
public class BookServiceImp  implements BookService {

	private final Bookrepo bookrepo;
	@Autowired
	  public BookServiceImp(Bookrepo bookrepo) {
	    this.bookrepo = bookrepo;
	  }

	@Override
	public Book insertBook(Book book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);
	}

	@Override
	public List<Book> getBook() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	@Override
	public Book getbookbyauthor(String author) {
		// TODO Auto-generated method stub
		return bookrepo.getByauthor(author);
	}

	@Override
	public void deleteByid(int book_id) {
		// TODO Auto-generated method stub
		 bookrepo.deleteById(book_id);
	}

	@Override
	public void delete(String bookname) {
		// TODO Auto-generated method stub
		bookrepo.delete(bookname);
	}

	

	@Override
	public void save(Book book_id) {
		// TODO Auto-generated method stub
		bookrepo.save(book_id);
	}

	/*@Override
	public void saveOrUpdate(Book book) {
		// TODO Auto-generated method stub
		
	}*/

	

	



	


	

	



	
	}



	
	


