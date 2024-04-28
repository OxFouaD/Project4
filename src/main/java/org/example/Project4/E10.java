package org.example.Project4;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
How can you remove all duplicates from ArrayList?
 */
public class E10 {

    public static void main(String[] args) {

            List<String> fruitList=new ArrayList<>();

            fruitList.add("annannas");
            fruitList.add("Apple");
            fruitList.add("Apple");
            fruitList.add("Apple");
            fruitList.add("Banana");
            fruitList.add("Orange");

            Set<String> newSet=new LinkedHashSet<>(fruitList);
            System.out.println(newSet);

    }
}

