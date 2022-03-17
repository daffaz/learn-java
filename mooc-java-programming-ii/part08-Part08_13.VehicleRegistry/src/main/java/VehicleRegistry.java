
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> regis;
    
    public VehicleRegistry() {
        this.regis = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        String realOwner = this.get(licensePlate);
        
        if (realOwner == null) {
            this.regis.put(licensePlate, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        String realOwner = this.regis.getOrDefault(licensePlate, null);
        
        if (realOwner != null) {
            return realOwner;
        }
        
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        String realOwner = this.regis.remove(licensePlate);
        
        if (realOwner == null) {
            return false;
        }
        
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate license : this.regis.keySet()) {
            System.out.println(license);
        }
    }
    
    public void printOwners() {
        HashMap<String, Boolean> ownerAlreadyRegistered = new HashMap<>();
        
        for (LicensePlate licensePlate : this.regis.keySet()) {
            if (ownerAlreadyRegistered.getOrDefault(this.regis.get(licensePlate), Boolean.FALSE) == Boolean.FALSE) {
                ownerAlreadyRegistered.put(this.regis.get(licensePlate), Boolean.TRUE);
                System.out.println(this.regis.get(licensePlate));
            }
        }
    }
}
