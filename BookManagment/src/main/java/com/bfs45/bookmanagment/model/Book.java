package com.bfs45.bookmanagment.model;

public class Book {
	
	private int bookId;
	
    private String bookName;
    
    private String bookDescription;
    
    
    private String bookPrice;
    
    
    


	public Book() {
		
	}





	public Book(int bookId, String bookName, String bookDescription, String bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.bookPrice = bookPrice;
	}





	public int getBookId() {
		return bookId;
	}





	public void setBookId(int bookId) {
		this.bookId = bookId;
	}





	public String getBookName() {
		return bookName;
	}





	public void setBookName(String bookName) {
		this.bookName = bookName;
	}





	public String getBookDescription() {
		return bookDescription;
	}





	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}





	public String getBookPrice() {
		return bookPrice;
	}





	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
    
    
    
}
