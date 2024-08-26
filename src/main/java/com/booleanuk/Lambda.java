package com.booleanuk;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    private static boolean containsLetterX(String s) {
        return s.contains("x");
    }

    public static void main(String[] args) {
        Function<String, Boolean> containsLetterX = s -> s.contains("x");
        // MERK: java kan `infer`e typene i lambda funksjonen siden vi spesisere dem i typen `Function<String, Boolean>`.
        // Det er flere måter å definere en lambda på

        boolean shouldBeFalse = containsLetterX.apply("This does not have that letter");
        boolean shouldBeTrue = containsLetterX.apply("This does have the letter x");

        System.out.println(shouldBeFalse);
        System.out.println(shouldBeTrue);

        boolean shouldBeFalse2 = containsLetterX("This does not have that letter");
        boolean shouldBeTrue2 = containsLetterX("This does have the letter x");

        System.out.println(shouldBeFalse2);
        System.out.println(shouldBeTrue2);

        // Det finnes flere interfaces for funksjoner enn `Function`. Forskjellige metoder
        // krever lambdaer som tilfredsstiller forskjellige interfaces (f.eks. map, filter, forEach, ...)

        // For eksempel `Predicate`.
        // Et predikat er en funksjon som tar et eller annet parameter og returnerer en `Boolean`
        // - tenk å filtrere en liste
        Predicate<String> containsLetterXPredicate = s -> s.contains("x");
        // Dette er funksjonelt det samme som `containsLetterX` ovenfor


        // `Consumer` tar et eller annet parameter og returnerer ingenting.
        // - tenk å kalle metoder på andre objekter for hvert element i en liste (for eksempel printing)
        Consumer<String> printString = s -> System.out.println("Here is my string: " + s);
    }
}
