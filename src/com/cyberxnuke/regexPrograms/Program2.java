package com.cyberxnuke.regexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program2 {
    static String strToBeSearched = "A regular expression is a sequence of characters that forms a search pattern. \n" +
    "When you search for data in a text, you can use this search pattern to describe what you are searching for 'SEARCH'.";

    public static void main(String[] args){
        ProgrammingLanguages javaLang = ProgrammingLanguages.JAVA;
        ProgrammingLanguages phpLang = ProgrammingLanguages.PHP;

        Pattern patternCaseSensitive = Pattern.compile("search");
        Pattern patternCaseInsensitive = Pattern.compile("search", Pattern.CASE_INSENSITIVE);

        Matcher matcher1 = patternCaseSensitive.matcher(strToBeSearched);
        Matcher matcher2 = patternCaseInsensitive.matcher(strToBeSearched);

        int count1 = 0;
        int count2 = 0;
        while(matcher1.find()){
                count1++;
        }

        while(matcher2.find()){
            count2++;
        }

        System.out.print("Number of times 'search' was found in the sentence: " + count1 + "\n");
        System.out.print("Number of times 'search' was found in the sentence: " + count2);


    }
}
