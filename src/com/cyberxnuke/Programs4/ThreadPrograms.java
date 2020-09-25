package com.cyberxnuke.Programs4;

import java.io.IOException;

public class ThreadPrograms {
    public static void main(String[] args) throws IOException {
        ThreadClass1 th1 = new ThreadClass1();
        ThreadClass1 th2 = new ThreadClass1();
        th1.start();
        th2.start();
    }
}
