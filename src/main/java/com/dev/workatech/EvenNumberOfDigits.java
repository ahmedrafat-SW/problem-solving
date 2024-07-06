package com.dev.workatech;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberOfDigits {

    List<Integer> getEvenDigitNumbers (int[] arr) {

        List<Integer> result = new ArrayList<>();

        for (int i : arr){
            String s = String.valueOf(i);
            int count = s.toCharArray().length;
            if (count % 2 == 0){
                result.add(Integer.valueOf(s));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        /**
         * Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
         * Answer: 42, 5775, 34, 45, 3556
         * */

        int [] arr = {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};

        List<Integer> evenDigitNumbers = new EvenNumberOfDigits().getEvenDigitNumbers(arr);
        System.out.println("evenDigitNumbers = " + evenDigitNumbers);

    }
}
