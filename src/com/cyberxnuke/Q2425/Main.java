package com.cyberxnuke.Q2425;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        Consumer<int[]> printIntegers = (n) -> {
            for(int num: n) {
                if (!(num > 3 && num < 7)) {
                    System.out.println(num);
                }
            }
        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        printIntegers.accept(arr);

        System.out.println();

        Consumer<Integer[]> doubleIntegers = (n) -> {
            for(int num: n){
                System.out.println(num*2);
            }
        };

        doubleIntegers.accept(arr1);
    }
}
