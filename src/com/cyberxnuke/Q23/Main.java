package com.cyberxnuke.Q23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList.stream().count());
        System.out.println(arrayList.stream().mapToInt(i -> i).sum());
        System.out.println(arrayList.stream().mapToInt(i -> i).min().getAsInt());
        System.out.println(arrayList.stream().mapToInt(i -> i).max().getAsInt());
        System.out.println(arrayList.stream().mapToInt(i -> i).average().getAsDouble());
    }
}
