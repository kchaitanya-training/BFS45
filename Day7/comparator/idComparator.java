package com.comparator;

import java.util.Comparator;

public class idComparator implements Comparator<Grades>{

	@Override
	public int compare(Grades o1, Grades o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	

}
