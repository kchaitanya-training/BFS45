package com.test.sample;

public class Child extends Parent {

    @Override
    void test(){
        System.out.println("Overriding 1 I am Child test1 ");
    }

    void test3(){
        System.out.println("I am Child test3 ");
    }

    public static void main(String[] args){
        Parent ch = new Child();
        ch.test();
        ch.test2(50);

    }
}
