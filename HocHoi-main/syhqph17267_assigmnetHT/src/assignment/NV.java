/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class NV implements Serializable{
    protected String manv;
    protected String name;
    protected int    tuoi;
    protected String Email;
    protected double luong;

    public NV() {
    }

    public NV(String manv, String name, int tuoi, String Email, double luong) {
        this.manv = manv;
        this.name = name;
        this.tuoi = tuoi;
        this.Email = Email;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NV{" + "manv=" + manv + ", name=" + name + ", tuoi=" + tuoi + ", Email=" + Email + ", luong=" + luong + '}';
    }
    
    
}
