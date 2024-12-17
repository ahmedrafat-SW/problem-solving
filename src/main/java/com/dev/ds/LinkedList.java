package com.dev.ds;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }


    public void append(int value){
        Node node = new Node(value);
        if (length == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        length ++;
    }

    public void prepend(int value){
        Node node = new Node(value);
        if (length == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }

        this.length ++;
    }

    public Node removeFirst(){
        if (length == 0) return null;

        Node temp = this.head;
        this.head = this.head.next;
        this.length --;

        if (length == 0) this.tail = null;

        return temp;
    }

    public Node removeLast(){
        if (length == 0) return null;

        Node temp = this.head;
        Node pre = this.head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        this.tail = pre;
        this.tail.next = null;
        this.length --;

        if (length == 0){
            this.head = null;
            this.tail = null;
        }

        return temp;
    }


    public int length() {
        return length;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void print(){
        Node temp = this.head;
        System.out.print("{");

        while(temp != null) {
            System.out.print(temp.value + (temp.next != null ? ", " : ""));
            temp = temp.next;
        }

        System.out.print("}");
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + (head != null ? head.value : null) +
                ", tail=" + (tail != null ? tail.value : null) +
                ", length=" + length +
                '}';
    }
}
