import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Adventure ad = new Adventure();
        UserInterface ui = new UserInterface(ad);
        ui.startProgram();
    }
}
