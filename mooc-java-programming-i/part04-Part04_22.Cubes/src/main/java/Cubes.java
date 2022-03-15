
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dummy = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            dummy = Integer.valueOf(input);
            System.out.println(dummy * dummy * dummy);
        }
    }
}
