package com.test.sample1;

import com.test.sample2.*; 
//importing class methods from another package
public class Dhawa {
	public void methodA(){
		System.out.println("Dhawa is my first name.");
		HarryPotter b = new HarryPotter();
		b.notMyName();

	}
	public static void main(String[] args) {
		Dhawa Name = new Dhawa();
		Name.methodA();
		
	}
	
}
class Lama{
	void methodB() {
		System.out.println("Lama is my last name.");
	}
}

