package com.dev.google.dsa;

import java.util.*;

public class FindAllPositions {
    public static List<Integer> findAllPositions(List<Integer> input) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Sort the input list and create a mapping of positions
        List<Integer> sortedInput = new ArrayList<>(input);
        Collections.sort(sortedInput); // O(n log n)

        // Step 2: Map each number to its positions in the sorted list
        Map<Integer, Queue<Integer>> orderedCounts = new HashMap<>();
        for (int i = 0; i < sortedInput.size(); i++) {
            int num = sortedInput.get(i);
            orderedCounts.putIfAbsent(num, new LinkedList<>());
            orderedCounts.get(num).add(i); // Append positions to the queue
        }

        // Step 3: Map original input numbers to their positions
        for (int origNum : input) {
            result.add(orderedCounts.get(origNum).poll());
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> input = Arrays.asList(1, 1, 2, 3, 4);
        List<Integer> result = findAllPositions(input);
        System.out.println(result); // Output: [0, 1, 2, 3, 4]
    }
}

