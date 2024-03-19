package com.app.algorithms.string_algorithms;

import java.util.Arrays;

public interface StringAlgorithms {
    /**
     * Checks if two given strings are anagrams of each other.
     * Two strings are considered anagrams if they contain the same characters in any order.
     * The comparison is case-insensitive.
     *
     * @param firstWord  The first string to be compared.
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
        return Arrays.equals(firstChars, secondChars);
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
        return stringBuilder.append(word.toLowerCase()).reverse().toString().equals(word.toLowerCase());
    }

    /**
     * Calculates the Hamming distance between two strings.
     * The Hamming distance is defined as the number of positions at which the corresponding symbols are different.
     * It requires that both strings be of equal length. If the strings are of different lengths,
     * an IllegalArgumentException is thrown.
     *
     * @param firstWord The first string to compare.
     * @param secondWord The second string to compare.
     * @return The Hamming distance between the two strings.
     * @throws IllegalArgumentException if the strings are of different lengths.
     */

    static int hammingDistance(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            throw new IllegalArgumentException("String must be the same length");
        }

        var distance = 0;
        var firstChars = firstWord.toCharArray();
        var secondChars = secondWord.toCharArray();

        for (var i = 0; i < firstWord.length(); i += 1) {
            if (firstChars[i] != secondChars[i]) {
                distance++;
            }
        }
        return distance;
    }

    /**
     * Calculates the Levenshtein distance between two strings.
     * The Levenshtein distance is a measure of the difference between two sequences.
     * It is quantified as the minimum number of single-character edits (insertions, deletions, or substitutions)
     * required to change one word into the other. This implementation creates a matrix to hold the distances between
     * all possible substrings of the first string and the second string. It then iteratively fills the matrix with
     * the distances, ultimately returning the distance between the entire strings.
     *
     * @param a The first string to compare.
     * @param b The second string to compare.
     * @return The computed Levenshtein distance between the two input strings.
     */

    static int levenshteinDistance(String a, String b) {
        int[][] distanceMatrix = new int[b.length() + 1][a.length() + 1];

        for (int i = 0; i <= a.length(); i++) {
            distanceMatrix[0][i] = i;
        }

        for (int j = 0; j <= b.length(); j++) {
            distanceMatrix[j][0] = j;
        }

        for (int j = 1; j <= b.length(); j++) {
            for (int i = 1; i <= a.length(); i++) {
                int indicator = (a.charAt(i - 1) == b.charAt(j - 1)) ? 0 : 1;
                distanceMatrix[j][i] = Math.min(
                        Math.min(
                                distanceMatrix[j][i - 1] + 1,
                                distanceMatrix[j - 1][i] + 1),
                        distanceMatrix[j - 1][i - 1] + indicator
                );
            }
        }

        return distanceMatrix[b.length()][a.length()];
    }


}
