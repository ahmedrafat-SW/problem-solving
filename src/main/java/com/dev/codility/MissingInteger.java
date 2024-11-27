package com.dev.codility;

public class MissingInteger {

    public static void main(String[] args) {

    }


    private static int getMissingInteger(int [] A) {
        int N = A.length;
        boolean [] presentArr = new boolean[N +1];

        for (int num : A){
            if(num > 0 && num <= N){
                presentArr[num] = true;
            }
        }

        for (int i =1; i < presentArr.length; i++) {
            if (presentArr[i] == false) {
                return i;
            }
        }
        return N + 1;
    }
}
