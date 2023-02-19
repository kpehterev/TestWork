package org.example;

import java.util.Arrays;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));


    }

    static int removeDuplicates(int[] nums){
        return (int)Arrays.stream(nums).distinct().count();
    }
}
