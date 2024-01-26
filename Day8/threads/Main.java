package com.threads;

public class Main {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		// both threads will run concurrently.
		t1.start(); // start thread1
		t2.start(); // start thread2

	}

}
