public class Map {

    private Room startroom;

    public void buildMap () {
        Room room1 = new Room("The bland room", "You enter a bland room. The old stone floor looks rigid and ready to break at any given moment.\n At the wall to the left you see a fainting picture of whom you assume to be the lord of this castle.\n She stands tall and proud almost as if she would expect nothing but failiure from her subjects... or you?");
        Room room2 = new Room("Total Darkness", "You're enshrouded by darkness in this room. Only a faint light is emitting from a extinguishing candle nearby. There's a note laying on the  old worned table");
        Room room3 = new Room("The poison room", "A flowery scent strikes you poisonous. You feel enfeebled by the smell and the longer you linger in the room the more dazy it gets\n. As you wander about in the room you can sense a silhouette of something laying on the cold hardened floor. A corpse.\n The same picture is found in this room but the only diffrence is this time the Lord is laughing... hysterically");
        Room room4 = new Room("The dusty room", "The old door creaks open. As you continue to open the door the rusty hinges fall off and the door slams to the ground.\nIf there were anyone else in this god forsakened castle they would surely have heard you.\nThis room has old furbished furniture and set aside neatly to one side the other side there has been evidence of a slaughter. \nWorn out blood testamentet to the cruel happenings going on in this castle");
        Room room5 = new Room("room 5", "5");
        Room room6 = new Room("room 6", "6");
        Room room7 = new Room("room 7", "7");
        Room room8 = new Room("room 8", "8");
        Room room9 = new Room("room 9", "9");
        //Room 1
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem("Lamp", "Shines bright like a diamond");
        //Room 2
        room2.setWest(room1);
        room2.setEast(room3);
        //Room 3
        room3.setWest(room2);
        room3.setSouth(room6);
        //Room 4
        room4.setNorth(room1);
        room4.setSouth(room7);
        //Room5
        room5.setSouth(room8);
        room5.addItem("Treasure", "Lots of gold coins");
        //Room 6
        room6.setNorth(room3);
        room6.setSouth(room9);
        //Room 7
        room7.setNorth(room4);
        room7.setEast(room8);
        room7.addItem("Sword", "The sword of a thousand truths");
        //Room 8
        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        //Room 9
        room9.setWest(room8);
        room9.setNorth(room6);


        startroom = room1;

        }

    public Room getStartroom(){
        return startroom;
    }


}
