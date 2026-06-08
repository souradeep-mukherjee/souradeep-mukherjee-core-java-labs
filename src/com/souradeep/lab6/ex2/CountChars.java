package com.souradeep.lab6.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {

    public Map<Character, Integer> countChars(char[] arr) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter characters without spaces: ");
        String input = sc.nextLine();

        CountChars obj = new CountChars();

        System.out.println(obj.countChars(input.toCharArray()));

        sc.close();
    }
}