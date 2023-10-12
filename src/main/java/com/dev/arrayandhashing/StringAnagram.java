package com.dev.arrayandhashing;

import java.util.HashMap;

public class StringAnagram {

    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";
       String s2 = "rat", t2 = "car";
       System.out.println("isAnagram(s, t) = " + isAnagram_2(s2, t2));

    }


    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character,Integer> s_map = new HashMap<>();
        HashMap<Character,Integer> t_map = new HashMap<>();

        for(int i= 0; i < s.length(); i ++){
            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i), 0) +1);
            t_map.put(t.charAt(i), t_map.getOrDefault(t.charAt(i), 0) +1);
        }
        for (char c : s_map.keySet()){
            if (!s_map.get(c).equals(t_map.getOrDefault(c, 0)))
                return false;
        }

        return true;
    }



    static boolean isAnagram_2(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - (int)'a']++;
            freq[t.charAt(i) - (int)'a']--;

//            int val = s.charAt(i) - 'a';
//            System.out.println(s.charAt(i) +"- 'a' = " + val);
//            val = t.charAt(i) - 'a';
//            System.out.println("\n"+t.charAt(i) +"- 'a' = " + val);

//            System.out.println("freq["+ s.charAt(i)+"- 'a']++ = " +  freq[s.charAt(i) - 'a']++);
//            System.out.println("freq["+t.charAt(i) +"- 'a']-- = " + freq[t.charAt(i) - 'a']--);

        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
