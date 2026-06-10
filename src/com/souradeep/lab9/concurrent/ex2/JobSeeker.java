package com.souradeep.lab9.concurrent.ex2;

import java.util.Scanner;

public class JobSeeker {

    public boolean validate(String username) {

        if (!username.endsWith("_job")) {
            return false;
        }

        String prefix =
                username.substring(0,
                        username.length() - 4);

        return prefix.length() >= 8;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        JobSeeker obj = new JobSeeker();

        System.out.println(obj.validate(username));

        sc.close();
    }
}