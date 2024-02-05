package com.bfs45.bookmanagment.controller;

import java.io.IOException;

import com.bfs45.bookmanagment.service.BookService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bookUpdate")
public class BookUpdateServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookId = req.getParameter("id");
		int book_id = Integer.valueOf(bookId);
		System.out.println(book_id);
		String bookName = req.getParameter("bname");
		String bookdescr = req.getParameter("description");
		String price = req.getParameter("price");
		
		// Call the service method to update the book
	    BookService service = new BookService();
	    boolean success = service.updateBook(book_id, bookName, bookdescr, price);

	    if (success) {
	        // Book updated successfully
	        System.out.println("Book updated successfully");
			RequestDispatcher rd=req.getRequestDispatcher("/bookServlet");
			req.setAttribute("role", "admin");
			rd.forward(req, resp);
	    } else {
	        // Failed to update book
	        resp.getWriter().write("Failed to update book");
	    }
	}
	

}