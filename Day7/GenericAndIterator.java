package PairProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericAndIterator {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Messi");
        stringList.add("Ronaldo");
        stringList.add("Neymar");
        
        // Using a generic method to print elements in the list
        printListElements(stringList);
        
        
        // Using an iterator to print elements in the list
        printListWithIterator(stringList);

        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(7);
        numList.add(11);

        printNumbers(numList);

        printNumberWithIterator(numList);
    }



    // Generic method to print elements in a list
    private static <String> void printListElements(List<String> list) {
        System.out.println("Printing elements using generics:");
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println();
    }

    private static <Integer> void printNumbers(List<Integer> list){
        System.out.println("Printing elements using generics:");
        for (Integer i: list){
            System.out.println(i);
        }
        System.out.println();
    }

    private static void printNumberWithIterator(List<Integer> list){
        System.out.println("Printing elements using iterator:");
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    //Method to print elements in a list using an iterator
    private static void printListWithIterator(List<String> list) {
        System.out.println("Printing elements using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

}
