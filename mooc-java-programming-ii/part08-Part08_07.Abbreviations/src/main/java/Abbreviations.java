
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffaz
 */
public class Abbreviations {
    
    private HashMap<String, String> abbr;
    
    public Abbreviations() {
        this.abbr = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.hasAbbreviation(sanititzeAbbr(abbreviation))) {
            System.out.println("Abbreviation already exists");
        }else {
            this.abbr.put(sanititzeAbbr(abbreviation), explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        String newAbbr = sanititzeAbbr(abbreviation);
        
        return this.abbr.containsKey(newAbbr);
    }
    
    public String findExplanationFor(String abbreviation) {
        boolean abbrFound = this.hasAbbreviation(abbreviation);
        
        if (abbrFound) {
            return this.abbr.get(sanititzeAbbr(abbreviation));
        }else {
            return null;
        }
    }
    
    private static String sanititzeAbbr(String abbr) {
        if (abbr == null) {
            abbr = "";
        }
        
        abbr = abbr.toLowerCase();
        return abbr.trim();
    }
}
