public class Room {

    //attributes
    private String name;
    private String enviorment;
    private Room east;
    private Room west;
    private Room north;
    private Room south;

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







    //konstruktør
    public Room(String name,String enviorment){
        this.name=name;
        this.enviorment=enviorment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnviorment() {
        return enviorment;
    }

    public void setEnviorment(String enviorment) {
        this.enviorment = enviorment;
    }


}
