package dhawalama;


public class DhawaLama {
	String myFirstMethod() {
		System.out.println("MyFirstMethod");
		return "D";
	}
	String mySecondMethod() {
		System.out.println("MySecondMethod");
		return "N";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		DhawaLama first = new DhawaLama();
		first.myFirstMethod();
		
		DhawaLama Second = new DhawaLama();
		Second.mySecondMethod();
	
	}

}
