package com.comparator;

import java.util.Comparator;

public class nameComparator implements Comparator<Grades>{

	@Override
	public int compare(Grades o1, Grades o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
