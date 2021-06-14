/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.Lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QL {

    Scanner sc = new Scanner(System.in);
    ArrayList<car> list = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("1.Nhập");
            System.out.println("2.Xuất");
            System.out.println("3.Thoát");
            int LuaChon = Integer.parseInt(sc.nextLine());
            switch (LuaChon) {
                case 1:
                    nhap();
                    break;
                    case 2 :xuat();
                    break;
                    case 3:System.exit(0);
                    

            }
        }

    }

    public void nhap() {
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhâp tên xe : ");
            String nameString = sc.nextLine();
            System.out.println("Nhâp Giá : ");
            double price = Double.parseDouble(sc.nextLine());
            if (i == 0) {
                car c = new ImportedCar(nameString, i);
                list.add(c);
            } else {
                car c = new LocalCar(nameString, price);
                list.add(c);
            }
        }
    }
    public void xuat(){
        for( car x : list){
            System.out.println(x);
        }
    }

}
