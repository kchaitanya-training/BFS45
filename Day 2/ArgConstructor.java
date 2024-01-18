/*
 * Write a program to construct argument constructor and
 *  creating the object and define instance variables.
 */
 
public class ArgConstructor {
	
	public int age = 19; //instance variable

//	ArgConstructor(){
		
	//}
	
	ArgConstructor(int a){
		System.out.println("my age: " + a);
		
		
	}
	
	public static void main(String[] args) {
		ArgConstructor ref = new ArgConstructor(10);
		System.out.println("given age:" + ref.age);
	}

}
