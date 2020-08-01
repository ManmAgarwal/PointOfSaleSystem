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

enum ItemType{
    FOOD, DRINK, MEALSET;
}
class Item {
    
    private ItemDetails itemDetails;
    private ItemType itemType;
    private int quantity;
    private boolean isOrdered;
    private boolean isInStock;
    
    public Item(ItemDetails itemDetails, ItemType itemType,
                int quantity, boolean isOrdered, boolean isInStock){
        this.itemDetails = itemDetails;
        this.itemType = itemType;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
        this.isInStock = isInStock;
    }
    
    public ItemDetails getItemDetails(){
        return this.itemDetails;
    }
    
    public ItemType getItemType(){
        return this.itemType;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public boolean isOrdered(){
        return this.isOrdered;
    }
    
    public boolean isInStock(){
        return this.isInStock;
    }
    
    public void setInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    
    @Override
    public String toString(){
        return this.getItemDetails().getName()+" "+this.getItemDetails().getPrice()+" "+this.getQuantity();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
