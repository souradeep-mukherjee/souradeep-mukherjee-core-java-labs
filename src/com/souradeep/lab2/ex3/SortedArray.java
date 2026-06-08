package com.souradeep.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public int[] getSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String num = Integer.toString(arr[i]);
            String reversed = new StringBuilder(num).reverse().toString();
            arr[i] = Integer.parseInt(reversed);
        }

        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SortedArray obj = new SortedArray();
        int[] result = obj.getSorted(arr);

        System.out.println("Sorted Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}