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

    static void fibonacciIteratively(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number is less than zero or equal zero.");
        }

        var a = 0;
        var b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(b);
            b += a;
            a = b - a;
        }
    }

    static int fibonacciRecursively(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number is less than zero or equal zero.");
        }
        if (n < 3) {
            return 1;
        }
        return fibonacciRecursively(n - 2) + fibonacciRecursively(n - 1);
    }
}
