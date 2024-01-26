package com.runnableInterface;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		sharedResource s = new sharedResource();
		for(int i=0; i<100; i++) {
			System.out.println("Running thread 1, Count = " + s.increment());
		}
	}
}
