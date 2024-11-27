package com.dev.codility;

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        String S = "{[()()]}";
        int consistentString = isConsistentString(S);
        System.out.println("consistentString = " + consistentString);
    }


    private static int isConsistentString(String S){

        // Initialize a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char c : S.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Handle closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty or top of the stack doesn't match, return 0
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return 0;
                }
            }
        }

        // If stack is empty at the end, the string is properly nested
        return stack.isEmpty() ? 1 : 0;
    }

    // Helper function to check if the opening and closing brackets match
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
