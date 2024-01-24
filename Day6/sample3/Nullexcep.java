package com.sample3;
//Null pointer exception handled with try catch

public class Nullexcep {
	public static void main(String[] args) {
		String s = null;
		
		
		try {
			
			s.charAt(0);
			//int i = 4/0;
		
		}
		catch (NullPointerException e) {
			System.out.println("Null pointer Exception");
		}
		System.out.println("the given string: " + s);
	}

}
