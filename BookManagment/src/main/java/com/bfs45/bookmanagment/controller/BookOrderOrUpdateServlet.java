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

@WebServlet("/bookOrderOrUpdateServlet")
public class BookOrderOrUpdateServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String[] s = req.getParameterValues("listofbookid");
		String buttonType = req.getParameter("buttonid");

		if ("order".equals(buttonType)) {

			// logic to order

		} else if ("update".equals(buttonType)) {

			if (s.length == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("/bookupdate.jsp");
				BookService service = new BookService();
				Book book = service.getBooks(Integer.valueOf(s[0]));
				req.setAttribute("book", book);
				rd.forward(req, resp);
			}

		}

	}
}
