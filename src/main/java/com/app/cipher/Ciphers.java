package com.app.cipher;

import java.util.stream.Collectors;

public interface Ciphers {
    static String encryptCaesarCipher(int key, String word) {
        if (key <= -26 || key >= 26) {
            throw new IllegalArgumentException("Key is out of range.");
        }
        final int effectiveKey = key % 26;
        String encrypted = word.chars()
                .mapToObj(c -> {
                    char base = (char) (c >= 'a' && c <= 'z' ? 'a' : 'A');
                    if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                        return (char) (base + (c - base + effectiveKey + 26) % 26);
                    } else {
                        return (char) c;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
        return encrypted;
    }

    static String decryptCaesarCipher(int key, String encryptedText) {
        if (key <= -26 || key >= 26) {
            throw new IllegalArgumentException("Key is out of range.");
        }
        final int effectiveKey = (26 - key % 26) % 26;
        String decrypted = encryptedText.chars()
                .mapToObj(c -> {
                    char base = (char) (c >= 'a' && c <= 'z' ? 'a' : 'A');
                    if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                        return (char) (base + (c - base - effectiveKey + 26) % 26);
                    } else {
                        return (char) c;
                    }
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
        return decrypted;
    }
}
