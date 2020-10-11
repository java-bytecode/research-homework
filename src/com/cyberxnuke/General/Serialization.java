package com.cyberxnuke.General;

import com.cyberxnuke.General.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    // General
    // Serialization
    // Deserialization
    // Parent Class - Child Class

    public static void main(String[] args) {
        // Creating The Object
        Student student = new Student(10, "Sarah");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        // Creating the stream and writing the object
        try {
            fileOutputStream = new FileOutputStream("student.ser");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
