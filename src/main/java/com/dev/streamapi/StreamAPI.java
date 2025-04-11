package com.dev.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {

    static List<String> strs = Arrays.asList("first", "second", "third", "last");
    static String[] arr = {"Java", "Python", "C++"};
    static List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

    public static void main(String[] args) {

        Stream<String> stringStream = strs.stream();

        Stream<String> arrayStream = Arrays.stream(arr);

        Stream<Integer> numStream = Stream.of(1, 2, 3, 4, 5);

        Stream<Double> generateStream = Stream.generate(Math::random).limit(10);

        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 5).limit(20);

        List<String> filterStream = strs.stream()
                .filter(item -> item.contains("t"))
                .collect(Collectors.toList());

        List<String> mapStream = strs.stream().map(String::toUpperCase).collect(Collectors.toList());

        Set<Integer> sortStream = numStream.sorted().collect(Collectors.toSet());

        long countStream = strs.stream().filter(item -> item.endsWith("t")).count();

//        Integer sumStream = numStream.reduce(0, Integer::sum);

        Integer sumParallelStream = nums.parallelStream().reduce(0, Integer::sum);

        Integer sumParallelStream_2 = nums.stream().parallel().reduce(0, Integer::sum);


        List<Integer> numms = IntStream.rangeClosed(1, 1_000_000).boxed().toList();

        boolean useParallel = numms.size() > 10000; // Condition to use parallel processing

        int sum = numms.stream()
                .filter(n -> n % 2 == 0)  // Example operation
                .map(n -> n * 2)
//                .let(s -> useParallel ? s.parallel() : s) // Conditionally switch to parallel
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);

        String str = "Hello";
        System.out.print("byte encoded string : ");
        byte[] byteArray = str.getBytes();
        for (byte  bty: byteArray ) {
            System.out.printf("%s, ", bty);
        }
    }
}
