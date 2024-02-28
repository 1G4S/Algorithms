package com.app.algorithms.number_algorithms;

public interface NumberAlgorithms {

    /**
     * Generates and prints Fibonacci sequence numbers up to the nth number iteratively.
     * This method uses an iterative approach to calculate the Fibonacci sequence, which is more
     * efficient in terms of memory usage compared to the recursive approach, especially for larger values of n.
     * Each number in the sequence is printed to the console as it is computed.
     *
     * @param n The number of Fibonacci sequence values to generate. Must be greater than 0.
     * @throws IllegalArgumentException if the input number is less than or equal to zero.
     */
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

    /**
     * Calculates the nth Fibonacci number recursively.
     * This method uses a recursive approach to calculate the nth Fibonacci number.
     * It is a direct implementation of the Fibonacci sequence definition, but it can be less efficient
     * for large values of n due to the increased number of recursive calls and potential stack overflow issues.
     *
     * @param n The position in the Fibonacci sequence of the number to be calculated. Must be greater than 0.
     * @return The nth Fibonacci number.
     * @throws IllegalArgumentException if the input number is less than or equal to zero.
     */
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
