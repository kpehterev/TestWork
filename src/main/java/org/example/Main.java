package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        printDiamond(4,4);

    }

    static void printDiamond(int height, int width) {


            String[][] romb = rombForPrtint(height, width);
            Arrays.stream(romb).map(Arrays::toString).forEach(System.out::println);


    }



    static String[][] rombForPrtint(int height, int width) {

        String[][] romb = new String[height][width];


        int right = width / 2;
        int left = width / 2;
        int half = height;
        int delimiter;

        if(height>6){
            delimiter = height/width;
        }
        else delimiter=0;

        while (height > 0 ) {
            if (height > half / 2 && right < width && left > 0) {

                height--;
                romb[height][right++] = "#";
                romb[height][--left] = "#";
                height -= delimiter;
            }else {
                height--;
                romb[height][--right] = "#";
                romb[height][left++] = "#";
                height -= delimiter;
            }
        }
        return romb;
    }

}