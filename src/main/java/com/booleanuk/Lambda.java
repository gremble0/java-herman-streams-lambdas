package com.booleanuk;

import java.util.function.Function;

public class Lambda {
    private static boolean containsLetterX(String s) {
        return s.contains("x");
    }

    public static void main(String[] args) {
        Function<String, Boolean> containsLetterX = s -> s.contains("x");

        boolean shouldBeFalse = containsLetterX.apply("This does not have that letter");
        boolean shouldBeTrue = containsLetterX.apply("This does have the letter x");

        System.out.println(shouldBeFalse);
        System.out.println(shouldBeTrue);

        boolean shouldBeFalse2 = containsLetterX("This does not have that letter");
        boolean shouldBeTrue2 = containsLetterX("This does have the letter x");

        System.out.println(shouldBeFalse2);
        System.out.println(shouldBeTrue2);
    }
}
