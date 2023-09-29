import org.jetbrains.annotations.NotNull;

import static java.lang.System.exit;

public class Player {

    private Room currentRoom;

    public Player(Room initialRoom) {
        currentRoom = initialRoom;
    }

    public Room getCurrenRoom() {
        return currentRoom;
    }


    public void moveRoom(String move) {

        switch (move) {
            case "e", "east", "go east" -> {
                Room requestedRoom = currentRoom.getEast();
                if (requestedRoom != null) {
                    currentRoom = requestedRoom;
                } else System.out.println("No room in  that direction");
            }

            case "w", "west", "go west" -> {
                Room requestedRoom = currentRoom.getWest();
                if (requestedRoom != null) {
                    currentRoom = requestedRoom;
                } else System.out.println("No room in that direction");
            }
            case "n", "north", "go north" -> {
                Room requestedRoom = currentRoom.getNorth();
                if (requestedRoom != null) {
                    currentRoom = requestedRoom;
                } else System.out.println("No room in that direction");
            }
            case "s", "south", "go south" -> {
                Room requestedRoom = currentRoom.getSouth();
                if (requestedRoom != null) {
                    currentRoom = requestedRoom;
                } else System.out.println("No room in that direction");
            }
        }
    }

    public String look() {
        Room curentRoom = getCurrenRoom();
        if (curentRoom != null) {
            return curentRoom.getEnviorment();
        } else return "You are not in a room";
    }

    /* public void moveToNextRoom(String move) {
        if (move.equalsIgnoreCase("go south")) {
            Room requestedRoom = currentRoom.getSouth();
            if (requestedRoom != null) {
                currentRoom = requestedRoom;
            } else System.out.println("No room in that direction");
        } else if (move.equalsIgnoreCase("go north")) {
            Room requestedRoom = currentRoom.getNorth();
            if (requestedRoom != null) {
                currentRoom = requestedRoom;
            } else System.out.println("No room in that direction");
        } else if (move.equalsIgnoreCase("go west")) {
            Room requestedRoom = currentRoom.getWest();
            if (requestedRoom != null) {
                currentRoom = requestedRoom;
            } else System.out.println("No room in that direction");
        } else if (move.equalsIgnoreCase("go east")) {
            Room requestedRoom = currentRoom.getEast();
            if (requestedRoom != null) {
                currentRoom = requestedRoom;
            } else System.out.println("No room in that direction");
        }

    } */
}