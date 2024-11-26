package com.dev.codility;

import java.util.HashSet;

public class FrogRiverOne {


    public static void main(String[] args) {
//          X = 10 , Y = 85 , D = 30
//          the function should return 3, because the frog will be positioned as follows:
//          after the first jump, at position 10 + 30 = 40
//          after the second jump, at position 10 + 30 + 30 = 70
//          after the third jump, at position 10 + 30 + 30 + 30 = 100

        System.out.println("working ..........");
        int x = 5;
        int [] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int earlestTime = getEarlestTime(x, A);
        System.out.println("earlestTime = " + earlestTime);

        System.out.println("getSmallestNumberOfJumps(10, 85, 30) = " + getSmallestNumberOfJumps(10, 85, 30));

    }

    private static int getEarlestTime(int X, int[] A){
        HashSet<Integer> positionCovered = new HashSet<>();
        int i=0;
        for(; i < A.length; i++){
            positionCovered.add(A[i]);

            if (positionCovered.size() == X){
                return i;
            }
        }
        return -1;
    }

    public static int getSmallestNumberOfJumps(int X, int Y, int D){
        int distance = Y - X;
        return (distance + D - 1) / D;
    }


}
