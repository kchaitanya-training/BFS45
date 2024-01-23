package keywords;

public class Main {
	public static void main(String[] args) {
		float radius = 8.7f;
		float area; 
		Circle shape1 = new Circle("Circle", radius);
		area = shape1.calculateArea();
		System.out.println(shape1.shapeName + " area with radius " + radius + " is: " + area);
	}

}
