
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give speed:");
        int input = Integer.valueOf(scanner.nextLine());
        
        if (input > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}