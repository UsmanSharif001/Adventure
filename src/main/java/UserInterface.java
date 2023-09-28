import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    public static void exit() {
        System.out.println("Exiting the game");
        System.exit(0);
    }

    public void startProgram() {

        System.out.println("Welome to THE adventure game! Let your journey commence!");
        System.out.println("Use the following commands: \n" + "help - Get an overview of the commands you can use\n" + "look - With this command you can look around in the room you are standing in" + "\nExit - exit the game");
        System.out.println("To move around the Castle use one of the following commands: ");
        System.out.println("go north, go south, go east, go west ");

        adventure.buildMap();



        while (true) {
            String cmd;
            cmd = scanner.nextLine();
            switch (cmd) {
                case "north", "n", "go north" -> adventure.moveRoom("north");
                case "east", "e", "go east" -> adventure.moveRoom("east");
                case "west", "w", "go west" -> adventure.moveRoom("west");
                case "south", "s", "go south" -> adventure.moveRoom("south");
                case "look" -> System.out.print(adventure.currenRoom().look());
                case "help" -> System.out.println("Here is a list of available commands: \n" + " look - This will give you a description of the current room you are in\n " + " exit - This command will exit the game");
                case "exit" -> exit();
                default -> System.out.println("Not a command, try another");

            }
        }
    }
}
