package org.example.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class CommulativeSumArr {


    public List<Integer> getPositiveCumulativeSum (int[] arr) {
        // add your logic here
        List<Integer> sumArr = new ArrayList<>(arr.length);
        int currntSum = 0;
        for( int i = 0; i < arr.length; i++) {
            currntSum += arr[i];
            if (currntSum > 0) sumArr.add(currntSum);
        }

        return sumArr;
    }

    public static void main(String[] args) {

        /**
         * Initial Array: [1, -2, 3, 4, -6]
         * Cumulative Sum: [1, -1, 2, 6, 0]
         *
         * Initial Array: [1, -1, -1, -1, 1]
         * Cumulative Sum: [1, 0, -1, -2, -1]
         *
         * Initial Array: [1, 3, 5, 7]
         * Cumulative Sum: [1, 4, 9, 16]
         * */
        int [] arr  = {1, -2, 3, 4, -6};
        int [] arr2  = {1, -1, -1, -1, 1};
        int [] arr3 = {1, 3, 5, 7};
        List<Integer> positiveCumulativeSum = new CommulativeSumArr().getPositiveCumulativeSum(arr);

        System.out.println("positiveCumulativeSum = " + positiveCumulativeSum);
    }
}
