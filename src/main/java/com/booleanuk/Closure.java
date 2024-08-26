package com.booleanuk;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Closure {
    public static void main(String[] args) {
        int iNeedThisInsideMyLambda = 5;
        Function<String, Boolean> containsLetterXAndVariableEquals5 =
                s -> s.contains("x") && iNeedThisInsideMyLambda == 5;

        List<String> strings = new ArrayList<>() {{
            this.add("hello");
            this.add("world");
            this.add("string with x in it");
        }};

        for (String s : strings)
            if (containsLetterXAndVariableEquals5.apply(s))
                System.out.println(s);
    }
}
