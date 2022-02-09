
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        String longestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] splittedInput = input.split(",");
            
            String currentName = splittedInput[0];
            
            if (longestName.length() < currentName.length()) {
                longestName = currentName;
            }
            counter++;
            sum += Integer.valueOf(splittedInput[1]);
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sum / (counter * 1.0)));
    }
}
