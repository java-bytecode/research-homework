package com.cyberxnuke.HasAObjectSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args){

        Address address = new Address("1922 Larchmont Pl", "Mount Laurel","New Jersey(NJ)");
        Person person = new Person("Sarah", address);

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
