package Day7.ComparatorC;

import java.util.Comparator;

public class NameComparator implements Comparator<StoreS> {
    @Override
    public int compare(StoreS o1, StoreS o2) {
        return o1.getItemName().compareTo(o2.getItemName());
    }
}
