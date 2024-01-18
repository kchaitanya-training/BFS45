
public class TestFive {

	int add(int a, int b) {
		return a+b;
	}
	
	int subtraction(int a, int b) {
		return a-b;
	}
	
	
	public static void main(String[] args) {
		TestFive test = new TestFive();
		int sum = test.add(5, 5);
		System.out.println("Addition: "+ sum );
		int sub = test.subtraction(8, 5);
		System.out.println("Subtraction: "+ sub);
		
	}
}
