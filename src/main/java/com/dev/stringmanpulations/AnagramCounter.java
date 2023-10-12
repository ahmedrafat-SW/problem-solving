package com.dev.stringmanpulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramCounter {

    public static void main(String[] args) {
        String[] dictionary = {"listen", "silent", "enlist", "inlets", "banana"};
        String[] query = {"listen", "tinsel", "banana"};

        List<String> dict = new ArrayList<>(
                List.of("hack", "a", "rank", "khac", "ackh",
                        "kran", "rankhacker", "a", "ab", "ba", "stairs", "raits"));
        List<String> quer = new ArrayList<>(
                List.of("a", "nark", "bs", "hack", "stair"));
//        int[] result = countAnagrams(dictionary, query);
//        System.out.println(Arrays.toString(result)); // prints "[3, 1, 1]"
        List<Integer> res = countAnagrams(dict, quer);
        res.forEach(System.out::println);

    }


    public static int[] countAnagrams(String[] dictionary, String[] query) {
        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if (isAnagram(query[i], dictionary[j])) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }


    public static List<Integer> countAnagrams(List<String> dictionary, List<String> query){
        int [] result = new int[query.size()];
        List<Integer> res  = new ArrayList<>(query.size());
        for (int i = 0; i < query.size(); i++) {
            for (int j = 0; j < dictionary.size(); j++) {
                if (isAnagram(query.get(i), dictionary.get(j) )){
                    result[i]++;
                }
            }
        }
        for(int e : result){
            res.add(e);
        }

        return res;
    }
}

