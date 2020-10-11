package com.cyberxnuke.IsAObjectSerDes;

import java.io.Serializable;

public class Vehicle implements Serializable {
    int noOftyres;
    String name;

    public Vehicle(int noOftyres, String name){
        this.noOftyres = noOftyres;
        this.name = name;
    }

}
