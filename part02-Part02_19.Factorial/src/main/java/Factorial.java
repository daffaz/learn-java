
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        int fact = 1;
        for (int i = 1; i <= end; i++) {
            fact *= i;
        }
        
        System.out.println("Factorial: " + fact);
    }
}
