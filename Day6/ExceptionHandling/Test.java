package com.day6;

public class Test {
	
	void method1() {
		System.out.println("hi");
		
		int a = 10;
		int b = a + 2;
		//b /= 0; // anything below this line won't execute.
		
		// try catch to handle exception.
		try{
			b/=0;
		} catch(Exception e) {
			System.out.println("arithmetic exception.");
		}
		
		System.out.println(b);
		System.out.println("End");
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.method1();
		
	}
}
