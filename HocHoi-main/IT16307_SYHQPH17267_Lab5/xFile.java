/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Admin
 */
public class xFile {

    public static byte[] read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int x = fis.available();
            byte[] data = new byte[x];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object obj = ois.readObject();
            ois.close();
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObject(String path, Object object) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            oos.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
