
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        int sum = 0;
        for (int i = 1; i <= lastNum; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
