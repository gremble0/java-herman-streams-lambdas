package com.booleanuk;

import java.util.ArrayList;
import java.util.List;

public class Initialization {
    public static void main(String[] args) {
        List<Integer> numbersWorse = new ArrayList<>();
        numbersWorse.add(420);
        numbersWorse.add(69);

        List<Integer> numbersBetter = new ArrayList<>() {{
            add(420);
            add(69);
        }};

        List<Integer> numbersMaybeBest = new ArrayList<>() {{
            this.add(420);
            this.add(69);
        }};

        for (int number : numbersWorse)
            System.out.println(number);
        System.out.println();

        for (int number : numbersBetter)
            System.out.println(number);
        System.out.println();

        for (int number : numbersMaybeBest)
            System.out.println(number);
    }
}
