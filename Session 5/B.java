package Sample2;

import Sample1.*;

public class B {
	public void methodB() {
		Y y = new Y();
		y.methodY();
		System.out.println("This is class B ");
		
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.methodB();
	}

}
