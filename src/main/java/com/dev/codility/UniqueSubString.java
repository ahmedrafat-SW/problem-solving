package com.dev.codility;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueSubString {


    public static void main(String[] args) {

    }


    private static int getSubStringCount(String S){
        int N = S.length();
        int result = 1;
        int lastOccourrence [] = new int [26];
        Arrays.fill(lastOccourrence , -1);

        for (int i = 0; i < N; i++){
            int charIndex = S.charAt(i) - 'a';
            if(lastOccourrence[charIndex] != -1){
                result = Math.max(result, i - lastOccourrence[charIndex]);
            }

            lastOccourrence[charIndex] = i;
        }

        return result;
    }

    private static int getSubStringCount2(String S) {
        HashSet<Character> seen = new HashSet<>();
        int substrings = 1;

        for (char c : S.toCharArray()) {
            if (seen.contains(c)) {
                substrings++;
                seen.clear();
            }
            // Add the current character to the set
            seen.add(c);
        }

        return substrings;
    }
}
