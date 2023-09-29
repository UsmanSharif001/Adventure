import java.util.ArrayList;

public class Room {

    //attributes
    private String name;
    private String enviorment;
    private Room east;
    private Room west;
    private Room north;
    private Room south;
    private ArrayList<Item> itemList =new ArrayList<>();


    public void addItem(String itemName, String itemDescription){
        //Item item = new Item(itemName, itemDescription); Undgår her at bruge item navn.
        itemList.add(new Item(itemName, itemDescription));

    }
    public void addItem(Item item){
        itemList.add(item);
    }


    public Room(String name,String enviorment){
        this.name=name;
        this.enviorment=enviorment;
    }

    //set metoder
    public void setEast(Room east){
        this.east=east;
    }

    public void setWest(Room west){
        this.west=west;
    }
    public void setNorth(Room north) {
        this.north=north;
    }

    public void setSouth(Room south){
        this.south=south;
    }

    //get metoder
    public Room getEast(){
        return east;
    }

    public Room getWest(){
        return west;
    }

    public Room getSouth(){
        return south;
    }

    public Room getNorth(){
        return north;
    }

    public String getEnviorment() {
        return enviorment;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Item> getRoomItems(){
        return itemList;
    }

    public void removeRoomItem(Item item){
        itemList.remove(item);
    }

    public boolean takeItem(String takeItemName) {
        if (takeItemName.contains(takeItemName))
            return true;
        else
            return false;

    }
    public boolean searchForItems(String searchForItems) {
            if (searchForItems.contains(searchForItems))
                return true;
            else
                return false;

    }



}
