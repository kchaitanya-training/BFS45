package com.annotation;

public class Circle {

	void methodCircle(float radius) {
		System.out.println("\tShape Name: Circle");
		float area = (float) (Math.PI * Math.pow(radius, 2));
		System.out.println("\tArea with radius ("+ radius + "): " + area);
	}
}
