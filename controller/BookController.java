package com.verinite.bookdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verinite.bookdatabase.entity.Book;
import com.verinite.bookdatabase.service.BookService;

@RestController
public class BookController {

	private final BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		
		this.bookService=bookService;
		
	}
	
	@PostMapping("books")
	Book insert(@RequestBody Book book) {
		return bookService.insertBook(book);
	}
	@GetMapping("books")
	List<Book> getBook(){
		return bookService.getBook();
	}
	@GetMapping("books/{author}")
	Book getbookByauthor(@PathVariable String author) {
		return bookService.getbookbyauthor(author);
	}
	
	@DeleteMapping("book/ById/{book_id}")
	void deleteBook(@PathVariable int book_id)
	{
	 bookService.deleteByid(book_id);
	}
	@DeleteMapping("book/{bookname}")
	void deleteBook(@PathVariable String bookname)
	{
		bookService.delete(bookname);
	}
	
	@PostMapping("/book/{book_id}")
	public void update(Book book,int book_id) {
		bookService.save(book);
	}
}
