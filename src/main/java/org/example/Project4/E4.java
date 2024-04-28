package org.example.Project4;

/*
Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.
 */
public class E4 {

    public static void main(String[] args) {

        String stringVariable="madam";
        StringBuilder reverse=new StringBuilder(stringVariable);
        System.out.println(reverse.reverse().toString().equals(stringVariable));

    }

}
