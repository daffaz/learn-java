
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        System.out.print("Last number? ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        for (int i = firstNum + 1; i <= secondNum; i++) {
            firstNum += i;
        }
        
        System.out.println("The sum is: " + firstNum);
    }
}
