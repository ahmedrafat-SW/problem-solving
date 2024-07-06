package com.dev.workatech;

public class MergeTwoSortedArrays {

    int [] mergeSortedArrays(int[] A, int[] B) {
        int [] resultArr = new int[A.length + B.length];
        int i= 0, j = 0, k = 0;

        while(i < A.length && j < B.length){
            if (A[i] >= B[j]){
                resultArr[k++] = B[j++];
            } else{
                resultArr[k++] = A[i++];
            }
        }

        while (i < A.length){
            resultArr[k++] = A[i++];
        }

        while (j < B.length){
            resultArr[k++] = B[j++];
        }

        return resultArr;
    }

    public static void main(String[] args) {


        /**
         * A: [1, 2, 3, 4, 4]
         * B: [2, 4, 5, 5]
         * C: [1, 2, 2, 3, 4, 4, 4, 5, 5]
         * */

        int [] arr1 = {1, 2, 3, 4, 4};
        int [] arr2 = {2, 4, 5, 5};

        int[] mergedSortedArrays = new MergeTwoSortedArrays().mergeSortedArrays(arr1, arr2);

        System.out.print("mergedSortedArrays = ");
        for (int i : mergedSortedArrays) {
            System.out.printf("%s ", i);
        }
        System.out.println();

    }
}
