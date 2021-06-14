
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class student implements Serializable{
    private String nameString;

    public student(String nameString) {
        this.nameString = nameString;
    }

    public student() {
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    @Override
    public String toString() {
        return "student{" + "nameString=" + nameString + '}';
    }
    
}
