package com.souradeep.lab6.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMedals {

    public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marks) {

        HashMap<Integer, String> medals = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {

            int score = entry.getValue();

            if (score >= 90) {
                medals.put(entry.getKey(), "Gold");
            } else if (score >= 80) {
                medals.put(entry.getKey(), "Silver");
            } else if (score >= 70) {
                medals.put(entry.getKey(), "Bronze");
            }
        }

        return medals;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> marks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Registration Number: ");
            int regNo = sc.nextInt();

            System.out.print("Marks: ");
            int score = sc.nextInt();

            marks.put(regNo, score);
        }

        StudentMedals obj = new StudentMedals();

        System.out.println(obj.getStudents(marks));

        sc.close();
    }
}