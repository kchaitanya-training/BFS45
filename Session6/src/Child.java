
public class Child extends Parent {
	
	void method1() {
		System.out.println("No argument in child class");
	}
	
	public static void main(String[] args) {
		Parent child = new Child();
		child.method1();
		child.method1(100);
	}

}
