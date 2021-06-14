/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Admin
 */
public class ProductManager {

    public static void main(String[] args) {
        Product p1 = new Product("iPhone9", 1000.0);
        Product p2 = new Product("Samsung Start", 3000.0);
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.load("E://prod.txt");
        dao.store("E://prod.txt");


        Product p = dao.find("iPhone9");
        System.out.println(">Name: " + p.name);
        System.out.println(">Price: " + p.price);

    }
}
