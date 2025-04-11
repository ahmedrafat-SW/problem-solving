package com.dev.hackerrankproblems.oneweekpreparation;

import java.util.List;

public class MatrixAbsulateDiagonalDiff {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int primaryDiagonal = 0, secondaryDiagonal = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            primaryDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get(n - i - 1);
        }

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }


    public static void main(String[] args) {

    }
}
