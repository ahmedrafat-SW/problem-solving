package com.dev.codility;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println("testing .............");

        int number = 1041; // Example integer
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + " is: " + binaryString);

        int lengthOfMaxBinaryGapOf = getLengthOfMaxBinaryGapOf(number);
        System.out.println("lengthOfMaxBinaryGapOf = " + lengthOfMaxBinaryGapOf);


    }

    private static int getLengthOfMaxBinaryGapOf(int n){
        String binaryString = Integer.toBinaryString(n);
        int maxLength = 0;
        int currentLength = 0;
        boolean counting= false;

        for (char c: binaryString.toCharArray()){
            if (c == '1'){
                if(counting) maxLength = Math.max(currentLength, maxLength);

                counting = true;
                currentLength = 0;

            } else if(counting) {
                currentLength ++;
            }
        }

        return maxLength;
    }

}
