public class Room {

    //attributes
    private String name;
    private String enviorment;
    private String currentRoom;


    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
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

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", enviorment='" + enviorment + '\'' +
                ", currentRoom='" + currentRoom + '\'' +
                '}';
    }
}
