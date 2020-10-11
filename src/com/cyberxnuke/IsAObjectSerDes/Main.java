package com.cyberxnuke.IsAObjectSerDes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    // Parent class properties are inherited to subclasses so if parent class is Serializable, subclass would also be.
    public static void main(String[] args){
        Car carObj = new Car(4, "Volkswagen");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("car.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(carObj);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
