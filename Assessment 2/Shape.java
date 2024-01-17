//Qno5
// define argument method and pass input and return value in the same class.
public class Shape {

	float area; 
	final float pi = 3.14f;
	
	float circleArea(float radius) {
		area = pi * (radius*radius);
		return area;
	}
	
	int rectangleArea(int length, int width) {
		return (length * width);
	}
	
	float squareArea(float side) {
		return (side * side);
	}
	
	
	public static void main(String[] args) {
		
		Shape circle = new Shape();
		Shape rectangle = new Shape();
		Shape square = new Shape();
		
		System.out.println("Area of circle with radius 4.3: " + circle.circleArea(4.3f));
		System.out.println("Area of rectangle(l=4 & w=5): " + rectangle.rectangleArea(4,5));
		System.out.println("Area of square with side 6.2: " + square.squareArea(6.2f));
	}
}

//Sample output
//Area of circle with radius 4.3: 58.05861
//Area of rectangle(l=4 & w=5): 20
//Area of square with side 6.2: 38.44