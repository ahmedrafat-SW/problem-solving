package com.dev.stringmanpulations;

import java.util.Scanner;

public class FormattingOutput {

    public static void main(String[] args) {

//        formatInput();
        System.out.println("getSmallestAndLargest (3) = "
                + getSmallestAndLargest("testing this is a string literal", 4));

    }

    private static void formatInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }

    /**
     finding lexicographically the smallest and the largest substrings in a given string s
     k is the number of character of substring
     then print the smallest and largest strings
     Given a string.
**/
 public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

        for (int i = 1; i <= s.length()- k; i++) {
        String currentSubString = s.substring(i, i+k);
        if (currentSubString.compareTo(smallest) < 0) {
            smallest = currentSubString;
        }if (currentSubString.compareTo(largest) > 0) {
            largest = currentSubString;
        }
    }
        return smallest + "\t" + largest;
}
}
