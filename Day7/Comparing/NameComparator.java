package Comparing;

import java.util.Comparator;

public class NameComparator implements Comparator<Detail> {
	
	
	@Override
	public int compare(Detail o1, Detail o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	

}
