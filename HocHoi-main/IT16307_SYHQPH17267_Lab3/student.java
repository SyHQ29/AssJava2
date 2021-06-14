/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Admin
 */
public class student implements Comparable<student> {
    public String name;
    public double mark;
    public String major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public String getGrade(){
        if(this.mark <3){
            return "kém";
        }
        if (this.mark <5) {
            return "yếu";
        }
        if (this.mark <6.5) {
            return "trung bình";
        }
        if (this.mark <7.5) {
            return "khá";
        }
        if (this.mark<9) {
            return "giỏi";
        }
        return "xuất sắc";
    }
    public boolean isbonus(){
        return this.mark >= 7.5;
    }

    @Override
    public int compareTo(student t) {
        return this.getName().compareTo(t.getName());
    }
    
}
