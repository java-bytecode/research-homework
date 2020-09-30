package com.cyberxnuke.collectionsPrograms;

import java.util.PriorityQueue;

public class PriorityQueueProgram {
    public static void main(String[] args){

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(4);
        pQueue.add(3);
        pQueue.add(5);

        System.out.println(pQueue.toString() + "\n");

        System.out.println(pQueue.element());
        System.out.println(pQueue.peek());
        System.out.println(pQueue.remove(1));
        System.out.println(pQueue.poll());
        System.out.println(pQueue.toString());

        System.out.println();
    }
}
