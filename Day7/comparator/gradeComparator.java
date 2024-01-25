package com.comparator;

import java.util.Comparator;

public class gradeComparator implements Comparator<Grades>{

	@Override
	public int compare(Grades o1, Grades o2) {
		
		return o1.getGrade()-o2.getGrade();
	}

}
