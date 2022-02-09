
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] splittedInput = input.split(",");
            if (Integer.valueOf(splittedInput[1]) > oldest) {
                oldest = Integer.valueOf(splittedInput[1]);
                name = splittedInput[0];
            }
        }
        
        System.out.println("Age of the oldest: " + name);
    }
}
