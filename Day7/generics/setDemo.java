package com.generics;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
	
	static <T> void print(Set<T> set) {
		for(T item : set) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet();
		s.add(10);
		s.add(3);
		s.add(5);
		s.add(1);
		s.add(4);
//		System.out.println(s);
		print(s); 
		
		Set<String> s1 = new HashSet();
		s1.add("bbb");
		s1.add("ddd");
		s1.add("aaa");
		s1.add("ccc");
		s1.add("eee");

		print(s1);
		

	}

}
