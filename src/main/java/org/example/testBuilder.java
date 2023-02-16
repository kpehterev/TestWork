package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testBuilder {
    public static void main(String[] args) {


    }


    static String rangeOf(int[] arr) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= arr.length ; i++) {

            if(i != arr.length && arr[i]-arr[i-1] == 1) {
                count++;
            }else{
                if (count==1) list.add(String.valueOf(arr[i-1]));
                else list.add(arr[i-count]+"-"+arr[i-1]);
                count=1;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1)str.append(list.get(i));
            else str.append(list.get(i)).append(",");
        }

        return str.toString();
    }
}
 class TestThread extends Thread{

     @Override
     public void run() {
         super.run();
     }
 }
