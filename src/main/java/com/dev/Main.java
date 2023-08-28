package com.dev;

public class Main {
    public static void main(String[] args) {

       int k = removeElement(new int []{3,2,2,3},3);
        System.out.println("K = "+k);


    }

    public static int removeElement(int[] nums, int val) {

        int temp =0 ;
        int j =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j;
    }
}