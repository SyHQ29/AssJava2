/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.Lab1;

/**
 *
 * @author Admin
 */
public  class LocalCar extends car{

   
    public LocalCar(String nameString, double price) {
        super(nameString, price);
    }
     public LocalCar() {
    }


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getVAT(){
        return getPrice()*0.05;
    }
    
    
}
