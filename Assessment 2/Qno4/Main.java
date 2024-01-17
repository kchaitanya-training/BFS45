// Qno4 
//Write program to express overloading and override method in between parent and child relation
package overloadOverride;

public class Main {

	public static void main(String[] args) {
		//Parent class object
		Shape shape = new Shape();
		shape.calculateArea();	// Parent class method
		shape.calculatePerimeter();
		
		
		// Child class object
		Circle circle = new Circle("Circle", 5f);
		circle.calculateArea(); 		// overriding the method of parent class
		circle.calculatePerimeter();    // overriding
		
		circle.calculateArea(5.5f, 3.5f); //overloading the same method 
	
	}
}
