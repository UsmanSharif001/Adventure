public class Adventure {

    private Room currentRoom;

        public Room getCurrenRoom () {
            return currentRoom;
        }


        public void buildMap () {
            Room room1 = new Room("room 1", "You enter a bland room. The old stone floor looks rigid and ready to break at any given moment.\n At the wall to the left you see a fainting picture of whom you assume to be the lord of this castle.\n She stands tall and proud almost as if she would expect nothing but failiure from her underlings");
            Room room2 = new Room("room 2", "You're enshrouded by darkness in this room. Only a faint light is emitting from the table nearby. There's a note laying on the table");
            Room room3 = new Room("room 3", "A flowery scent strikes you almost poisonous. You feel enfeebled by the smell and the longer you linger in the room the more dazy it gets\n The same picture from room one is now laughing hysterically");
            Room room4 = new Room("room 4", "4");
            Room room5 = new Room("room 5", "5");
            Room room6 = new Room("room 6", "6");
            Room room7 = new Room("room 7", "7");
            Room room8 = new Room("room 8", "8");
            Room room9 = new Room("room 9", "9");
            //Room 1
            room1.setEast(room2);
            room1.setSouth(room4);
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
            //Room 6
            room6.setNorth(room3);
            room6.setSouth(room9);
            //Room 7
            room7.setNorth(room4);
            room7.setEast(room8);
            //Room 8
            room8.setWest(room7);
            room8.setNorth(room5);
            room8.setEast(room9);
            //Room 9
            room9.setWest(room8);
            room9.setNorth(room6);
            //peg på room1
            currentRoom = room1;
        }

        public void moveRoom (String move){
            Room requestedRoom = null;

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

    }

