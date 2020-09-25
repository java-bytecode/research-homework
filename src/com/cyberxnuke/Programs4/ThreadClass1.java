package com.cyberxnuke.Programs4;

public class ThreadClass1 extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " " + i);
        }

    }
}
