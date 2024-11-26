package com.dev.codility;

import java.util.HashSet;

public class ArrayPermutation {


    public static void main(String[] args) {

        int [] A = {4,1,3,2};
        int permutation = isPermutation(A);
        System.out.println("permutation = " + permutation);

    }

    private static int isPermutation(int [] A) {
        HashSet<Integer> nonRepeated = new HashSet<>();
        long expectedSum = (long) A.length * (A.length + 1) / 2;
        long sum = 0;

        for (int num : A) {
            if (num < 1 || num > A.length || nonRepeated.contains(num)){
                return 0;
            }
            sum += num;
            nonRepeated.add(num);
        }

        return expectedSum == sum ? 1 : 0;
    }
}
