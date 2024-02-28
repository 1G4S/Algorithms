package com.app.cipher;

import java.util.stream.Collectors;

public class CaesarCipher {

    private static int key;
    private final static int CONSTANT_INT = 26;

    private CaesarCipher(int key) {
        this.key = key;
    }

    public static CaesarCipher of(int n) {
        return new CaesarCipher(n);
    }

    /**
     * Encrypts a plaintext string using the Caesar cipher algorithm.
     *
     * @param word The plaintext string to be encrypted.
     * @return The encrypted string.
     * @throws IllegalArgumentException if the key is out of the acceptable range.
     */
    public String encryptCaesarCipher(String word) {
        final int effectiveKey = key % CONSTANT_INT;
        return sequence(word, effectiveKey);
    }

    /**
     * Decrypts a string encrypted with the Caesar cipher algorithm.
     *
     * @param encryptedText The encrypted string to be decrypted.
     * @return The decrypted (original) string.
     * @throws IllegalArgumentException if the key is out of the acceptable range.
     */
    public String decryptCaesarCipher(String encryptedText) {
        final int effectiveKey = (CONSTANT_INT - key % CONSTANT_INT) % CONSTANT_INT;
        return sequence(encryptedText, effectiveKey);
    }

    /**
     * Performs the actual encryption or decryption operation on the given text.
     *
     * This method applies the Caesar cipher algorithm to each character of the input text based on the effective key.
     * It supports both encryption and decryption by adjusting the value of the effective key accordingly. The method
     * iterates over each character of the input text, checking if it is an alphabetical character. If it is, the method
     * calculates the new character after applying the cipher shift. The shift wraps around the alphabet, ensuring that
     * the operation stays within the bounds of alphabetic characters ('A' to 'Z' and 'a' to 'z'). Non-alphabetical characters
     * are left unchanged. The result is a new string with each character encrypted or decrypted based on the effective key.
     *
     * @param encryptedText The input text to be encrypted or decrypted.
     * @param effectiveKey The effective shift key used for the cipher operation. This key is calculated differently for
     *                     encryption and decryption to ensure the proper reversal of the encryption process.
     * @return The resulting string after applying the Caesar cipher shift to the input text.
     */
    private static String sequence(String encryptedText, int effectiveKey) {
        return encryptedText.chars()
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
    }
}
