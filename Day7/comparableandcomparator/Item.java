package Collection.comparableandcomparator;

public class Item implements Comparable<Item> {
    
    private Integer itemNum;
    private String itemName;

    public Item(Integer itemNum, String itemName){
        super();
        this.itemNum = itemNum;
        this.itemName = itemName;
    }

    public Integer getItemNum(){
        return itemNum;
    }

    public String getItemName(){
        return itemName;
    }

    public String toString(){
        return "{" + this.getItemNum() + ":" + this.getItemName() + "}";
    }

    public int compareTo(Item a){
        return this.getItemNum() > ((Item) a).getItemNum() ? -1 : this.getItemNum() == ((Item) a).getItemNum() ? 0 : 1;
    }

}
