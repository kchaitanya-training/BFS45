// Accessing the default value of different data types
public class Learn1 {
	
	String name;
	int age;
	float height;
	char middleInitial;
	boolean check;
	
	void defaultValue() {
		System.out.println("Default value of String data type: " + name);
		System.out.println("Default value of int data type: " + age);
		System.out.println("Default value of float data type: " + height);
		System.out.println("Default value of char data type: " + middleInitial);
		System.out.println("Default value of boolean data type: " + check);
	}
	
	public static void main(String[] args) {
		Learn1 test = new Learn1();
		System.out.println("Reference value of an object \"test\": "+ test);
		test.defaultValue();
	}
}
