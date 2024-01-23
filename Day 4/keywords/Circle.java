package keywords;

public class Circle extends Shape{
	
	float radius;
	
	Circle(String name, float radius){
		super(name);					//calling parent constructor with argument
		this.radius = radius;
	}
	
	float calculateArea() {
		return (pi*(radius*radius));}
}
