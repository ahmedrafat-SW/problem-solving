package com.dev.hackerrankproblems;

public class TwoStrings {

    public static void main(String[] args) {
        String[] a = {"ab", "cd", "ef"};
        String[] b = {"af", "ee", "ef"};
        String[] res = twoStrings(a, b);
        for(String r : res) {
            System.out.println(r);
        }
    }

    private static String[] twoStrings(String[] a, String[] b) {
        String[] res = new String[a.length];
        for(int i=0;i<a.length;i++) {
            int bitMaskA = 0;
            int bitMaskB = 0;
            for(int j =0;j<a[i].length();j++) {
                char ac = a[i].charAt(j);
                char bc = b[i].charAt(j);
                bitMaskA |= 1 << (ac - 'a');
                bitMaskB |= 1 << (bc - 'a');
            }
            res[i] = (bitMaskA & bitMaskB) > 0 ? "YES" : "NO";
        }
        return res;
    }

}
