package com.day6;

public class ObjectArray {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		Object[] obj = new Object[5]; //Object array
		
		obj[0] = t1;
		obj[1] = new Test2();
		obj[2] = "hi";
		obj[3] = 10;
		obj[4] = true;
		
		// Casting - Can't cast from parent to child.
//		Test2 t2 = (Test2) obj[1]; // down casting.
//		t2.method2();
		
		int[] arr = {1,2,3};
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println(t1.getClass().toString());

		for (Object o : obj) {
			if(o.getClass().toString().contains("Test2")) {
				// o is Test2 object
				Test2 t3 = (Test2) o; // down casting 
				t3.method2();
			} else if(o instanceof Test) { // another way 
				Test t = (Test)o;
				t.method();
			}
			System.out.println(o);
		}
	}

}
