package com.sample;

public class Child extends Parent{
	@Override
	void method1() {
		super.method1();
		System.out.println("it is not argument");
	}
	void method3() {
		System.out.println("it is method3 in child class");
	}
	
	public static void main(String[] args) {
		Parent ch = new Child();
		ch.method1();
		
		ch.method2(10);
		
		Child p1 = new Child();
		p1.method1();
		
		Parent p2 = (Parent)ch;
		
	}

}
