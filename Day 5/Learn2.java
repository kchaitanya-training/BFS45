
public class Learn2 {
	

	public static void main(String[] args) {
		
		
		int a = 0;
		System.out.println("Using while Loop to print from 0 to 15:");
		while(a!=16) {
			System.out.println(a);
			a++;
		}

		System.out.println("Using For Loop to print from 0 to 15:");
		for(int i = 0; i<16; i++) {
			System.out.println(i);
		}
		String[] array = new String[5];
		array[0] = "Learn";
		array[1] = "Java";
		array[2] = "& Spring";
		array[3] = "from";
		array[4] = "Takeo";
		
		a=0;
		System.out.println("Using While Loop to print value of string array with index 5:");
		while(a<5) {
			System.out.println(array[a]);
			a++;
		}
	
		System.out.println("Using For Loop to print value of string array with index 5:");
		for(String i:array)
		{
			System.out.println(i);
		}
	}
}