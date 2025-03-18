package com.dev.hackerrankproblems.oneweekpreparation;

import java.util.*;

public class CountingSortStrings {
    public static List<String> countingSortStrings(List<String> arr) {
        // Step 1: Create a frequency array for lowercase letters (a-z)
        int maxChar = 26;  // English lowercase letters
        List<List<String>> buckets = new ArrayList<>(Collections.nCopies(maxChar, null));

        // Initialize each bucket as an empty list
        for (int i = 0; i < maxChar; i++) {
            buckets.set(i, new ArrayList<>());
        }

        // Step 2: Place words into buckets based on their first character
        for (String word : arr) {
            char firstChar = word.toLowerCase().charAt(0); // Convert to lowercase for case-insensitive sorting
            int index = firstChar - 'a';  // 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
            buckets.get(index).add(word);
        }

        // Step 3: Build the sorted list by concatenating all buckets
        List<String> sortedList = new ArrayList<>();
        for (List<String> bucket : buckets) {
            sortedList.addAll(bucket);  // Maintain relative order (Stable Sort)
        }

        return sortedList;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "grape", "cherry", "blueberry", "avocado");
        System.out.println(countingSortStrings(words));
        // Expected Output: [apple, avocado, banana, blueberry, cherry, grape]
    }
}
