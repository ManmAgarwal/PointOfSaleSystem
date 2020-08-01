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
public class Manager extends Staff{

    public Manager(){
        this.name = "A";
        this.id = 1;
        this.position = "Manager";
        this.password = 123;
    }
    
    @Override
    protected void accessPOS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
