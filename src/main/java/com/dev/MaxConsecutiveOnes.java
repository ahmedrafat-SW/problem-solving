package com.dev;

public class MaxConsecutiveOnes {

    int getMaxConsecutiveOnes(int[] A) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 1){
                ++ currentCount;
            } else {
                if (currentCount > maxCount) maxCount = currentCount;
                if (i != A.length) currentCount = 0;
            }
        }
        if (currentCount > maxCount) maxCount = currentCount;

        return maxCount;
    }

    public static void main(String[] args) {

        /**
         *
         *A: [1, 1, 3, 2, 3, 1, 1, 1]
         * Max consecutive 1s: 3
         * */
        int [] arr = {1, 1, 3, 2, 3, 1, 1, 1};
        int maxConsecutiveOnes = new MaxConsecutiveOnes().getMaxConsecutiveOnes(arr);

        System.out.println("maxConsecutiveOnes = " + maxConsecutiveOnes);
    }
}
