package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    static List<String> namesList = Arrays.asList("Ivan","Peter","Ringo","Viktoriya","Samson","Dora","Arnold","Akira");

    public static String getNames(List<String> names){
        StringBuilder result = new StringBuilder();
        IntStream.range(0, names.size())
                .filter( i -> i % 2 == 0)
                .forEach(i -> result.append((i + 1) + ". ").append(names.get(i)).append(", "));
        return result.toString();
    }
    public static void main(String[] args) {

        System.out.println(getNames(namesList));
    }
}
