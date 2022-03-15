
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                total += input;
                counter++;
            }
        }
        
        if (counter <= 0) {
            System.out.println("Cannot calculate the average");
        }else {
            System.out.println(total / (counter * 1.0));
        }
    }
}
