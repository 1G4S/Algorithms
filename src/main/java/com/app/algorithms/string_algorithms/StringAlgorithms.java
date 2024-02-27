package com.app.algorithms.string_algorithms;

import java.util.Arrays;

public interface StringAlgorithms {
    /**
     * Checks if two given strings are anagrams of each other.
     * Two strings are considered anagrams if they contain the same characters in any order.
     * The comparison is case-insensitive.
     *
     * @param firstWord The first string to be compared.
     * @param secondWord The second string to be compared.
     * @return true if the two strings are anagrams, false otherwise.
     */
    static boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        var firstChars = firstWord.toLowerCase().toCharArray();
        var secondChars = secondWord.toLowerCase().toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);
        return String.valueOf(firstChars).equals(String.valueOf(secondChars));
    }
    /**
     * Checks if the given string is a palindrome.
     * A string is considered a palindrome if it reads the same forward and backward,
     * ignoring case sensitivity.
     *
     * @param word The string to be checked.
     * @return true if the string is a palindrome, false otherwise.
     */
    static boolean isPalindrome(String word) {
        var stringBuilder = new StringBuilder();
        stringBuilder.append(word.toLowerCase()).reverse();
        return stringBuilder.toString().equals(word.toLowerCase());
    }
}
