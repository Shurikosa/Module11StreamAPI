package org.example;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    static List<String> namesList = Arrays.asList("Ivan","Peter","Ringo","Viktoriya","Samson","Dora","Arnold","Akira");

    static Names task1String = namesList -> {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < namesList.size(); i += 2) {
            result.append(i + ". ").append(namesList.get(i) + ", ");
        }
        return result.toString();
    };

    public static void main(String[] args) {

        System.out.println(task1String.namesByOddIndex(namesList));
    }
}
