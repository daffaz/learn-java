
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                this.dictionary.add(word, translation);
            }else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String toBeSearched = scanner.nextLine();
                String translated = this.dictionary.translate(toBeSearched);
                
                if (translated == null) {
                    System.out.println("Word " + toBeSearched + " was not found");
                }else {
                    System.out.println("Translation: " + translated);
                }
            }else {
                System.out.println("Unknown command");
            }
        }
    }
}
