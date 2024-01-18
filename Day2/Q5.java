/*
 * define argument method and pass input and return value in the same class.*/
public class Q5 {
	
	int area(int l, int b) {
		System.out.print("The area of a rectangle is: ");
		return l * b;
	}

	public static void main(String[] args) {
		
		Q5 q = new Q5();
		System.out.println(q.area(4, 5));

	}

}
