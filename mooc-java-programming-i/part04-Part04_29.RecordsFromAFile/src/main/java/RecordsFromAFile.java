
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file");
        String fileName = scanner.nextLine();
        
        try (Scanner fs = new Scanner(Paths.get(fileName))){
            while (fs.hasNextLine()) {
                String[] data = fs.nextLine().split(",");
                System.out.println(data[0] + ", age: " + data[1] + " years");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
