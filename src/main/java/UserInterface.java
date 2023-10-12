import java.util.Scanner;public class UserInterface {    private Adventure adventure;    Scanner scanner = new Scanner(System.in);    public UserInterface(Adventure adventure) {        this.adventure = adventure;    }    public static void exit() {        System.out.println("Exiting the game");        System.exit(0);    }    public void startProgram() {        System.out.println("Welome to Era of the Dragon Slayers! Let your journey commence!");        command();    }    public void command() {        final String MENU =                """                        You can use the following commands:                        Go - north, south, east, west - to move around the castle.                        Look - Look around the room you are standing in.                        Take "itemname" - To pick up different items from the rooms.                        Inventory - Displays what you have in your inventory                        Drop "itemname" - To drop an item you have in your inventory.                        Health - Shows your current health.                        Eat - You can eat different food items to gain health - Watch out! Some food might be bad.                        Equip - Equips a weapon you have in your inventory.                        Attack - Attacks an enemy, if you have a weapon equipped.                        Help - Displays this MENU again.                        Exit - Exit the game. """;        System.out.println(MENU);        try {            boolean player = true;            while (player) {                String input = scanner.nextLine().toLowerCase();                String[] userInput = input.split(" ");                String command = userInput[0].toLowerCase();                String userChoice = " ".toLowerCase();                if (userInput.length > 1) {                    userChoice = userInput[1];                }                switch (command) {                    case "go" -> {                        char direction = userChoice.charAt(0);                        boolean succesGo = adventure.moveRoom(direction);                        if (succesGo) {                            System.out.println("You're going " + userChoice);                        } else {                            System.out.println("Can't go that way");                        }                    }                    case "look" -> System.out.print(adventure.look() + "\n");                    case "help" -> System.out.println(MENU);                    case "inventory", "inv", "i" -> System.out.println(adventure.showInventory());                    case "take" -> {                        boolean succesTake = adventure.takeItem(userChoice);                        if (succesTake) {                            System.out.println("Added " + userChoice + " to inventory");                        } else {                            System.out.println("No items found");                        }                    }                    case "health" -> {                        System.out.println("Your current health is: " + adventure.showHealth());                        if (adventure.showHealth() >= 40) {                            System.out.println("You're still in great health continue your journey");                        }                        if (adventure.showHealth() >= 20 && adventure.showHealth() < 40) {                            System.out.println("You feel a bit weakened, and the hunger starts to set in");                        }                        if (adventure.showHealth() > 1 && adventure.showHealth() < 20) {                            System.out.println("Find food, do not fight!");                        }                        if (adventure.showHealth() == 0) {                            System.out.println("You're dead - better luck next time");                        }                    }                    case "eat" -> {                        ReturnMessage itemToEat = adventure.eat(userChoice);                        Player playerInRoom = adventure.getPlayer();                        switch (itemToEat) {                            case USE -> System.out.print("You ate " + userChoice + " nom nom nom");                            case CANT_BE_USED -> System.out.print("You cannot eat: " + userChoice + " you idiot");                            case CANT_BE_FOUND -> System.out.print("NO SUCH THING AS: " + userChoice);                        }                        if (!adventure.isPlayerAlive(playerInRoom)) {                            System.out.println("You managed to kill yourself by eating " + userChoice + " good job");                            exit();                        }                    }                    case "equip" -> {                        ReturnMessage itemToEquip = adventure.equip(userChoice);                        switch (itemToEquip) {                            case USE -> System.out.println("You equipped " + userChoice);                            case CANT_BE_USED -> System.out.println("You cannot use : " + userChoice);                            case CANT_BE_FOUND -> System.out.println(userChoice + " can't be found");                        }                    }                    case "attack" -> {                        if (!adventure.getPlayerLocation().getEnemyList().isEmpty()) {                            Enemy enemyInRoom = adventure.getPlayerLocation().getEnemyList().get(0);                            Player playerinRoom = adventure.getPlayer();                            ReturnMessageAttack attack = adventure.attack(enemyInRoom); //adventure er kontroller                            switch (attack) {                                case ATTACK -> {                                    System.out.println("You have dealt " + adventure.getPlayer().getCurrentWeapon().getDmg() + " damage");                                    if (adventure.isEnemyAlive(enemyInRoom)) {                                        System.out.println("You have taken " + enemyInRoom.getWeapon().getDmg() + " damage");                                        System.out.println("The enemy has " + enemyInRoom.getHealth() + " hp left");                                        System.out.println("You have " + adventure.showHealth() + " hp left");                                    } else {                                        System.out.println(enemyInRoom.getName() + " is dead and dropped " + enemyInRoom.getWeapon());                                    }                                    if (!adventure.isPlayerAlive(playerinRoom)) {                                        System.out.println("Defeated - try again or give up, quitter.");                                        exit();                                    }                                }                                case NO_WEAPON_EQUIPPED -> {                                    System.out.println("No weapon equipped!!");                                }                                case OUT_OF_AMMO -> {                                    System.out.println("Out of ammunition! Use another weapon");                                }                            }                        } else {                            System.out.println("You hit thin air");                        }                    }                    case "drop" -> {                        boolean succesDrop = adventure.dropItem(userChoice);                        if (succesDrop) {                            System.out.println("Dropped " + userChoice + " on the floor");                        } else {                            System.out.println("No items to drop");                        }                    }                    case "exit" -> exit();                    default -> System.out.println("Not a command, try another");                }            }        } catch (Exception e) {            throw new RuntimeException(e);        }    }}