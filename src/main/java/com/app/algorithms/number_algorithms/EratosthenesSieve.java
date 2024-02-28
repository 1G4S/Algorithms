package com.app.algorithms.number_algorithms;

import com.app.data.FileData;
import java.util.BitSet;

public class EratosthenesSieve {
    private final BitSet sieve;

    /**
     * Private constructor to initialize the Eratosthenes sieve with a given BitSet.
     *
     * @param sieve The BitSet representing the sieve of Eratosthenes.
     */
    private EratosthenesSieve(BitSet sieve) {
        this.sieve = sieve;
    }

    /**
     * Creates an instance of EratosthenesSieve for numbers up to n using the sieve of Eratosthenes algorithm.
     *
     * @param n The upper limit for the sieve.
     * @return An instance of EratosthenesSieve with the sieve generated up to n.
     */
    public static EratosthenesSieve of(int n) {
        return new EratosthenesSieve(createSieve(n));
    }

    /**
     * Creates an instance of EratosthenesSieve from a file containing a precomputed sieve.
     *
     * @param filename The name of the file containing the sieve data.
     * @return An instance of EratosthenesSieve with the sieve loaded from the file.
     */
    public static EratosthenesSieve of(String filename) {
        return new EratosthenesSieve(createSieve(filename));
    }

    /**
     * Checks if a given number is prime based on the sieve.
     *
     * @param number The number to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public boolean isPrime(int number) {
        return sieve.get(number);
    }

    /**
     * Generates the sieve of Eratosthenes up to a given number n.
     *
     * @param n The upper limit for generating the sieve.
     * @return A BitSet representing the sieve of Eratosthenes, where set bits indicate prime numbers.
     */
    private static BitSet createSieve(int n) {
        var bitSet = new BitSet(n + 1);
        bitSet.set(2, n);
        for (int p = 2; p * p <= n; p++) {
            if (bitSet.get(p)) {
                for (int i = p * p; i <= n; i += p) {
                    bitSet.clear(i);
                }
            }
        }
        return bitSet;
    }

    /**
     * Loads a sieve of Eratosthenes from a file.
     *
     * This method should be implemented in the FileData class to read the BitSet from a file.
     *
     * @param filename The name of the file from which to load the sieve.
     * @return A BitSet representing the sieve loaded from the file.
     */
    private static BitSet createSieve(String filename) {
        return FileData.getSieve(filename);
    }

}
