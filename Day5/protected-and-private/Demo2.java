package com.sonam.protectedAndPrivate;

public class Demo2 {
	
	// private methods can't be accessed anywhere outside of this class.
	private void test2() {
		System.out.println("This method is private.");
	}
	
	void print() {
		test2();
	}
	
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.print();
	}
}
