package com.bfs45.bookmanagment.controller;

import java.io.IOException;

import com.bfs45.bookmanagment.model.Order;
import com.bfs45.bookmanagment.service.OrderService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/orderBook")
public class BookOrderServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve book details from the request parameters
        String book_Id = request.getParameter("book_id");
        int bookId = Integer.valueOf(book_Id);
        String userId = request.getParameter("user_id");
        String status = "Pending";
        String role = request.getParameter("role");
		request.setAttribute("role", role);
		
		
        Order newOrder = new Order(userId, bookId, status);
        
        // Use orderService to add the order book to the database
        OrderService orderService = new OrderService();
        boolean addSuccess = orderService.addOrders(newOrder);

        if (addSuccess) {
            System.out.println("Order added successfully");
			RequestDispatcher rd=request.getRequestDispatcher("/bookServlet");
			request.setAttribute("role", role);
			rd.forward(request, response);
        } else {
            response.getWriter().write("Failed to add the order");
        }
    }
}
