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

    /**
     * Checks if a number is prime.
     * This method determines whether a given number is prime. A prime number is a number greater than 1
     * that has no positive divisors other than 1 and itself. The function starts checking from 2 up to the square root
     * of the number, which optimizes the process by reducing the number of checks needed.
     * <p>
     * If the number is less than 2, it is automatically not prime. For any number 2 or greater, the function
     * iteratively checks for any divisor. If a divisor is found, the number is not prime, and the function
     * returns false. If no divisors are found, the number is prime, and the function returns true.
     *
     * @param number The number to be checked for primality.
     * @return true if the number is prime; false otherwise.
     */
    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determines if a given number is a perfect number.
     * A perfect number is a positive integer that is equal to the sum of its proper positive divisors,
     * excluding itself. For example, 6 is a perfect number because its divisors are 1, 2, and 3, and
     * 1 + 2 + 3 = 6. This method efficiently calculates the sum of all divisors of the input number by
     * iterating only up to its square root and adjusting for perfect squares when necessary.
     *
     * The algorithm works by initializing a sum variable with 1 (considering 1 as a proper divisor of all
     * numbers) and iterating through 2 to the square root of the number. For each divisor found, it adds both
     * the divisor and its complement with respect to the number (i.e., number / divisor) to the sum. If the
     * number is a perfect square, the square root is subtracted from the sum to correct the earlier addition,
     * as it would have been added twice.
     *
     * @param number The number to check for perfection. It must be a positive integer.
     * @return true if the number is a perfect number, false otherwise.
     */

    static boolean isPerfect(int number) {
        var s = 1;
        var p = Math.sqrt(number);
        for (int i = 2; i <= p; i++) {
            if (number % i == 0) {
                s += i + number / i;
            }
        }
        if (number == p * p) s -= (int) p;
        return number == s;
    }
}
