package com.sajan.bookmanagement.controller;

import com.sajan.bookmanagement.model.Book;
import com.sajan.bookmanagement.service.BookService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BookService bookService = new BookService();
        List<Book> books = bookService.getBooks();

        String role = (String) req.getAttribute("role");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("books.jsp");
        req.setAttribute("books", books);
        requestDispatcher.forward(req, resp);

    }

}
