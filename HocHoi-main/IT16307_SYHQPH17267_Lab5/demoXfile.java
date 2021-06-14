/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author Admin
 */
public class demoXfile {

    public static void main(String[] args) {
//        byte[] data = xFile.read("C:\\Users\\Admin\\OneDrive\\Pictures\\amee.jpg");
//        xFile.write("C:\\Users\\Admin\\OneDrive\\Pictures\\ameex2.jpg", data
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("Tuấn", 5, "CNTT"));
        list.add(new student("Cường", 7.5, "TKTW"));
        list.add(new student("Hạnh", 8.5, "CNTT"));
        xFile.writeObject("E:/students.dat", list);
        ArrayList<student> list2 = (ArrayList<student>) xFile.readObject("E:/students.dat");
        for (student sv : list) {
            System.out.println(">Họ và tên: " + sv.name);
        }
    }
}
