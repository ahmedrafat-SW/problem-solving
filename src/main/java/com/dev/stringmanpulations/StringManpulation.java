package com.dev.stringmanpulations;

public class StringManpulation {

    public static void main(String[] args) {
        String s = "testing string replace all function with regular expression";
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("str = " + str);

//        String [][] testCases = {{"abc", "pqr",} ,{"ab", "pqrs"}, {"abcd", "pq"}};
//        int i = 0;
//        for(String [] testCase : testCases){
//            String result = mergeAlternately(testCase[i],testCase[i+1]);
//            System.out.println("result = " + result);
//        }
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder("");
        int i =0;
        while (i < word1.length() || i < word2.length()){
            if (i < word1.length())
                merged.append(word1.charAt(i));
            if (i < word2.length())
                merged.append(word2.charAt(i));
            i++;
        }
        return merged.toString();
    }


}
