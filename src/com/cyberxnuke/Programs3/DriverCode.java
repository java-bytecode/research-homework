package com.cyberxnuke.Programs3;

public class DriverCode {
    public static void main(String[] args){


        String str1 = "  ABACD";
        System.out.println(str1.charAt(0));
        System.out.println(str1.codePointAt(0));
        System.out.println(str1.codePointBefore(1));
        System.out.println(str1.codePointCount(0, 5));
        System.out.println(str1.lastIndexOf("A"));
        System.out.println(str1.concat("SKS"));
        System.out.println(str1);
        System.out.println(str1.contains("ACD"));
        System.out.println(str1.trim());
        System.out.println(str1.replace('A', 'Z'));
        System.out.println(str1);
        System.out.println(str1.equalsIgnoreCase("  abacd"));
        System.out.println(str1.endsWith("D"));
        System.out.println(str1.split(" "));
        System.out.println(str1.compareTo(" ABACD"));

        StringBuilder strBuild1 = new StringBuilder();
        strBuild1.insert(0, "HELLO");
        strBuild1.append(" WORLD");
        strBuild1.delete(0, 6);
        strBuild1.deleteCharAt(1);
        strBuild1.reverse();
        strBuild1.replace(0, 2 ,"APPLE");
        CharSequence ml = strBuild1.subSequence(0, 3);
        System.out.println(ml);
        strBuild1.lastIndexOf("P");
        System.out.println(strBuild1);
    }
}
