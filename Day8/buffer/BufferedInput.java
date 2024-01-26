package com.buffer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInput {
	
	void inputMethod() throws IOException {
		File file =
		new File("C:\\Users\\sonam\\eclipse-workspace\\Assessment8\\src\\com\\practice\\input.txt");
		
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(file));
		
		int a = 0;
		while((a= input.read()) != -1) {
			System.out.print((char)a); // convert 'a' into character.
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedInput i = new BufferedInput();
		i.inputMethod();		
	}
}
