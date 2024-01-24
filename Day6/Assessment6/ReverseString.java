package com.day6;

public class ReverseString {
	
	// for loop
//	void reverse(String s) {
//		
//		char[] c = s.toCharArray();
//		String reverse = "";
//		for(int i=c.length-1; i>=0; i--) {
//			reverse += c[i];
//		}
//		System.out.println(reverse);
//	}
	

	 //while loop
	void reverse(String s) {
		char[]  c = s.toCharArray();
		
		int size = c.length;
		int mid = size/2;
		char temp;
		int i=0;
		while (i<mid) {
			temp = c[i];
			c[i] = c[size-i-1];
			c[size-i-1] = temp;
			i++;
			
		}
		System.out.println(String.copyValueOf(c));
	}
	


	public static void main(String[] args) {
		
		String s = "hello123";
		ReverseString r = new ReverseString();
		r.reverse(s);

	}

}
