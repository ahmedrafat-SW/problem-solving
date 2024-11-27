package com.dev.codility;

import java.util.Arrays;

public class Triangle {

    public static void main(String[] args) {
       int [] A = {10, 2, 5, 1, 8, 20};

        int solution = solution(A);
    }


    private static int solution(int[] A){
        int N = A.length;

        // If there are less than 3 elements, no triangular triplet is possible
        if (N < 3) {
            return 0;
        }

        // Sort the array
        Arrays.sort(A);

        for (int i = 0; i < N - 2; i++) {
            // Check the rearranged inequalities to avoid overflow
            if (A[i] > A[i + 2] - A[i + 1] && A[i + 1] > A[i + 2] - A[i] && A[i + 2] > A[i + 1] - A[i]) {
                return 1; // A triangular triplet is found
            }
        }

        return 0; // No triangular triplet exists
    }
}
