package com.souradeep.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GetValues {

    public List<String> getValues(HashMap<Integer, String> map) {
        List<String> values = new ArrayList<>(map.values());
        Collections.sort(values);
        return values;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter value: ");
            String value = sc.nextLine();

            map.put(key, value);
        }

        GetValues obj = new GetValues();

        System.out.println(obj.getValues(map));

        sc.close();
    }
}