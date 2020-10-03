package com.cyberxnuke.Q1013;

public class ThreadCalcSum extends Thread {
    int number1;
    int number2;

    public ThreadCalcSum(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public void run() {
        add(number1, number2);
    }

    public void add(int number1, int number2) {
        System.out.println("Sum: " + (number1 + number2));
    }
}
