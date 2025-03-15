package com.dev.hackerrankproblems.oneweekpreparation;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int postiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int listSize = arr.size();
        for(Integer num : arr) {
            if(num > 0) postiveCount++;
            if(num < 0) negativeCount++;
            if(num == 0) zeroCount++;
        }
        System.out.printf("%.6f%n", (double) postiveCount / listSize);
        System.out.printf("%.6f%n", (double) negativeCount / listSize);
        System.out.printf("%.6f%n", (double) zeroCount / listSize);
    }


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(-1, -1, 0, 1, 1));
        plusMinus(nums);
        System.out.println("******************");
        nums = new ArrayList<>(List.of(-4, 3, -9, 0, 4, 1));
        plusMinus(nums);
    }
}
