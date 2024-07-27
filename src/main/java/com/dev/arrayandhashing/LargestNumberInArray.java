package com.dev.arrayandhashing;

public class LargestNumberInArray {

    public static int getLargestNumberIn(int [] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2, 523,1, 5546, 24, 10000, -1};

        int largestNumberIn = getLargestNumberIn(numbers);
        System.out.println("largestNumberIn = " + largestNumberIn);

    }
}
