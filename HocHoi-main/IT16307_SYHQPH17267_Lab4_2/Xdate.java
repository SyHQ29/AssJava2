/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Xdate {
    private static  SimpleDateFormat formater= new SimpleDateFormat();
    public static Date parse(String text, String pattern) throws RuntimeException{
        try {
            formater.applyPattern(pattern);
            return formater.parse(text);
            
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public  static Date parse(String text) throws RuntimeException{
        return  Xdate.parse(text,"dd-MM-yyyy");
    }
}
