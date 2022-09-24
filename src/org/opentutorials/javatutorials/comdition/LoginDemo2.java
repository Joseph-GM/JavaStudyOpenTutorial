package org.opentutorials.javatutorials.comdition;

public class LoginDemo2 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing")) {
            if (password.equals("111111")) {
                System.out.println("Welcome!");
            } else {
                System.out.println("check your password");
            }

        } else {
            System.out.println("check your id");
        }
    }
}
