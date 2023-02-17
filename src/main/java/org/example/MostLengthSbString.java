package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MostLengthSbString {
    public static void main(String[] args) {
        String resource = "bbbbb";
        System.out.println(mostLength(resource));

    }

    public static int mostLength(String resource){
        String[] massive = resource.split("");

        Set unique = new LinkedHashSet();

        for (int i = 0; i < massive.length; i++) {
            if (unique.contains(massive[i])) continue;
            else unique.add(massive[i]);
        }
        return unique.size();
    }
}
