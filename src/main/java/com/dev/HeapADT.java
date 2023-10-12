package com.dev;

import java.util.*;

public class HeapADT {
    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        pQueue.add(10);
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);
        pQueue.add(6);

        pQueue.forEach(System.out::println);
    }
}
