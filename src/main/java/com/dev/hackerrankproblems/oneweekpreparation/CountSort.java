package com.dev.hackerrankproblems.oneweekpreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountSort {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> sorted = new ArrayList<>();
        List<Integer> freq= new ArrayList<>(Collections.nCopies(100, 0));

        for(Integer num : arr){
            freq.set(num, freq.get(num) + 1);
        }

        System.out.println("freq = " + freq  + "\n");

        for (int i = 0; i < freq.size(); i++) {
            for (int j = 0; j < freq.get(i); j++) {
                    sorted.add(i);
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        String arr = "63 25 73 1 98 73 56 84 86 57 16 83 8 25 81 56 9 53 98 67 99 12 83 89 80 91 39 86 76 85 74 39 25 90 59 10 94 32 44 3 89 30 27 79 46 96 27 32 18 21 92 69 81 40 40 34 68 78 24 87 42 69 23 41 78 22 6 90 99 89 50 30 20 1 43 3 70 95 33 46 44 9 69 48 33 60 65 16 82 67 61 32 21 79 75 75 13 87 70 33";
        String[] s = arr.split(" ");
        int[] nums = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        List<Integer> unSortedNums = Arrays.stream(nums)
                                           .boxed()
                                           .collect(Collectors.toList());
        System.out.println("unSortedNums = " + unSortedNums + "\n");

        List<Integer> freq = countingSort(unSortedNums);
        System.out.println("sorted = " + freq + "\n");
    }
}
