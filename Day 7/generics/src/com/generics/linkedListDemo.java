package com.generics;

import java.util.LinkedList;
import java.util.List;

public class linkedListDemo {

    public static <T> void print(List<T> list) {
        for(T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        List<Double> l = new LinkedList<>();
        l.add(3.14);
        l.add(1.41);
        l.add(2.72);
        print(l);

        List<String> ls = new LinkedList<>();
        ls.add("cherry");
        ls.add("apple");
        ls.add("blueberry");
        print(ls);
    }
}
