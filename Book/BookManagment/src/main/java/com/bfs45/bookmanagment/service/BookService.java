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
	
	public boolean addBooks(Book newBook){
		
		BookDao bookDao=new BookDao();
		try {
			return bookDao.addBooks(newBook);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
}
	
	public boolean updateBook(int bookId, String bookName, String bookDescription, String bookPrice) {
	    BookDao bookDao = new BookDao();
	
	    try {
	        // Get the existing book details
	        Book existingBook = bookDao.getBook(bookId);
	
	        // Check if the book exists
	        if (existingBook != null) {
	            // Update the book details
	            existingBook.setBookName(bookName);
	            existingBook.setBookDescription(bookDescription);
	            existingBook.setBookPrice(bookPrice);
	
	            // Call the updateBook method in the BookDao class
	            return bookDao.updateBook(existingBook);
	        } else {
	            // Book with the specified ID not found
	            System.out.println("Book with ID " + bookId + " not found");
	            return false;
	        }
	    } catch (SQLException e) {
	        // Handle SQLException appropriately
	        e.printStackTrace();
	        return false;
	    }
	}

	public boolean deleteBook(int book_id) {

		BookDao bookDao=new BookDao();
		try {
			return bookDao.deleteBook(book_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
