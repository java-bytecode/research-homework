package com.cyberxnuke.Q1013;

public class ThreadPrac {
    public static void main(String[] args) {

        Boolean calcAvgCompleted = false;

        ThreadCalcSum calcAdd = new ThreadCalcSum(10, 20);
        calcAdd.start();

        ThreadCalcAvg calcAvg = new ThreadCalcAvg(10,20, calcAvgCompleted);
        Thread calcAvgT = new Thread(calcAvg);
        calcAvgT.start();

        ThreadDisplay threadDisplay = new ThreadDisplay(calcAvgCompleted);
        threadDisplay.start();



    }
}
