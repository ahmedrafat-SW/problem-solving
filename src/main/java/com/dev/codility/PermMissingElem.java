package com.dev.codility;

public class PermMissingElem {

    public static void main(String[] args) {

        int [] A = {2, 3,1, 5};
        System.out.println("MissingNumber = " + getMissingNumber(A));
    }

    private static int getMissingNumber (int[] A){
        int N = A.length;
        long totalSum = (long)(N + 1) * (N + 2) / 2;
        long arrSum = 0;

        for (int num : A){
            arrSum += num;
        }

        return (int) (totalSum - arrSum);
    }
}
