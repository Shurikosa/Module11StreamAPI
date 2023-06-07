package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    static String[] arrayForTask3 = {"1, 2, 0", "4, 5"};
    static Numbers task3String = arrayForTask3 -> {
        List<Integer> numbers = new ArrayList<>();
        for (String str : arrayForTask3) {
            String[] numbersArr = str.split(",");
            for (String numb : numbersArr) {
                int number = Integer.parseInt(numb.trim());
                numbers.add(number);
            }
        }
        numbers.sort(Integer::compareTo);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    };

    public static void main(String[] args) {
        System.out.println(task3String.getAndSort(arrayForTask3));
    }
}
