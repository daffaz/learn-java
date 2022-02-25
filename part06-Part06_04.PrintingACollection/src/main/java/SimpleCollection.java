
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
        for (String ele : this.elements) {
            if (this.elements.indexOf(ele) == this.elements.size() - 1) {
                toReturn = toReturn + ele;
            }else {
                toReturn = toReturn + ele + "\n"; 
            }
        }
        
        String ele = "";
        
        if (this.elements.size() > 1) {
            ele = "elements:\n";
        }else {
            ele = "element:\n";
        }
        
        toReturn = "The collection " + this.name + " has " + this.elements.size() + " " + ele + toReturn;
        
        return toReturn;
    }
}
