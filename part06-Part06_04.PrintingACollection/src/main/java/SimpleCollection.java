
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (this.elements.size() <= 0) {
            return "The collection " + this.name + " is empty.";
        }
        
        String toReturn = "";
//        String toReturn = "The collection alphabet has " + this.elements.size() + " element:\n";
        for (String ele : this.elements) {
            toReturn += ele + "\n"; 
        }
        toReturn = "The collection " + this.name + " has " + this.elements.size() + " element:\n" +
                toReturn + "\n";
        
        return toReturn;
    }
}
