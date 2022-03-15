/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffaz
 */
public class Container {
    private int litre;
    
    public Container() {
        this.litre = 0;
    }
    
    public int contains() {
        return this.litre;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.litre += amount;
            
            if (this.litre > 100) {
                this.litre = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.litre -= amount;
            
            if (this.litre < 0) {
                this.litre = 0;
            }
        }
    }
    
    public String toString() {
        String val = String.format("%d/100", this.litre);
        return val;
    }
}
