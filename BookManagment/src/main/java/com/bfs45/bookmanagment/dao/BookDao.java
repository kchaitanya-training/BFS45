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
	
    public boolean updateBook(Book book){
    	Connection con=DBUtil.getConnection();
        PreparedStatement preparedStatement = null;
       
        try {
	        preparedStatement = con.prepareStatement("UPDATE book SET book_name=?, book_description=?, book_price=? "
	        										+ "WHERE book_id=?");
	
	        preparedStatement.setString(1, book.getBookName());
	        preparedStatement.setString(2, book.getBookDescription());
	        preparedStatement.setString(3, book.getBookPrice());
	        preparedStatement.setInt(4, book.getBookId());
	
	        int rowsUpdated = preparedStatement.executeUpdate();
	
	        return rowsUpdated > 0;
        
        }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				DBUtil.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return false;
    }
    


    @SuppressWarnings("resource")
	public boolean addBooks(Book newBook) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int maxBookId = 0;

        try {
            con = DBUtil.getConnection();

            // Retrieve the maximum existing book ID
            preparedStatement = con.prepareStatement("SELECT MAX(book_id) FROM book");
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                maxBookId = resultSet.getInt(1);
            }

            // Increment the maximum book ID to get the new book ID
            int newBookId = maxBookId + 1;

            // Add the new book
            preparedStatement = con.prepareStatement("INSERT INTO book (book_id, book_name, book_description, book_price)"
                    									+ "VALUES (?, ?, ?, ?)");

            preparedStatement.setInt(1, newBookId);
            preparedStatement.setString(2, newBook.getBookName());
            preparedStatement.setString(3, newBook.getBookDescription());
            preparedStatement.setString(4, newBook.getBookPrice());

            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0;

        } finally {
            // Close resources in a finally block to ensure they are closed even if an exception occurs
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }


	public boolean deleteBook(int book_id) throws SQLException {
		 Connection con = null;
		    PreparedStatement preparedStatement = null;

		    try {
		        con = DBUtil.getConnection();

		        // Delete the book based on its ID
		        preparedStatement = con.prepareStatement("DELETE FROM book WHERE book_id = ?");
		        preparedStatement.setInt(1, book_id);

		        int rowsDeleted = preparedStatement.executeUpdate();

		        return rowsDeleted > 0;

		    } finally {
		        // Close resources in a finally block to ensure they are closed even if an exception occurs
		        if (preparedStatement != null) {
		            preparedStatement.close();
		        }
		        if (con != null) {
		            con.close();
		        }
		    }
		}
    
}


