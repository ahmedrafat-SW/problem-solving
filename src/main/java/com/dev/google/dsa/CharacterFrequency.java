package com.dev.google.dsa;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {


    public static void main(String[] args) {
        String s = "aadfdfebbbbbbbbbbbdg$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44fffffffffffffffffffeeeeeeeeeeebbbbbbbsaaddgeaa";
        System.out.println("findHighestFrequency(s) = " + findHighestFrequency(s));

    }


    private static char findHighestFrequency(String s){
        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (char c: s.toCharArray()){
            charFreq.put(c , charFreq.getOrDefault(c, 0) + 1);
        }

        char highestCharFreq = '#';
        int maxFreq = -1;
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()){
            if (entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                highestCharFreq = entry.getKey();
            }
        }
        
        return highestCharFreq;
    }
}
