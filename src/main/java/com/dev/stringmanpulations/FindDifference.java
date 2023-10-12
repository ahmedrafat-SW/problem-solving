package com.dev.stringmanpulations;

import java.util.Random;

public class FindDifference {

    public static void main(String[] args) {

        String[][] testCases = {{"sadbutsad", "sad"}, {"leetcode", "leeto"}};

        int i = 0;
//        for(String [] testcase : testCases){
//        }

        int firstOccurrenceOfSubString = getFirstOccurrenceOfSubString("sadbutsad", "sad");
        System.out.println("first occurrence at = " + firstOccurrenceOfSubString);
    }

    public static char findTheDifference(String s, String t) {
        char c = 0;
        for (char cs : s.toCharArray()) c ^= cs;
        for (char ct : t.toCharArray()) c ^= ct;
        return c;
    }

    public static int getFirstOccurrenceOfSubString(String haystack, String needle) {
        int i = 0, j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(i)) {
                i++;
            } else if (i == needle.length() - 1) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }


    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
}
