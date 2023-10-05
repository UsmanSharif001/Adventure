import java.security.PublicKey;
import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health;
    private Weapon currentWeapon;

    public Player(Room startRoom, int health) {
        this.currentRoom = startRoom;
        inventory = new ArrayList<>();
        this.health = health;
    }


    public Room getCurrenRoom() {
        return currentRoom;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public int getHealth() {
        return health;
    }

    public boolean moveRoom(char direction) {
        Room requestRoom = null;
        boolean succes = false;
        if (direction == 'n') {
            requestRoom = currentRoom.getNorth();
            succes = goNorth();
        } else if (direction == 's') {
            requestRoom = currentRoom.getSouth();
            succes = goSouth();
        } else if (direction == 'e') {
            requestRoom = currentRoom.getEast();
            succes = goEast();
        } else if (direction == 'w') {
            requestRoom = currentRoom.getWest();
            succes = goWest();
        }
        if (succes && requestRoom != null) {
            currentRoom = requestRoom;
            return true;
        } else {
            currentRoom = requestRoom;
            return false;
        }
    }

    public boolean goNorth() {
        Room roomNorth = currentRoom.getNorth();
        if (roomNorth == null) {
            return false;
        } else {
            currentRoom = roomNorth;
            return true;
        }
    }

    public boolean goSouth() {
        Room roomSouth = currentRoom.getSouth();
        if (roomSouth == null) {
            return false;
        } else {
            currentRoom = roomSouth;
            return true;
        }
    }

    public boolean goEast() {
        Room roomEast = currentRoom.getEast();
        if (roomEast == null) {
            return false;
        } else {
            currentRoom = roomEast;
            return true;
        }
    }

    public boolean goWest() {
        Room roomWest = currentRoom.getWest();
        if (roomWest == null) {
            return false;
        } else {
            currentRoom = roomWest;
            return true;
        }
    }


    public String look() {
        Room curentRoom = getCurrenRoom();
        if (curentRoom != null) {
            String string = currentRoom.getName() + "\n" + currentRoom.getEnviorment();
            if (!curentRoom.getRoomItems().isEmpty()) {
                for (Item item : currentRoom.getRoomItems()) {
                    string += "\nThere is a " + item.getItemName() + " that " + item.getItemDescription();
                }
            }
            return string;
        } else return "You are not in a room";
    }


    public boolean takeItem(String itemName) {
        for (Item item : getCurrenRoom().getRoomItems()) {
            if (item.getItemName().toLowerCase().contains(itemName.toLowerCase())) {
                inventory.add(item);
                getCurrenRoom().getRoomItems().remove(item);
                return true;
            }

        }
        return false;
    }

    public boolean dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().toLowerCase().contains(itemName.toLowerCase())) {
                inventory.remove(item);
                getCurrenRoom().getRoomItems().add(item);
                return true;
            }

        }
        return false;
    }

    public Item showInventory1(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equals(itemName)) ;
            return item;
        }
        return null;
    }

    public String showInventory() {
        String string = "";
        if (!inventory.isEmpty()) {
            for (Item item : inventory) {
                string += " \n" + item;
            }
        } else {
            string = "Inventory is empty";
        }
        return string;
    }

    public ReturnMessage eat(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().toLowerCase().contains(itemName.toLowerCase())) {
                if (item instanceof Food) {
                    inventory.remove(item);
                    adjustHealth(((Food) item).getHealth());
                    return ReturnMessage.EAT;

                }
                return ReturnMessage.CANT_BE_USED;
            }
        }
        for (Item item : currentRoom.getRoomItems()) {
            if (item.getItemName().toLowerCase().contains(itemName.toLowerCase())) {
                if (item instanceof Food) {
                    currentRoom.getRoomItems().remove(item);
                    adjustHealth(((Food) item).getHealth());
                    return ReturnMessage.EAT;

                }
                return ReturnMessage.CANT_BE_USED;
            }
        }
        return ReturnMessage.CANT_BE_FOUND;

    }

    public void adjustHealth(int amount) {
        health += amount;

    }
}

