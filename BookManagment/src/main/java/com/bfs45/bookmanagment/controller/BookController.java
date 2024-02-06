package com.bfs45.bookmanagment.controller;

import java.io.IOException;
import java.util.Set;

import com.bfs45.bookmanagment.model.Book;
import com.bfs45.bookmanagment.model.Order;
import com.bfs45.bookmanagment.service.BookService;
import com.bfs45.bookmanagment.service.OrderService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/bookControllerServlet")
public class BookController extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String[] s = req.getParameterValues("listofbookid");
		String buttonType = req.getParameter("buttonid");
		// Retrieving session with userid
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("userid");
		String role = (String) session.getAttribute("role");

		if ("order".equals(buttonType)) {
			if (s.length == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("/bookOrder.jsp");
				BookService service = new BookService();
				Book book = service.getBooks(Integer.valueOf(s[0]));
				req.setAttribute("book", book);
				req.setAttribute("userid", userId);
				req.setAttribute("role", role);
				rd.forward(req, resp);
			}

		} else if ("update".equals(buttonType)) {

			if (s.length == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("/bookupdate.jsp");
				BookService service = new BookService();
				Book book = service.getBooks(Integer.valueOf(s[0]));
				req.setAttribute("book", book);
				req.setAttribute("role", role);
				rd.forward(req, resp);
			}

		} else if ("add".equals(buttonType)) {

				RequestDispatcher rd = req.getRequestDispatcher("/addBooks.jsp");
				Book newBook = new Book();
				req.setAttribute("book", newBook);
				req.setAttribute("role", role);
				rd.forward(req, resp);
				
		}else if ("delete".equals(buttonType)) {
	
			RequestDispatcher rd = req.getRequestDispatcher("/deleteBook.jsp");
			BookService service = new BookService();
			Book book = service.getBooks(Integer.valueOf(s[0]));
			req.setAttribute("book", book);
			req.setAttribute("role", role);
			rd.forward(req, resp);
		}else if ("orderedList".equals(buttonType)) {
			OrderService service = new OrderService();
			Set<Order> orders = service.getOrders();
			RequestDispatcher rd = req.getRequestDispatcher("/orderList.jsp");
			req.setAttribute("ordersList", orders);
			req.setAttribute("role", role);
			rd.forward(req, resp);
		}else if ("bookList".equals(buttonType)) {
		    req.setAttribute("role", role);
		    // calling the method of BookServlet class with attribute
		    BookServlet bookServlet = new BookServlet();
		    bookServlet.doPost(req, resp);
		}
	}
	
}
