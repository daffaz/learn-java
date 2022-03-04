
import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first =  0;
        int second = 0;
        int CAP = 100;
        
        while (true) {
            System.out.printf("First: %d/100\n", first);
            System.out.printf("Second: %d/100\n", second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int amount = Integer.parseInt(parts[1]);
            if ((amount == (int) amount) && amount > 0) {
                if (parts[0].equals("add")) {
                    if (amount + first > CAP) {
                        first = CAP;
                    }else {
                        first += amount;
                    }
                }else if (parts[0].equals("move")) {
                    if (first >= amount) {
                        if (amount + second > CAP) {
                            second = CAP;
                        }else {
                            second += amount;
                        }
                        first -= amount;
                    }else {
                        if (first > 0) {
                            second += first;
                            first = 0;
                        }
                    }
                }else if (parts[0].equals("remove")) {
                    if (amount > second) {
                        second = 0;
                    }else {
                        second -= amount;
                    }
                }
            }
        }
    }
}
