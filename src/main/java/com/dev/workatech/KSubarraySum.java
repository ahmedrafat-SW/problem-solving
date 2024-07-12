package com.dev.workatech;

import java.util.ArrayList;
import java.util.List;

public class KSubarraySum {

    int[] kSubarraySum (int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1]; // To store the sums

        int subarraySum = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                // Initialize subarray sum for the first window
                subarraySum += arr[i];
            } else {
                // Update subarray sum for subsequent windows
                subarraySum += arr[i] - arr[i - k];
            }

            // Add the subarray sum to the result only when the window is full (size k)
            if (i >= k - 1) {
                result[i - k + 1] = subarraySum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /**
         * Array: [3, 5, 6, 2, 4, 7, 8]
         * k: 3
         * Here, the sub-arrays of size k and their sum are:
         * [3 5 6] => 14
         * [5 6 2] => 13
         * [6 2 4] => 12
         * [2 4 7] => 13
         * [4 7 8] => 19
         * Answer: [14, 13, 12, 13, 19]
         * */

        int [] arr = {3, 5, 6, 2, 4, 7, 8};
        int k = 3;

        int[] sumArray = new KSubarraySum().kSubarraySum(arr, k);

        System.out.print("sum array = ");
        for (int i : sumArray){
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}
