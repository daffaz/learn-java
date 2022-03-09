
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffaz
 */
public class UserInterface {
    
    private ScoreCounter scoreCounter;
    private Scanner scanner;
    
    public UserInterface(ScoreCounter newScoreCounter, Scanner scanner) {
        this.scoreCounter = newScoreCounter;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            this.scoreCounter.add(input);
        }
        
        System.out.println("Point average (all): " + this.scoreCounter.getAverageOfAllValue());
        System.out.println("Point average (passing): " + this.scoreCounter.getAverageOfPassing());
        System.out.println("Pass percentage: " + this.scoreCounter.passPercentage());
        System.out.println("Grade distribution:");
        this.scoreCounter.starPrinter();
    }
}
