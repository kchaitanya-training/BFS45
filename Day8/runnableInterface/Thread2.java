package com.runnableInterface;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		sharedResource s = new sharedResource();
		for(int i=0; i<100; i++) {
			System.out.println("Running thread 2, Count = " + s.increment());
		}		
	}
}
