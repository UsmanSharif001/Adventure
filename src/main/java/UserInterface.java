import java.util.Scanner;public class UserInterface {    private Adventure adventure;    Scanner scanner = new Scanner(System.in);    public UserInterface(Adventure adventure) {        this.adventure = adventure;    }    public static void exit() {        System.out.println("Exiting the game");        System.exit(0);    }    public void startProgram() {        System.out.println("Welome to THE adventure game! Let your journey commence!");        command();    }    private void command() {        System.out.println("Use the following commands: \n" + "help - Get an overview of the commands you can use\n" + "look - With this command you can look around in the room you are standing in" + "\nExit - exit the game");        System.out.println("To move around the Castle use one of the following commands: ");        System.out.println("go north, go south, go east, go west ");        try {            boolean player = true;            while (player) {                String input = scanner.nextLine();                String[] userInput = input.split(" ");                String command = userInput[0];                String userChoice = "";                if (userInput.length > 1) {                    userChoice = userInput[1];                }                switch (command) {                    case "go" -> {                        String direction = userChoice;                        boolean succesGo = adventure.moveRoom(direction);                        if (succesGo) {                            System.out.println("You're going that way! " + userChoice);                        } else {                            System.out.println("Can't go this way");                        }                    }                    case "look" -> System.out.print(adventure.look());                    case "help" ->                            System.out.println("Here is a list of available commands: \n" + "look - This will give you a description of the current room you are in\n"                                    + "exit - This command will exit the game\n" + "take - *insert item name* will take item\ndrop - *item name* will drop the item\ninventroy, inv, i - will check inventory of items you posses");                    case "inventory", "inv", "i" -> System.out.println(adventure.showInventory());                    case "take" -> {                        boolean succesTake = adventure.takeItem(userChoice);                        if (succesTake) {                            System.out.println("Added " + userChoice + " to inventory");                        } else {                            System.out.println("No items found");                        }                    }                    case "health" -> {                        System.out.println("Your current health is: " + adventure.showHealth());                        if (adventure.showHealth() >= 40) {                            System.out.println("You're still in great health continue your journey");                        }                        if (adventure.showHealth() >= 20 && adventure.showHealth() < 40) {                            System.out.println("You look hungry, you should eat some");                        }                        if (adventure.showHealth() > 1 && adventure.showHealth() < 20) {                            System.out.println("Find food, do not fight!");                        }                        if (adventure.showHealth() == 0) {                            System.out.println("You're dead - better luck next time");                        }                    }                    case "eat" -> {                        ReturnMessage itemToEat = adventure.eat(userChoice);                        switch (itemToEat) {                            case USE -> System.out.println("You ate: " + userChoice + " nom nom nom");                            case CANT_BE_USED -> System.out.println("You cannot eat: " + userChoice + "you idiot");                            case CANT_BE_FOUND -> System.out.println("NO SUCH THING AS: " + userChoice);                        }                    }                    case "equip" -> {                        ReturnMessage itemToEquip = adventure.equip(userChoice);                        switch (itemToEquip) {                            case USE -> System.out.println("You equipped: " + userChoice);                            case CANT_BE_USED -> System.out.println("You cannot use : " + userChoice);                            case CANT_BE_FOUND -> System.out.println(userChoice + " can't be foun");                        }                    }                    case "attack" -> {                        ReturnMessageAttack attack = adventure.attack(); //adventure er kontroller som har metoder fra andre klasser                        switch (attack) {                            case ATTACK -> System.out.println("You have sucesfully attacked");                            case NO_WEAPON_EQUIPPED -> System.out.println("You have not sucesfully attacked");                            case OUT_OF_AMMO ->                                    System.out.println("You have sucesfully attacked NOTHING because you have no shots fool.");                        }                    }                    case "drop" -> {                        boolean succesDrop = adventure.dropItem(userChoice);                        if (succesDrop) {                            System.out.println("Dropped " + userChoice + " on the floor");                        } else {                            System.out.println("No items to drop");                        }                    }                    case "exit" -> exit();                    default -> System.out.println("Not a command, try another");                }            }        } catch (Exception e) {            throw new RuntimeException(e);        }    }}