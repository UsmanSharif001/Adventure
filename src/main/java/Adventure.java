public class Adventure {
    private Room currentRoom;

    public Room getCurrenRoom(){
        return currentRoom;
    }

    //public void setCurrentRoom(Room currentRoom) {
        //this.currentRoom = currentRoom;
    //}

    public void buildMap(){
        Room room1 = new Room("room1","Boring starting room");



        //peg på room1
        currentRoom = room1;

    }

}
