package com.dev.hackerrankproblems;

import java.util.Scanner;

public class PrimitivesOperations {

    public static void main(String[] args) {

        String s ;
        Scanner in = new Scanner(System.in);
//        s = in.next();z
//        System.out.println("s = " + s);
//        System.out.println("Math.pow(2,1) = " + (int)Math.pow(2, 4));
        getMaxMinForAllPrimitives();
        formatOutput(in);


    }

    private static void formatOutput(Scanner in) {
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();

        System.out.println("1 "+s1);
        System.out.println("2 "+s2);
        System.out.println("3 "+s3);
        System.out.println();
        int i =1;
        while ( i < 10) {
            System.out.format("%s %s \n",i, s1);
            i++;
        }
    }

    private static void getMaxMinForAllPrimitives() {
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("\nShort.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("\nInteger.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("\nLong.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
    }


    static void checkNumber(int n, Scanner in) {
        n = in.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0) {

        }
    }


}
