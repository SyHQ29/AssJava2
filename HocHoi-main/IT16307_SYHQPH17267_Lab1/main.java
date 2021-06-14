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
public class main {
    public static void main(String[] args) {
        QL ql = new  QL();
        LocalCar lc = new LocalCar();
        lc.insert();
        lc.delete();
        lc.update();
        lc.select();
        ImportedCar ip = new ImportedCar();
        ip.delete();
        ip.delete();
        ip.select();
        ip.update();
        ql.menu();
    }
    
}
