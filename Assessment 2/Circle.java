package overloadOverride;
//Child class
public class Circle extends Shape{
	
	String shapeName;
	float radius; 
	
	Circle(String shapeName, float radius){
		this.shapeName = shapeName;
		this.radius = radius; 
	}
	
	// overriding the two functions of parent class
	void calculateArea(){
		System.out.println("\nCalculating Area for "+ shapeName + " with radius "+radius);
		area = pi*(radius*radius);
		System.out.println("\t"+shapeName + " Area: "+ area);
	};
	void calculatePerimeter(){
		System.out.println("Calculating Perimeter for "+ shapeName + " with radius "+radius);
		perimeter = 2*pi*radius;
		System.out.println("\t"+shapeName + " Perimeter: "+ perimeter );
	};

	// Overloading 
	void calculateArea(float radius1, float radius2){
		area = pi*(radius1*radius1);
		System.out.println("Method overloading performed:");
		System.out.println("\t1st " + shapeName + " Area with radius "+radius1 +": "+ area);
		area = pi*(radius2*radius2);
		System.out.println("\t2nd " + shapeName + " Area with radius "+radius2 +": "+ area);
	};
	
}
