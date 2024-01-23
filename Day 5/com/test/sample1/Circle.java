package com.test.sample1;
import com.test.sample2.*;

public class Circle {

	final float pi = 3.14f;
	int radius = 4;
	float area, perimeter;
	
	void calculateAll() {
		
		// Class and its object from different package
		Area a = new Area();
		area = a.areaCircle(radius,pi);
		Perimeter p = new Perimeter();
		perimeter = p.perimeterCircle(radius, pi);
		System.out.println("Area of circle: " + area);
		System.out.println("Perimeter of circle: " + perimeter);
		
		// same package class and its object
		Rectangle r = new Rectangle();
		r.calculate();
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.calculateAll();
	}
}
