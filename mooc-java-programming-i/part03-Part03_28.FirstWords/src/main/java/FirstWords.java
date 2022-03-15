
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            
            String[] arrayOfWords = words.split(" ");
            System.out.println(arrayOfWords[0]);
        }
    }
}
