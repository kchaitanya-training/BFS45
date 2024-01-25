
public class ObjectArray {
	public static void main(String[] args) {
		Object[] obj = new Object[5];
		
		obj[0] = new Test1();
		obj[1] = new Test2();
		obj[2] = 20;
		obj[3] = "Hello";
		obj[4] = false;

		
		
		System.out.println(obj[0]);
		Test2 t2 = (Test2)obj[1];
		t2.method2();
		
		for(Object o:obj) {
		System.out.println(o);
		}
		
		
		
	}

}
