package com.bfs45.book.dao;

import com.bfs45.book.model.Order;
import com.bfs45.book.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    Connection connection;
    BookDAO bookDAO;
    UserDAO userDAO;

    public OrderDAO() throws SQLException, ClassNotFoundException {
        this.connection = DBUtil.getConnection();
        this.bookDAO = new BookDAO();
        this.userDAO = new UserDAO();
    }

    public Order createOrderObject(int OrderID, int BookID, String UserID) throws SQLException {
        return new Order(
                OrderID,
                this.bookDAO.getBook(BookID),
                this.userDAO.getUserWithID(UserID)
        );
    }

    public Order getOrder(int OrderID) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("SELECT order_id, book_id, user_id FROM orders WHERE order_id = ?");

        ps.setInt(1, OrderID);
        ps.execute();

        ResultSet result = ps.getResultSet();
        result.next();

        return this.createOrderObject(
                result.getInt(1),
                result.getInt(2),
                result.getString(3)
        );
    }

    public List<Order> getAllOrders() throws SQLException {
        List<Order> allOrders = new ArrayList<>();
        PreparedStatement ps = this.connection.prepareStatement("SELECT order_id, book_id, user_id FROM orders");
        ps.execute();

        ResultSet result = ps.getResultSet();
        while(result.next()) {
            allOrders.add(this.createOrderObject(
                    result.getInt(1),
                    result.getInt(2),
                    result.getString(3)
            ));
        }

        return allOrders;
    }

    public void addOrder(Order order) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("INSERT INTO orders(order_id, book_id, user_id) VALUES (?, ?, ?)");

        ps.setInt(1, order.getOrderID());
        ps.setInt(2, order.getBook().getBookID());
        ps.setString(3, order.getUser().getUserID());

        ps.execute();
    }

    public int deleteOrder(Order order) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("DELETE FROM orders WHERE order_id=?");

        ps.setInt(1, order.getOrderID());

        return ps.executeUpdate();
    }
}
