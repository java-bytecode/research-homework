package com.cyberxnuke.ArrayListObjSer;

import java.io.Serializable;

public class Car implements Serializable {
    int id;
    String name;

    public Car(int id, String name){
        this.id = id;
        this.name = name;
    }
}
