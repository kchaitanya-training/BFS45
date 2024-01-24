package com.test.sample2;

public class ObjectArr {
    public static void main(String[] args){

        Object[] obj = new Object[5];
        obj[0] = new Test1();
        obj[1] = new Test2();
        obj[2] = "car";
        obj[3] = 50;
        obj[4] = true;

        for (Object o: obj){
            if(o instanceof Test1) {
                Test1 t = (Test1) o;
                t.method1();
            }
            System.out.println(o);
        }



    }
}
