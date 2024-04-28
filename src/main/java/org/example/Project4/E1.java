package org.example.Project4;
/*
Write a program to swap 2 String without a temporary variable?
 */
public class E1 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "People";

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
    }
}
