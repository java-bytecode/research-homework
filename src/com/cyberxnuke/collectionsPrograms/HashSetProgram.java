package com.cyberxnuke.collectionsPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
    public static void main(String[] args){
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Watch 6");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("Microsoft");

        Iterator itrHashSet = hashSet.iterator();
        while(itrHashSet.hasNext()) {
            System.out.println(itrHashSet.next());
        }
    }
}
