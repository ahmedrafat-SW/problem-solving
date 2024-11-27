package com.dev.codility;

import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String[] args) {
        int [] A = {};
        int maxProductOfThree = getMaxProductOfThree(A);
        System.out.println("maxProductOfThree = " + maxProductOfThree);
    }


    private static int getMaxProductOfThree(int [] A){
        Arrays.sort(A);
        int N = A.length;
        int product1 = A[N-1] * A[N-2] * A[N-3];
        int product2 = A[0] * A[1] * A[N-1];

        return Math.max(product1, product2);
    }
}
