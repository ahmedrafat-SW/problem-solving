package com.dev.amazonsde;
import java.util.*;
public class trancationCount {

    public static List<String> processLogs(List<String> logs, int threshold) {
        // Write your code here

        Map <String, Integer> trancationCount = new HashMap<>();

        for(String log: logs) {
            String [] parts = log.split(" ");
            String sender = parts[0];
            String receiver = parts[1];

            trancationCount.put(sender, trancationCount.getOrDefault(sender, 0 ) + 1);

            if (!sender.equals(receiver)) {
                trancationCount.put(receiver, trancationCount.getOrDefault(receiver, 0) + 1);
            }
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: trancationCount.entrySet()) {
            if (entry.getValue() >= threshold) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result, (a, b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));

        return result;

    }


    public static List<Integer> numberOfItems1(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here
        int count = 0;
        List<Integer> result = new ArrayList<>();

        Stack<Character> itemsStack = new Stack<>();
        for(int i = 0; i < startIndices.size(); i++) {
            count = 0;
            char[] str = s.substring(startIndices.get(i), endIndices.get(i)).toCharArray();
            for (int j = 0; j < str.length; j++) {
                if ((int) str[j] == 124 && itemsStack.isEmpty()) {
                    itemsStack.push(str[j]);
                } else if((int) str[j] == 42 && !itemsStack.isEmpty()) {
                    itemsStack.push(str[j]);
                } else if((int) str[j] == 124 && !itemsStack.isEmpty()){
                    char c = itemsStack.pop();
                    if ((int) c == 42) {
                        count++;
                    }
                }
            }

            result.add(count);

        }

        return result;
    }

    public static List<Integer> numberOfItems2(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < startIndices.size(); i++) {

            int start = startIndices.get(i) -1;
            int end = endIndices.get(i) -1;
            int count = 0, totalCount = 0;
            boolean compartmentOpen = false;

            for (int j = start; j <= end; j++) {

                char c = s.charAt(j);
                if(c == '|') {
                    if (compartmentOpen) {
                        totalCount += count;
                    }
                    compartmentOpen = true;
                    count= 0;
                } else if ( c == '*' && compartmentOpen) {
                    count++;
                }

            }

            result.add(totalCount);

        }

        return result;
    }


    public static List<Integer> numberOfItems3(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int[] starPrefixSum = new int[n + 1];
        int[] leftPipe = new int[n];
        int[] rightPipe = new int[n];
        int lastPipe = -1;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '|') lastPipe = i;
            starPrefixSum[i+1] = starPrefixSum[i] + (s.charAt(i) == '*'? 1 : 0);
        }

        lastPipe = -1;
        for(int i = n-1; i >= 0; i--) {
            if(s.charAt(i) == '|') lastPipe = i;
            rightPipe[i] = lastPipe;
        }

        for(int i = 0; i < startIndices.size(); i++) {
            int start = startIndices.get(i) -1;
            int end = endIndices.get(i) -1;
            int leftBound =rightPipe[start];
            int rightBound = leftPipe[end];

            if(leftBound != -1 && rightBound != -1  && leftBound < rightBound) {
                result.add(starPrefixSum[rightBound] - starPrefixSum[leftBound]);
            } else {
                result.add(0);
            }
        }


        return result;
    }

}
