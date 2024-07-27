package com.dev.Search;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int [] arr , int key) {
        int left = 0, right = arr.length -1;

        while (left <= right){
//            int mid = left + (right - left) / 2;
            int mid = (left + right) / 2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] < key){
                left = mid + 1;
            }
            if (arr[mid] > key){
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] numbers = {76,2,5,635, 12, 10, 100, 53, 73, 452};
        System.out.println("numbers.length = " + numbers.length);
        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(i -> System.out.printf("%s ", i));
        System.out.println();
        int keyIdx = binarySearch(numbers, 100);
        System.out.println("keyIdx = " + keyIdx);
    }
}
