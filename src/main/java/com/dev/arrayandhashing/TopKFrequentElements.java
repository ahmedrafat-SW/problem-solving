package com.dev.arrayandhashing;

import java.util.*;


/**
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * */
public class TopKFrequentElements {

    public static void main(String[] args) {

        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(10);

        int [] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 1;
        int[] topK_Frequent = topKFrequent(nums, k);
        System.out.println("topK_Frequent = " + Arrays.toString(topK_Frequent));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length ==1) return null;

        Map<Integer, Integer> freq = new HashMap<>();
        int [] res = new int[k];
        for (int key : nums) {
            freq.put(key, freq.getOrDefault(key, 0) +1);
        }

        PriorityQueue<Integer> order =
                new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int key: freq.keySet())
            order.offer(key);
        int i = 0;
        for(;  i < k; i++){
            res[i] = order.poll();
        }

        return res;
    }
}
