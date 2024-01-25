package com.collection.comparator;
// Using comparator to sort the array list
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DealerMain {

	public static void main(String[] args) {
		
		Dealer car1 = new Dealer("Volvo", "XC90", 2022);
		Dealer car2 = new Dealer("Toyota", "Tacoma", 2024);
		Dealer car3 = new Dealer("BMW","4 Series", 2024);
		Dealer car4 = new Dealer("Volvo", "XC60", 2023);
		Dealer car5 = new Dealer("Toyota", "Tacoma", 2015);
		Dealer car6 = new Dealer("Hyundai", "Tucson", 2023); 
		
		List<Dealer> dealerList = new ArrayList<>();
		dealerList.add(car1);
		dealerList.add(car2);
		dealerList.add(car3);
		dealerList.add(car4);
		dealerList.add(car5);
		dealerList.add(car6);
		
		System.out.println("Unsorted car list:");
		for(Dealer car: dealerList) {
			System.out.println("\t" + car);
		}
		
		System.out.println("Sorted car list in ascending order:");
		// Sorting logic:
		// Compare make first, 
		// If the make is same, then compare model,
		// If the make and model is same, then compare year
		Collections.sort(dealerList, new MakeComparatorDealer()
											.thenComparing(new ModelComparatorDealer())
											.thenComparing(new YearComparatorDealer()));
		
		for(Dealer car: dealerList) {
			System.out.println("\t" + car);
		}
	}
}
