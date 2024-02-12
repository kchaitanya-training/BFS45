package sprint.sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, "This");
        Item item2 = new Item(2, "Is");
        Item item3 = new Item(3, "An");
        Item item4 = new Item(4, "Example");

        ArrayList<Item> arr = new ArrayList<Item>();
        arr.add(item1);
        arr.add(item2);
        arr.add(item3);
        arr.add(item4);

        System.out.println("ArrayList");
        for (Item i : arr) {
            System.out.println(i);
        }

        // MADE TO SORT IN DESCENDING ORDER
        Collections.sort(arr);

        System.out.println("----\n\rSorted in Descending");
        System.out.println(arr);

        System.out.println("----");

        // USING COMPARATORS
        Collections.sort(arr, new NumComparator());
        System.out.println("Sort by key");
        System.out.println(arr);

        Collections.sort(arr, new NameComparator());
        System.out.println("----\n\rSort by value");
        System.out.println(arr);
    }
}
