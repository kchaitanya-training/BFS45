package loops;
// write a program to define a string arrays and print the string using while-loop and for loop
public class Q1 {

	public static void main(String[] args) {
		
		// String array
		String[] arr = new String[5];
		arr[0] = "hello";
		arr[1] = "hi";
		arr[2] = "hey";
		arr[3] = "hii";
		arr[4] = "hellooo";
		
		// Enhanced for loop
		for(String ss : arr) {
			System.out.print(ss + " ");
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// while loop
		int i=0;
		int n = arr.length;
		while(i < n) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

}
