package org.opentutorials.javatutorials.compare;

public class EqualDemo {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        String c = "Hello";

        System.out.println("one" == "one"); //true

        System.out.println(a == b); //false
        System.out.println(a == c); //true
        System.out.println(a.equals(b)); //true
    }
}
