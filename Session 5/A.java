package Sample2;
import Sample1.*;

public class A {
	public void methodA() {
		X x = new X();
		x.methodX();
		System.out.println("This is class A");
		
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}

}
