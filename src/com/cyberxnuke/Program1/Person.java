package com.cyberxnuke.Program1;

import java.util.List;

public abstract class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected long contact;
    String address;
    protected List<Address> addressList;

    protected Person(){

    }

    protected Person(String name, int age, String gender, long contact, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.address = address;
    }

    protected Person(String name, int age, String gender, long contact, List address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.addressList = address;
    }

    abstract public void insertPersonDetails();
    abstract public void insertPersonDetails(String name, int age, String gender, long contact, String address) throws IllegalCallerException;
    abstract public void insertPersonDetails(String name, int age, String gender, long contact, List address) throws IllegalCallerException;
    abstract public void getPersonDetails();
}
