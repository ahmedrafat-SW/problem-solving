package com.dev.codility;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        int N = 5;
        int [] A = {3,4,4,6,1,4,4};
        int[] counters = calculateMaxCounters(N, A);
        System.out.print("counters = ");
        Arrays.stream(counters).forEach(e -> System.out.printf("%s, ", e));
    }

    public static int[] calculateMaxCounters(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0; // Tracks the current maximum value
        int lastMax = 0;    // Tracks the last max counter value applied

        for (int operation : A) {
            if (operation >= 1 && operation <= N) {
                int index = operation - 1; // Convert to 0-based index

                // Lazy update for the specific counter
                if (counters[index] < lastMax) {
                    counters[index] = lastMax;
                }

                // Increment the counter and update currentMax
                counters[index]++;
                currentMax = Math.max(currentMax, counters[index]);
            } else if (operation == N + 1) {
                // Update lastMax to the currentMax
                lastMax = currentMax;
            }
        }

        // Final pass: Ensure all counters are at least lastMax
        for (int i = 0; i < N; i++) {
            if (counters[i] < lastMax) {
                counters[i] = lastMax;
            }
        }

        return counters;
    }
}
