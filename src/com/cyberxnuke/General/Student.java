package com.cyberxnuke.General;

import java.io.Serializable;

public class Student implements Serializable {
    public int id;
    public   String name;
    protected static int rollno;
    protected static String description;
    private Long secretCode; // Serialization does not care about access modifiers such as private
    public transient String message;

    {
        description = "Student";
        secretCode = 101010L;
        message = "XYZ";
    }

    static {
        rollno = 1;
    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

}
