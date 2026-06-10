package com.souradeep.lab9.lambda.ex2;

interface FormatString {
    String format(String str);
}

public class StringFormatter {

    public static void main(String[] args) {

        FormatString formatter = str -> {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {

                sb.append(str.charAt(i));

                if (i < str.length() - 1) {
                    sb.append(" ");
                }
            }

            return sb.toString();
        };

        System.out.println(formatter.format("CG"));
    }
}