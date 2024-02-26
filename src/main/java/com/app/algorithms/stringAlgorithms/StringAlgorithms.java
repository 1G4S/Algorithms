package com.app.algorithms.stringAlgorithms;

import java.util.Arrays;

public interface StringAlgorithms {
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

    static boolean isPalindrome(String word) {
        var stringBuilder = new StringBuilder();
        stringBuilder.append(word.toLowerCase()).reverse();
        return stringBuilder.toString().equals(word.toLowerCase());
    }

    static void sieve(int n) {
        var arr = new boolean[n];
        Arrays.fill(arr, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i + i; j < n; j += i) {
                arr[j] = false;
            }
        }

        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }
    }
}
