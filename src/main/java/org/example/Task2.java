package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {

    static List<String> namesList = Arrays.asList("Ivan","Peter","Ringo","Viktoriya","Samson","Dora","Arnold","Akira");

    static Strings<String> task2List = namesList -> {
        Collections.sort(namesList);
        Collections.reverse(namesList);
        for (int i = 0; i < namesList.size(); i++) {
            namesList.set(i, namesList.get(i)
                    .toString()
                    .toUpperCase());
        }
        return namesList;
    };
    public static void main(String[] args) {

        System.out.println(task2List.descendingSort(namesList));
    }
}
