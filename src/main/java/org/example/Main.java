package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sam",15);
        System.out.println(person.toString());

    }


    record Person(String name, int age){}


}