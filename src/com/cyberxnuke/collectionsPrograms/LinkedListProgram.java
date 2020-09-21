package com.cyberxnuke.collectionsPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {

    public static void main(String[] args) {

        LinkedList<String> lList = new LinkedList<>();
        lList.add("Hello");
        lList.addLast("World!");
        lList.add("x");
        lList.add("x");
        System.out.println(lList.peek());
        System.out.println(lList.peekFirst());
        System.out.println(lList.lastIndexOf("x"));
        System.out.println(lList.pop());
        System.out.println(lList.pollFirst());
        System.out.println(lList.peek());
        System.out.println(lList.peekLast());
        System.out.println(lList.size());

        Iterator itr2 = lList.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // Why infinite loop?

        //System.out.println(lList.iterator().hasNext());

//		while(lList.iterator().hasNext()) {
//			System.out.println(lList.iterator().next());
//		}

        System.out.println();
    }
}
