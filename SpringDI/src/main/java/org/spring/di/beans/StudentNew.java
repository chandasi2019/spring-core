package org.spring.di.beans;

public class StudentNew {
    private int rollno;
    private String name;
    private AddressNew addressNew;

    public StudentNew(int rollno, String name, AddressNew addressNew) {
        this.rollno = rollno;
        this.name = name;
        this.addressNew = addressNew;
    }
    public void display(){
        System.out.println("Rollno: "+rollno+" Name: "+name+" AddressNew: "+addressNew);
    }
}
