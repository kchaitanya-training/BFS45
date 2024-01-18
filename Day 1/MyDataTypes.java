package dhawalama;

public class MyDataTypes {
	
	int a = 20;
	float b = 34.45f;
	String c = "Friends";
	
	public void method() {
		char d = 'T';
		char e = '5';
		
		System.out.println(d);
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDataTypes ref = new MyDataTypes();
		ref.method();
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println(ref.c);
		
	}

}
