package Collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        
        Item player1 = new Item(10, "Messi");
        Item player2 = new Item(7, "Ronaldo");
        Item player3 = new Item(9, "Suarez");
        Item player4 = new Item(11, "Neymar");

        List<Item> list = new ArrayList<>();
        list.add(player1);
        list.add(player2);
        list.add(player3);
        list.add(player4);

        for(Item player: list){
            System.out.println(player);
        }

        System.out.println("-----------------------------");
        //Sorting the array in decending order using sort function
        Collections.sort(list);
        System.out.println(list);

        System.out.println("-----------------------------");

        //Sorting using Comparator
        Collections.sort(list, new NumComparator());
        System.out.println(list);

        Collections.sort(list, new NameComparator());
        System.out.println(list);


    }
    
}
