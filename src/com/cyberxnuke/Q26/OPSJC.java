package com.cyberxnuke.Q26;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class OPSJC {
    public static void main(String[] args){
        int num1 = 10;
        Integer num2 = null;
        Optional<Integer> opt1 = Optional.ofNullable(num1);
        Optional<Integer> opt2 = Optional.ofNullable(num2);

        Integer num3 = opt2.orElse(100);
        // Integer num4 = opt2.orElseThrow(); // No such element exception

        System.out.println(opt1.get());
        System.out.println(opt1);
        System.out.println(opt2);
        // System.out.println(opt2.get()); // No such element exception
        System.out.println(num3);

        opt1.ifPresent((n) -> System.out.println(n*n));
        opt2.ifPresent((n) -> System.out.println(n*2));

        System.out.println(opt1.isEmpty());

        System.out.println();

        int[] arrNumbers = {1,10,2,4,3,5,6,7,9,8};
       // List<Integer> arr = Arrays.stream(arrNumbers).boxed().collect(Collectors.toList());
        Arrays.parallelSort(arrNumbers);
        Arrays.stream(arrNumbers).forEach(n -> System.out.println(n + " "));

        System.out.println();

        ArrayList arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Microsoft");
        arrayList.add("HTML");
        arrayList.add("CSS");
        arrayList.add("Javascript");

        StringJoiner sj1 = new StringJoiner(", ");
        sj1.setEmptyValue("sj1 is Empty");
        System.out.println(sj1);
        sj1.add((CharSequence) arrayList.get(0)).add((CharSequence) arrayList.get(1)).add((CharSequence) arrayList.get(2));
        System.out.println(sj1);

        System.out.println(sj1.length());

        StringJoiner sj2 = new StringJoiner(" and ");
        sj2.add((CharSequence) arrayList.get(3)).add((CharSequence) arrayList.get(4));
        System.out.println(sj2);

        sj1.merge(sj2);
        System.out.println(sj1);
        System.out.println(sj1.toString());
    }
}
