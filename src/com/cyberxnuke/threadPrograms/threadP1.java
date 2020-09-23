package com.cyberxnuke.threadPrograms;

public class threadP1 extends Thread {
    int num;

    {
        num = 1;
    }

    @Override
    public void run(){
        while(num != 10){
        System.out.println("Hello World from Program 1! " + num);
        num++;
        }
    }
}
