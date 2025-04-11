package com.dev.hackerrankproblems.oneweekpreparation;

import java.util.Arrays;
import java.util.List;

public class UniqueElement {

    public static int lonelyinteger(List<Integer> a) {
        int[] freq = new int[100];
        int uniqueElement = 0;

        for (Integer integer : a) {
            freq[integer] += 1;
        }

        for(int idx2 = 0; idx2 < freq.length; idx2 ++) {
            if (freq[idx2] == 1){
                uniqueElement = idx2;
                break;
            }
        }

        return uniqueElement;
    }


    public static void main(String[] args) {
        System.out.println("lonelyinteger(Arrays.asList(1, 2, 1, 3, 3, 4, 2)) = " + lonelyinteger(Arrays.asList(1, 2, 1, 3, 3, 4, 2)));
    }
}
