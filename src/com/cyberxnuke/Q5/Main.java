package com.cyberxnuke.Q5;

public class Main {
    public static void main(String[] args){
        OnlyOnce obj1 = OnlyOnce.obj;
        obj1.setName("ABCD");
        System.out.println(obj1.name);

        OnlyOnce obj2 = OnlyOnce.obj;
        System.out.println(obj2.name);
    }
}
