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
abstract class SystemInterface {
    
    protected Item[] items;
    protected int nItems;
    
    protected abstract void initializedSystemInterface();

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getnItems() {
        return nItems;
    }

    public void setnItems(int nItems) {
        this.nItems = nItems;
    }

    @Override
    public String toString() {
        return "SystemInterface{" + "items=" + items + ", nItems=" + nItems + '}';
    }
    
    
}
