public class Item {

private String itemName;
private String itemDescribion;
private String takeItem;
private String dropItem;

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

public String getTakeItem(){
    return takeItem;
}

public String getDropItem(){
    return dropItem;
}

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemDescribion='" + itemDescribion + '\'' +
                '}';
    }
}
