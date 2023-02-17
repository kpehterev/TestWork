package org.example;

public class LongestPalindromic {
    public static void main(String[] args) {

        System.out.println(longest("cbbd"));

    }

    static String longest(String str){
        String[] massive = str.split("");

        String longest = null;
        int maxLength=0;

        for (int i = 0; i < massive.length; i++) {
            int count = i;
            StringBuilder palindromicBuilder = new StringBuilder();

            while (true) {

                palindromicBuilder.append(massive[count]);
                count++;
                if (count == massive.length) break;


                if (massive[i].equals(massive[count-1])) {

                    String subString = str.substring(i, count);
                    StringBuilder reverseBuilder = new StringBuilder(palindromicBuilder).reverse();

                    if (subString.equals(reverseBuilder.toString())) {
                        if (subString.length() > maxLength) {
                            longest = str.substring(i, count);
                            maxLength = subString.length();
                        }
                    }

                }
            }
        }
        return longest;
    }
}
