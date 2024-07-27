package com.dev.stringmanpulations;

public class PalindromStrings {

    public static boolean isPalindrom(String str){
        int left = 0 , right = str.length() -1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right))
                return false;
            right --;
            left ++;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "level";

        boolean palindrom = isPalindrom(word);
        System.out.println("palindrom = " + palindrom);
    }
}
