package com.collection.comparator;
import java.util.Comparator;
public class ModelComparatorDealer implements Comparator<Dealer>{
	
	@Override
	public int compare(Dealer o1, Dealer o2) {
		// TODO Auto-generated method stub
		return o1.getModel().compareTo(o2.getModel());
	}
}
