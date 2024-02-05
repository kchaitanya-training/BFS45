package com.bfs45.bookmanagment.controller;

import java.io.IOException;

import com.bfs45.bookmanagment.model.Book;
import com.bfs45.bookmanagment.service.BookService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addBook")
public class BookAddServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve book details from the request parameters
        String bookName = request.getParameter("bname");
        String bookDescription = request.getParameter("description");
        String bookPrice = request.getParameter("price");
        System.out.println(bookName + bookDescription + bookPrice);

        // Create a new Book object with the provided details
        Book newBook = new Book();
        newBook.setBookName(bookName);
        newBook.setBookDescription(bookDescription);
        newBook.setBookPrice(bookPrice);

        // Use BookService to add the new book to the database
        BookService bookService = new BookService();
        boolean addSuccess = bookService.addBooks(newBook);

        if (addSuccess) {
            System.out.println("Book added successfully");
			RequestDispatcher rd=request.getRequestDispatcher("/bookServlet");
			request.setAttribute("role", "admin");
			rd.forward(request, response);
        } else {
            response.getWriter().write("Failed to add the book");
        }
    }
}