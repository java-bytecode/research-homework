package com.cyberxnuke.Q141518;

import java.io.File;
import java.io.FileWriter;
import java.util.Comparator;

public abstract class Employee {
    String fileName;
    File fileObj;
    FileWriter fileWriterObj;

    public String name;
    public int rating;
    public int year;

    public Employee(String name, int rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public Employee(String fileName){
        this.fileName = fileName;
    }

    public abstract void create();
    public abstract void read();
    public abstract void write(String name);
}
