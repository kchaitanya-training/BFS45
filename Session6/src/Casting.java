
public class Casting {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		
		byte b = (byte)a;
		System.out.println(b);
		
		double d = 123.123;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
        Integer wa = 10;
        System.out.println(wa);

        Byte wb = wa.byteValue();
        System.out.println(wb);

        Double wd = 123.123;
        System.out.println(wd);

        Float wf = wd.floatValue();
        System.out.println(wf);
		
	}
}
