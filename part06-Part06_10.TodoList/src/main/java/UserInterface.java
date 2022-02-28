
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
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        OUTER:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break OUTER;
                case "add":
                    System.out.print("To add: ");
                    String newTask = scanner.nextLine();
                    this.todoList.add(newTask);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int toRemoved = Integer.parseInt(scanner.nextLine());
                    this.todoList.remove(toRemoved);
                    break;
                default:
                    break;
            }
        }
    }
}
