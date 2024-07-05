package org.example.problemsolving;

import java.util.*;
import java.util.stream.Collectors;


public class LongestStringWithoutRepeating {

    public String findLongestNonRepeatedStringOf(String str) {
        System.out.println("input string = " + str);
        Set<Character> result = new LinkedHashSet<>();
        int j = 0, i = 0;
        int maxLength = 0;
        int size = str.length();
        while (j < size) {
            if (!result.contains(str.charAt(j))){
                result.add(str.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                result.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println("result.size() = " + result.size());
        return result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String inputStr = "pwwkew";
        String result = new LongestStringWithoutRepeating().findLongestNonRepeatedStringOf(inputStr);
        System.out.println("result = " + result);
    }
}
