package com.app.data;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Utility class for file data operations.
 * This class provides methods for reading data from a file and converting it into a BitSet.
 * It is designed with a private constructor to prevent instantiation, as it only contains static methods.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public final class FileData {

    /**
     * Reads a sieve stored in a file and converts it into a BitSet.
     * The method assumes that the sieve is represented in the file as a string of "0"s and "1"s separated by spaces,
     * where "1" indicates a prime number and "0" indicates a non-prime number.
     *
     * @param filename The path of the file containing the sieve data.
     * @return A BitSet representing the sieve, where the set bits correspond to prime numbers.
     * @throws IllegalStateException if an error occurs while reading the file.
     */
    public static BitSet getSieve(String filename) {
        var bitSet = new BitSet();
        try (var fileReader = new FileReader(filename); var sc = new Scanner(fileReader)) {
            var values = Files.readAllLines(Paths.get(filename)).getFirst().split(" ");
            for (int i = 0; i < values.length; i++) {
                if ("1".equals(values[i])) {
                    bitSet.set(i);
                }
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        return bitSet;
    }

}
