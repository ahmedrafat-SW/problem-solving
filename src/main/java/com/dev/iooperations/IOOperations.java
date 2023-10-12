package com.dev.iooperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IOOperations {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        System.out.println("tArray.to = " + Arrays.toString(tArray));
        System.out.println("tArray.toString() = " + Arrays.toString(tArray));

        if (Arrays.toString(tArray).equals(Arrays.toString(tArray)))
            System.out.println("Two Strings are equal");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            s = br.readLine();
            double number = Double.parseDouble(s);
            System.out.println("Number is:" + number);
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }
}
