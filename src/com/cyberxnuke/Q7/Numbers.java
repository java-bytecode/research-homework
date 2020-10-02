package com.cyberxnuke.Q7;

import java.util.HashMap;
import java.util.Iterator;

public class Numbers {
    public  static void main(String[] args){
        int[] arr = {1,2,3,4,5,2,3,4,5,1,2,4,7,8,9,1};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count;

        for(int num: arr){
            if(hashMap.containsKey(num)){
                count = hashMap.get(num);
                count++;
//                System.out.println(count);
                hashMap.put(num, count);
            } else {
                hashMap.put(num, 1);
            }

        }

        System.out.println("Duplicates in the Array using HashMap");
        System.out.println();

        System.out.println(hashMap + "\n");

        Iterator itr = hashMap.keySet().iterator();
        while(itr.hasNext()) {
            int num = (Integer) itr.next();
            if (hashMap.get(num) > 1) {
                System.out.println(num);
            }
        }

    }
}
