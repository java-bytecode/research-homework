package com.cyberxnuke.Deserial;

import com.cyberxnuke.General.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args){
        try{
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.ser"));
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.id + " " + student.name + " "  + student.message);

        } catch (Exception e){
            e.fillInStackTrace();
        }
    }
}
