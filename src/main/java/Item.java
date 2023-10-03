public class Item {

private String itemName;
private String itemDescribion;


public Item (String itemName, String itemDescribion){
    this.itemName = itemName;
    this.itemDescribion = itemDescribion;
}

public String getItemName(){
    return itemName;
}

public String getItemDescribion(){
    return itemDescribion;
}

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemDescribion='" + itemDescribion + '\'' +
                '}';
    }
}
