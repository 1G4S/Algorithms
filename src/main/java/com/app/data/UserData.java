package com.app.data;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public final class UserData {

    public static String getString(String regex) {
        var sc = new Scanner(System.in);
        var str = sc.nextLine();
        while (!str.matches(regex)) {
            System.out.println("Give me proper format of input.");
            str = sc.nextLine();
        }
        return str;
    }

    public static int getInt() {
        var regex = "^-?\\d+$\n";
        System.out.println("Give me int: ");
        return Integer.parseInt(getString(regex));
    }

    public static double getDouble() {
        var regex = "^-?\\d+(\\.\\d+)?$\n";
        System.out.println("Give me double: ");
        return Double.parseDouble(getString(regex));
    }
}
