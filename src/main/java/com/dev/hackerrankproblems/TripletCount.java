package com.dev.hackerrankproblems;

import java.util.Map;
import java.util.HashMap;

public class TripletCount {

    public static int getTripletCount(int[] arr, int d) {
        int n = arr.length;
        int count = 0;

        // Iterate through all triplets using three nested loops
        for (int i = 0; i < n - 2; i++) { // First element of the triplet
            for (int j = i + 1; j < n - 1; j++) { // Second element
                for (int k = j + 1; k < n; k++) { // Third element
                    // Check if the sum of the triplet is divisible by d
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum % d == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int getTripletCountOptimized(int[] arr, int d) {
        int n = arr.length;
        int count = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        // Calculate prefix sums and their counts
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int remainder = prefixSum % d;
            prefixSumCount.put(remainder, prefixSumCount.getOrDefault(remainder, 0) + 1);
        }

        // Iterate over the array again, calculating the required sum and checking for valid triplets
        for (int i = 0; i < n; i++) {
            prefixSum -= arr[i];
            int remainder = prefixSum % d;
            int targetRemainder = (d - remainder) % d;

            // Check for null before accessing the count
            Integer targetCount = prefixSumCount.get(targetRemainder);
            if (targetCount != null) {
                count += targetCount;
            }

            // Adjust the count for the current prefix sum
            int currentRemainder = prefixSum % d;
            Integer sumCount = prefixSumCount.get(currentRemainder);
            prefixSumCount.put(currentRemainder,  sumCount != null ? sumCount - 1 : null);
        }

        return count;
    }
    public static void main(String[] args) {
        // Test case
        int[] arr = {3, 3, 4, 7, 8};
        int d = 5;

        int result = getTripletCount(arr, d);
        int result2 = getTripletCountOptimized(arr, d);

        System.out.println("Number of valid triplets: " + result);
        System.out.println("Number of valid triplets optimized: " + result2);
    }

}
