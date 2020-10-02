package com.cyberxnuke.Q141518;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class Manager extends Employee {
    public Manager(String fileName) {
        super(fileName);
    }

    public Manager(String name, int rating, int year) {
        super(name, rating, year);
    }

    @Override
    public void create() {
        try {
            fileObj = new File(fileName);
            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            } else {
                System.out.println("File already exists!");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    @Override
    public void read() {
        try {
            fileObj = new File(fileName);
            Scanner fileReader = new Scanner(fileObj);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    @Override
    public void write(String name) {
        try {
            fileWriterObj = new FileWriter(fileName, true);
            fileWriterObj.write(name);
            fileWriterObj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeFileReadable() {
        try {
            fileObj = new File(fileName);
            fileObj.setReadOnly();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public void delete() {
        try {
            fileObj = new File(fileName);
            if (fileObj.delete()) {
                System.out.println("File deleted: " + fileObj.getName());
            } else {
                System.out.println("Failed to delete the file!");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}

class sortEmployeesRating implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.rating > o2.rating){
            return -1;
        } else if(o1.rating == o2.rating){
            return 0;
        } else {
            return 1;
        }
    }
}

class sortEmployeesYear implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.year > o2.year){
            return -1;
        } else if(o1.year == o2.year){
            return 0;
        } else {
            return 1;
        }
    }
}

