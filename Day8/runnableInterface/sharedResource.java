package com.runnableInterface;

public class sharedResource {

	public static int count;
	
	// both threads try to access this method simultaneously.
	// Use keyword "synchronized" because we want only one thread to access this
	// method at a given time.
	public synchronized int increment() {
		return count++;
	}
}
