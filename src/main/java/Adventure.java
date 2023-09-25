public class Adventure {

    private Room currentRoom;

    public Room getCurrenRoom(){
        return currentRoom;
    }


    public void buildMap(){
        Room room1 = new Room("room 1","1");
        Room room2 = new Room("room 2","2");
        Room room3 = new Room("room 3","3");
        Room room4 = new Room("room 4","4");
        Room room5 = new Room("room 5","5");
        Room room6 = new Room("room 6","6");
        Room room7 = new Room("room 7","7");
        Room room8 = new Room("room 8","8");
        Room room9 = new Room("room 9","9");

        room1.setEast(room2);




        //peg på room1
        currentRoom = room1;




//if(room1.equals("east")) {
//currentRoom = room2;
//} else {
//currentRoom = room4;
//}

    }

}
