package com.day6;

public class StringException {

	public static void main(String[] args) {
		
		String string = null;
		
		try {
//			string.charAt(0);
//			string.contains("s");
			string.endsWith("a");
		} catch (Exception e) {
			System.out.println("null pointer exception");
		}
		

	}

}
