package com.bfs45.bookmanagment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.bfs45.bookmanagment.model.Order;
import com.bfs45.bookmanagment.util.DBUtil;

public class OrderDao {
		
		public Set<Order> getOrders() throws SQLException{
			
			Connection con=DBUtil.getConnection();
			PreparedStatement ps = null;
			HashSet<Order> orders=new HashSet<Order>();
			try {
				ps=con.prepareStatement("SELECT * FROM ORDERS");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					Order order=new Order();
					order.setOrderId(rs.getString(1));
					order.setUserId(rs.getString(2));
					order.setBookId(rs.getInt(3));
					order.setStatus(rs.getString(4));
					orders.add(order);
				}
				return orders;
			}finally {
				try {
					ps.close();
					DBUtil.closeConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
			
		
		public Order getOrders(int orderId) throws SQLException{
			
			Connection con=DBUtil.getConnection();
			PreparedStatement ps = null;
			Order order=new Order();
			try {
				ps=con.prepareStatement("SELECT * FROM ORDERS where order_id=?");
				ps.setInt(1, orderId);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					
					order.setOrderId(rs.getString(1));
					order.setUserId(rs.getString(2));
					order.setBookId(rs.getInt(3));
					order.setStatus(rs.getString(4));
					
				}
				return order;
			}finally {
				try {
					ps.close();
					DBUtil.closeConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
		
		@SuppressWarnings("resource")
		public boolean addOrders(Order newOrder) throws SQLException{
	        Connection con =  DBUtil.getConnection();
	        PreparedStatement preparedStatement = null;

	        try {
	         
	            // Add the new book
	            preparedStatement = con.prepareStatement("INSERT INTO ORDERS (order_id, user_id, book_id, status)"
	                    									+ "VALUES (?, ?, ?, ?)");

	            preparedStatement.setString(1, newOrder.getOrderId());
	            preparedStatement.setString(2, newOrder.getUserId());
	            preparedStatement.setInt(3, newOrder.getBookId());
	            preparedStatement.setString(4, newOrder.getStatus());

	            int rowsUpdated = preparedStatement.executeUpdate();
	            return rowsUpdated > 0;

	        }finally {
				try {
					preparedStatement.close();
					DBUtil.closeConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }
}
