package keywords;

//abstract class
public abstract class Shape {

	String shapeName;
	final float pi = 3.14f;
	
	Shape(String shapeName){
		this.shapeName = shapeName;
	}
	
	// abstract method
	abstract float calculateArea();
	
}
