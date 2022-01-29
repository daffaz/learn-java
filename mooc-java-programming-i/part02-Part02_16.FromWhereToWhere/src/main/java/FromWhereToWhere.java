
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        System.out.print("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        for (; start <= end; start++) {
            System.out.println(start);
        }
    }
}
