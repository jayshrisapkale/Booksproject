package com.verinite.bookdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import com.verinite.bookdatabase.entity.Book;


@Repository
public interface Bookrepo extends JpaRepository<Book,Integer> {
	

@Query("delete from book b where b.bookname=?1")
public void delete(String bookname);


@Query("update book b set b.bookId = 1 where b.bookname=?1")
public void update(int book_id);


public Book getByauthor(String author);

}