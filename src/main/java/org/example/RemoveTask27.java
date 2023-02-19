package org.example;

import java.util.Arrays;

public class RemoveTask27 {

    public static void main(String[] args) {

        int[] array ={0,1,2,2,3,0,4,2};
        int element=2;

        System.out.println(removeElement(array,element));

    }

    static int removeElement(int[] data, int element){
        int count = (int) Arrays.stream(data).filter(x->x!=element).count();
        return count;
    }
}
