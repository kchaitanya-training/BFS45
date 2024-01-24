// Parent - Child Reference 
package com.relationship;
class Circle implements Shape{

	float radius;
	String shapeName;
	
	Circle(String shapeName, float radius){
		this.shapeName = shapeName;
		this.radius = radius;
	}
	@Override
	public void area() {
		float area = (float)(Math.PI * Math.pow(radius, 2));
		System.out.println(shapeName + " Area with radius "+ radius + ": " + area);
	}

	@Override
	public void perimeter() {
		float perimeter = (float)(2*Math.PI*radius);
		System.out.println(shapeName + " Perimeter with radius "+ radius + ": " + perimeter);
		
	}

	@Override
	public void diameter() {
		float diameter =2*radius;
		System.out.println(shapeName + " Diameter with radius "+ radius + ": " + diameter);
	}
	
	public static void main(String[] args) {
		Shape circle = new Circle("Circle", 4.5f);
		circle.area();
		circle.perimeter();
		circle.diameter();
	}
}
