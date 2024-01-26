package com.threads;

public class Thread2 extends Thread {

	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Thread 2");
			System.out.println("Writing...");
			i++;
		}
	}
}
