package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static <T> void print(List<T> list) {
		for(T item : list) {
			System.out.println(item);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		List<Grades> list = new ArrayList();
		list.add(new Grades(123, "Max", 'B'));
		list.add(new Grades(211, "John", 'A'));
		list.add(new Grades(122, "Ben", 'D'));
		list.add(new Grades(100, "Alex", 'C'));

		//unsorted list
		print(list);
		
		System.out.println("Sort list based on ID:");
		Collections.sort(list, new idComparator());
		print(list);
		
		System.out.println("Sort list based on names:");
		Collections.sort(list, new nameComparator());
		print(list);
		
		System.out.println("Sort list based on grades:");
		Collections.sort(list, new gradeComparator());
		print(list);
	}

}
