package com.aashirwad.package1;

import com.aashirwad.package2.C;

public class A {
     void classA(){
        C c= new C();
        c.classC();

        B b = new B();
        b.classB();
    }

    public static void main(String[] args) {
        A a = new A();
        a.classA();
    }
}
