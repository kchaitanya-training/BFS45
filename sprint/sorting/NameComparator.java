package sprint.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getItemValue().compareTo(o2.getItemValue());
    }
}
