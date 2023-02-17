package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianOfArrays {
    public static void main(String[] args) {
        Integer[] first = {1,2};
        Integer[] second = {3,4};
        System.out.println(median(first,second));

    }

    static Double median(Integer[] first,Integer[] second){

        List<Integer> result = Stream.concat (Arrays.stream(first),Arrays.stream(second) ).sorted().toList();
        int count = result.size()/2;

        if (result.size()%2==0) {
            return (Double.valueOf(result.get(count))+Double.valueOf(result.get(--count)))/2;
        } else return (double) result.get(count);
    }
}
