package loops;
//print numbers from 0 - 15
public class Q2 {
	
	public static void main(String[] args) {
		
		// while loop
		int a = 0;
		while(a <= 15) {
			System.out.print(a++ + " ");
		}
		System.out.println();
		
		// for loop
		for (int i=0; i<=15; i++) {
			System.out.print(i + " ");
		}
		
	}
}
