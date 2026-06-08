package com.souradeep.lab6.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetSquares {

    public Map<Integer, Integer> getSquares(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, num * num);
        }

        return map;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        GetSquares obj = new GetSquares();

        System.out.println(obj.getSquares(arr));

        sc.close();
    }
}