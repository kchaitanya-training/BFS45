
public class TestOne {
	int age = 23;
	String name = "Menda";
	float height = 182.4f;
	
	void method1() {
		System.out.println("Name: "+name);
		method2();
		float conversion = method3(182.4f,30.48f);
		System.out.println("Height: "+conversion);
	}
	
	int method2() {
		System.out.println("Age: "+age);
		return age;
	}
	
	float method3(float height,float feet) {
		
		return height/feet;
	}
	
	public static void main(String[] args) {
		TestOne test = new TestOne();
		test.method1();		
	}
}
