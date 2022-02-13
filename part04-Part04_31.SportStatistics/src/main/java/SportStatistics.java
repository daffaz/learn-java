
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int counter = 0;
        int winCounter = 0;
        int losesCounter = 0;
        
        try (Scanner fs = new Scanner(Paths.get(fileName))){
            while (fs.hasNextLine()) {
                String[] data = fs.nextLine().split(",");
                for (int i = 0; i < 2; i++) {
                    if (data[i].equals(teamName)) {
                        counter++;
                        if (i % 2 == 0) {
                            if (Integer.valueOf(data[2]) > Integer.valueOf(data[3])) {
                                winCounter++;
                            }else {
                                losesCounter++;
                            }
                        }else {
                            if (Integer.valueOf(data[2]) < Integer.valueOf(data[3])) {
                                winCounter++;
                            }else {
                                losesCounter++;
                            }
                        }
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + losesCounter);
    }

}
