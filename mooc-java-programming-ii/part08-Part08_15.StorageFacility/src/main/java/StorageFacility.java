
import java.util.ArrayList;
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
class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;
    
    public StorageFacility() {
        this.facility = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.facility.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> newFac = this.facility.get(storageUnit);
        if (newFac.isEmpty()) {
            return;
        }
        
        newFac.remove(item);
        if (newFac.isEmpty()) {
            this.facility.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> keys = new ArrayList<>();
        this.facility.keySet().forEach((key) -> {
            keys.add(key);
        });
        
        return keys;
    }
}
