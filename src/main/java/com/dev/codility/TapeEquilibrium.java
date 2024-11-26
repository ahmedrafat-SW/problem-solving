package com.dev.codility;

public class TapeEquilibrium {

    public static void main(String[] args) {

        int [] A = {3,1,2,4,3};

        int indexThatGiveMinimalDifference = getIndexThatGiveMinimalDifference(A);
        System.out.println("indexThatGiveMinimalDifference = " + indexThatGiveMinimalDifference);

    }


    public static int getIndexThatGiveMinimalDifference(int[] A) {
        int N = A.length;

        // Step 1: Calculate the total sum of the array
        long sumTotal = 0;
        for (int num : A) {
            sumTotal += num;
        }
        System.out.println("sumTotal = " + sumTotal);
        // Step 2: Iterate through the array to find the minimal difference
        long sumLeft = 0;
        long minDifference = Long.MAX_VALUE; // Initialize to a large value
        System.out.println("minDifference = " + minDifference);

        for (int P = 1; P < N; P++) {
            sumLeft += A[P - 1]; // Incrementally compute the left sum
            long sumRight = sumTotal - sumLeft; // Right sum is total sum minus left sum
            System.out.println("P = " + P);
            System.out.println("sumLeft = " + sumLeft);
            System.out.println("sumRight = " + sumRight);
            long difference = Math.abs(sumLeft - sumRight); // Absolute difference
            System.out.println("difference = " + difference);

            // Update the minimal difference
            minDifference = Math.min(minDifference, difference);
            System.out.println("minDifference = " + minDifference);
            System.out.println("*******************************************************************************");
        }

        System.out.println("result: " + minDifference);
        return (int) minDifference; // Return the result as an integer

    }
}
