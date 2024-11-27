package com.dev.codility;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};

        solution(S, P, Q);
    }


    private static int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;

        // Prefix sums for A, C, G, T
        int[] countA = new int[N + 1];
        int[] countC = new int[N + 1];
        int[] countG = new int[N + 1];
        int[] countT = new int[N + 1];

        // Preprocess prefix sums
        for (int i = 0; i < N; i++) {
            countA[i + 1] = countA[i];
            countC[i + 1] = countC[i];
            countG[i + 1] = countG[i];
            countT[i + 1] = countT[i];

            if (S.charAt(i) == 'A') countA[i + 1]++;
            else if (S.charAt(i) == 'C') countC[i + 1]++;
            else if (S.charAt(i) == 'G') countG[i + 1]++;
            else if (S.charAt(i) == 'T') countT[i + 1]++;
        }

        // Answer queries
        int[] result = new int[M];
        for (int k = 0; k < M; k++) {
            int start = P[k];
            int end = Q[k] + 1; // Use exclusive range

            if (countA[end] - countA[start] > 0) {
                result[k] = 1;
            } else if (countC[end] - countC[start] > 0) {
                result[k] = 2;
            } else if (countG[end] - countG[start] > 0) {
                result[k] = 3;
            } else if (countT[end] - countT[start] > 0) {
                result[k] = 4;
            }
        }

        return result;
    }
}
