package looping;

public class Stringarray {
	public static void main(String[] args) {
		String[] name = new String[5];
		name[0]="John";
		name[1]="Peter";
		name[2]="Dan";
		name[3]="Harry";
		name[4]="Jordan";
		
	//	System.out.println(name.length);
		
		/*
		int b=name.length-1;
		b = 0;
		while(b!=5) {
			System.out.println(name[b]);
			b++;
			
		}*/
		/*
		for(int c = 0;c!=5;c++) {
			System.out.println(name[c]);
		}
		*/
		for(String s:name) {
			System.out.println(s);
		}
		
		
	}

}
