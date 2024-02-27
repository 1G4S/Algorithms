package com.app.data;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.FileReader;
import java.util.Scanner;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public final class FileData {
    /**
     * Reads an integer value from a file specified by the filename.
     * This method opens the file, reads the first integer value found, and returns it.
     * If the file cannot be opened, read, or does not contain an integer as expected,
     * an IllegalStateException is thrown, encapsulating the original exception.
     *
     * @param filename The path and name of the file from which to read the integer.
     * @return The first integer value found in the specified file.
     * @throws IllegalStateException if the file cannot be read or does not contain an integer.
     */
    public static int getInt(String filename) {
        try (var fileReader = new FileReader(filename); var sc = new Scanner(fileReader)) {
            return sc.nextInt();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

}
