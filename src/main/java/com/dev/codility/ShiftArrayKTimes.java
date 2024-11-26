package com.dev.codility;

import java.util.Arrays;

public class ShiftArrayKTimes {

    public static void main(String[] args) {
        int [] A = {3, 8, 9, 7, 6};
        int k = 3;
        int x = 0;
        int di = 10;
        int lstDigit = 0;
        while (x < 5){
            lstDigit = 12345 % di;
            System.out.println("lstDigit = " + lstDigit);
            x++;
            di*= 10;

        }

        int[] res = shiftRightKTimes(A, k);
        System.out.print("res = ");
        Arrays.stream(res).forEach(System.out::print);
    }

    private static int [] shiftRightKTimes(int A[], int K){
        int N = A.length;

        // Handle edge cases
        if (N == 0 || K % N == 0) {
            return A; // No rotation needed
        }

        System.out.println("K = " + K);

        // Normalize K to avoid unnecessary rotations
        K = K % N;
        System.out.println( K + " % "+ N +" = " + K);

        // Perform the rotation
        int[] rotatedArray = new int[N];
        for (int i = 0; i < N; i++) {
            rotatedArray[(i + K) % N] = A[i];
        }

        return rotatedArray;
    }
}
