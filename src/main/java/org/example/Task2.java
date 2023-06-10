package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {

    static List<String> namesList = Arrays.asList("Ivan","Peter","Ringo","Viktoriya","Samson","Dora","Arnold","Akira");

    public static List<String> reverseSort(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {

        System.out.println(reverseSort(namesList));
    }
}
