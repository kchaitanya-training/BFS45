package com.sample.day8.com.test.thread;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("SecondThread  "+Thread.currentThread());
        }
    }
}
