package com.souradeep.lab3.ex8;

import java.util.Scanner;

public class PositiveString {

    public boolean isPositiveString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        PositiveString obj = new PositiveString();

        if (obj.isPositiveString(str)) {
            System.out.println("Positive String");
        } else {
            System.out.println("Not a Positive String");
        }

        sc.close();
    }
}