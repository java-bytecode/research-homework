package com.cyberxnuke.collectionsPrograms;

import java.util.TreeMap;

public class TreeMapProgram {
    public static void main(String[] args){
        TreeMap<Integer, String> tMap = new TreeMap<>();

        tMap.put(1,"Hello");
        tMap.put(3, "UNIX");
        tMap.put(2, "World");

        System.out.println(tMap);

        for(Integer num: tMap.keySet()){
            System.out.println(num + ", " + tMap.get(num));
        }

        // Less than
        System.out.println("headMap: " + tMap.headMap(2));
        // greater than or equal to
        System.out.println("tailMap: " + tMap.tailMap(2));
        // between
        System.out.println("subMap: " + tMap.subMap(1,3)); // inclusive, exclusive
    }
}
