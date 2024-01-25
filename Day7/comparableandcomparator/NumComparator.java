package Collection.comparableandcomparator;

import java.util.Comparator;

public class NumComparator implements Comparator<Item> {

    public int compare(Item p1, Item p2){
        return p1.getItemNum().compareTo(p1.getItemNum());
    }

}
