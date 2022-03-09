
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCounter scoreCounter = new ScoreCounter();
        
        UserInterface ui = new UserInterface(scoreCounter, scanner);
        
        ui.start();
    }
}
