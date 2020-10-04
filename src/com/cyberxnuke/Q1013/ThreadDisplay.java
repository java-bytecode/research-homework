package com.cyberxnuke.Q1013;

public class ThreadDisplay extends Thread {

    Boolean resultCalc;

    public ThreadDisplay(Boolean resultCalc){
        this.resultCalc = resultCalc;
    }

    @Override
    public void run(){
        print();
    }

    public void print(){
            System.out.println("CALC SUM & AVG THREADS DONE");
        }
    }
