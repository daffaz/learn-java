
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
public class Room {
    private ArrayList<Person> listOfPerson;
    
    public Room() {
        this.listOfPerson = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.listOfPerson.add(person);
    }
    
    public boolean isEmpty() {
        return this.listOfPerson.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.listOfPerson;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.listOfPerson.get(0);
        
        for (Person person : this.listOfPerson) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        this.listOfPerson.remove(shortest);
            
        return shortest;
    }
}
