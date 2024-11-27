package com.dev.codility;

import java.util.HashSet;

public class Distinct {

    public static void main(String[] args) {
        int A [] = {1, 2, 4, 3, 2, 1, 3};
        int uniqueElementsCount = getUniqueElementsCount(A);
        System.out.println("uniqueElementsCount = " + uniqueElementsCount);
    }

    private static int getUniqueElementsCount(int [] A){
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int num : A) {
            uniqueElements.add(num);
        }

        return uniqueElements.size();
    }
}
