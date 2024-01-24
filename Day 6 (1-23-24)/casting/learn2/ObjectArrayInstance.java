// instanceOf & contains condition being used
package com.casting.learn2;
public class ObjectArrayInstance {

	public static void main(String[] args) {
		
		Object[] object = new Object[5];
		object[0] = new Car();
		object[1] = new Bike();// class Test2 cannot be cast to class Test1
 
		object[2] = "Plane";
		object[3] = 5;
		object[4] = false;

		for (Object o : object) {
			if(o instanceof Bike) {
				Bike bike = (Bike)o;
				bike.vehicleInfo();
				System.out.println("\tUsed instanceOf condition.");
			}
			System.out.println(o);
		}
		
		for (Object o : object) {
			if (o.getClass().toString().contains("Car")) {
				Car car = (Car) o;
				car.vehicleInfo();
				System.out.println("\tUsed contains condition");
			}
		}}
}

class Car {
	void vehicleInfo() {
		System.out.println("This is a car.");
	}
}

class Bike {
	void vehicleInfo() {
		System.out.println("This is a bike.");
	}
}

