package com.souradeep.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedNumbers {

    public int[] getSorted(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {

            String reversed =
                    new StringBuilder(String.valueOf(num))
                            .reverse()
                            .toString();

            list.add(Integer.parseInt(reversed));
        }

        Collections.sort(list);

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SortedNumbers obj = new SortedNumbers();

        int[] result = obj.getSorted(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}