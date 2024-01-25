package Day7.ListSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayA {
    void newArraylist()
    {
        //ARRAYLIST
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("hello");
        arr.add("hola");
        arr.add("Apple");
        arr.remove("Apple");
        System.out.println(arr);
    }
    void newLinkedList()
    {
        //LINKEDLIST
        LinkedList <Integer>link = new LinkedList();
        link.add(11);
        link.add(22);
        link.add(33);
        link.add(44);

        for(Integer result: link)
        {
            System.out.println(result);
        }
        System.out.println("Retrieving item: " + link.get(2));
    }

    void listMethod()
    {

        List obj = new LinkedList<>();
        obj.add(15);
        obj.add("Steams");
        obj.add(true);
        obj.add(3.45f);
        obj.add(45.55);

        System.out.println(obj);

        List<String> hs = new LinkedList();
        hs.add("H");
        hs.add("e");
        hs.add("l");
        hs.add("l");
        hs.add("o");
        System.out.println(hs);

    }

    public static void main(String[] args) {
       ArrayA aa = new ArrayA();
       aa.newArraylist();
       aa.newLinkedList();
       aa.listMethod();
    }
}
