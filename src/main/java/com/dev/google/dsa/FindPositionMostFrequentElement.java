package com.dev.google.dsa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPositionMostFrequentElement {


    public static void main(String[] args) {

        int[] arr = {11, 33, 22, 33, 44, 44, 44, 50, 50, 50, 50, 50, 50};
        int[] positionsOfMostFrequentElementIndices = getPositionsOfMostFrequentElementIndices(arr);
        for (int pos : positionsOfMostFrequentElementIndices){
            System.out.println("pos = " + pos);
        }

        Arrays.sort(arr);
        for (int num : arr){
            System.out.printf("%s ", num);
        }

    }


    private static int[] getPositionsOfMostFrequentElementIndices(int[] arr){
        HashMap<Integer, Integer> elementFreq = new HashMap<>();

        for (int n : arr){
            if (elementFreq.containsKey(n)){
                elementFreq.put(n, elementFreq.get(n) + 1);
            } else {
                elementFreq.put(n, 1);
            }
        }
        int mostFrequentElement = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : elementFreq.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        System.out.println("mostFrequentElement = " + mostFrequentElement);
        System.out.println("maxFrequency = " + maxFrequency);

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > mostFrequentElement){
                ++ count;
            }
        }

        Integer elementFrequency = elementFreq.get(mostFrequentElement);
        int[] result = new int[elementFrequency];

        for (int j = 0; j < result.length; j ++){
            result[j] = count ++;
        }

        return result;
    }

















}
