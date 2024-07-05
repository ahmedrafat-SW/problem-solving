package org.example.problemsolving;

import java.util.*;

public class Executor {

    public static void main(String[] args) throws AnimalException {
//        DataSaver.save("entering some data to be saved using static method in an interface.");
//        DBSaver dbSaver = new DBSaver() {
//            void doSomeThing() {System.out.println("Doing some thing.");}
//        };
//        dbSaver.saveToDB("data being saved .");

//        compareStrings();

        Cat animal = new Cat();
        animal.getSons();

//        List<Integer> numbers = new ArrayList<>(List.of(10, 12, 23, 4, 1, 100, 49));
//        Set<Integer> numSet = new TreeSet<>(Set.of(10, 12, 23, 4, 1, 100, 49));
//        numSet.forEach(System.out::println);

//        mapImplementations();
    }

    static void compareStrings(){
        String str1 = "a";
        String str2 = new String("a");

        if (str1 == str2){
            System.out.println("str1 == str2");
            System.out.println(str1.hashCode());
            System.out.println(str2.hashCode());
        } else if (str1.equals(str2)) {
            System.out.println("str1 equals str2");
            System.out.println(str1.hashCode());
            System.out.println(str2.hashCode());
        }
    }

    static void mapImplementations(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: ");
        hashMap.keySet().forEach(System.out::println);

        // LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Two", 2);
        System.out.println("LinkedHashMap: ");
        linkedHashMap.keySet().forEach(System.out::println);

        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);
        treeMap.put("One", 1);
        System.out.println("LinkedHashMap: ");
        treeMap.keySet().forEach(System.out::println);
    }
}
