package com.cyberxnuke.Q1013;

public class ThreadPrac {
    public static void main(String[] args) {

        Boolean calcAvgCompleted = false;

        ThreadCalcSum calcAdd = new ThreadCalcSum(10, 20);
        calcAdd.start();
        try {
            calcAdd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadCalcAvg calcAvg = new ThreadCalcAvg(10,20, calcAvgCompleted);
        Thread calcAvgT = new Thread(calcAvg);
        calcAvgT.start();
        try {
            calcAvgT.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadDisplay threadDisplay = new ThreadDisplay(calcAvgCompleted);
        threadDisplay.start();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        t1.setName("yourName");
        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

        // Properties
        System.out.println("\n***** Thread Properties *****\n");
        System.out.println(t1.getId() + "\t" + t2.getId() + "\t" + t3.getId());
        System.out.println(t1.getName() + "\t" + t2.getName() + "\t" + t3.getName());
        System.out.println(t1.getPriority() + "\t" + t2.getPriority() + "\t" + t3.getPriority());
        System.out.println(t1.getState() + "\t" + t2.getState() + "\t" + t3.getState());
        System.out.println(t1.isAlive() + "\t" + t2.isAlive() + "\t" + t3.isAlive());
        System.out.println(t1.isDaemon() + "\t" + t2.isDaemon() + "\t" + t3.isDaemon());
        System.out.println(t1.getThreadGroup() + "\t" + t2.getThreadGroup() + "\t" + t3.getThreadGroup());


    }
}
