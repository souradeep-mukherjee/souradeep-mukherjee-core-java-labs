package com.souradeep.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VotersList {

    public List<Integer> votersList(Map<Integer, LocalDate> map) {

        List<Integer> voters = new ArrayList<>();

        for (Map.Entry<Integer, LocalDate> entry : map.entrySet()) {

            int age = Period.between(
                    entry.getValue(),
                    LocalDate.now()).getYears();

            if (age > 18) {
                voters.add(entry.getKey());
            }
        }

        return voters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, LocalDate> map = new HashMap<>();

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter DOB (yyyy-mm-dd): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            map.put(id, dob);
        }

        VotersList obj = new VotersList();

        System.out.println(obj.votersList(map));

        sc.close();
    }
}