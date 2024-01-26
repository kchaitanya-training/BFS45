package com.sample.day8.com.test.thread;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        FirstThread ft = new FirstThread();
        Thread t1 = new Thread(ft);
        t1.setPriority(8);
        t1.start();

        SecondThread st = new SecondThread();
        Thread t2 = new Thread(st);
        t2.setPriority(1);
        t2.start();
    }
}
