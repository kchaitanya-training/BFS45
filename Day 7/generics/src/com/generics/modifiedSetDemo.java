package com.generics;

import java.util.HashSet;
import java.util.Set;

public class modifiedSetDemo {

    static <T> void print(Set<T> set) {
        for(T item : set) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        // Using HashSet with Double
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.23);
        doubleSet.add(4.56);
        doubleSet.add(7.89);
        print(doubleSet);

        // Using HashSet with Boolean
        Set<Boolean> booleanSet = new HashSet<>();
        booleanSet.add(true);
        booleanSet.add(false);
        print(booleanSet);
    }
}
