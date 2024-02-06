package com.bfs45.bookmanagment.service;

import java.sql.SQLException;
import java.util.Random;
import java.util.Set;

import com.bfs45.bookmanagment.dao.BookDao;
import com.bfs45.bookmanagment.dao.OrderDao;
import com.bfs45.bookmanagment.model.Order;

public class OrderService {
	
	public Set<Order> getOrders(){
			
			OrderDao orderDao=new OrderDao();
			try {
				return orderDao.getOrders();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		public Order getOrders(String orderId){
				
			OrderDao orderDao=new OrderDao();
				try {
					return orderDao.getOrders(orderId);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
		}
		
		public boolean addOrders(Order newOrder){
			
			OrderDao orderDao=new OrderDao();
			try {
				Random rd=new Random();
				int randomNum=rd.nextInt(500);
				newOrder.setOrderId(newOrder.getUserId()+"_"+ newOrder.getBookId()+"_"+randomNum);
				return orderDao.addOrders(newOrder);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	}
		
		public boolean deleteOrder(String order_id) {

			OrderDao orderDao=new OrderDao();
			try {
				return orderDao.deleteOrder(order_id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}
}