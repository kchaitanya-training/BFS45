
public class Loops {
	static int a = 0;
	static String[] s = new String[5];
	
	public static void main(String[] args) {
		System.out.println("While loop");
		while (a<=15) {
			
			System.out.println(a);
			a++;
		}
		
		System.out.println("For loop");
		for(int a = 0; a<=15; a++) {
			
			System.out.println(a);
			
		}
		
		s[0] = "A";
		s[1] = "B";
		s[2] = "C";
		s[3] = "D";
		s[4] = "E";
		
		a = 0;
		while(a <s.length) {
			System.out.println("While loop: "+ s[a]);
			a++;
		}
		
		for(int a = 0; a<s.length;a++) {
			System.out.println("For loop: "+s[a]);
		}
		
	}

}
