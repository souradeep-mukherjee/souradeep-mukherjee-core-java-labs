package com.souradeep.lab3.ex3;

import java.util.Scanner;

public class AlterString {

    public String alterString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("AEIOUaeiou".indexOf(ch) == -1 && Character.isLetter(ch)) {
                ch++;
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        AlterString obj = new AlterString();

        System.out.println("Modified String: " + obj.alterString(str));

        sc.close();
    }
}