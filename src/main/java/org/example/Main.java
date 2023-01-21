package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printDiamond(4,13);
    }


    static void printDiamond(int height, int width) {
        String[][] romb = new String[height][width];

        int right = width / 2;
        int left = width / 2;
        int halfH = height;


        while (height > 0 && right < width && left > 0) {
            height--;
            romb[height][right++] = "#";
            romb[height][--left] = "#";

            if (height == halfH/2 || right == width-1 || left < 0) {
                while (height > 0 && left < width && right > 0) {
                    height--;
                    romb[height][--right] = "#";
                    romb[height][left++] = "#";
                }
            }
        }
        Arrays.stream(romb).map(Arrays::toString).forEach(System.out::println);
    }
}