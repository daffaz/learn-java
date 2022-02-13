
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        
        try (Scanner fs = new Scanner(Paths.get(scanner.nextLine()))){
            while (fs.hasNextLine()) {
                System.out.println(fs.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
