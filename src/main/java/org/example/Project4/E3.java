package org.example.Project4;

/*
Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH".
 */
public class E3 {


    public static void main(String[] args) {

        String str = "hello";
        for (int i=str.length() -1; i>=0;i--) {
            System.out.print(str.charAt(i));
        }
    }
}

