package com.chand.spring.learn.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("Chandan")
    private String name;
    @Value("11")
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void display(){
        System.out.println("Name: "+this.name+" Id: "+this.getId());
    }
}
