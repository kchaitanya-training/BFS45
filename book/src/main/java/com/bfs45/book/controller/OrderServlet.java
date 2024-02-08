package com.bfs45.book.controller;

import com.bfs45.book.dao.OrderDAO;
import com.bfs45.book.model.Order;
import com.bfs45.book.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        try {
            OrderDAO dao = new OrderDAO();
            List<Order> allOrders = dao.getAllOrders();

            User user = (User) getServletContext().getAttribute("user");

            if (!user.getRole().equals("admin")) {
                PrintWriter pw = resp.getWriter();
                pw.write("<h1>Unauthorized</h1>");
            } else {
                req.setAttribute("allOrders", allOrders);
                req.setAttribute("userID", user.getUserID());
                req.setAttribute("user", user.getUsername());
                req.setAttribute("role", user.getRole());

                RequestDispatcher dispatch = req.getRequestDispatcher("orders.jsp");
                dispatch.forward(req, resp);
            }
        } catch (NullPointerException e) {
            resp.sendRedirect("/book/login.jsp");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
