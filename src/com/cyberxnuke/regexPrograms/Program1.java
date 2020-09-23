package com.cyberxnuke.regexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program1 {

   static String strToBeSearched = "PHP is one of the programming languages commonly used. PHP follows OOPS concept in it.\n" +
                             "Java is very well known for its as a platform independent language.";

    public static void main(String[] args){
        ProgrammingLanguages javaLang = ProgrammingLanguages.JAVA;
        ProgrammingLanguages phpLang = ProgrammingLanguages.PHP;

        Pattern pattern = Pattern.compile(phpLang.toString(), Pattern.CASE_INSENSITIVE);

        // Replace Once
        String strReplacePHPOnce = strToBeSearched.replaceFirst(pattern.toString(), javaLang.toString());

        // Replace All
        String strReplacePHPAll = strToBeSearched.replace(pattern.toString(), javaLang.toString());

        System.out.println(strReplacePHPOnce + "\n");
        System.out.println(strReplacePHPAll);

    }
}
