package org.example.problemsolving;

import java.text.BreakIterator;

public class Main {

    public static void main(String[] args) {
        String s = "string";
        System.out.println("reverse(s) = " + reverse(s));

        int[] nums = new int[] {1,34,435,2, 53,643,23, 0};
        System.out.println("findMax(nums) = " + findMax(nums));

        String str = "levee";
        System.out.println("isPalindrome(str) = " + isPalindrome(str));

        int n = 10;
        System.out.println("fibonacciOf(n) = " + fibonacciOf(n));

        // ate eat eta tea
        String s1 = "tea";
        String s2 = "att";
        System.out.println("isAnagram(s1, s2) = " + isAnagram(s1, s2));


    }



    static String reverse(String in){
        StringBuilder str = new StringBuilder();

        for (int i = in.length() -1; i >= 0; i--) {
            str.append(in.charAt(i));
        }
        return str.toString();
    }

    static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() -1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    static int fibonacciOf(int n){
        if (n <= 1)
            return n;

        return fibonacciOf(n-1) + fibonacciOf(n-2);
    }

    static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length())
            return false;

        int [] freq  = new int[26];
        char c;
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            freq[c - 'a'] ++ ;
            c = s2.charAt(i);
            freq[c - 'a'] --;
        }

        for (int n : freq){
            if (n != 0)
                return false;
        }
        return true;
    }

}
