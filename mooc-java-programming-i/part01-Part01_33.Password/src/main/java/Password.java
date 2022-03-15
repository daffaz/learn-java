
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Caput Draconis";
        System.out.println("Password?");
        String pwd = scan.nextLine();
        
        if (pwd.equals(password)) {
            System.out.println("Welcome!");
        }else {
            System.out.println("Off with you!");
        }
    }
}
