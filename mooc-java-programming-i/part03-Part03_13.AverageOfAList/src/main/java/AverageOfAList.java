
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        
        // implement here a program, that first reads user input
        int sum = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            numList.add(input);
            sum += input;
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        System.out.println("Average: " + (sum / (numList.size() * 1.0)));
    }
}
