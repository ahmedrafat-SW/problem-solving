package com.dev;

import java.util.Arrays;

public class ArrayProblems {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {

       int k = removeDuplicates(new int[]{1,1,2});
        System.out.println(k);
        k = removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(k);
        
        String str = "ahgemdar";
        System.out.println("length of str: "+ str.length());
        str.length();
        str += "12423";

        System.out.println("str = " + str);
        System.out.println("char at index 1: "+ str.charAt(1));
    }
    
}
