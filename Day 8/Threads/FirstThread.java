package com.sample.day8.com.test.thread;

public class FirstThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("First Thread "+Thread.currentThread());
        }
    }
}
