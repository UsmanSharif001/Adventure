import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    public static void exit(){
        System.out.println("Exiting the game");
        System.exit(0);
    }

    public static void main(String[] args) {
        Adventure adventure = new Adventure();
        adventure.buildMap();

        System.out.println("Welome to THE adventure game! Let your journey commence!");
        Scanner scanner = new Scanner(System.in);
        String cmd;

        while(true) {
             cmd = scanner.nextLine();
            switch (cmd) {
                case "north", "n", "go north" -> adventure.moveRoom("north");
                case "east", "e", "go east" -> adventure.moveRoom("east");
                case "west", "w", "go west" -> adventure.moveRoom("west");
                case "south", "s", "go south" -> adventure.moveRoom("south");

                case "look" -> System.out.print(adventure.getCurrenRoom().getEnviorment() + " You are here");
                case "help" -> System.out.println("Try google: www.google.com/help");
                case "exit" -> exit();
                default -> System.out.println("Error");

            }
        }

    }
}
