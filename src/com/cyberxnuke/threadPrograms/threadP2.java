package com.cyberxnuke.threadPrograms;

public class threadP2 implements Runnable {
    int num;
    {
        num = 10;
    }

    @Override
    public void run() {
        while(num != 1){
            System.out.println("Hello World from Program 2! " + num);
            num--;
        }
    }

//    public void start(){
//        run();
//    }
}
