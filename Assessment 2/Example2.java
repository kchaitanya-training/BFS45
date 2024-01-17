// Qno 2
// Same example like Assessment 1 but using constructor arguments and 
// also creating the object and define instance variables.
public class Example2 {

	final float pi = 3.14f;
	float radius; 
	String shape;
	float diameter;
	float area;
	int side;

	// argument constructor 
	Example2(String shape, float radius){
		this.shape = shape;
		this.radius = radius; 
	}
	
	Example2(String shape, int side){
		this.shape = shape;
		this.side = side;
	}
	
	// function to calculate the area and diameter of circle
	void calculate() {
		if(shape == "Circle") {
			diameter = 2 * radius;
			area = pi * (radius*radius);
			System.out.println(shape + " Diameter with radius " + radius + ": " + diameter);
			System.out.println(shape + " Area with radius " + radius + ": " + area);
		}else {
			area = side*side;
			diameter = (float) (side * Math.sqrt(side));
			System.out.println(shape + " Diameter with side " +side + ": " + diameter);
			System.out.println(shape + " Area with side " +side + ": " + diameter);
		}
	}

	public static void main(String[] args) {
		
		// creating an object name shape1 for class Example2 and calling its constructor with arguments
		Example2 shape1 = new Example2("Circle", 5.4f);
		shape1.calculate();				
		
		//creating another object and calling its matching constructor with arguments
		Example2 shape2 = new Example2("Square", 7);
		shape2.calculate();				 
		
	}
}


//Sample Output:
//Circle Diameter:10.8
//Circle Area:91.56241
//Square Diameter:18.52026
//Square Area:49.0
