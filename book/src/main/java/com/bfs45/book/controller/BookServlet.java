package com.bfs45.book.controller;

import com.bfs45.book.dao.BookDAO;
import com.bfs45.book.model.Book;
import com.bfs45.book.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try {
            BookDAO dao = new BookDAO();
            List<Book> allBooks = dao.getAllBooks();

            User user = (User) getServletContext().getAttribute("user");

            req.setAttribute("allBooks", allBooks);
            req.setAttribute("userID", user.getUserID());
            req.setAttribute("user", user.getUsername());
            req.setAttribute("role", user.getRole());

            RequestDispatcher dispatch = req.getRequestDispatcher("books.jsp");
            dispatch.forward(req, resp);
        } catch (NullPointerException e) {
            resp.sendRedirect("/book/login.jsp");
        }
        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
