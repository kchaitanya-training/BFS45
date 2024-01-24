// Upcasting and Down-casting of primitive data types
package com.casting.learn2;
public class PrimitiveDT {
	public static void main(String[] args) {
		int x = 10;			// this takes 4 bytes space
		byte y = (byte)x; 	// down-casting performed
		System.out.println("Downcasting from int --> byte:");
		System.out.println("\tValue of x with integer data type: " + x);
		// down-casting the size of variable a to byte
		System.out.println("\tDown-casting performed for x to variable y of byte size: "+y);
		
		double a = 2.5;
		float b = (float)a;
		System.out.println("Downcasting from double --> float:");
		System.out.println("\tValue of a with double data type: " + a);
		System.out.println("\tDown-casting performed for a to variable b of float size: "+b);
		
		long value1 = 253535242L;
		int value2 = (int)value1;
		System.out.println("Downcasting from long --> int:");
		System.out.println("\tValue of value1 with long data type: " + value1);
		System.out.println("\tDown-casting performed for value1 to variable value2 of float size: "+value2);
		
		y = 21;			// byte size
		x = (int)y;
		System.out.println("Upcasting from byte --> int:");
		System.out.println("\tValue of y with byte data type: " + y);
		System.out.println("\tUpcasting-casting performed for y to variable x of int size: "+x);
		
		char value3 = 'N';
		int asciiValue = (int)value3;
		System.out.println("Upcasting from char --> int:");
		System.out.println("\tCharacter value3 with char data type: " + value3);
		System.out.println("\tASCII value of character '" + value3 + "': " + asciiValue);
	}
}
