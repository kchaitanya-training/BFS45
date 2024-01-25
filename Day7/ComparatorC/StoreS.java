package Day7.ComparatorC;

public class StoreS implements Comparable{

    private Integer itemNum;
    private String itemName;

    //CONSTRUCTOR
    public StoreS(Integer itemNum, String itemName)
    {
        super();
        this.itemName = itemName;
        this.itemNum = itemNum;
    }

    //GETTER METHOD
    public String getItemName()
    {
        return itemName;
    }
    public int getItemNum()
    {
        return itemNum;
    }

    @Override
    public String toString() {
        return "[" + itemNum + ": " + itemName +"]";
    }

    @Override
    public int compareTo(Object o) {
        StoreS a = (StoreS) o;
        return this.getItemName().compareTo(a.getItemName());
    }



    }

