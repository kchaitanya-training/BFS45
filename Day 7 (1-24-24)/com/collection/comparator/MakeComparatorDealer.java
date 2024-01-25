package com.collection.comparator;
import java.util.Comparator;
public class MakeComparatorDealer implements Comparator<Dealer>{

	@Override
	public int compare(Dealer o1, Dealer o2) {
		// TODO Auto-generated method stub
		return o1.getMake().compareTo(o2.getMake());
	}

}
