package com.bfs45.bookmanagment.service;

import java.sql.SQLException;
import java.util.Set;

import com.bfs45.bookmanagment.dao.BookDao;
import com.bfs45.bookmanagment.model.Book;

public class BookService {

	public Set<Book> getBooks(){
		
		BookDao bookDao=new BookDao();
		try {
			return bookDao.getBooks();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
public Book getBooks(int bookId){
		
		BookDao bookDao=new BookDao();
		try {
			return bookDao.getBook(bookId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
