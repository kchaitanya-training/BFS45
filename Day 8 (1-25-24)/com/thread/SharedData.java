package com.thread;
import java.util.Random;

class SharedData {
	
    int sharedValue = 0;
    // function to generate random number
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(); // Generates a random integer
    }
    
    public void changeData(String threadName) {
    	// calling function to generate random number
        sharedValue = generateRandomNumber();			
        System.out.println(threadName + " changed the shared value to " + sharedValue);
    }
}