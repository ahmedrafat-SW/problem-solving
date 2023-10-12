package com.dev.arrayandhashing;

import java.util.*;

public class GroupAnagrams {
/**
 *      Input: strs = ["eat","tea","tan","ate","nat","bat"]
 *      Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * */

    public static void main(String[] args) {

        String [] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

//        create empty map to store count of a string as a key and  list of anagrams as it's values
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        char[] frequency = new char[26];

//        traverse strs array get string object and calculate the frequency of each unique characters
        for (String string : strs) {
            char [] str = string.toCharArray();
           for (char c : str){
               frequency[c - 'a'] ++;
           }
           String key = String.valueOf(frequency);
            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }
            anagramMap.get(key).add(string);
        }

        anagramMap.keySet().forEach(key ->{
            List<String> strings = anagramMap.get(key);
            System.out.println(strings.toString());
        });
        return new ArrayList<>(anagramMap.values());
    }

}
