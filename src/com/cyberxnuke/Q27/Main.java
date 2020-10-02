package com.cyberxnuke.Q27;

public class Main {
    public static void main(String[] args){
        ExceptionPrac exceptionPrac = new ExceptionPrac();
        System.out.println(exceptionPrac.getArrayElement(10)); // Gets return from finally
        System.out.println(exceptionPrac.getArrayElement(1)); // finally is overtaking everything. Not cool!
        System.out.println(exceptionPrac.getArrayElement(2.0));
        System.out.println(exceptionPrac.getArrayElement(11.0));
    }
}
