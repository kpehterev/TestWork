package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        printDiamond(10,20);

    }

    static void printDiamond(int height, int width) {

            String[][] romb = rombForPrtint(height, width);
            Arrays.stream(romb).map(Arrays::toString).forEach(System.out::println);

    }



    static String[][] rombForPrtint(int height, int width) {


        String[][] romb = new String[height][width];

        int right = width / 2;
        int left = width / 2;
        int halfH = height;
        int delimiter = height/width;



        while (height > 0 && right < width && left > 0) {
            height--;
            romb[height][right++] = "#";
            romb[height][--left] = "#";
            height-=delimiter;

            if (height <= halfH / 2 ) {
                while (height > 0 && left < width && right > 0) {
                    height--;
                    romb[height][--right] = "#";
                    romb[height][left++] = "#";
                    height-=delimiter;
                }
            }
        }
        return romb;
    }

}