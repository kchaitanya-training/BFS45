
public class Wrapper {

	void wrapperClass() {

		int value1 = 42;
		String wrapperString = String.valueOf(value1);
		System.out.println("int to String is converted for this value: " + wrapperString);
		
		float value2 = 3.65f;
		String wrapperChar1 = String.valueOf(value2);
		System.out.println("float to String is converted for this value: " + wrapperChar1);
		
		float value3 = 3.65f;
		Double wrapperDouble = Double.valueOf(value3);
		System.out.println("float to Double is converted for this value: " + wrapperDouble);
		
		String value4 = "2024";
		Integer wrapperInt = Integer.valueOf(value4);
		System.out.println("String to Integer is converted for this value: " + wrapperInt);
		
		char value5 = 'D' ;
		Integer wrapperChar2 = Integer.valueOf(value5);
		System.out.println("char to Integer, ASCII value of '" + value5 + "': " + wrapperChar2);
	}

	public static void main(String[] args) {
		Wrapper wrapper = new Wrapper();
		wrapper.wrapperClass();
	}
}
