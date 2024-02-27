package com.app.algorithms.number_algorithms;

import com.app.data.FileData;

import java.util.ArrayList;
import java.util.Arrays;

public class EratosthenesSieve {
    private final int[] sieve;

    private EratosthenesSieve(int[] sieve) {
        this.sieve = sieve;
    }

    /**
     * Factory method to create an instance of EratosthenesSieve based on an upper limit.
     * This method calculates prime numbers up to the given limit and stores them in the sieve.
     *
     * @param n The upper limit for calculating prime numbers.
     * @return An instance of EratosthenesSieve containing prime numbers up to the limit.
     */
    public static EratosthenesSieve of(int n) {
        return new EratosthenesSieve(createSieve(n));
    }

    /**
     * Factory method to create an instance of EratosthenesSieve based on a filename.
     * Reads an upper limit from the specified file and calculates prime numbers up to that limit.
     *
     * @param filename The name of the file containing the upper limit.
     * @return An instance of EratosthenesSieve containing prime numbers up to the limit read from the file.
     */
    public static EratosthenesSieve of(String filename) {
        return new EratosthenesSieve(createSieve(filename));
    }

    /**
     * Generates an array of prime numbers up to a given limit using the Sieve of Eratosthenes algorithm.
     *
     * @param n The upper limit for the prime numbers calculation.
     * @return An array containing all prime numbers up to the limit.
     */
    private static int[] createSieve(int n) {
        var prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        var primeNumbers = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.stream().mapToInt(i -> i).toArray();
    }

    /**
     * A variant of the prime number generator that reads the upper limit from a file.
     *
     * @param filename The file from which to read the upper limit for prime number generation.
     * @return An array of prime numbers up to the limit specified in the file.
     */
    private static int[] createSieve(String filename) {
        var n = FileData.getInt(filename);
        return createSieve(n);
    }
    /**
     * Prints all prime numbers stored in the sieve to the standard output.
     */
    public void printSieve() {
        for (int prime : sieve) {
            System.out.println(prime);
        }
    }
    /**
     * Returns the array of prime numbers stored in the sieve.
     *
     * @return An array of prime numbers.
     */
    public int[] getSieve() {
        return sieve;
    }
}
