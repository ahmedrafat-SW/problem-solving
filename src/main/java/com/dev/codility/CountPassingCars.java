package com.dev.codility;

public class CountPassingCars {


    public static void main(String[] args) {
        int [] A = {1, 3, 6, 4, 1, 2};
        int numberOfPassingCarsPair = getNumberOfPassingCarsPair(A);
        System.out.println("numberOfPassingCarsPair = " + numberOfPassingCarsPair);
    }

    private static int getNumberOfPassingCarsPair(int [] A){

        int eastCount = 0; // Number of cars traveling east
        int passingCars = 0; // Total number of passing cars

        for (int car : A) {
            if (car == 0) {
                // Increment eastCount for cars traveling east
                eastCount++;
            } else if (car == 1) {
                // Add the number of east-traveling cars seen so far
                passingCars += eastCount;
                // If the limit is exceeded, return -1
                if (passingCars > 1_000_000_000) {
                    return -1;
                }
            }
        }

        return passingCars;
    }
}
