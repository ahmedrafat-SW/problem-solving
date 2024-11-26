package com.dev.manara;

public class NumbersOperations {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        boolean powerOfTwo = new NumbersOperations().isPowerOfTwo(16);
        System.out.println("powerOfTwo = " + powerOfTwo);
    }
}
