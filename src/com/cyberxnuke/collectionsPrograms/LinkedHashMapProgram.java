package com.cyberxnuke.collectionsPrograms;

import java.util.LinkedHashMap;

public class LinkedHashMapProgram {

    public static void main(String[] args){
        LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<>();
        lhMap.put(1, "Hello");
        lhMap.put(2, "World");
        lhMap.put(3, "CyberxNuke");
        lhMap.put(null, "CyberxNuke");
        lhMap.put(null, null);


        System.out.println(lhMap);
        System.out.println(lhMap.entrySet());

        System.out.println(lhMap.containsValue("Hello"));
        System.out.println(lhMap.containsKey(1));
        System.out.println(lhMap.size());
    }

}
