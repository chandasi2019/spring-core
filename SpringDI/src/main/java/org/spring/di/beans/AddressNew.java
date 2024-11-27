package org.spring.di.beans;

public class AddressNew {
    private int houseno;
    private String city;
    private int pincode;

    public AddressNew(int houseno, String city, int pincode) {
        this.houseno = houseno;
        this.city = city;
        this.pincode = pincode;
    }
    public void display() {
        System.out.println( "Address{" +
                "houseno=" + houseno +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}');
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseno=" + houseno +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
