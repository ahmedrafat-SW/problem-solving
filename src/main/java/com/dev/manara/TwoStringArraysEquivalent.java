package com.dev.manara;

import java.util.ArrayList;
import java.util.List;

public class TwoStringArraysEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();
        int n = Math.max(word1.length, word2.length);

        for (int i = 0; i < n; i++) {
            if (i < word1.length){
                st1.append(word1[i]);
            }
            if (i < word2.length) {
                st2.append(word2[i]);
            }
        }
        return st1.toString().contentEquals(st2);
    }

    public static void main(String[] args) {

        /**
         *Example 1:
         * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
         * Output: true
         * Explanation:
         * word1 represents string "ab" + "c" -> "abc"
         * word2 represents string "a" + "bc" -> "abc"
         * The strings are the same, so return true.
         *
         * Example 2:
         * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
         * Output: false
         *
         * Example 3:
         * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
         * Output: true
         * **/

        List<List<String []>> inputs = new ArrayList<>();

        inputs.add(List.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        inputs.add(List.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        inputs.add(List.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));

        for (List<String[]> in : inputs){
            boolean arrayStringsAreEqual = new TwoStringArraysEquivalent().arrayStringsAreEqual(in.get(0), in.get(1));
            System.out.println("arrayStringsAreEqual = " + arrayStringsAreEqual);
        }


    }
}
