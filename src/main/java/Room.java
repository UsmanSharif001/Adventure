public class Room {

    //attributes
    private String name;
    private String enviorment;
    private Room east;
    private Room west;
    private Room north;
    private Room south;

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

}
