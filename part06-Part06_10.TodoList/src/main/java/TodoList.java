
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffaz
 */
public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        int number = 1;
        for (String task : todoList) {
            System.out.println(number + ": " + task);
            number++;
        }
    }
    
    public void remove(int task) {
        if ((task + 1) <= this.todoList.size()) {
            this.todoList.remove(task - 1);
        }
    }
}
