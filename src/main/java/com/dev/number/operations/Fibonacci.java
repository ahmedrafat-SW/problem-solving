package com.dev.number.operations;

public class Fibonacci {

    public static int recursiveFibonacci(int n){
        if (n <= 1)
            return n;
        else
            return recursiveFibonacci(n -1) + recursiveFibonacci(n -2);
    }

    public static int dynamicProgrammedFibonacci(int n){

        int a = 0, b = 1, sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.printf("%s ", a);
        }
        System.out.println();
        return a;
    }

    public static void main(String[] args) {

        int fibRes = recursiveFibonacci(9);
        System.out.println("fibRes = " + fibRes);

        int dynamicFib = dynamicProgrammedFibonacci(9);
        System.out.println("dynamicFib = " + dynamicFib);
    }
}
