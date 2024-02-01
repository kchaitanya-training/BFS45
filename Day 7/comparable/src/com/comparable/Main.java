package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static <T> void print(List<T> items) {
        for (T a : items) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        List<Grades> ls = new ArrayList<>();
        // Updated to include score
        ls.add(new Grades(50, "Sandesh", 'B', 75.5));
        ls.add(new Grades(55, "Nihal", 'A', 88.0));
        ls.add(new Grades(60, "Ishu", 'B', 82.3));
        ls.add(new Grades(65, "Sharmila", 'C', 60.4));

        print(ls);
        System.out.println("Sorted List by Score:");

        Collections.sort(ls);
        print(ls);
    }
}
