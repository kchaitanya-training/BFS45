package com.bean.xml;

public class Circle {

	void methodCircle(float radius) {
		System.out.println("Shape Name: Circle");
		float area = (float) (Math.PI * Math.pow(radius, 2));
		System.out.println("Area of radius ("+ radius + "): " + area);
	}
}
