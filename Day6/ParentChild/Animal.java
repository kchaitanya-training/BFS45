package com.day6;

public class Animal {
	
	String name;

	Animal(String name){
		this.name = name;
	}
	
	void sleep() {
		System.out.println(name + " is sleeping...");
	}

}
