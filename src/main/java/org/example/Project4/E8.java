package org.example.Project4;

/*
You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".
 */


import java.util.ArrayList;
import java.util.List;

public class E8 {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        stringList.add("Apple");
        stringList.add("ANANAS");
        stringList.add("Car");
        stringList.add("Bike");
        stringList.add("Awesome");

        for(String s:stringList){
            if(s.startsWith("A")){
                System.out.println(s.toLowerCase());

            }
        }
    }

}