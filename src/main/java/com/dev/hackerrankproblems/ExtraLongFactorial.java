package com.dev.hackerrankproblems;

import java.math.BigInteger;

public class ExtraLongFactorial {


    public static void main(String[] args) {

        int num = 30;
        extraLongFactorials(num);
        num = 50;
        extraLongFactorials(num);
        num = 100;
        extraLongFactorials(num);
    }

    public static void extraLongFactorials(int n) {

        BigInteger fact = BigInteger.ONE;

        for(int i = 2; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(" factorial " + n + " = " + fact);

    }

}
