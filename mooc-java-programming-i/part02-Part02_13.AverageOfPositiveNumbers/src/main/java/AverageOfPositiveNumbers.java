
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCounter = 0;
        int positiveSum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }else if (number > 0) {
                positiveCounter += 1;
                positiveSum += number;
            }
        }
        if (positiveCounter < 1) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((positiveSum / (double) positiveCounter));
        }
    }
}
