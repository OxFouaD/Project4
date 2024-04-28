package org.example.Project4;

/*
Create a method to count how many vowels are present in a string
“documentation”
 */
public class E6 {
    public static void main(String[] args) {
        String vowels = "documentation";
        System.out.println(countVowels(vowels));
    }
    static int countVowels(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }
}

