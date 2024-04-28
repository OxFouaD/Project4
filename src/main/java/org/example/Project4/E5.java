package org.example.Project4;

/*
Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */

import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());

        // WE CAN PRINT IT THIS WAY
        if(areAnagrams==true){
            System.out.println(" Strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }

        // OR THIS WAY
        System.out.println(areAnagrams==true ? "Strings are anagrams!":"Strings are not anagrams.");

    }
}