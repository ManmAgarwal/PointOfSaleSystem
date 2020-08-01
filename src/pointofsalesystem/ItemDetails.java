/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesystem;

/**
 *
 * @author Manmath
 */
class ItemDetails {
    
    private String name;
    private double price;
    private String servingSize;
    
    public ItemDetails (String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public String getServingSize(){
        return this.servingSize;
    }
}
