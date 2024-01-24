package com.sample3;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "hello123";
		
		char[]  c = str.toCharArray();
		
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

}
