package com.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput {
	void method() throws IOException {
		File file =
		new File("C:\\Users\\sonam\\eclipse-workspace\\Assessment8\\src\\com\\practice\\output.txt");
		
		File file2 = 
		new File("C:\\Users\\sonam\\eclipse-workspace\\Assessment8\\src\\com\\practice\\input.txt");
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file2));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(file));
		
		for(int i=in.read(); i != -1; i = in.read()) {
			bo.write(i);
		}
		bo.flush();
	}

	public static void main(String[] args) throws IOException {
		
		BufferedOutput o = new BufferedOutput();
		o.method();
	}

}
