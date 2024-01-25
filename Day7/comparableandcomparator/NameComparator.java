package Collection.comparableandcomparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Item>  {

    public int compare(Item p1, Item p2){
        return p1.getItemName().compareTo(p2.getItemName());
    }
    
}
