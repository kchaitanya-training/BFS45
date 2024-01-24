package com.day6;

public class Dog extends Animal {
	
	
	Dog(String name) {
		super(name);
		System.out.println("Name: " + name);
	}


	void eat() {
		super.sleep();
		System.out.println( name + " is eating...");
	}
	
	@Override
	void sleep() {
		System.out.println(name + " is not sleeping...");
	}


	public static void main(String[] args) {
		
		// upcasting
		Animal d = new Dog("Benji");
		//d.eat();  Can't access child methods using Parent reference.
		d.sleep(); // overridden method is called.
		
		// implicit downcasting
		// Dog dg = new Animal(); Can't create Animal object using Dog reference.
		
		Dog d2 = new Dog("Max");
		d2.eat();
		
		// Dog d3 = (Animal)Dog("lucy"); Can't cast from parent to child.
		
		//explicit upcasting
		Animal d4 = (Animal)d2; // casting child as parent.
		d4.sleep();
		// d4.eat(); //since we up casted Dog object "d2" to be of type Animal, we can't access Dog's method.
		
		// Downcasting explicitly
		Dog dog = (Dog)d; // d is Animal's reference
		System.out.println(dog.name);
		dog.eat();
		
		System.out.println(d instanceof Animal);
	}

}
