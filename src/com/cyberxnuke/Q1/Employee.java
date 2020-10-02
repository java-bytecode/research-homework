package com.cyberxnuke.Q1;

public class Employee {
    String name;
    int rating;
    int startYear;

    {
        rating = 0;
        startYear = 2020;
    }

    public Employee(String name, int rating, int startYear){
        this.name = name;
        this.rating = rating;
        this.startYear = startYear;
    }

    public String toString(){
        return name + " " + rating + " " + startYear;
    }
}
