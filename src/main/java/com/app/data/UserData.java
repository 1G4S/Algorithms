package com.app.data;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public final class UserData {
    private final static Scanner sc = new Scanner(System.in);
    /**
     * Reads a line of input from the console and validates it against a given regular expression.
     * If the input does not match the regex, it prompts the user to enter the data again until the input is valid.
     *
     * @param regex The regular expression pattern the input must match.
     * @return A string that matches the specified regular expression.
     */
    public static String getString(String regex) {
        var str = sc.nextLine();
        while (!str.matches(regex)) {
            str = sc.nextLine();
        }
        return str;
    }
    /**
     * Prompts the user to enter an integer, ensuring the input matches an integer pattern.
     * This method uses a default regex pattern for integers and leverages getString to validate the input.
     *
     * @return An integer entered by the user that matches the integer pattern.
     */
    public static int getInt() {
        var regex = "^-?\\d+$\n";
        System.out.println("Give me int: ");
        return Integer.parseInt(getString(regex));
    }
    /**
     * Overloaded version of getInt() that allows for custom regex patterns for integer validation.
     *
     * @param regex The regular expression pattern to validate the integer input.
     * @return An integer entered by the user that matches the specified pattern.
     */
    public static int getInt(String regex){
        System.out.println("Give me int: ");
        return Integer.parseInt(getString(regex));
    }
    /**
     * Prompts the user to enter a double, ensuring the input matches a double pattern.
     * This method uses a default regex pattern for doubles and leverages getString to validate the input.
     *
     * @return A double value entered by the user that matches the double pattern.
     */
    public static double getDouble() {
        var regex = "^-?\\d+(\\.\\d+)?$\n";
        System.out.println("Give me double: ");
        return Double.parseDouble(getString(regex));
    }
    /**
     * Overloaded version of getDouble() that allows for custom regex patterns for double validation.
     *
     * @param regex The regular expression pattern to validate the double input.
     * @return A double value entered by the user that matches the specified pattern.
     */
    public static double getDouble(String regex) {
        System.out.println("Give me double: ");
        return Double.parseDouble(getString(regex));
    }
}
