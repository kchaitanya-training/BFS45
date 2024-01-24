package com.sample;

//instanceof condition example with downcasting and upcasting

class Animal {
	void eat () {
		System.out.println("All animal eat.");
	}
}

class Rhino extends Animal{
	void horns() {
		System.out.println("Rhinos have horn.");
	}
	
}
	
public class MainInstanceof{	
	public static void main(String[] args) {
		Rhino ri = null;
		System.out.println(ri instanceof Animal);
		
		
		Animal R = new Rhino(); //upcasting (instance R of the Rhino class is assigned to reference variable of Animal class.
		R.eat();
		
		//Downcasting //R reference is downcasted to the Dog class, allowing access to the specific methods of the Dog class.
		if (R instanceof Rhino) {
			Rhino r = (Rhino) R; //performs downcasting. It takes the existing animal reference (which is of type Animal) and explicitly casts it to a Dog reference. This allows you to access the specific methods and fields of the Dog class.
			r.horns();
		}
	}
	
}