package com.cyberxnuke.Q3;

public interface AnonI {
    public abstract void print();
    default void printMessage() {
        System.out.println("APPLE");
    };
}
