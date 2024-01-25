package com.generics;

import java.util.*;

public class arrayListDemo {
	
	public static <T> void print(List<T> list) {
		
		for(T item : list) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		
		List<Character> l = new ArrayList();
		l.add('c');
		l.add('a');
		l.add('b');
		l.add('d');
		l.add('a');
		Collections.sort(l);
		print(l);
		
//		for(Character c : l) {
//			System.out.println(c);
//		}
		
		List<String> ls = new ArrayList();
		ls.add("apple");
		ls.add("orange");
		ls.add("banana");
		ls.add("kiwi");
		print(ls);
		
//		for(String s : ls) {
//			System.out.println(s);
//		}
	}

}
