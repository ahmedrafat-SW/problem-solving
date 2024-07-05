package org.example;

public class Employee extends Person {


    static String name;

    public static String doSomething(String thing){
        return "I'm doing something.";
    }


    public static int doSomething(int thing, String thing2){
        System.out.println("thing2 = " + thing2);
        return thing;
    }


    public static void main(String[] args) {

        System.out.println("doSomething(\"thiitani\") = " + doSomething("thiitani"));
        System.out.println("doSomething(134, \"another thing\") = " + doSomething(134, "another thing"));
    }


    public static void doYourWork() {
        System.out.println("doing Some Work.");
    }





}
