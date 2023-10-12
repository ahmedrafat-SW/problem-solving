package com.dev.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsOperations {
    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
////        reverseArr(numbers);
////        for (int number : numbers) {
////            System.out.printf("%2d",number);
////        }

        int [] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
//        System.out.println("K = " + removeDuplicates(nums));
//        for (int num : nums) {
//            System.out.printf("%2d",num);
//        }
//        System.out.println("Arrays.stream(nums).max() = " + Arrays.stream(nums).max());

        int [] testcase= {3,2,3};
        System.out.println("findMajorityElement(nums) = " + findMajorityElement(nums));

    }


    public static void reverseArray(int [] numbers){
        int n = numbers.length;
        int temp = 0;
        for (int i = 0; i < Math.floor((n-2 / 2)); i++) {
            temp = numbers[i];
            numbers[i] = numbers[n -1 -i];
            numbers[n -1 -i] = temp;
        }
    }

    /*
    * Input: nums = [0,0,1,1,1,1,2,3,3]
      Output: 7, nums = [0,0,1,1,2,3,3,_,_]
      Explanation: Your function should return k = 7,
    * with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and
    * */

    static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static List<Integer> reverseArr(List<Integer> a) {
        int n = a.size();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(a.get((n-1) -i));
        }
        return res;
    }

    /*
    *   Input: nums = [2,2,1,1,1,2,2]
        Output: 2
        Constraints:
        n == nums.length
        1 <= n <= 5 * 104
        -109 <= nums[i] <= 109
    * */


    public static int findMajorityElement(int [] nums){
        Arrays.sort(nums);
        int n = nums.length;
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println("nums[n/2] = " + nums[n / 2]);
        return nums[n/2];
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) {
            return;
        }

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
