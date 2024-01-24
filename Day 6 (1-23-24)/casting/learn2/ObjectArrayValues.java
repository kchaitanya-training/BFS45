// Define Object Array and store different values including object reference
package com.casting.learn2;
public class ObjectArrayValues {

	public static void main(String[] args) {
		
		Object[] obj = new Object[8];
		obj[0] = new Shape();					// storing Parent class object reference
		obj[1] = new Circle("Circle", 3.65f); 	// storing Child class object reference with constructor arguments
		obj[2] = ((Circle) obj[1]).calculate(); // calling the argument function that return area
		obj[3] = 5;								// integer 
		obj[4] = false;							// boolean
		obj[5] = 2.67f;							// float
		obj[6] = 'A';							// character
		obj[7] = "Learn Java";					// string
		
		for (Object o : obj) {
			System.out.println(o);
		}
	}
}

class  Shape {
	String shapeName;
	
	Shape() {System.out.println("This is parent class");}
	
	Shape(String shapeName){
		this.shapeName = shapeName;
	}
}

class Circle extends Shape {

	float radius;
	Circle(String shapeName, float radius) {
		super(shapeName);
		this.radius = radius;
	}
	
	float calculate() {
		float area =  (float) (Math.PI * Math.pow(radius, 2));
		return area;
	}
}
