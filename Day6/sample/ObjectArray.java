package com.sample;

//object Array

public class ObjectArray {
	
	public static void main(String[] args) {
		Test t1 = new Test();
		Object[] obj = new Object[5]; //Object array
		
		obj[0] = t1;
		obj[1] = 30;
		obj[2] = "thank you";
		obj[3] = new Parent();
		obj[4] = false;
		
		for(Object o: obj) {   //as the array type is array, there is Object. it could be String, Int
			if(o.getClass().toString().contains("Test")){
				Test tt = (Test)o; //down casting
				tt.test1();
				
			}
			
			else if(o instanceof Parent) {
				Parent r = (Parent) o;
				r.method1();
				
			}
			System.out.println(o);
		
	}
	}

}
