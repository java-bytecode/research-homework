package com.cyberxnuke.Q1013;

public class ThreadCalcAvg implements Runnable {

    int number1;
    int number2;
    Boolean resultCalc;

    public ThreadCalcAvg(int number1, int number2, Boolean resultCalc) {
        this.number1 = number1;
        this.number2 = number2;
        this.resultCalc = resultCalc;
    }

    @Override
    public void run() {
        avg(number1, number2);
    }

    public void avg(int number1, int number2) {
        System.out.println("Average: " + (number1 + number2)/2);
    }
}
