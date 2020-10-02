package com.cyberxnuke.Q9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(2);

        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();

        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

//        HashSet hashSet = new HashSet();
//        hashSet.iterator();

//        ListIterator listIterator = (ListIterator) linkedHashSet.iterator();
//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
    }
}
