package com.dev.google.dsa;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindromesSubstrings {

    // Helper method to expand around center and collect palindromes
    private static void findPalindromes(String str, int left, int right, List<String> result) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            result.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }

    // Method to find all valid palindromic substrings
    public static List<String> getPalindromicSubstrings(String str) {
        List<String> palindromes = new ArrayList<>();

        // Expand around each possible center
        for (int i = 0; i < str.length(); i++) {
            // Odd-length palindromes
            findPalindromes(str, i, i, palindromes);
            // Even-length palindromes
            findPalindromes(str, i, i + 1, palindromes);
        }

        return palindromes;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////

    public static int countPalindromeSubstrings(String s) {
        int result = 0;

        // Iterate through each character in the string
        for (int pos = 0; pos < s.length(); pos++) {
            // Check for odd-length palindromes (center is the character itself)
            System.out.println("pos = " + pos);
            result += countPalindromesAroundCenter(s, pos, pos);

            // Check for even-length palindromes (center is between characters)
            result += countPalindromesAroundCenter(s, pos, pos + 1);
        }

        return result;
    }

    private static int countPalindromesAroundCenter(String s, int left, int right) {
        int count = 0;

        // Expand while the characters on both sides match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            System.out.print("s.charAt(" + left +") = " + s.charAt(left));
            System.out.println(", s.charAt(" + right +") = " + s.charAt(right));
            count++;
            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "aaaabbbb";

        // Get valid palindromic substrings
        List<String> result = getPalindromicSubstrings(input);
        int countPalindromeSubstrings = countPalindromeSubstrings(input);
        System.out.println("countPalindromeSubstrings = " + countPalindromeSubstrings);
        // Print the palindromic substrings
        System.out.println("Palindromic substrings:");
        for (String substr : result) {
            System.out.println(substr);
        }
    }
}
