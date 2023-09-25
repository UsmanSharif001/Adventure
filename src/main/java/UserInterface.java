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
        //String cmd = scanner.nextLine();

        String cmd;

        while(true) {
             cmd = scanner.nextLine();
            switch (cmd) {
                case "north", "n", "go north" -> System.out.println("Going north");
                case "east", "e", "go east" -> System.out.println("Going east");
                case "west", "w", "go west" -> System.out.println("Going west");
                case "south", "s", "go south" -> System.out.println("Going south");

                case "look" -> System.out.print(adventure.getCurrenRoom() + " You are here");
                case "help" -> System.out.println("Try google: www.google.com/help");
                case "exit" -> exit();
                default -> System.out.println("Error");




            }
        }




    }
}
