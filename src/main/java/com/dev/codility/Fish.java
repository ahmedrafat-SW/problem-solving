package com.dev.codility;

import java.util.Stack;

public class Fish {


    public static void main(String[] args) {

    }

    public static int solution(int[] A, int[] B) {
        Stack<Integer> downstream = new Stack<>(); // Stack to keep sizes of downstream fish
        int survivors = 0; // Count of surviving fish

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                // Downstream fish, push to stack
                downstream.push(A[i]);
            } else {
                // Upstream fish, fight with downstream fish in the stack
                while (!downstream.isEmpty()) {
                    // Check if the upstream fish is larger
                    if (downstream.peek() < A[i]) {
                        downstream.pop(); // Downstream fish loses
                    } else {
                        // Upstream fish loses
                        break;
                    }
                }
                // If no downstream fish survived, this upstream fish survives
                if (downstream.isEmpty()) {
                    survivors++;
                }
            }
        }

        // Remaining downstream fish in the stack are survivors
        survivors += downstream.size();
        return survivors;
    }
}
