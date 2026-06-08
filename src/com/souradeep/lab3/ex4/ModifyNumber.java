package com.souradeep.lab3.ex4;

import java.util.Scanner;

public class ModifyNumber {

    public int modifyNumber(int number1) {
        String num = Integer.toString(number1);
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < num.length() - 1; i++) {
            int digit1 = num.charAt(i) - '0';
            int digit2 = num.charAt(i + 1) - '0';

            result.append(Math.abs(digit1 - digit2));
        }

        result.append(num.charAt(num.length() - 1));

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        ModifyNumber obj = new ModifyNumber();

        System.out.println("Modified Number: " + obj.modifyNumber(number));

        sc.close();
    }
}