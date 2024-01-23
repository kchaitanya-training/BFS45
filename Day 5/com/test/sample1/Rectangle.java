package com.test.sample1;

public class Rectangle {

	int l = 5;
	int w = 4;
	int perimeter, area;
	
	void calculate() {
		perimeter = 2*(l+w);
		area = l * w;
		
		System.out.println("Area of Rectangle: "+ area);
		System.out.println("Perimeter of Rectangle: "+ perimeter);
	}
}
