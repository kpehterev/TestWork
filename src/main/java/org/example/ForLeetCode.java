package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Collectors;

public class ForLeetCode {


    public static void main(String[] args) {
        String s1 = "abbca";
        String s2 = "dog dog cat fish dog";
        System.out.println(lengthOfLongestSubstring(s1,s2));
    }

    static boolean lengthOfLongestSubstring(String pattern, String s2) {

        List<String> listPatterns = new ArrayList<>();
        List<String> listStrings = new ArrayList<>();
        String[] patternMassive = pattern.split("");
        String[] strings = s2.split(" ");

        int count = 0;

        for (int i = 0; i < patternMassive.length; i++) {
            listPatterns.add(patternMassive[i]);
        }

        for (int i = 0; i < strings.length; i++) {
            listStrings.add(strings[i]);
        }


        for (int i = 0; i < patternMassive.length; i++) {
            if(!(listPatterns.contains(strings[i]))) Collections.replaceAll(listPatterns, patternMassive[i], strings[i]);


        }
        Collections.sort(listPatterns);
        Collections.sort(listStrings);
        return listPatterns.equals(listStrings);


    }
}

