/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.Lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class car implements DAO{
    private String nameString;
    private double price;

    public car() {
    }

    public car(String nameString, double price) {
        this.nameString = nameString;
        this.price = price;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double getVAT();

    @Override
    public String toString() {
        return "car{" + "nameString=" + nameString + ", price=" + price + ", VAT= " + getVAT()+ '}';
    }
    
  
  
    @Override
    public void insert(){
        System.out.println("Bạn đã nhập thành công");
    }

    @Override
    public  void select(){
        System.out.println("Bạn đã chọn thành công");
    }

    @Override
    public void delete(){
        System.out.println("Bạn đã xóa thành công");
    }

    @Override
    public  void update(){
        System.out.println("Bạn đã cập nhật thành công");
    }
    
    
}
