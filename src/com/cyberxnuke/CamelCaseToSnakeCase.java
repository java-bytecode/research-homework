package com.cyberxnuke;

public class CamelCaseToSnakeCase {
    public CamelCaseToSnakeCase(){
        //
    }
    public String convertToSnakeCase(String s){
        StringBuilder str = new StringBuilder(s);
        for(int count = 0; count < str.length(); count++){
            char ch = str.charAt(count);
           // System.out.println(count);
            if(((ch >= 'A' && ch <= 'Z') || (ch == '!' || ch == '&')) && (count!=0)){
                str.insert(count, '_');
                count+=1;
            }
        }

        return str.toString().toLowerCase();
    }

}
