//write a program to create two threads to access 
//shared class and to modify some data of shared class
package com.thread;
public class Main {

    public static void main(String[] args) {
        SharedData sharedData = new SharedData();

        // Create two threads and pass the sharedData instance
        Thread thread1 = new Thread(new WorkerThread(sharedData, "Thread 1"));
        Thread thread2 = new Thread(new WorkerThread(sharedData, "Thread 2"));

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

