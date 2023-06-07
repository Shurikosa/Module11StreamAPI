package org.example;

import java.util.stream.Stream;

public class Task4 {
public static Stream<Long> randomGeneratedDigitsStream(long seed, long a, long c, long m){
    return Stream.iterate(seed, x -> (a * x + c) % m);
}

    public static void main(String[] args) {

        long seed = 1;
        long a = 25214903917L;
        long c = 11;
        long m = 2^48;

        Stream<Long> randomStream = randomGeneratedDigitsStream(seed, a, c, m);
        randomStream.forEach(System.out::println);
    }
}

