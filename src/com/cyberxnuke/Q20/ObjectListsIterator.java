package com.cyberxnuke.Q20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ObjectListsIterator {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("ABC");
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(arrayList + "\n");

        ListIterator iterator1 = arrayList.listIterator();
        iterator1.add(100);
        iterator1.add(200);
        iterator1.add(300);

        System.out.println(arrayList + "\n");

        ListIterator iterator2 = arrayList.listIterator(3);
        while(iterator2.hasPrevious()){
        //    System.out.println(iterator1.nextIndex());
            System.out.println(iterator2.previousIndex() + " " + iterator2.previous());
            // iterator2.add(500);
            //iterator2.remove();
            iterator2.set(400);
        }

        System.out.println("\n" + arrayList);

    }
}
