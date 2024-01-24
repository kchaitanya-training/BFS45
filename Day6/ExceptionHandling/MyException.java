package com.day6;

public class MyException extends Exception{

	public MyException(String s) {
		super(s);
		System.out.println("My own exception");
	}
	
	public static void main(String[] args) {
		
		MyException myException = new MyException("sonam");
		
		
		try {
			if(myException.toString().contains("s")) {
				System.out.println("true");
			}
			throw new MyException("my exception");
			
		}catch(MyException e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
		}
	}
}
