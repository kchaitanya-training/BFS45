package com.bfs45.bookmanagment.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.bfs45.bookmanagment.model.Book;
import com.bfs45.bookmanagment.service.BookService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
	
	
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BookService service=new BookService();
		Set<Book> books=service.getBooks();
		String role=(String)req.getAttribute("role");
		RequestDispatcher rd=req.getRequestDispatcher("/bookdetails.jsp");
		req.setAttribute("role", role);
		req.setAttribute("bookDetails", books);
		rd.forward(req, resp);
		
	}
	
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookId = req.getParameter("id");
		String bookName = req.getParameter("bname");
		String bookdescr = req.getParameter("description");
		String price = req.getParameter("price");
		
		
	}
	
	
	
	
	

}
