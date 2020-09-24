package com.cyberxnuke.threadPrograms;

import java.util.Set;

public class DriverCode {

    public static void main(String[] args) throws InterruptedException {

        // Thread 1
        threadP1 obj = new threadP1();
        obj.setName("Hello");
        obj.start();
        obj.join(); // Why?

        // Thread 3
        threadP3 obj3 = new threadP3();
        threadP2 obj2 = new threadP2();
        Thread thread2 = new Thread(obj2);
        obj3.start();
        // obj3.join();

        // Thread 2

        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
//        System.out.println(thread2.getName());
//        System.out.println(obj.getName());
//        System.out.println(obj3.getName());
        // thread2.join();

        System.out.println("HELLOWOW");

        // Properties

        System.out.println("Thread 1 is alive? " + obj.isAlive());
        System.out.println("Thread 3 is alive? " + obj3.isAlive());
        System.out.println("Name of Thread 1: " + obj.getName());
        System.out.println("Thread 1 ID: " + obj.getId());
        System.out.println("Thread 2 ID: " + thread2.getId());
        System.out.println("Thread 3 ID: " + obj3.getId());

        System.out.println("\n" + "ID" + "\t\t\t\t" + " Name");

        Set<Thread> threadPropertySet = threadP1.getAllStackTraces().keySet();

        for (Thread thr : threadPropertySet) {
            System.out.println(thr.getId() + "\t\t\t\t" + thr.getName() + "\t\t\t\t" + thr.getState());
        }

        System.out.println();

        // Priority
        System.out.println("Priority Of Thread 1: " + obj.getPriority());
        System.out.println("Priority Of Thread 2: " + thread2.getPriority());

        // Daemon Thread
        threadP1 obj4 = new threadP1();
        obj4.setDaemon(true);
        obj4.start();

        System.out.println("Thread 1 is daemon thread? " + obj.isDaemon());
        System.out.println("Thread 4 is daemon thread? " + obj4.isDaemon());
    }

}
