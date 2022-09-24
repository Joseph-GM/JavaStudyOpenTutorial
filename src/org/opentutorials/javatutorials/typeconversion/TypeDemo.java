package org.opentutorials.javatutorials.typeconversion;

public class TypeDemo {
    public static void main(String[] args) {
        int a = 3;
        float b = 1.0F;
        double c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        float d = (float)100.0;
        int e = (int)100.1F;
        System.out.println(d);
        System.out.println(e);
    }
}
