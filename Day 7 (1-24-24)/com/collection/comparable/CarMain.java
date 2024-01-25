// Using comparable to sort the array list

package com.collection.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car("Volvo", "XC90", 2022);
		Car car2 = new Car("Toyota", "Tacoma", 2018);
		Car car3 = new Car("BMW","4 Series", 2024);
		Car car4 = new Car("Volvo", "V60", 2023);
		Car car5 = new Car("Toyota", "Tacoma", 2024);
		
		List<Car> carList = new ArrayList<>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
		
		System.out.println("Unsorted car list:");
		for(Car car: carList) {
			System.out.println("\t" + car);
		}
		
		System.out.println("Sorted car list based on year:");
		Collections.sort(carList);
		
		for(Car car: carList) {
			System.out.println("\t" + car);
		}
		
	}
}
