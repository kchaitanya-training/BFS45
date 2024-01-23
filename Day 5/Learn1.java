
public class Learn1 {

	void arrray() {
		
		int[] arrayInt = new int[] {112, 1223};
		System.out.println(arrayInt[0]);
		System.out.println(arrayInt[1]);
		
		String[] arrayString = new String[] {"Learn", "Java"};
		for (String i:arrayString) {
			System.out.println(i);
		}
		
		float[] arrayFloat = new float[2];
		arrayFloat[0]= 4.65f;
		arrayFloat[1]= 6.44f;
		System.out.println(arrayFloat[0]);
		System.out.println(arrayFloat[1]);
		
		Test[] arrayTest = new Test[2];
	
		
	}
	
	public static void main(String[] args) {
		
		Learn1 test = new Learn1();
		test.arrray();
	
	}
}

class Test{}
