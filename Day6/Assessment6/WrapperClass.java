package com.day6;

public class WrapperClass {

	public static void main(String[] args) {
		
		int num = 10;
		boolean bb = false;
		
		// primitive to wrapper objects
		Integer i1 = Integer.valueOf(num);
		System.out.println(i1);
		System.out.println(i1 instanceof Integer);
		
		Double d1 = Double.valueOf(num);
		System.out.println(d1);
		System.out.println(d1 instanceof Double);
		
		Float float1 = Float.valueOf(num);
		System.out.println(float1);
		System.out.println(float1 instanceof Float);
		
		Boolean b = Boolean.valueOf(bb);
		System.out.println(b);
		System.out.println(b instanceof Boolean);
		
		
		
	}

}
