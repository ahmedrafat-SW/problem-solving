package com.dev.hackerrankproblems;

import java.util.Arrays;
import java.util.List;

public class MatrixOperations {

    public static void main(String[] args) {
//        calcMatrixDiff();
        calcDiff();
    }

    private static void calcMatrixDiff() {
        int n = 3; // size of the matrix
        int[][] matrix = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        int mainDiagonalSum = 0;
        int reverseDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    mainDiagonalSum += matrix[i][j];
                }
                if (i + j == n - 1) {
                    reverseDiagonalSum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of reverse diagonal: " + reverseDiagonalSum);
        System.out.println("diff: "+ (mainDiagonalSum - reverseDiagonalSum));
    }

    public static void calcDiff(){
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );

        int mainDiagonalSum = 0;
        int reverseDiagonalSum = 0;

        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> row = matrix.get(i);
            int j = i; // column index for main diagonal
            int k = matrix.size() - i - 1; // column index for reverse diagonal
            mainDiagonalSum += row.get(j);
            reverseDiagonalSum += row.get(k);
        }

        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of reverse diagonal: " + reverseDiagonalSum);
    }

}
