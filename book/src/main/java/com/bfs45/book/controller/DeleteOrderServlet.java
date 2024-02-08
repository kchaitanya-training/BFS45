package com.bfs45.book.controller;

import com.bfs45.book.dao.OrderDAO;
import com.bfs45.book.model.Order;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/DeleteOrderServlet")
public class DeleteOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] orderIdList=req.getParameterValues("listoforderid");
        PrintWriter pw = resp.getWriter();

        if (orderIdList == null) {
            pw.write("<h1>Select orders!</h1>");
        } else {
            try {
                OrderDAO dao = new OrderDAO();

                for (String orderId:orderIdList) {
                    Order order = dao.getOrder(Integer.parseInt(orderId));
                    dao.deleteOrder(order);
                }

                resp.sendRedirect("/book/OrderServlet");
//            pw.write("<h1>Orders Deleted</h1>");
            } catch (SQLException | ClassNotFoundException e) {
                pw.write("<h1>"+ e +"</h1>");
            }
        }

    }
}
