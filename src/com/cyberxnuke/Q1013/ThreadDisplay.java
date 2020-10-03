package com.cyberxnuke.Q1013;

public class ThreadDisplay extends Thread {

    Boolean resultCalc;

    public ThreadDisplay(Boolean resultCalc){
        this.resultCalc = resultCalc;
    }

    @Override
    public void run(){
        printAvg();
    }

    public void printAvg(){
        synchronized(resultCalc){
            try {
                while(!resultCalc){
                    resultCalc.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("CALC AVG THREAD DONE");
           // System.out.println("Average: " + (number1 + number2)/2);
        }
    }
}
