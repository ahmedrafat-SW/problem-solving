package com.dev.google.dsa;

import java.util.*;

public class KthLargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        Arrays.sort(arr);
        int kthElement = arr[k];
        System.out.println("kthElement = " + kthElement);
        System.out.println("*******************************************************************");
        int kthLargestElement = getKthLargestElement(arr, k);
        System.out.println("kthLargestElement = " + kthLargestElement);
    }

    private static int getKthLargestElement(int[] arr, int k) {
        int element = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : arr){
            minHeap.add(n);
            maxHeap.add(n);

            if (minHeap.size() > k){
                element = minHeap.poll();
//                System.out.println("remove element = " + element);
            }

        }

        System.out.println("maxHeap.peek() = " + maxHeap.peek());
        return minHeap.peek();
    }
}
