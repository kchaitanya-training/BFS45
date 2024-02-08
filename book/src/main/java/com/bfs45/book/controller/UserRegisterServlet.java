package com.bfs45.book.controller;

import com.bfs45.book.model.User;
import com.bfs45.book.service.UserRegisterService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        User user=new User(username,password,role);

        UserRegisterService service=new UserRegisterService();
        String userID;
        try {
            userID = service.createUser(user);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        RequestDispatcher rd=req.getRequestDispatcher("/success.jsp");
        req.setAttribute("userID", userID);
        req.setAttribute("username", user.getUsername());
        req.setAttribute("role", user.getRole());
        rd.forward(req, resp);
    }
}
