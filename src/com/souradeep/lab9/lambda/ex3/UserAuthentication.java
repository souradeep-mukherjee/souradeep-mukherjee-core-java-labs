package com.souradeep.lab9.lambda.ex3;

interface Authenticate {
    boolean validate(String username, String password);
}

public class UserAuthentication {

    public static void main(String[] args) {

        Authenticate auth =
                (username, password) ->
                        username.equals("admin")
                                && password.equals("admin123");

        System.out.println(auth.validate("admin", "admin123"));
    }
}