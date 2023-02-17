package org.example;

import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args) {
        int target = 9;
        Integer[] figures = {2,7,11,15};
        System.out.println(Arrays.toString(sumTwo(figures,target)));

    }

    static Integer[] sumTwo(Integer[] figure, int target){
        Integer[] finish = new Integer[2];
        for (int i = 1; i < figure.length; i++) {
           int j = i;
           int start = figure[j-1];

            while (true){
               if(start+figure[j]==target){
                   finish[0]=i-1;
                   finish[1]=j;
                   break;
               }else ++j;
               if(j==figure.length) break;
           }
        }
        return finish;

    }
}

