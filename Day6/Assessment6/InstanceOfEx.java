package com.day6;

public class InstanceOfEx {

	public static void main(String[] args) {
		
		InstanceOfEx i = new InstanceOfEx();
		
		if(i instanceof InstanceOfEx) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
