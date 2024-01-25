package com.collection.comparator;
import java.util.Comparator;
public class YearComparatorDealer implements Comparator<Dealer>{

	@Override
	public int compare(Dealer o1, Dealer o2) {
		 return (o1.getYear() < o2.getYear() ) ? -1 : 
			 ((o1.getYear() == o2.getYear() ) ? 0 : 1);
	}
}
