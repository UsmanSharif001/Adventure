import static java.lang.System.exit;

public class Player {

    private Room currentRoom;


    public Player(Room room){
        this.currentRoom = room;
    }

    public Room getCurrenRoom() {
        return currentRoom;
    }
    public void moveRoom (String move){
        System.out.println("Command entered: " + move);
        Room requestedRoom = null;
        move = move.toLowerCase();


        switch (move) {
            case "e", "east", "go east" -> {
                requestedRoom = currentRoom.getEast();
            }

            case "w", "west", "go west" -> {
                requestedRoom = currentRoom.getWest();
            }
            case "n", "north", "go north" -> {
                requestedRoom = currentRoom.getNorth();
            }
            case "s", "south", "go south" -> {
                requestedRoom = currentRoom.getSouth();
            }
        }
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
        } else System.out.println("Not a room");

    }

//    public boolean moveRoom (char move) {
//        Room requestedRoom = null;
//        boolean succes = true;
//
//        if (move == 'e') {
//            requestedRoom = currentRoom.getEast();
//            succes = goEast();
//        } return succes;
//    }

    public String look(){
        return currentRoom.look();
    }

    //TODO Metoder til at player kan gå i retning north / south / east / west

}
