package com.souradeep.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallestCollection {

    public int getSecondSmallest(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        return list.get(1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SecondSmallestCollection obj = new SecondSmallestCollection();

        System.out.println("Second Smallest = "
                + obj.getSecondSmallest(arr));

        sc.close();
    }
}