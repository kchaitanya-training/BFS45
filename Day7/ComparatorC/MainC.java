package Day7.ComparatorC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainC {
    public static void main(String[] args) {


        StoreS i1 = new StoreS(10, "Apple");
        StoreS i2 = new  StoreS(20, "Banana");
        StoreS i3 = new  StoreS(30, "Grapes");
        StoreS i4 = new  StoreS(40, "Oranges");

        List< StoreS> ls = new ArrayList<>();
        ls.add(i1);
        ls.add(i2);
        ls.add(i3);
        ls.add(i4);

        Collections.sort(ls);

        for(StoreS ss : ls)
        {
            System.out.println(ss);
        }






    }
}
