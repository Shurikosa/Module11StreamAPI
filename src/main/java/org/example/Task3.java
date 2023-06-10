package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    static String[] arrayForTask3 = {"1, 2, 0", "4, 5"};

    static String result = Arrays.stream(arrayForTask3)
            .flatMap(str -> Arrays.stream(str.split(",\\s*")))
            .sorted()
            .collect(Collectors.joining(", "));



    public static void main(String[] args) {

        System.out.println(result);
    }

}
