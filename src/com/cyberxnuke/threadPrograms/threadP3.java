package com.cyberxnuke.threadPrograms;

public class threadP3 extends Thread {
    int num;
    {
        num = 10;
    }

    @Override
    public void run() {
        while(num != 1){
            System.out.println("Hello World from Program 3! " + num);
            num--;
        }
    }
}
