package com.exception;

public class NullException {
	void exception(String str) {
		try {
			char[] array = str.toCharArray();
			int startIndex = 0;
			int endIndex = array.length - 1;
			
			while(startIndex < endIndex) {
				char temp = array[startIndex];
				array[startIndex] = array[endIndex];
				array[endIndex] = temp;
				startIndex++;
				endIndex--;
			}
			String reverseStr = new String(array);
			System.out.println("Reverse of string \"" + str + "\" is " + reverseStr);
			
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception caught!");
		}
	}
	
	void checkFullName(String fullName) {
		int length = fullName.length();
		// Custom exception: If the full name length is more than 5 then full name is printed
		// However, if the full name length is less than 5, then a custom exception is thrown
		try {
			if(length > 5) {
				System.out.println("Full name: "+ fullName);
			}else {
				throw new CustomExceptionPrompt("This is not a full name. Enter again!");
			}
		}catch(CustomExceptionPrompt e) {
			System.out.println("***Error caught: Custom Exception***\n" + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		NullException check = new NullException();
		String str = null;
		check.exception(str);              // check for null pointer exception
		String str1 = "123";
		check.exception(str1);
		
		check.checkFullName("A");         // custom exception 

	}
}


class CustomExceptionPrompt extends Exception{
	CustomExceptionPrompt(String s){
		super(s);
	}
}

