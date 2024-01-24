package com.casting.learn2;

public class DownCasting {

	public static void main(String[] args) {
		
		Food food = new Food();
		food.humanFood();
		
		Human human = new Human();
		
		// Downcasting
		Food humanFood = (Food) human;
		humanFood.humanFood();
	}
}

class Food{
	void humanFood() {
		System.out.println("Parent class --> Human eatable food!");
	}
}

class Human extends Food{
	
	@Override
	void humanFood() {
		System.out.println("Child class --> Rice with spicy curry!");
	}
}

