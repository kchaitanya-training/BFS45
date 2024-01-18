/*
 * write a program to construct argument constructor and creating the object and define instance variables.
 * */
public class Q2 {
	
	// Declare instance variables
	int v1;
	double v2;
	
	// Constructor
	Q2(int a, float b){
		System.out.println("int: " + a + ", float: "+ b);
		this.v1 = 20; // Initialize instance variables
		this.v2 = 30.34;
	}
	
	
	public static void main(String[] args) {
		Q2 q = new Q2(10,10.3f);
		System.out.println("instance variable1: "+ q.v1); //access instance variable using object reference.
		System.out.println("instance variable2: "+ q.v2);
	}

}
