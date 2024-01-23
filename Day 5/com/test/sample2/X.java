package com.test.sample2;

public class X {
    public void test(){
        System.out.println("This is class X");
    }

    public static void main(String[] args){
        Y y = new Y();
        y.test2();
        X x = new X();
        x.test();

    }


}
