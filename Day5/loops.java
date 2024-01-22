
public class loops {

	public static void main(String[] args) {
		
		// print numbers from 0 - 15
		int a = 0;
		while(a <= 15) {
			System.out.print(a++ + " ");
		}
		System.out.println();
		
		// String array
		String[] arr = new String[5];
		arr[0] = "hello";
		arr[1] = "hi";
		arr[2] = "hey";
		arr[3] = "hii";
		arr[4] = "hellooo";
		
		for(String ss : arr) {
			System.out.print(ss + " ");
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
