package com.bean.xml;

public class Shape {

	private float radius;
	private Circle circle;
	
	public Shape(float radius, Circle circle) {
		super();
		this.radius = radius;
		this.circle = circle;
	}
	
	void method() {
		System.out.println("Callng to Circle class");
		circle.methodCircle(radius);
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	
}
