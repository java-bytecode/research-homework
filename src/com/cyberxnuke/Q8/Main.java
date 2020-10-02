package com.cyberxnuke.Q8;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();
        treeSet.add("12345");
        treeSet.add("A78");
        treeSet.add("aA123");
        treeSet.add("ABCD");
        treeSet.add("abcd");
        treeSet.add("CyberxNuke");
        treeSet.add("12Apple");
        treeSet.add("zqwerty");

        // Predicted Output
        // Numbers, Capital Letters, Small letters
        // 12345, 12Apple, A78, ABCD, CyberxNuke, aA123, abcd, zqwerty
        System.out.println(treeSet);
    }
}
