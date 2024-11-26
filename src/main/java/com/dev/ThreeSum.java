package com.dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<String, List<Integer>> zeroSumMap= new HashMap<>();
        List<Integer> zeroSumArr;

        for (int i= 0; i < nums.length; i++){
            for (int j= i + 1; j < nums.length; j++){
                for (int k= j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
//                    zeroSumArr = new ArrayList<>(List.of(i, j, k));
//                    zeroSumArr.sort(Integer::compareTo);
                    String idxs= i +""+ j +""+ k;
                    List<Integer> numList = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    if (sum == 0 && !zeroSumMap.containsKey(idxs)){
                        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                        numList.sort(Integer::compareTo);
                        zeroSumMap.put(idxs, numList);
                    }
                }
            }
        }

        List<List<Integer>> values = zeroSumMap.values().stream().toList();

        return values;
    }

    public static void main(String[] args) {
        List<int[]> inputs = new ArrayList<>();
        int [] nums = {-1,0,1,2,-1,-4};
        int [] nums2 = {0, 0, 0};
        int [] nums3 = {0, 1, 1};
        inputs.add(nums);
        inputs.add(nums2);
        inputs.add(nums3);

        for (int[] in : inputs){
            List<List<Integer>> result = new ThreeSum().threeSum(in);
            System.out.println("result = " + result);
            System.out.println("**************************************************************");
        }

    }
}
