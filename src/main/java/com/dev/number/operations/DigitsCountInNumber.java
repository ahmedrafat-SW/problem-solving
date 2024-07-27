package com.dev.number.operations;

public class DigitsCountInNumber {

    public static int getDigitCountOf(int number){
        int count = 0;
        while (number != 0){
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int number = 1765712349;
        int digitCount = getDigitCountOf(number);
        System.out.println("digitCount = " + digitCount);

    }
}
