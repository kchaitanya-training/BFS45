package com.aashirwad.package2;

import com.aashirwad.package1.*;

public class C {
     public void classC(){
         B b = new B();
         b.classB();

         A a = new A();

        System.out.println("This is c class");
    }

    public static void main(String[] args) {
        C c = new C();
        c.classC();
    }
}
