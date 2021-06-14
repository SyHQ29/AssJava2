/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_mod1023;

import java.io.Serializable;


/**
 *
 * @author doanp
 */
public class User implements Serializable{
    private String name;
    private String pass;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User() {
    }

    public User(String name, String pass, String role) {
        this.name = name;
        this.pass = pass;
        this.role = role;
    }
}
