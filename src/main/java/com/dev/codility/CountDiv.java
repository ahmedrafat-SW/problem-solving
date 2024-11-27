package com.dev.codility;

public class CountDiv {

    public static void main(String[] args) {
        int A = 1, B = 2_000_000_000, K = 2;
        System.out.println("A = " + A+ ", " + "B = " + B + ", " + "K = " + K);
//        int numberODivisibleInRage = getNumberODivisibleInRage(A, B, K);
//        System.out.println("numberODivisibleInRage = " + numberODivisibleInRage);
        int numberODivisibleInRage2 = getNumberODivisibleInRage2(A, B, K);
        int numberODivisibleInRage3 = getNumberODivisibleInRage3(A, B, K);
        System.out.println("numberODivisibleInRage2 = " + numberODivisibleInRage2);
        System.out.println("numberODivisibleInRage3 = " + numberODivisibleInRage3);
    }


    private static int getNumberODivisibleInRage(int A, int B, int K) {

        int numberOfDivisible = 0;

        for (int i = A; i <= B; i++) {
            if (i % K == 0) numberOfDivisible++;
        }

        return numberOfDivisible;
    }

    private static int getNumberODivisibleInRage2(int A, int B, int K) {
        int countUpToB = B / K;
        int countUpToA = (A > 0) ? (A - 1) / K : 0;

        // Return the count of numbers divisible by K in [A..B]

        System.out.println("divisibleUpToB = " + countUpToB);
        System.out.println("divisibleUpToA = " + countUpToA);

        return countUpToB - countUpToA;
    }

    private static int getNumberODivisibleInRage3(int A, int B, int K) {
        int count = 0;
        // Start at the first number divisible by K >= A
        int start = (A % K == 0) ? A : A + (K - A % K);

        for (int i = start; i <= B; i += K) {
            count++;
        }
        return count;
    }
}
