package com.souradeep.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

    public String[] sortStrings(String[] arr) {
        Arrays.sort(arr);

        int upperLimit = (arr.length % 2 == 0) ? arr.length / 2 : (arr.length / 2) + 1;

        for (int i = 0; i < arr.length; i++) {
            if (i < upperLimit) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        SortStrings obj = new SortStrings();
        String[] result = obj.sortStrings(arr);

        System.out.println("Modified Array:");
        for (String str : result) {
            System.out.println(str);
        }

        sc.close();
    }
}