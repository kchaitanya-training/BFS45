package Day7.ComparatorC;

import java.util.Comparator;

public class NumComparator implements Comparator<StoreS> {
//    @Override
//    public int compare(StoreS o1, StoreS o2) {
//        return (o1.getItemNum() < o2.getItemNum()) ? -1 : (o1.getItemNum() == o2.getItemNum() ? 0 : 1);
//    }


    @Override
    public int compare(StoreS o1, StoreS o2) {
        return Integer.compare(o1.getItemNum(), o2.getItemNum());
    }
}
