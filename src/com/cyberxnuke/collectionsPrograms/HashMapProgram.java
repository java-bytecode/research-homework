package com.cyberxnuke.collectionsPrograms;

import java.util.HashMap;

public class HashMapProgram {
    public static void main(String[] args){
        HashMap<Integer, String> hsMap = new HashMap<Integer, String>();

        hsMap.put(2, "Hello");
        hsMap.put(3, "World");
        hsMap.put(4, "!");
        hsMap.put(1, null);
        hsMap.put(null, "Meow");

        for(Integer key: hsMap.keySet()){
            System.out.println(key);
        }

        for(String values: hsMap.values()){
            System.out.println(values);
        }

        System.out.println("\n*************************\n");
        System.out.println(hsMap.get(2));
        hsMap.remove(2);
        System.out.println(hsMap.get(2));
        System.out.println(hsMap);

        System.out.println();

        for(Integer i: hsMap.keySet()){
            System.out.println("key: " + i + " Value: " + hsMap.get(i));
        }

        hsMap.replace(1, "Packet");
        hsMap.replace(2, null, "Message");
        System.out.println("\n" + hsMap);

    }
}
