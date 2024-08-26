package com.booleanuk;

import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>() {{
            this.add(420);
            this.add(69);
        }};

        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++)
            numbers.set(i, numbers.get(i) * 2);

        System.out.println(numbers);
        // Ånei! listen er blitt mutert :(

        List<Integer> doubled = new ArrayList<>();
        for (int number : numbers)
            doubled.add(number * 2);

        System.out.println(doubled);
        // Hmm dette funker, men vi må vite om implementasjonsdetaljene til listen vi henter fra og
        // avhengig av hva vi gjør i for løkken kan vi få sideeffekter.

        List<Integer> doubledStream = numbers
                .stream()
                .map(number -> number * 2)
                .toList();

        System.out.println(doubledStream);
        // WOW! fint og abstrakt, på en linje, spesialisert med en lambdafunksjon som ikke
        // kan ha sideeffekter (sideeffekter er dårlig).
    }
}
