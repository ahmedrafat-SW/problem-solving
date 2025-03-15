package com.dev.hackerrankproblems.oneweekpreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MInMax {

    public static void miniMaxSum (List<Integer> nums) {
        long minSum = 0, maxSum = 0;

        Collections.sort(nums); // Sort the array

        // Compute the min sum (sum of first four numbers) and max sum (sum of last four numbers)
        for (int i = 0; i < 4; i++) {
            minSum += nums.get(i);
        }
        for (int i = 1; i < 5; i++) {
            maxSum += nums.get(i);
        }

        // Print the result
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1, 3, 5, 7, 9));
        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }
}
