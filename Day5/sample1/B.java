package com.test.sample1;
import com.test.sample2.*;

public class B extends ForBclass{
	protected void methodB() {
		System.out.println("this is class B");
		methodforB();
	}
	public static void main(String[] args) {
		B b = new B();
		b.methodB();
		
	}

}
