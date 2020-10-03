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

    public synchronized void avg(int number1, int number2) {
        resultCalc = true;
        resultCalc.notify();
    }
}
