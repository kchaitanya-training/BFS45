package com.bfs45.book.dao;

import com.bfs45.book.model.Book;
import com.bfs45.book.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    Connection connection;

    public BookDAO() throws SQLException, ClassNotFoundException {
        this.connection = DBUtil.getConnection();
    }

    public Book getBook(int BookID) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("SELECT book_id, name, author, description, price FROM book WHERE book_id = ?");

        ps.setString(1, String.valueOf(BookID));
        ps.execute();

        ResultSet result = ps.getResultSet();
        result.next();

        return new Book(
                result.getInt(1),
                result.getString(2),
                result.getString(3),
                result.getString(4),
                result.getFloat(5)
        );
    }

    public List<Book> getAllBooks() throws SQLException {
        List<Book> allBooks = new ArrayList<>();
        PreparedStatement ps = this.connection.prepareStatement("SELECT book_id, name, author, description, price FROM book");
        ps.execute();

        ResultSet result = ps.getResultSet();
        while(result.next()) {
            allBooks.add(new Book(
                    result.getInt(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getFloat(5)
            ));
        }

        return allBooks;
    }

    public void addBook(Book book) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("INSERT INTO book(book_id, name, author, description, price) VALUES (?, ?, ?, ?, ?)");

        ps.setInt(1, book.getBookID());
        ps.setString(2, book.getBookName());
        ps.setString(3, book.getBookAuthor());
        ps.setString(4, book.getBookDescription());
        ps.setFloat(5, book.getBookPrice());

        ps.execute();
    }

    public int updateBook(Book book) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("UPDATE book SET name='?', author='?', description='?', price='?' WHERE book_id=?");

        ps.setString(1, book.getBookName());
        ps.setString(2, book.getBookAuthor());
        ps.setString(3, book.getBookDescription());
        ps.setFloat(4, book.getBookPrice());
        ps.setInt(5, book.getBookID());

        return ps.executeUpdate();
    }

    public int deleteBook(Book book) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("DELETE FROM book WHERE book_id=?");

        ps.setInt(1, book.getBookID());

        return ps.executeUpdate();
    }
}
