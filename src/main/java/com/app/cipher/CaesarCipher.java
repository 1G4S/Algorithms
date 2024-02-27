package com.app.cipher;

import java.util.stream.Collectors;

public class CaesarCipher {

    private static int key;
    private final static int CONSTANT_INT = 26;

    public CaesarCipher(int key) {
        this.key = key;
    }

    /**
     * Encrypts a plaintext string using the Caesar cipher algorithm.
     *
     * @param word The plaintext string to be encrypted.
     * @return The encrypted string.
     * @throws IllegalArgumentException if the key is out of the acceptable range.
     */
    public static String encryptCaesarCipher(String word) {
        if (key <= -CONSTANT_INT || key >= CONSTANT_INT) {
            throw new IllegalArgumentException("Key is out of range.");
        }
        final int effectiveKey = key % CONSTANT_INT;
        var encrypted = word.chars()
                .mapToObj(c -> {
                    char base = (char) (c >= 'a' && c <= 'z' ? 'a' : 'A');
                    if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                        return (char) (base + (c - base + effectiveKey + CONSTANT_INT) % CONSTANT_INT);
                    } else {
                        return (char) c;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
        return encrypted;
    }
    /**
     * Decrypts a string encrypted with the Caesar cipher algorithm.
     *
     * @param encryptedText The encrypted string to be decrypted.
     * @return The decrypted (original) string.
     * @throws IllegalArgumentException if the key is out of the acceptable range.
     */
    public static String decryptCaesarCipher(String encryptedText) {
        if (key <= -CONSTANT_INT || key >= CONSTANT_INT) {
            throw new IllegalArgumentException("Key is out of range.");
        }
        final int effectiveKey = (CONSTANT_INT - key % CONSTANT_INT) % CONSTANT_INT;
        var decrypted = encryptedText.chars()
                .mapToObj(c -> {
                    char base = (char) (c >= 'a' && c <= 'z' ? 'a' : 'A');
                    if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                        return (char) (base + (c - base - effectiveKey + CONSTANT_INT) % CONSTANT_INT);
                    } else {
                        return (char) c;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
        return decrypted;
    }
}
