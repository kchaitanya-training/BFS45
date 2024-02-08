package com.bfs45.book.service;

import com.bfs45.book.dao.OrderDAO;
import com.bfs45.book.model.Order;

import java.sql.SQLException;

public class OrderService {
    public void saveOrder(Order order) throws SQLException, ClassNotFoundException {
        OrderDAO dao = new OrderDAO();

        dao.addOrder(order);
    }
}
