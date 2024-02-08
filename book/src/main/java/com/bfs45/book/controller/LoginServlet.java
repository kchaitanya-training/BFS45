package com.bfs45.book.controller;

import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;

import com.bfs45.book.model.User;
import com.bfs45.book.service.LoginService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        LoginService service=new LoginService();
        User user=service.authenticate(username, password);

        getServletContext().setAttribute("user", user);

        resp.sendRedirect("/book/BookServlet");

    }
}
