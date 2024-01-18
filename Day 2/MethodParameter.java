//Write program to define two methods with parameters , 
//one method should call to another method and execute or 
//call that method with object reference.

public class MethodParameter {
	public int withParameter(int a, int b) {
		int z = a*b;
		return z;
	}
	
	public void methodCall() {
		System.out.println("the result of multiplication:"+ withParameter(2,3));
	}
	public static void main(String[] args) {
		MethodParameter ref = new MethodParameter();
		ref.methodCall();
		
	}
}
