package AssessmentDay7.comparators;

import java.util.*;

public class Item implements Comparable {
    Integer itemKey;
    String itemValue;

    Item(Integer itemKey, String itemValue) {
        this.itemKey = itemKey;
        this.itemValue = itemValue;
    }

    public Integer getItemKey() {
        return itemKey;
    }

    public String getItemValue() {
        return itemValue;
    }

    @Override
    public String toString() {
        return "{" + this.getItemKey() + ":" + this.getItemValue() + "}";
    }

    @Override
    public int compareTo(Object o) {
        // DESCENDING ORDER
        return this.getItemKey() > ((Item) o).getItemKey() ? -1 : this.getItemKey() == ((Item) o).getItemKey() ? 0 : 1;
    }
}
