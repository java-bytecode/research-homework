package com.cyberxnuke.collectionsPrograms;

import java.util.ArrayDeque;

public class ArrayDequeProgram {
    public static void main(String[] args){
        ArrayDeque aDeque = new ArrayDeque();
        ArrayDeque aDequeIntentionallyEmpty = new ArrayDeque();

        aDeque.add(1);
        aDeque.addLast("Hello World!");
        aDeque.add(1);

        System.out.println(aDeque.element());

        try {
            System.out.println(aDequeIntentionallyEmpty.element());

        } catch(Exception e) {
            System.out.print("Intentionally printing this exception! ");
            System.out.println(e.fillInStackTrace());
        }

        System.out.println(aDequeIntentionallyEmpty.peek());
        System.out.println(aDequeIntentionallyEmpty.peekFirst());
        System.out.println(aDequeIntentionallyEmpty.peekLast());
        try {
            System.out.println(aDequeIntentionallyEmpty.remove());
        } catch (Exception e) {
            System.out.print("Intentionally printing this exception! ");
            System.out.println(e.fillInStackTrace());
        }

        System.out.println(aDequeIntentionallyEmpty.poll());

        System.out.println(aDeque.removeLastOccurrence(1));

        System.out.println(aDeque.getLast());

        System.out.println();
    }
}
