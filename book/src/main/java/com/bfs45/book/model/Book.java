package com.bfs45.book.model;

public class Book {
    int BookID;
    String BookName;
    String BookAuthor;
    String BookDescription;
    float BookPrice;

    public Book (int BookID, String BookName, String BookAuthor, String BookDescription, float BookPrice) {
        this.BookID = BookID;
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.BookDescription = BookDescription;
        this.BookPrice = BookPrice;
    }

    public int getBookID() {
        return BookID;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public String getBookDescription() {
        return BookDescription;
    }

    public float getBookPrice() {
        return BookPrice;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public void setBookDescription(String bookDescription) {
        BookDescription = bookDescription;
    }

    public void setBookPrice(float bookPrice) {
        BookPrice = bookPrice;
    }
}
