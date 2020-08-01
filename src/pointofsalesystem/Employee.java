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
public class Employee extends Staff {
    
     public Employee(){
        this.name = "B";
        this.id = 2;
        this.position = "Employee";
        this.password = 321;
    }
    
    @Override
    protected void accessPOS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
