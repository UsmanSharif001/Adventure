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


    public Room(String name,String enviorment){
        this.name=name;
        this.enviorment=enviorment;
    }

    public void addItem(Item item){
        //Item item = new Item(itemName, itemDescription); Undgår her at bruge item navn.
        itemList.add(item);

    }

    public void addEnemy(Enemy enemy){
        enemyList.add(enemy);
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

    public String getName(){
        return name;
    }
    public String getEnviorment(){
        return enviorment;
    }

    public ArrayList<Item> getRoomItems(){
        return itemList;
    }
}
