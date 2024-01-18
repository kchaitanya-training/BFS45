/*
 * define argument method and pass input and 
 * return value in the same class.
 */
public class Argument {
	
	public float myMethod(int a, float b) {
		float z = a*b;
		return z;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Argument value = new Argument();
		System.out.println("The Value:" + value.myMethod(3, 3.04f));
		
	}

}
