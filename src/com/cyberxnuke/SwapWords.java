package com.cyberxnuke;

import java.util.ArrayList;

public class SwapWords {

    public void swapWords(String s){

        String[] strSplit = s.split("(?=[A-Z])");
        String  temp = strSplit[0];
        strSplit[0] = strSplit[1];
        strSplit[1] = temp;

        for(int count = strSplit.length-1; count >=0; count--){
                System.out.print(strSplit[count]);
        }
    }
}
