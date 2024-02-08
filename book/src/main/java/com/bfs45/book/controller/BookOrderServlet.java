package com.bfs45.book.controller;

import com.bfs45.book.dao.OrderDAO;
import com.bfs45.book.model.Order;
import com.bfs45.book.model.User;
import com.bfs45.book.service.OrderService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@WebServlet("/BookOrderServlet")
public class BookOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String[] bookIdList=req.getParameterValues("listofbookid");
        PrintWriter pw = resp.getWriter();

        if (bookIdList == null) {
            pw.write("<h1>Select Books!</h1>");
        } else {
            User user = (User) getServletContext().getAttribute("user");

            Random rd=new Random();
            int randomNum;

            try {
                OrderService service = new OrderService();
                OrderDAO orderDAO = new OrderDAO();

                for(String bookId : bookIdList) {
                    randomNum = rd.nextInt(1000);
                    Order order = orderDAO.createOrderObject(randomNum, Integer.parseInt(bookId), user.getUserID());
                    service.saveOrder(order);
                }

                pw.write("<h1>");
                pw.write("Order created for " + user.getUsername());
                pw.write("</h1>");
            } catch (Exception e) {
                e.printStackTrace();
                pw.write("<h1>");
                pw.write("Unable to create order.");
                pw.write("<br />");
                pw.write(e.toString());
                pw.write("</h1>");
            }
        }

    }
}
