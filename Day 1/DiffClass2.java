package dhawalama;

public class DiffClass2 {
	
	DiffClass2(){                //constructor
		System.out.println("the number is Negative.");
	}  
	
	public boolean isNeg(int a, int b) {
		if ((a-b) < 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		DiffClass2 number = new DiffClass2();
		System.out.println(number.isNeg(4,3));
	}
}
