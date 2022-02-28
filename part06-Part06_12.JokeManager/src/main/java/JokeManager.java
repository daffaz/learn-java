
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffaz
 */
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public int size() {
        return this.jokes.size();
    }
    
    public boolean isEmpty() {
        return this.jokes.isEmpty();
    }
    
    public String drawJoke() {
        
        if (this.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        Random draw = new Random();
        int index = draw.nextInt(this.jokes.size());
        
        return this.jokes.get(index);
    }
    
    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
