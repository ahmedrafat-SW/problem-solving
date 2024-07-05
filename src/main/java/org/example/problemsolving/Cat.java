package org.example.problemsolving;

public class Cat extends Animal{

    double weight;

    public Cat() {
        weight = 23.21;
    }

    public Cat(String name, String color, int age) {
//        this();
        super(name, color, age);
    }

    @Override
    public void getSons(){
        System.out.println("5 sons");
    }
}
