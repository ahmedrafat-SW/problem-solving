package org.example.problemsolving;


import java.util.List;
import java.util.Vector;

public class Animal {
    String name;
    String color;
    int age;

    Vector<String> sons = new Vector<>(List.of("jak", "jon", "kiko"));

    public Animal() {}

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void getSons() throws AnimalException{
        sons.forEach(System.out::println);
    }
}
