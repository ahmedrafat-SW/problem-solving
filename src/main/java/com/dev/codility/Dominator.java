package com.dev.codility;

public class Dominator {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        int n = A.length;
        if (n == 0) return -1;

        // Step 1: Find the candidate for dominator
        int candidate = 0, count = 0;
        for (int num : A) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if the candidate is a dominator
        int occurrences = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] == candidate) {
                occurrences++;
                index = i; // Store the index of the candidate
            }
        }

        // Check if the candidate is the dominator
        if (occurrences > n / 2) {
            return index; // Return any valid index
        }
        return -1; // No dominator
    }
}
