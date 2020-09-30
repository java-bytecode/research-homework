package com.cyberxnuke.collectionsPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetProgram {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet<String> treeSet = new TreeSet();

        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Watch 6");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("Microsoft");
        hashSet.add("Microsoft");

        Iterator itrHashSet = hashSet.iterator();
        while(itrHashSet.hasNext()) {
            System.out.println(itrHashSet.next());
        }

        linkedHashSet.add("Apple");
        linkedHashSet.add("Apple");
        linkedHashSet.add(1);
        linkedHashSet.add(null);
        linkedHashSet.add(null);


        System.out.println(linkedHashSet.toString());

        /* Ordering:
           Numbers
           Capitals
           Small alphabets */
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("b");
        treeSet.add("A");

        System.out.println(treeSet.toString());


    }
}
