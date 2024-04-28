package org.example.Project4;
/*
Find out how many alpha characters are present in a string?
 */
public class E2 {

    public static void main(String[] args) {
        String text="Syntax2024";

        System.out.println(text.replaceAll("[^A-Za-z]","").length());
    }
}
