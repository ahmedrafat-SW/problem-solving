package com.dev.codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int [] A = {9, 3, 9, 3, 9, 7, 9};
        int unpairedNumber = getUnpairedNumberIn(A);
        int unpairedNumber2 = getUnpairedNumberIn2(A);
        System.out.println("unpairedNumber = " + unpairedNumber);
        System.out.println("unpairedNumber2 = " + unpairedNumber2);

    }


    private static int getUnpairedNumberIn (int[] A){
        Set<Integer> uniqueNums = new HashSet<>();

        for(int num : A){
            if (uniqueNums.contains(num)){
                uniqueNums.remove(num);
            } else {
                uniqueNums.add(num);
            }
        }
        return uniqueNums.iterator().next();
    }


    private static int getUnpairedNumberIn2 (int[] A){
        int result = 0;
        for(int num : A){
            System.out.print( result + " ^ " + num + " = ");
            result ^= num;
            System.out.println(result);
        }
        return result;
    }



}
