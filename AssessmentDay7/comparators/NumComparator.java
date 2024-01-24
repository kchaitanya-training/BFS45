package AssessmentDay7.comparators;

import java.util.Comparator;

public class NumComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getItemKey().compareTo(o2.getItemKey());
    }
}
