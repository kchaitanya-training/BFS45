package com.bfs45.book.model;

public class Order {
    int orderID;
    Book book;
    User user;

    public Order(int orderID, Book book, User user) {
        this.orderID = orderID;
        this.book = book;
        this.user = user;
    }

    public Order(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public int getOrderID() {
        return orderID;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
