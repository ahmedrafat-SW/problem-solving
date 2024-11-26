package com.dev.arrayandhashing;

public class StackWithArray {

    int [] arr;

    public StackWithArray (int capacity) {
        arr = new int[capacity];
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public int size() {
        return this.arr.length;
    }

    public int top() {
        return arr[arr.length -1];
    }

    public void push(int element) {
        arr[arr.length -1] = element;
    }

    public void pop() {
    }
}
