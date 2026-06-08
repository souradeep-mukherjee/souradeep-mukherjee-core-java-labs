package com.souradeep.lab3.ex5;

import java.util.Scanner;

public class CountText {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        int characters = text.length();
        int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
        int lines = text.isEmpty() ? 0 : text.split("\n").length;

        System.out.println("Number of Characters: " + characters);
        System.out.println("Number of Words: " + words);
        System.out.println("Number of Lines: " + lines);

        sc.close();
    }
}