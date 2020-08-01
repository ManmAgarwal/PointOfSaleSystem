/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsalesystem;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Manmath
 */
class OrderDetails {
    
    public int number;
    public ArrayList<Item> items;
    public Date date;
    public Time time;
    public double total;
    public OrderInterface orderInterface;
    
    public OrderDetails(int number, ArrayList<Item> items, Date date,
                        Time time, double total){
        this.number = number;
        this.items = items;
        this.date = date;
        this.time = time;
        this.total = total;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public ArrayList<Item> getItem(){
        return this.items;
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    public double calculateTotal(){
        
        double totalPrice;
        totalPrice = 0d;
        for(Item item : this.items){
            ItemDetails iDetails = item.getItemDetails();
            int quantity = item.getQuantity();
            totalPrice += quantity * (iDetails.getPrice());
        }
        return totalPrice;
    }
    @Override
    public String toString(){
        return "";
    }
}
