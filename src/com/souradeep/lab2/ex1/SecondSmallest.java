package com.souradeep.lab2.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

    public int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        SecondSmallest obj = new SecondSmallest();

        System.out.println("Second Smallest Element: " + obj.getSecondSmallest(arr));

        sc.close();
    }
}