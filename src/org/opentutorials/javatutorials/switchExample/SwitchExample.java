package org.opentutorials.javatutorials.switchExample;

import java.util.*;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("달을 입력하세요:");
        month = input.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("지금은 봄 입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("지금은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("지금은 가을 입니다.");
                break;
            case 12: case 1: case 2:
                System.out.println("지금은 겨울 입니다.");
                break;
            default:
                System.out.println("부정확한 달입니다.");
                break;
        }
    }
}
