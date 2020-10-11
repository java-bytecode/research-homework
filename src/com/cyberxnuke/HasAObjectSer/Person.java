package com.cyberxnuke.HasAObjectSer;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    Address address; // HAS A RELATIONSHIP

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
}
