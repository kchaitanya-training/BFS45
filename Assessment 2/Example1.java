// Qno 1
// Program to calculate the radius & diameter of a Circle & 
// Also taking user initial guess for diameter and checking whether the guess is correct or not
// Program contains two methods with parameters, where one method calls to another method and 
// execute or call that method with object reference.
public class Example1 {

	final float pi = 3.14f;

	// function to calculate the area and diameter of circle and return back diameter
	float calculate(float radius) {
		String shape = "Circle";
		float diameter;
		float area;
		diameter = 2 * radius;
		area = pi * (radius*radius);
		System.out.println(shape + " Diameter:" + diameter);
		System.out.println(shape + " Area:" + area);
		return diameter; 
	}
	
	void matchDiameter(float radius, float diameterGuess) {
		
		boolean check = false; 
		float diameter = calculate(radius);		// calling the function calculate
		
		// checking whether the user initial guess diameter matches the calculated radius
		if(diameter == diameterGuess) {
			check = true;				// if the radius matches, then set check to true
		}
		System.out.println("Does the user diameter guess match the calculated radius?-->" + check);
	}
	public static void main(String[] args) {
		Example1 test = new Example1();
		
		float radius = 5; 
		float diameterGuess = 10;			// user guessing the radius
		
		//check if user diameter guess is correct or not with boolean answer
		test.matchDiameter(radius, diameterGuess);
	}
}

//Sample Output
//Circle Diameter:10.0
//Circle Area:78.5
//Does the user diameter guess match the calculated radius?-->true
