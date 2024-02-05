package com.bfs45.bookmanagment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bfs45.bookmanagment.model.Book;
import com.bfs45.bookmanagment.util.DBUtil;

public class BookDao {
	
	public Set<Book> getBooks() throws SQLException{
		
		Connection con=DBUtil.getConnection();
		
		PreparedStatement ps=con.prepareStatement("SELECT * FROM BOOK");
		
		ResultSet rs=ps.executeQuery();
		HashSet<Book> books=new HashSet<Book>();
		while(rs.next()) {
			Book book=new Book();
			book.setBookId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setBookDescription(rs.getString(3));
			book.setBookPrice(rs.getString(4));
			books.add(book);
		}
		
		return books;
	}
	
	
	public Book getBook(int bookId) throws SQLException{
		
		Connection con=DBUtil.getConnection();
		
		PreparedStatement ps=con.prepareStatement("SELECT * FROM BOOK where book_id=?");
		ps.setInt(1, bookId);
		ResultSet rs=ps.executeQuery();
		Book book=new Book();
		while(rs.next()) {
			
			book.setBookId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setBookDescription(rs.getString(3));
			book.setBookPrice(rs.getString(4));
			
		}
		
		return book;
	}

}
