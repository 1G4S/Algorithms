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
     * Determines if a given number is prime.
     * A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers.
     * In other words, it has exactly two distinct natural number divisors: 1 and itself. This method checks for primality
     * using efficient checks and optimizations. First, it handles edge cases (numbers less than 2, and 2 and 3 themselves).
     * Then, it eliminates numbers divisible by 2 and 3. For larger numbers, it iterates over potential factors from 5
     * up to the square root of the number, in steps of 6 (i.e., checks i and i+2 within each loop), to quickly identify
     * divisibility by any smaller prime number.
     * <p>
     * The algorithm initially checks if the number is less than 2 (not prime), or is 2 or 3 (prime). Then, it checks
     * for divisibility by 2 or 3 to quickly eliminate multiples of these. For numbers greater than 3 that are not divisible
     * by 2 or 3, it proceeds to check potential factors starting from 5, incrementing by 6 each time (since all primes
     * greater than 3 are of the form 6k ± 1). If the number is divisible by any of these or the immediate next number
     * (i.e., i+2), it is not prime. If no divisors are found by the time the loop reaches the square root of the number,
     * the number is prime.
     *
     * @param number The number to check for primality. It must be a natural number.
     * @return true if the number is prime, false otherwise.
     */

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
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
     * <p>
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
        if (number < 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }

    /**
     * Calculates the sum of the digits of a given number.
     * This method takes an integer value as input and computes the sum of its digits.
     * The computation is performed on the absolute value of the input number to ensure
     * that the method works correctly for both positive and negative numbers.
     * <p>
     * The algorithm iterates over each digit of the number by repeatedly dividing the number by 10
     * and adding the remainder to the sum. This process continues until the number is reduced to 0.
     *
     * @param n The input number whose digits are to be summed.
     * @return The sum of the digits of the input number.
     */

    static int sumDigits(int n) {
        var s = 0;
        var nn = Math.abs(n);
        while (nn > 0) {
            s += nn % 10;
            nn /= 10;
        }
        return s;
    }

}
