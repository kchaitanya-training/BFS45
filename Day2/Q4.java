/*
 * Write program to express overloading and override method in between parent and child relation
 * */

public class Q4 {

	public static void main(String[] args) {
		
		Car c1 = new BMW();
		c1.print();
		c1.print("BMW");
		
		Car c2 = new Porsche();
		c2.print();
		c2.print("Porsche");
	}
}

class Car {
	
	// method overloading
	void print() {
		System.out.println("This is a  Car.");
	}
	
	void print(String name) {
		System.out.println("This is a parent method for "+ name);
	}
	
}

class BMW extends Car{
	// method overriding
	@Override
	void print() {
		System.out.println("This is a BMW.");
	}
	
}

class Porsche extends Car{
	
	@Override
	void print() {
		System.out.println("This is a Porsche.");
	}
}
