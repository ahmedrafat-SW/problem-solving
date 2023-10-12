package com.dev.arrayandhashing;

import java.util.HashMap;

public class SumTwo {

    public static void main(String[] args) {

        int [] nums = new int[] {2,7,11,15};
        int [] nums_2 = new int[] {3, 3};
        int target = 6;

        int[] res = twoSum(nums_2, target);
        System.out.print("SumTwo= ");
        for (int index : res) {
            System.out.printf("%3d",index);
        }

    }

//  This function tries to find the indices of numbers that sum up matches the target value
//  Using Hash Map DS
    static int [] twoSum(int [] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        int [] res;
        int diff = 0;
        for (int i=0; i < nums.length; i ++) {
            diff = target - nums[i];
            if (prevMap.containsKey(diff)){
                return res = new int[]{prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i);
        }
        return new int[0];
    }

}
