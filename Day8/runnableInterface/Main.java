package com.runnableInterface;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		sharedResource s = new sharedResource();
		
		Thread1 thread1 = new Thread1();
		Thread t1 = new Thread(thread1); // create a Thread and pass instance of runnable thread1
		
		Thread2 thread2 = new Thread2();
		Thread t2 = new Thread(thread2);
		
//		thread1.start(); //can't run start() method with Runnable interface.
//		thread2.start();
		
		t1.start();
		t2.start();
		
		t1.join(); // main method waits for these threads to finish their execution.
		t2.join();
		
		// main thread is execute at the end.
		System.out.println("Main thread, count = " + s.count );
	}

}
