package org.opentutorials.javatutorials.operator;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);  // 3 정수
        System.out.println(c/d);  // 3.3333333 실수
        System.out.println(a/d);  // 3.3333333 (정수 / 실수 = 실수)
    }

}
