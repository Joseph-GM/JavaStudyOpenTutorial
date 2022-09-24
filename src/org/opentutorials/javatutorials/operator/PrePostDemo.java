package org.opentutorials.javatutorials.operator;

public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력 연산 먼저 수행 후 i에 대입
        System.out.println(i); // 6출력
        System.out.println(i++); // 6 출력 i를 먼저 출력 후 연산
        System.out.println(i); // 7 출력
    }
}
