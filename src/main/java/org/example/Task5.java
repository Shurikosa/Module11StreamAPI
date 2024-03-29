package org.example;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();


        Spliterator<T> zipSpliterator = Spliterators.spliteratorUnknownSize(new Iterator<T>() {

            private boolean isFromFirst = true;

            public boolean hasNext() {
                return isFromFirst ? firstIterator.hasNext() : secondIterator.hasNext();
            }

            public T next() {
                T element = isFromFirst ? firstIterator.next() : secondIterator.next();
                isFromFirst = !isFromFirst;
                return element;
            }
            },
                Spliterator.ORDERED
        );

        return StreamSupport.stream(zipSpliterator, false);
    }
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(6, 7, 8, 9, 10, 11, 12, 13, 14);

        Stream<Integer> result = zip(first, second);
        result.forEach(System.out::println);
    }



}



