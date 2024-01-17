package overloadOverride;
//parent class
public class Shape {
	
	float area;
	float perimeter;
	final float pi = 3.14f;
	String shapeName;
	
	void calculateArea(){
		System.out.println("Ready for calculating area for the different shape");
	};
	void calculatePerimeter(){
		System.out.println("Ready for calculating perimeter for the different  shape");
	};
}
