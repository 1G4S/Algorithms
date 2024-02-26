package com.app.algorithms.numberAlgorithms;

import java.util.Arrays;

public interface NumberAlgorithms {
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
