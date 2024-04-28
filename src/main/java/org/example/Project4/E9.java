package org.example.Project4;

import java.util.*;

/*
Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'.
 */
public class E9 {

    public static void main(String[] args) {
    String str = "abracadabra";

    for (char ch : str.toCharArray()) {
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println("The first non-repeating character is: " + ch);
            break;
        }
    }
  }
}
