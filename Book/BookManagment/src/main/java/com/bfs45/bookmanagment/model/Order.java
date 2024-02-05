package com.bfs45.bookmanagment.model;

public class Order {

	private String orderId;
	private String userId;
	private int bookId;
	private String status;
	
	public Order(String userId, int bookId, String status) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.status = status;
	}

	
	public Order() {
		// TODO Auto-generated constructor stub
	}


	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
