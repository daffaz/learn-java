
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        count += 1;
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        count += 1;
        
        System.out.println("The average is " + ((firstNum + (double) secondNum) / count));
    }
}
