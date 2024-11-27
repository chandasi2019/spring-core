package org.spring.di.beans;

public class Address {
    private int houseno;
    private String city;
    private int pincode;


    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
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
