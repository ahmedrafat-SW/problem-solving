package org.example.problemsolving.debugging;

public class ErrorVerification {

    public static void main(String[] args) {
        String str = """ 
                        this is a multi line.
                        string in java put i don't know.
                        why its not working correctly.
                        """;

        System.out.println(str);

        printColor("green");
        printColor("");
    }

    static void printColor(String color){
        switch (color){
            case "red" -> System.out.println("the color is red.");
            case "green" -> System.out.println("the color is green.");
            case "blue" -> System.out.println("the color is blue.");
            default -> System.out.println("the default color is white.");
        }
    }
}
