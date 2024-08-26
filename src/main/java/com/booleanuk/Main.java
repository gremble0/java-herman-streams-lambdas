package com.booleanuk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); ++i)
            System.out.println(numbers.get(i));

        for (int number : numbers)
            System.out.println(number);

        System.out.println("Hello world!");
    }
}