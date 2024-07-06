package com.dev.workatech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IdenticalTwinsCount {


    public int getIdenticalTwinsCount (int[] arr) {
        // add your logic
//        List<List<Integer>> identicalSet = new ArrayList<>();
        int identicalCount= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length ; j++) {
                if (arr[i] == arr[j] && i < j){
                    identicalCount ++;
                }
            }
        }

        return identicalCount;
    }

    public static void main(String[] args) {

        /**
         *
         * Array: [1, 2, 3, 2, 1]
         * Number of Identical Twins: 2
         * Explanation:
         * Identical Twins: [[1, 1], [2, 2]]
         * Indexes: (0, 4), (1, 3)
         * Array: [1, 2, 2, 3, 2, 1]
         * Number of Identical Twins: 4
         * Explanation:
         * Identical Twins: [[1, 1], [2, 2], [2, 2], [2, 2]]
         * Indexes: (0, 5), (1, 2), (1, 4), (2, 4)
         *
         * */

        int [] arr = {1, 2, 3, 2, 1};
        int [] arr2 = {1, 2, 2, 3, 2, 1};
        int identicalTwinsCount = new IdenticalTwinsCount().getIdenticalTwinsCount(arr2);

        System.out.println("identicalTwinsCount = " + identicalTwinsCount);

    }
}
