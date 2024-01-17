package dhawalama;

public class DiffClass1 {
	public int sub (int x) {
		int sub;
		sub = x - add(3,4)  ;
		return sub;
	}
	public int add (int y, int z) {
		int sum = y + z;
		return sum;
		
	}
	
	public static void main(String[] args) {
		DiffClass1 addition = new DiffClass1();
		System.out.println("sub: " + addition.sub(2));
	}

}
