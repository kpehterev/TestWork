package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        printDiamond(10,40);

    }

    static void printDiamond(int height, int width) {

        if(height>6){
            String[][] romb = rombForPrtintMore(height, width);
            Arrays.stream(romb).map(Arrays::toString).forEach(System.out::println);
        }

        if(height<=6){
            String[][] romb = rombForPrtintLess(height, width);
            Arrays.stream(romb).map(Arrays::toString).forEach(System.out::println);
        }



    }



    static String[][] rombForPrtintMore(int height, int width) {

        String[][] romb = new String[height][width];

        int right = width / 2;
        int left = width / 2;
        int half = height;
        int delimiter = height/width;

        while (height > 0) {

            if (height > half / 2) {

                height--;
                romb[height][right++] = "#";
                romb[height][--left] = "#";
                height -= delimiter;
            }else  {
                height--;
                romb[height][--right] = "#";
                romb[height][left++] = "#";
                height -= delimiter;
            }
        }
        return romb;
    }

    static String[][] rombForPrtintLess(int height, int width) {

        String[][] romb = new String[height][width];

        int right = width / 2;
        int left = width / 2;
        int half = height;

        while (height > 0 ) {
            if (height > half / 2 && right < width && left > 0) {

                height--;
                romb[height][right++] = "#";
                romb[height][--left] = "#";
            }else {
                height--;
                romb[height][--right] = "#";
                romb[height][left++] = "#";
            }
        }
        return romb;
    }

}