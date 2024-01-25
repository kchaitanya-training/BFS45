package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static <T> void print(List<T> items) {
		for(T i : items) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		List<Grades> ls = new ArrayList();
		ls.add(new Grades(22, "john", 'B'));
		ls.add(new Grades(55, "sara", 'A'));
		ls.add(new Grades(11, "jane", 'B'));
		ls.add(new Grades(33, "max", 'C'));
		
		print(ls);
		System.out.println("Sorted List:");
		// sort
		Collections.sort(ls);
		print(ls);
		

	}

}
