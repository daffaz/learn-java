
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] splittedInput = input.split(" ");
            for (String word : splittedInput) {
                System.out.println(word);
            }
        }
    }
}
