package com.dev.ds;

public class DSExecutor {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(10);

        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.print();
        System.out.println("\nlist = " + list);
        System.out.println("**********************************************************************************");

        list.prepend(93);
        list.prepend(94);
        list.prepend(95);
        list.print();
        System.out.println("\nlist = " + list);
        System.out.println("**********************************************************************************");

        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.print();
        System.out.println("\nlist = " + list);
        System.out.println("**********************************************************************************");

        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.removeLast();
        list.print();
        System.out.println("\nlist = " + list);
        System.out.println("**********************************************************************************");

        list.append(5);
        list.append(10);
        list.append(15);
        list.print();
        System.out.println("\nlist = " + list);
        System.out.println("**********************************************************************************");


        list.removeLast();
        list.removeLast();
        list.print();
        System.out.println("\nlist = " + list);
        System.out.println("**********************************************************************************");

        list.prepend(10);
        list.prepend(20);
        list.print();
        System.out.println("\nlist = " + list);
        System.out.println("**********************************************************************************");

    }
}
